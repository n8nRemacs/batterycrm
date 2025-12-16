package defpackage;

/* loaded from: classes2.dex */
public interface bl0 {
    String appToken();

    String buildUuid();

    String environment();

    default boolean isDisabled() {
        return false;
    }

    String namespace();

    String versionName();
}
