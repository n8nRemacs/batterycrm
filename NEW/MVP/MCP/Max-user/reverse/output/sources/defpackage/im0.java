package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class im0 extends ht3 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im0(vt3 vt3Var, int i) {
        super(vt3Var);
        this.f = i;
    }

    @Override // defpackage.ht3
    public final boolean a(r5i r5iVar) {
        switch (this.f) {
            case 0:
                return r5iVar.j.b;
            case 1:
                return r5iVar.j.d;
            case 2:
                return r5iVar.j.a == 2;
            case 3:
                int i = r5iVar.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return r5iVar.j.e;
        }
    }

    @Override // defpackage.ht3
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                gea geaVar = (gea) obj;
                return (geaVar.a && geaVar.b) ? false : true;
            case 3:
                gea geaVar2 = (gea) obj;
                return !geaVar2.a || geaVar2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
