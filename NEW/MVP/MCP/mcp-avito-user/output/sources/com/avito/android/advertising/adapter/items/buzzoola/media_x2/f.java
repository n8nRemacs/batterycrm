package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import Db.InterfaceC13381a;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaMediaX2Presenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/f;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44739c> f87335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f87336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f87337d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.i f87338e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f87339f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.ui.buzzoola.i f87340g;

    @Inject
    public f(@Y61.k InterfaceC13381a interfaceC13381a, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k com.avito.android.advertising.ui.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k h31.e eVar) {
        this.f87335b = eVar;
        this.f87336c = cVar;
        this.f87337d = aVar;
        this.f87338e = iVar;
        this.f87339f = interfaceC13381a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, final int i12) throws Resources.NotFoundException {
        String string;
        j jVar = (j) eVar;
        BuzzoolaMediaX2BannerItem buzzoolaMediaX2BannerItem = (BuzzoolaMediaX2BannerItem) aVar;
        final BuzzoolaBanner.BuzzoolaMediaX2 banner = buzzoolaMediaX2BannerItem.getBanner();
        h31.e<InterfaceC44739c> eVar2 = this.f87335b;
        final WeakReference weakReference = new WeakReference(eVar2);
        final BannerInfo f74925c = buzzoolaMediaX2BannerItem.getF74925c();
        if (banner.f88235h.f88309g != BuzzoolaPromoType.INTERNAL) {
            string = banner.f88232e;
            if (string == null) {
                string = jVar.getF88600b().getResources().getString(R.string.advertising_badge_name);
            }
        } else {
            string = null;
        }
        if (this.f87339f.f()) {
            com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
            View f88600b = jVar.getF88600b();
            hVar.getClass();
            com.avito.android.advertising.ui.h.b(f88600b, buzzoolaMediaX2BannerItem);
        }
        InterfaceC44739c interfaceC44739c = eVar2.get();
        if (interfaceC44739c != null) {
            interfaceC44739c.J4(f74925c, i12);
        }
        jVar.getF88605g().setRatio(banner.f88233f);
        jVar.getF87357f().setImageURI(banner.f88229b);
        jVar.f20(jVar.getF87358g(), string);
        jVar.getF87358g().setOnClickListener(new d(0, this, banner));
        jVar.Be(banner.f88234g);
        final WeakReference weakReference2 = new WeakReference(this.f87337d);
        jVar.getF88605g().setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advertising.adapter.items.buzzoola.media_x2.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC44739c interfaceC44739c2;
                h31.e eVar3 = (h31.e) weakReference.get();
                if (eVar3 != null && (interfaceC44739c2 = (InterfaceC44739c) eVar3.get()) != null) {
                    interfaceC44739c2.C1(f74925c, i12);
                }
                f fVar = this;
                BuzzoolaBanner.BuzzoolaMediaX2 buzzoolaMediaX2 = banner;
                fVar.f87336c.d(buzzoolaMediaX2.f88236i);
                fVar.f87338e.a((com.avito.android.deeplink_handler.handler.composite.a) weakReference2.get(), buzzoolaMediaX2.f88235h.f88304b);
            }
        });
    }
}
