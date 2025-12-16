package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: DevelopmentListItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/e;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34760e implements InterfaceC34758c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f270978b;

    public C34760e(@Y61.k h31.e<InterfaceC47690b> eVar) {
        this.f270978b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Image image;
        InterfaceC34761f interfaceC34761f = (InterfaceC34761f) eVar;
        DevelopmentItem developmentItem = (DevelopmentItem) aVar;
        interfaceC34761f.setTitle(developmentItem.f270895d);
        interfaceC34761f.p(developmentItem.f270897f);
        List<Image> list = developmentItem.f270903l;
        com.avito.android.image_loader.a aVarB = (list == null || (image = (Image) C42745f0.E(list)) == null) ? null : com.avito.android.image_loader.b.b(image);
        if (aVarB != null) {
            InterfaceC34846e.a.a(interfaceC34761f, aVarB, null, 6);
        }
        List<String> list2 = developmentItem.f270907p;
        if (list2 != null) {
            interfaceC34761f.i1(C42745f0.O(list2, "\n", null, null, null, 62));
        }
        List<GeoReference> list3 = developmentItem.f270906o;
        interfaceC34761f.Q5(list3 != null ? (GeoReference) C42745f0.E(list3) : null);
        interfaceC34761f.l3(developmentItem.f270896e);
        interfaceC34761f.c(new C34759d(this, developmentItem));
    }
}
