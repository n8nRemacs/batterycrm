package defpackage;

import android.os.Bundle;
import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public abstract class j5j {
    public static oq3 a(s5g s5gVar, Bundle bundle, f1e f1eVar, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            f1eVar = null;
        }
        return new oq3(s5gVar, bundle, f1eVar);
    }

    public static final void b(s5c s5cVar, yl3 yl3Var, String str) {
        String string;
        yl3Var.n().getClass();
        uog.g(1, null);
        s5cVar.getClass();
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        ca3 ca3Var = null;
        sb.append(ca3Var.b());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + string2 + '.';
        } else {
            StringBuilder sbL = wy1.l("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            ho7.r(sbL, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbL.append(ca3Var.b());
            sbL.append("' has to be sealed and '@Serializable'.");
            string = sbL.toString();
        }
        throw new SerializationException(string);
    }
}
