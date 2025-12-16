package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import com.avito.android.error.z;
import com.avito.android.messenger.conversation.mvi.deeplinks.review.f;
import kotlin.Metadata;

/* compiled from: RequestReviewLinkDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f190664b;

    public h(f fVar) {
        this.f190664b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        f.k(this.f190664b, new f.a.C5640a(new a(z.l(th2), null, th2, 2, null)));
    }
}
