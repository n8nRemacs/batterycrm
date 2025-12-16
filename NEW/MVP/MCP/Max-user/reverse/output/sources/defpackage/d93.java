package defpackage;

/* loaded from: classes2.dex */
public interface d93 {
    long a();

    default boolean b(long j) {
        return a() <= j && j <= c();
    }

    long c();
}
