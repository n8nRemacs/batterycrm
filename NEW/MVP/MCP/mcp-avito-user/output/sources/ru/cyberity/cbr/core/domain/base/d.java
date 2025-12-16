package ru.cyberity.cbr.core.domain.base;

import Y61.k;
import kotlin.Metadata;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBRErrorHandler;
import ru.cyberity.cbr.core.data.model.CBRApplicantNotFoundException;
import ru.cyberity.cbr.core.data.model.CBRConfigNotFoundException;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: CommonExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/source/common/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {
    @k
    public static final Exception a(@k ru.cyberity.cbr.core.data.source.common.a aVar, @k Exception exc) {
        if (exc instanceof CBRException) {
            CBRException cBRException = (CBRException) exc;
            if (cBRException instanceof CBRException.Api) {
                Integer code = ((CBRException.Api) exc).getCode();
                aVar.a((code != null && code.intValue() == 401) ? CBRSDKState.Failed.Unauthorized.INSTANCE : new CBRSDKState.Failed.Unknown(exc));
            } else if (cBRException instanceof CBRException.Unknown) {
                aVar.a(new CBRSDKState.Failed.Unknown(exc));
            } else if (cBRException instanceof CBRException.Network) {
                aVar.a(new CBRSDKState.Failed.NetworkError(exc));
            }
            try {
                CBRErrorHandler errorHandler = n0.f432787a.getErrorHandler();
                if (errorHandler != null) {
                    errorHandler.onError((CBRException) exc);
                }
            } catch (Exception e12) {
                ru.cyberity.log.a aVar2 = ru.cyberity.log.a.f436064a;
                String strA = ru.cyberity.log.c.a(aVar);
                String message = e12.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar2.e(strA, message, e12);
            }
        } else if (exc instanceof CBRApplicantNotFoundException) {
            aVar.a(new CBRSDKState.Failed.ApplicantNotFound(exc));
        } else if (exc instanceof CBRConfigNotFoundException) {
            aVar.a(new CBRSDKState.Failed.InitialLoadingFailed(exc));
        }
        return exc;
    }
}
