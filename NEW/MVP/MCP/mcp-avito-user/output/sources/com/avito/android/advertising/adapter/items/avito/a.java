package com.avito.android.advertising.adapter.items.avito;

import Fb.C13552b;
import Fb.C13554d;
import Fb.InterfaceC13553c;
import TV0.g;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.fresco.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44740d;

/* compiled from: AvitoNetworkImageBigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/a;", "LTV0/b;", "LFb/c;", "Lcom/avito/android/advertising/adapter/items/avito/AvitoNetworkImageBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<InterfaceC13553c, AvitoNetworkImageBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f87001a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44740d f87002b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<C13554d> f87003c = new g.a<>(R.layout.ad_avito, new C2592a());

    /* compiled from: AvitoNetworkImageBigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LFb/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LFb/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.avito.a$a, reason: collision with other inner class name */
    public static final class C2592a extends N implements p<ViewGroup, View, C13554d> {
        public C2592a() {
            super(2);
        }

        @Override // Y41.p
        public final C13554d invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            C13554d c13554d = new C13554d(view, AdStyle.f88537b);
            boolean zA2 = a.this.f87002b.a();
            C13552b c13552b = c13554d.f4796b;
            if (zA2) {
                c13552b.c(R.dimen.ad_image_corner_radius);
                SimpleDraweeView simpleDraweeView = c13552b.f4794d;
                simpleDraweeView.setBackground(null);
                simpleDraweeView.setForeground(androidx.core.content.d.getDrawable(c13552b.f4795e.getContext(), R.drawable.ad_borderless_foreground));
            } else {
                c13552b.b();
            }
            return c13554d;
        }
    }

    @Inject
    public a(@k c cVar, @k InterfaceC44740d interfaceC44740d) {
        this.f87001a = cVar;
        this.f87002b = interfaceC44740d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87001a;
    }

    @Override // TV0.b
    @k
    public final g.a<C13554d> b() {
        return this.f87003c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AvitoNetworkImageBannerItem) && (this.f87002b.a() || !((AvitoNetworkImageBannerItem) aVar).getDisplayType().isInformative());
    }
}
