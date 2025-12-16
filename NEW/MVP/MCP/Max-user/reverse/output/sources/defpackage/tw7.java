package defpackage;

/* loaded from: classes.dex */
public abstract class tw7 {
    public static final vl7 a = yfi.a(rmf.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final tx7 a(sw7 sw7Var) {
        tx7 tx7Var = sw7Var instanceof tx7 ? (tx7) sw7Var : null;
        if (tx7Var != null) {
            return tx7Var;
        }
        throw new IllegalArgumentException("Element " + vid.a(sw7Var.getClass()) + " is not a JsonPrimitive");
    }
}
