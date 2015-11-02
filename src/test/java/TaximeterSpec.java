import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;

@RunWith(Spectrum.class)
// @formatter:off
public class TaximeterSpec {{
// @formatter:on

    describe("出租车车费如何计算", () -> {

        describe("起步价固定费用", () -> {
            describe("2公里内为起步价6元", () -> {
                it("上了车就6元", () -> {
                });
                it("不到2公里也是6元", () -> {
                });
                it("2公里整也是6元", () -> {
                });
            });
            // TODO: 需要跟BA或客户确认
            it("等待时间不算钱", () -> {
            });
        });

        describe("短途收费=起步价+每公里正常费用+等待费用", () -> {
            describe("8公里以内为短途,每公里0.8元", () -> {
                it("3公里6.8元", () -> {
                });
                it("7公里10元", () -> {
                });
            });
            describe("等待时间每分钟0.25元", () -> {
                it("3公里等待1分钟7.05元", () -> {
                });
            });
            // FIXME 下面这两个用例放在这里感觉不太好,应该怎么改?
            // TODO 这两个需求需要跟BA或者客户确认
            describe("不足1公里的按1公里算", () -> {
                it("2.1公里也是6.8元", () -> {
                });
            });
            describe("等待不足1分钟的不算", () -> {
                it("3公里等待59秒也是6.8元", () -> {
                });
            });
        });

        describe("长途收费=起步价+每公里正常费用+超长部分每分里加收费用+等待费用", () -> {
            describe("8公里开始为长途,每公里加收50%运费", () -> {
                it("8公里要收11.2元", () -> {
                });
                it("100公里要收121.6元", () -> {
                });
            });
            it("等待时间每分钟0.25元", () -> {
                it("8公里等待1分钟要收11.45元", () -> {
                });
            });
        });
    });

    describe("最终费用如何调整", () -> {
        describe("最终价格会被四舍五入到元", () -> {
            it("6元还是6元", () -> {
            });
            it("6.49元收6元", () -> {
            });
            it("6.50元收7元", () -> {
            });
        });
    });

// @formatter:off
}}
// @formatter:on
