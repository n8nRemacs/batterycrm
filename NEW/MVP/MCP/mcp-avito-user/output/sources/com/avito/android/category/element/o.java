package com.avito.android.category.element;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryWidgetElementItemViewImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class o extends N implements Y41.p<DeepLink, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f116625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<DeepLink, String, G0> f116626m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.avito.android.lib.design.bottom_sheet.d dVar, Y41.p<? super DeepLink, ? super String, G0> pVar) {
        super(2);
        this.f116625l = dVar;
        this.f116626m = pVar;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, String str) {
        this.f116625l.r();
        this.f116626m.invoke(deepLink, str);
        return G0.f406611a;
    }
}
