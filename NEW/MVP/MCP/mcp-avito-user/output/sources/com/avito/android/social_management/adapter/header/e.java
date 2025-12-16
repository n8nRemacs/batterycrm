package com.avito.android.social_management.adapter.header;

import Y61.k;
import com.avito.android.social_management.adapter.SocialItem;
import kotlin.Metadata;

/* compiled from: HeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/header/e;", "Lcom/avito/android/social_management/adapter/header/b;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f284527b;

    public e(@k com.jakewharton.rxrelay3.c cVar) {
        this.f284527b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        SocialItem.Header header = (SocialItem.Header) aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.d(new c(fVar, cVar));
        cVar.b(fVar.A().t0(new d(this, header)));
        fVar.g0(header.f284480c);
    }
}
