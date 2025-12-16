package defpackage;

/* loaded from: classes2.dex */
public interface pb3 {
    default boolean b() {
        pe8 pe8Var = (pe8) this;
        String string = pe8Var.g.getString(vb9.e(pe8Var.s(), "app.pin_"), null);
        return !(string == null || string.length() == 0);
    }
}
