package com.avito.android.category.element;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryWidgetElementItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "title", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.p<DeepLink, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f116608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f116609m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, int i12) {
        super(2);
        this.f116608l = jVar;
        this.f116609m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, String str) {
        j jVar = this.f116608l;
        int i12 = this.f116609m;
        jVar.f116611b.p7(i12, deepLink, str);
        return G0.f406611a;
    }
}
