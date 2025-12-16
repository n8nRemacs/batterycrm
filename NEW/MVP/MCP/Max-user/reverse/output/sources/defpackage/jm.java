package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* loaded from: classes2.dex */
public interface jm {
    public static final im a = new im();

    default void debugApiException(sl slVar, hm hmVar, ApiException apiException) {
    }

    default void debugApiRequest(sl slVar, hm hmVar, tl tlVar) {
    }

    default xx7 debugApiResponseFail(sl slVar, hm hmVar, xx7 xx7Var) {
        return xx7Var;
    }

    default xx7 debugApiResponseOk(sl slVar, hm hmVar, xx7 xx7Var) {
        return xx7Var;
    }

    default void debugIoException(sl slVar, hm hmVar, IOException iOException) {
    }
}
