package defpackage;

import java.io.IOException;
import ru.ok.android.api.core.ApiException;

/* loaded from: classes.dex */
public final class wg1 implements jm {
    @Override // defpackage.jm
    public final void debugApiException(sl slVar, hm hmVar, ApiException apiException) {
        wqi.p("ApiProviderTag", "debugApiException: " + hmVar.getUri() + " " + apiException.getMessage(), apiException);
    }

    @Override // defpackage.jm
    public final void debugApiRequest(sl slVar, hm hmVar, tl tlVar) {
        wqi.c("ApiProviderTag", "debugApiRequest: " + hmVar.getUri(), new Object[0]);
    }

    @Override // defpackage.jm
    public final xx7 debugApiResponseFail(sl slVar, hm hmVar, xx7 xx7Var) {
        wqi.q("ApiProviderTag", "debugApiResponseFail: " + hmVar.getUri(), new Object[0]);
        return xx7Var;
    }

    @Override // defpackage.jm
    public final xx7 debugApiResponseOk(sl slVar, hm hmVar, xx7 xx7Var) {
        wqi.c("ApiProviderTag", "debugApiResponseOk: " + hmVar.getUri(), new Object[0]);
        return xx7Var;
    }

    @Override // defpackage.jm
    public final void debugIoException(sl slVar, hm hmVar, IOException iOException) {
        wqi.p("ApiProviderTag", "debugIoException: " + hmVar.getUri() + " " + iOException.getMessage(), iOException);
    }
}
