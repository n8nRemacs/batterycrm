package com.avito.android.bxcontent;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "loadedLink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.x0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29264x0 extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f113240l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AsyncPhoneItem f113241m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContactSource f113242n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29264x0(C29253t0 c29253t0, AsyncPhoneItem asyncPhoneItem, ContactSource contactSource) {
        super(1);
        this.f113240l = c29253t0;
        this.f113241m = asyncPhoneItem;
        this.f113242n = contactSource;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DeepLink deepLink) {
        String f157692b = this.f113241m.getF267834b();
        this.f113240l.W(f157692b, deepLink, this.f113242n, null, null);
        return kotlin.G0.f406611a;
    }
}
