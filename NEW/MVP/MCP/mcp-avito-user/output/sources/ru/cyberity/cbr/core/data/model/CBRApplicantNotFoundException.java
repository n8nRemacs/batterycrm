package ru.cyberity.cbr.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRApplicantNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "applicantId", "", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final class CBRApplicantNotFoundException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public CBRApplicantNotFoundException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CBRApplicantNotFoundException(@Y61.l String str) {
        super(AK.c.k("Applicant(", str, ") is not found"));
    }

    public /* synthetic */ CBRApplicantNotFoundException(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}
