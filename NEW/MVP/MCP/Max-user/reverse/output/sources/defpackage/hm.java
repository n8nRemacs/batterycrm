package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public interface hm {
    default int getPriority() {
        return 16;
    }

    nm getScope();

    Uri getUri();

    default boolean shouldGzip() {
        return false;
    }

    default boolean shouldPost() {
        return false;
    }

    default boolean willWriteParams() {
        return true;
    }

    default boolean willWriteSupplyParams() {
        return false;
    }

    void writeParams(gy7 gy7Var);

    default void writeSupplyParams(gy7 gy7Var) {
    }
}
