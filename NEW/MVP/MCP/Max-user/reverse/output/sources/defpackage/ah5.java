package defpackage;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ah5 implements zy7 {
    public final Enum[] a;
    public xg5 b;
    public final bwf c;

    public ah5(String str, Enum[] enumArr) {
        this.a = enumArr;
        this.c = new bwf(new qn2(this, 10, str));
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        Enum r5 = (Enum) obj;
        Enum[] enumArr = this.a;
        int iY = ys.y(enumArr, r5);
        if (iY != -1) {
            ree reeVarD = d();
            bVar.getClass();
            bVar.r(reeVarD.g(iY));
        } else {
            throw new SerializationException(r5 + " is not a valid enum " + d().a() + ", must be one of " + Arrays.toString(enumArr));
        }
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        int iS = lh4Var.s(d());
        Enum[] enumArr = this.a;
        if (iS >= 0 && iS < enumArr.length) {
            return enumArr[iS];
        }
        throw new SerializationException(iS + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.zy7
    public final ree d() {
        return (ree) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
