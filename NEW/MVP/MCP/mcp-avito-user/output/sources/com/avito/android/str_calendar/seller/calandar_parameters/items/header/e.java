package com.avito.android.str_calendar.seller.calandar_parameters.items.header;

import Gy0.InterfaceC13931a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: HeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f287189b;

    public e(f fVar) {
        this.f287189b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        f fVar = this.f287189b;
        fVar.f287190b.invoke(new InterfaceC13931a.q((DeepLink) obj));
    }
}
