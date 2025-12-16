package com.avito.android.deal_confirmation.deep_link;

import com.avito.android.deal_confirmation.deep_link.a;
import com.avito.android.remote.model.DealConfirmationFeedbackResult;
import kotlin.Metadata;
import l41.g;

/* compiled from: DealConfirmationLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/DealConfirmationFeedbackResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/DealConfirmationFeedbackResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f132746b;

    public b(a aVar) {
        this.f132746b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f132746b.j(new a.AbstractC3975a.b(((DealConfirmationFeedbackResult) obj).getMessage()));
    }
}
