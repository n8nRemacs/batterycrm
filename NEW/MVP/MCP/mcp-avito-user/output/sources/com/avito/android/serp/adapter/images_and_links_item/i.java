package com.avito.android.serp.adapter.images_and_links_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImagesWithLinksItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/i;", "Lcom/avito/android/serp/adapter/images_and_links_item/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Kundle f270185b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f270186c;

    @Inject
    public i(@sr0.f @Y61.l Kundle kundle) {
        this.f270185b = kundle == null ? new Kundle() : kundle;
        this.f270186c = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        ImagesWithLinksItem imagesWithLinksItem = (ImagesWithLinksItem) aVar;
        lVar.Wv(imagesWithLinksItem.f270171e, imagesWithLinksItem.f270173g);
        lVar.W0(this.f270185b.f318647b.getInt("current_position", 0));
        this.f270186c.b(lVar.PH().t0(new h(this)));
        String str = imagesWithLinksItem.f270168b;
        if (str != null) {
            lVar.setTitle(str);
        }
    }
}
