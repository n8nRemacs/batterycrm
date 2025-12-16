package com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemsListSnippetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/h;", "LTV0/d;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements TV0.d<a, f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<? extends e> f194022b;

    public h(@k h31.e<? extends e> eVar) {
        this.f194022b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        f fVar = (f) aVar;
        aVar2.setTitle(fVar.f194015c);
        aVar2.p(fVar.f194016d);
        aVar2.V(fVar.f194018f);
        aVar2.wI(L.f(fVar.f194019g, Boolean.TRUE));
        aVar2.z2(fVar.f194017e);
        aVar2.a(new g(this, fVar));
    }
}
