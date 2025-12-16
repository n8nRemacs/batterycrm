package ru.cyberity.cbr.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRAuthenticationFailureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final class CBRAuthenticationFailureException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public CBRAuthenticationFailureException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CBRAuthenticationFailureException(@Y61.k String str) {
        super(str);
    }

    public /* synthetic */ CBRAuthenticationFailureException(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "Authentication failure" : str);
    }
}
