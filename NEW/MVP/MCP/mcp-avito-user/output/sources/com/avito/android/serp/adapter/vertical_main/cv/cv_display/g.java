package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: CvDisplayItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f272788l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f272789m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CvDisplayItem f272790n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i12, CvDisplayItem cvDisplayItem) {
        super(1);
        this.f272788l = hVar;
        this.f272789m = i12;
        this.f272790n = cvDisplayItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        h hVar = this.f272788l;
        Integer numValueOf = Integer.valueOf(this.f272789m);
        CvDisplayItem cvDisplayItem = this.f272790n;
        d.a.a(hVar.f272792c, numValueOf, "cvDisplayWidget", cvDisplayItem.f272768c, null, null, null, null, cvDisplayItem.f272771f, 120);
        InterfaceC47691c.a.a(hVar.f272791b.get(), deepLink, null, 14);
        return G0.f406611a;
    }
}
