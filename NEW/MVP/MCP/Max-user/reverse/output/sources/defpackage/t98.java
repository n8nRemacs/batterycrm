package defpackage;

/* loaded from: classes2.dex */
public interface t98 {
    long getItemId();

    default boolean h(t98 t98Var) {
        return getItemId() == t98Var.getItemId();
    }

    default Object k(t98 t98Var) {
        return null;
    }

    int m();

    default boolean q(t98 t98Var) {
        return equals(t98Var);
    }
}
