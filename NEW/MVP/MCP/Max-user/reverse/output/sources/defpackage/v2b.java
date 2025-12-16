package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final class v2b extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ w2b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2b(w2b w2bVar, int i) {
        super(12, t75.b);
        this.c = i;
        switch (i) {
            case 2:
                this.d = w2bVar;
                super(12, r2b.a);
                break;
            case 3:
                Boolean bool = Boolean.FALSE;
                this.d = w2bVar;
                super(12, bool);
                break;
            case 4:
                Boolean bool2 = Boolean.TRUE;
                this.d = w2bVar;
                super(12, bool2);
                break;
            default:
                this.d = w2bVar;
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    w2b w2bVar = this.d;
                    if (!w2bVar.C0) {
                        w2bVar.a(w2bVar.getTextFont());
                        break;
                    }
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    w2b w2bVar2 = this.d;
                    if (!w2bVar2.C0) {
                        w2bVar2.a(w2bVar2.getTextFont());
                        break;
                    }
                }
                break;
            case 2:
                if (!fni.a(obj, obj2)) {
                    v1a v1aVar = a93.s0;
                    w2b w2bVar3 = this.d;
                    w2bVar3.f(v1aVar.y(w2bVar3));
                    break;
                }
                break;
            case 3:
                w2b w2bVar4 = this.d;
                GradientDrawable gradientDrawable = w2bVar4.B0;
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (!zBooleanValue) {
                        gradientDrawable.setStroke(kti.d(0 * vw4.d().getDisplayMetrics().density), (ColorStateList) null);
                        break;
                    } else {
                        gradientDrawable.setStroke(kti.c(vw4.d().getDisplayMetrics().density * 1.5d), a93.s0.y(w2bVar4).i().a.a.a);
                        break;
                    }
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    w2b w2bVar5 = this.d;
                    w2bVar5.setBackground(zBooleanValue2 ? w2bVar5.B0 : null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2b(Object obj, w2b w2bVar) {
        super(12, obj);
        this.c = 1;
        this.d = w2bVar;
    }
}
