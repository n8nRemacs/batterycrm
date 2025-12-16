package com.avito.android.serp.adapter.rich_snippets.service;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.SerpViewType;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertRichServiceItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/c;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/service/v;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34805c implements TV0.b<v, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34807e f271308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.video_snippets.g f271309b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<w> f271310c = new g.a<>(R.layout.advert_item_rich_service, new a());

    /* compiled from: AdvertRichServiceItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/service/w;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/service/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.rich_snippets.service.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, w> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final w invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            return new w(view2, AsyncViewportTracker.ViewContext.f430419i, new com.avito.android.cyclic_gallery_widget.image_carousel.m(view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.56f, 1.3333334f, 0.0f, 0.0f, 12, null), null, false, C34805c.this.f271309b, 8, null);
        }
    }

    @Inject
    public C34805c(@Y61.k InterfaceC34807e interfaceC34807e, @Y61.l com.avito.android.video_snippets.g gVar) {
        this.f271308a = interfaceC34807e;
        this.f271309b = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f271308a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<w> b() {
        return this.f271310c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) aVar;
            if (advertItem.f268374D == SerpViewType.f268582b && advertItem.f268378F.isService()) {
                return true;
            }
        }
        return false;
    }
}
