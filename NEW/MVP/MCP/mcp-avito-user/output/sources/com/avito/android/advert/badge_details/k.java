package com.avito.android.advert.badge_details;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.advert_badge_bar.BadgeDetailsResponse;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: BadgeDetailsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/badge_details/k;", "Lcom/avito/android/advert/badge_details/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f68782a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f68783b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f68784c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f68785d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.badge_details.d f68786e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final n f68787f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f68788g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f68789h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f68790i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f68791j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public s f68792k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public BadgeDetailsActivity f68793l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public BadgeDetailsResponse f68794m;

    /* compiled from: BadgeDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BadgeDetailsResponse f68796c;

        public a(BadgeDetailsResponse badgeDetailsResponse) {
            this.f68796c = badgeDetailsResponse;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink uri;
            k kVar = k.this;
            kVar.f68785d.c(new com.avito.android.advert.badge_details.c(kVar.f68783b, kVar.f68782a));
            BadgeDetailsResponse.Action action = this.f68796c.getAction();
            if (action != null && (uri = action.getUri()) != null) {
                b.a.a(kVar.f68789h, uri, null, null, 6);
            }
            BadgeDetailsActivity badgeDetailsActivity = kVar.f68793l;
            if (badgeDetailsActivity != null) {
                badgeDetailsActivity.finish();
            }
        }
    }

    /* compiled from: BadgeDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f68797b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: BadgeDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            BadgeDetailsActivity badgeDetailsActivity = k.this.f68793l;
            if (badgeDetailsActivity != null) {
                badgeDetailsActivity.finish();
            }
        }
    }

    /* compiled from: BadgeDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f68799b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public k(@com.avito.android.advert.badge_details.di.d int i12, @com.avito.android.advert.badge_details.di.g @Y61.k String str, @com.avito.android.advert.badge_details.di.f @Y61.k String str2, @Y61.l Kundle kundle, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.advert.badge_details.d dVar, @Y61.k n nVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f68782a = i12;
        this.f68783b = str;
        this.f68784c = str2;
        this.f68785d = interfaceC28373a;
        this.f68786e = dVar;
        this.f68787f = nVar;
        this.f68788g = interfaceC35745a5;
        this.f68789h = aVar;
        this.f68794m = kundle != null ? (BadgeDetailsResponse) kundle.d("badgeDetails") : null;
    }

    @Override // com.avito.android.advert.badge_details.h
    public final void a(@Y61.k BadgeDetailsActivity badgeDetailsActivity) {
        this.f68793l = badgeDetailsActivity;
    }

    @Override // com.avito.android.advert.badge_details.h
    public final void b(@Y61.k s sVar) {
        this.f68792k = sVar;
        BadgeDetailsResponse badgeDetailsResponse = this.f68794m;
        if (badgeDetailsResponse != null) {
            c(badgeDetailsResponse);
            return;
        }
        String str = this.f68784c;
        B0 b0A = this.f68786e.a(this.f68782a, this.f68783b, str);
        InterfaceC35745a5 interfaceC35745a5 = this.f68788g;
        z<T> zVarR0 = b0A.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).r0(P2.c.f318721a);
        i iVar = new i(this);
        l41.g<? super Throwable> jVar = new j<>(this);
        zVarR0.getClass();
        this.f68790i.b(zVarR0.v0(iVar, jVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void c(BadgeDetailsResponse badgeDetailsResponse) {
        s sVar = this.f68792k;
        if (sVar != null) {
            String title = badgeDetailsResponse.getTitle();
            String str = title == null ? "" : title;
            String content = badgeDetailsResponse.getContent();
            String str2 = content != null ? content : "";
            BadgeDetailsResponse.Action action = badgeDetailsResponse.getAction();
            String title2 = action != null ? action.getTitle() : null;
            boolean z12 = title2 == null || title2.length() == 0;
            Context context = sVar.f68814b;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.badge_details_content, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.description);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            I5.a(textView, str2, false);
            int iB2 = y6.b(!z12 ? 16 : 40);
            int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_content_padding);
            textView.setPadding(dimensionPixelSize, y6.b(0), dimensionPixelSize, iB2);
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.BadgeDialog);
            dVar.F(viewInflate, !z12 ? Integer.valueOf(R.layout.badge_details_footer) : null, z12 ? null : new r(title2, sVar));
            com.avito.android.lib.design.bottom_sheet.j.c(dVar, str, true, 0, 0, 0, 120);
            dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(sVar, 3));
            sVar.f68815c = dVar;
            D6.w(sVar.f68816d);
            com.avito.android.lib.design.bottom_sheet.d dVar2 = sVar.f68815c;
            if (dVar2 != null) {
                com.avito.android.lib.util.g.a(dVar2);
            }
            InterfaceC35745a5 interfaceC35745a5 = this.f68788g;
            I0 i0J0 = sVar.f68819g.j0(interfaceC35745a5.e());
            a aVar = new a(badgeDetailsResponse);
            l41.g<? super Throwable> gVar = b.f68797b;
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(aVar, gVar, interfaceC43543a);
            io.reactivex.rxjava3.disposables.c cVar = this.f68791j;
            cVar.b(dVarV0);
            cVar.b(sVar.f68820h.j0(interfaceC35745a5.e()).v0(new c(), d.f68799b, interfaceC43543a));
        }
    }

    @Override // com.avito.android.advert.badge_details.h
    public final void c0() {
        this.f68793l = null;
    }

    @Override // com.avito.android.advert.badge_details.h
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f68794m, "badgeDetails");
        return kundle;
    }
}
