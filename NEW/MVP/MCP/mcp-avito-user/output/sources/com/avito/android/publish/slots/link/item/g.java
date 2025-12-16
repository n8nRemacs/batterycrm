package com.avito.android.publish.slots.link.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LinkSlotItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/link/item/g;", "Lcom/avito/android/publish/slots/link/item/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f244501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f244502c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f244503d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f244504e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f244505f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f244506g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f244507h;

    @Inject
    public g(@k com.avito.android.util.text.a aVar) {
        this.f244501b = aVar;
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244502c = cVar;
        this.f244503d = cVar;
        com.jakewharton.rxrelay3.c<String> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244504e = cVar2;
        this.f244505f = cVar2;
        com.jakewharton.rxrelay3.c<DeepLink> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f244506g = cVar3;
        this.f244507h = cVar3;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) aVar;
        e eVar2 = new e(cVar, this);
        AttributedText attributedText = cVar.f244491c;
        attributedText.setOnUrlClickListener(eVar2);
        attributedText.setOnDeepLinkClickListener(new f(cVar, this));
        ((i) eVar).g0(this.f244501b.b(attributedText));
    }

    @Override // com.avito.android.publish.slots.link.item.d
    @k
    /* renamed from: Z0, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF244503d() {
        return this.f244503d;
    }

    @Override // com.avito.android.publish.slots.link.item.d
    @k
    public final z<DeepLink> j() {
        return this.f244507h;
    }

    @Override // com.avito.android.publish.slots.link.item.d
    @k
    public final z<String> l() {
        return this.f244505f;
    }
}
