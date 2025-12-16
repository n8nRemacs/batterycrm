package defpackage;

import androidx.appcompat.widget.AppCompatCheckBox;

/* loaded from: classes2.dex */
public final class u0b extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ v0b d;

    /* JADX WARN: Illegal instructions before constructor call */
    public u0b(v0b v0bVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.d = v0bVar;
                super(12, bool);
                break;
            case 2:
                this.d = v0bVar;
                super(12, (Object) null);
                break;
            case 3:
                this.d = v0bVar;
                super(12, r0b.a);
                break;
            case 4:
                this.d = v0bVar;
                super(12, q0b.b);
                break;
            case 5:
                this.d = v0bVar;
                super(12, s0b.a);
                break;
            case 6:
                this.d = v0bVar;
                super(12, s0b.a);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.d = v0bVar;
                super(12, bool2);
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        AppCompatCheckBox appCompatCheckBox;
        switch (this.c) {
            case 0:
                v0b v0bVar = this.d;
                und undVar = v0bVar.z0;
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (undVar.e() || zBooleanValue) {
                        AppCompatCheckBox appCompatCheckBox2 = v0bVar.I0;
                        if (appCompatCheckBox2 != null) {
                            v0bVar.removeView(appCompatCheckBox2);
                        }
                        if (zBooleanValue) {
                            appCompatCheckBox = (AppCompatCheckBox) undVar.getValue();
                        } else {
                            undVar.reset();
                            appCompatCheckBox = null;
                        }
                        if (appCompatCheckBox != null) {
                            v0bVar.addView(appCompatCheckBox);
                            v0bVar.requestLayout();
                        }
                        v0bVar.I0 = appCompatCheckBox;
                        break;
                    }
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    und undVar2 = this.d.z0;
                    if (undVar2.e()) {
                        ((AppCompatCheckBox) undVar2.getValue()).setChecked(zBooleanValue2);
                        break;
                    }
                }
                break;
            case 2:
                if (!fni.a(obj, obj2)) {
                    yeb yebVarY = (yeb) obj2;
                    v0b v0bVar2 = this.d;
                    if (yebVarY == null) {
                        yebVarY = a93.s0.y(v0bVar2);
                    }
                    v0bVar2.onThemeChanged(yebVarY);
                    break;
                }
                break;
            case 3:
                if (!fni.a(obj, obj2)) {
                    this.d.m();
                    break;
                }
                break;
            case 4:
                if (!fni.a(obj, obj2)) {
                    v0b.b(this.d);
                    break;
                }
                break;
            case 5:
                if (!fni.a(obj, obj2)) {
                    v0b v0bVar3 = this.d;
                    v0bVar3.requestLayout();
                    v0bVar3.invalidate();
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    v0b v0bVar4 = this.d;
                    v0bVar4.requestLayout();
                    v0bVar4.invalidate();
                    break;
                }
                break;
        }
    }
}
