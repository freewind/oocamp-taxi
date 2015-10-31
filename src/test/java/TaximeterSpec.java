import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;

@RunWith(Spectrum.class)
// @formatter:off
public class TaximeterSpec {{
// @formatter:on

    describe("按里程计算费用", () -> {
        describe("起步价2公里6元", () -> {
            it("上了车就6元", () -> {
            });
            it("不到2公里也是6元", () -> {
            });
            it("2公里整也是6元", () -> {
            });
            it("2.1公里就要超过6元", () -> {
            });
        });

        describe("超出2公里小于8公里按每公里0.8元", () -> {
            it("3公里6.8元", () -> {
            });
            it("7公里10元", () -> {
            });
            describe("不足1公里按1公里算", () -> {
                it("2.1公里要6.8元", () -> {
                });
                it("3.9公里要7.6元", () -> {
                });
            });
        });

        describe("8公里超每公里加收50%运价", () -> {
            it("8公里要收11.2元", () -> {
            });
            it("100公里要收121.6元", () -> {
            });
        });

    });

    describe("按等待时间收费", () -> {
        describe("每分钟0.25元", () -> {
            it("1分钟0.25元", () -> {
            });
            it("10分钟2.5元", () -> {
            });
        });
        // 这是需要由BA或者客户来决定的"不清楚"的需要
        describe("不足1分钟的不算", () -> {
            it("0秒0元", () -> {
            });
            it("59秒0元", () -> {
            });
            it("1分钟零1秒0.25元", () -> {
            });
        });
    });

    describe("同时计算路程与等待时间", () -> {
        it("3公里且等待1分钟需要7.05元", () -> {
        });
    });

    describe("最终价格会被四舍五入到元", () -> {
        it("6元还是6元", () -> {
        });
        it("6.49元收6元", () -> {
        });
        it("6.50元收7元", () -> {
        });
    });

// @formatter:off
}}
// @formatter:on
