package defpackage;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class bfd implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ bfd(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        bwf bwfVarD;
        int i = this.a;
        int i2 = 2;
        int i3 = 1;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                Context context = recordControlsWidget.getContext();
                int i4 = ivd.a;
                return new jg5(context);
            case 1:
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                int iOrdinal = recordControlsWidget.R0().ordinal();
                if (iOrdinal == 0) {
                    return new w6h();
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                o6i o6iVar = o6i.a;
                return new e40(o6iVar.getAccessor().d(8), o6iVar.getAccessor().d(37));
            case 2:
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                if (recordControlsWidget.R0() == tdd.b) {
                    return new w60(o6i.a.getAccessor().d(496));
                }
                return null;
            case 3:
                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                return recordControlsWidget.R0() == tdd.a ? new z4h(o6i.a.getAccessor().d(161), ((fed) recordControlsWidget.b.getValue()).b) : new l40();
            case 4:
                yy7[] yy7VarArr5 = RecordControlsWidget.g1;
                tdd tddVarR0 = recordControlsWidget.R0();
                fed fedVar = (fed) recordControlsWidget.b.getValue();
                int iOrdinal2 = recordControlsWidget.R0().ordinal();
                if (iOrdinal2 == 0) {
                    bwfVarD = o6i.a.getAccessor().d(494);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bwfVarD = o6i.a.getAccessor().d(496);
                }
                return new zed(tddVarR0, fedVar, bwfVarD, new bwf(new bfd(recordControlsWidget, i3)), new bwf(new bfd(recordControlsWidget, i2)), new bwf(new bfd(recordControlsWidget, 3)), new hdc(27));
            case 5:
                return r34.b(recordControlsWidget.getContext(), recordControlsWidget.E0.a);
            case 6:
                yy7[] yy7VarArr6 = RecordControlsWidget.g1;
                return r34.b(recordControlsWidget.getContext(), yud.O0);
            default:
                yy7[] yy7VarArr7 = RecordControlsWidget.g1;
                float f = 2;
                return new InsetDrawable(r34.b(recordControlsWidget.getContext(), yud.p), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density));
        }
    }
}
