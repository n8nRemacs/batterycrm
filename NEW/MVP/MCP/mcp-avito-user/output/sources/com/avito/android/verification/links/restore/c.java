package com.avito.android.verification.links.restore;

import com.avito.android.remote.model.common.VerificationRedirectResult;
import kotlin.Metadata;

/* compiled from: VerificationRestoreLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/common/VerificationRedirectResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/common/VerificationRedirectResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f324388b;

    public c(e eVar) {
        this.f324388b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        b bVar = new b();
        e eVar = this.f324388b;
        eVar.i(bVar, eVar.f324394j, ((VerificationRedirectResult) obj).getUri());
    }
}
