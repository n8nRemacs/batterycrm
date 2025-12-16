package com.avito.android.social_management.adapter.vk_group;

import Y61.k;
import com.avito.android.social_management.adapter.SocialItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VkGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/vk_group/f;", "Lcom/avito/android/social_management/adapter/vk_group/c;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f284558b;

    @Inject
    public f(@k com.jakewharton.rxrelay3.c cVar) {
        this.f284558b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SocialItem.VkGroupItem vkGroupItem = (SocialItem.VkGroupItem) aVar;
        hVar.SV(vkGroupItem);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        hVar.d(new d(hVar, cVar));
        cVar.b(hVar.A().t0(new e(this, vkGroupItem)));
    }
}
