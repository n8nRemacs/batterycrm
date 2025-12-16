package com.avito.android.deal_confirmation.deep_link;

import com.avito.android.R;
import com.avito.android.deal_confirmation.deep_link.a;
import kotlin.Metadata;
import l41.g;

/* compiled from: DealConfirmationLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f132747b;

    public c(a aVar) {
        this.f132747b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        a aVar = this.f132747b;
        aVar.j(new a.AbstractC3975a.C3976a(aVar.f132742h.getResources().getString(R.string.deal_confirmation_default_error)));
    }
}
