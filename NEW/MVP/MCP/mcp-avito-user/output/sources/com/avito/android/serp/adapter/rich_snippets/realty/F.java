package com.avito.android.serp.adapter.rich_snippets.realty;

import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.serp.adapter.serp_advert_card.C34847f;
import com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: DevelopmentXlListItemView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/F;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/E;", "Lcom/avito/android/serp/adapter/serp_advert_card/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F extends com.avito.android.serp.c implements E, InterfaceC34846e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34847f f270929b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f270930c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270931d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(@Y61.k View view, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        super(view);
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430426p;
        this.f270929b = new C34847f(view, aVar, hVar, locale, viewContext);
        View viewFindViewById = view.findViewById(R.id.metro);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f270930c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image_second);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f270931d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image_third);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f270932e = (SimpleDraweeView) viewFindViewById3;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from) {
        this.f270929b.B3(aVar, null, from);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.realty.E
    public final void ME(@Y61.k com.avito.android.image_loader.a aVar) {
        InterfaceC34846e.a.b(this, this.f270932e, aVar);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.realty.E
    public final void Q5(@Y61.l GeoReference geoReference) {
        int i12;
        LinearLayout linearLayout = this.f270930c;
        linearLayout.removeAllViews();
        if (geoReference != null) {
            new os0.d(linearLayout).b(geoReference);
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void c(@Y61.l Y41.a<G0> aVar) {
        this.f270929b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void i1(@Y61.l String str) {
        this.f270929b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.realty.E
    public final void jM(@Y61.k com.avito.android.image_loader.a aVar) {
        InterfaceC34846e.a.b(this, this.f270931d, aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void l3(@Y61.l String str) {
        this.f270929b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.realty.E
    public final void p(@Y61.l String str) {
        z3(str, false, null);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setTitle(@Y61.k String str) {
        this.f270929b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f270929b.vd(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f270929b.z3(str, false, null);
    }
}
