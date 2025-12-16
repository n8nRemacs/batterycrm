package com.avito.android.verification.links.esia;

import com.avito.android.remote.model.common.VerificationRedirectResult;
import kotlin.Metadata;
import l41.o;

/* compiled from: VerificationEsiaLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lcom/avito/android/remote/model/common/VerificationRedirectResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final f<T, R> f324253b = new f<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((VerificationRedirectResult) obj).getUri();
    }
}
