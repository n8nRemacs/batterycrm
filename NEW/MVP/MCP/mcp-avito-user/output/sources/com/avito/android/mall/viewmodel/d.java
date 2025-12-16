package com.avito.android.mall.viewmodel;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mall.m;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: MallViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f184373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f184374c;

    public d(g gVar, String str) {
        this.f184373b = gVar;
        this.f184374c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        g gVar = this.f184373b;
        if (z12) {
            gVar.f184377E.c((DeepLink) ((P2.b) p22).f318720a);
            gVar.f184386R.setValue(new m.a());
            gVar.f184389U.onNext("");
        } else {
            if (!(p22 instanceof P2.a)) {
                p22.equals(P2.c.f318721a);
                return;
            }
            gVar.f184377E.a(new SearchParams(null, null, null, null, null, null, null, null, null, null, this.f184374c, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 1, null));
            gVar.f184386R.setValue(new m.a());
            gVar.f184389U.onNext("");
        }
    }
}
