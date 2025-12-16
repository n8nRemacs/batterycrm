package com.avito.android.advert_details_items.sellerprofile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.service_seller_type.ServiceSellerType;
import com.avito.android.util.O2;
import ir.C42094b;
import ir.e;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSellerProfileView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/I;", "Lcom/avito/android/advert_details_items/sellerprofile/H;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I implements H {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f85570b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public View f85571c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ir.e f85572d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f85573e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C42094b f85574f = new C42094b();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f85575g = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f85576h = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f85577i = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f85578j = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f85579k = C42727D.c(new b());

    /* compiled from: AdvertSellerProfileView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetViewId", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            I.this.f85578j.accept(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertSellerProfileView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<ViewGroup> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ViewGroup invoke() {
            View view = I.this.f85570b;
            if (view instanceof ViewStub) {
                view = (ViewGroup) ((ViewStub) view).inflate();
            }
            View viewFindViewById = view.findViewById(R.id.contacts_container);
            if (viewFindViewById != null) {
                return (ViewGroup) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public I(@Y61.k View view) {
        this.f85570b = view;
        this.f85573e = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    public final void DZ(@Y61.k ir.f fVar, boolean z12) {
        boolean z13 = fVar.f405291s;
        boolean z14 = fVar.f405287o;
        boolean z15 = fVar.f405288p;
        int i12 = z13 ? R.layout.advert_details_profile_snippet_services_redesign : z15 ? R.layout.advert_details_profile_snippet_restyle : z14 ? R.layout.advert_details_profile_snippet_redesign : R.layout.advert_details_profile_snippet;
        View viewInflate = this.f85571c;
        InterfaceC42726C interfaceC42726C = this.f85579k;
        if (viewInflate == null) {
            viewInflate = this.f85573e.inflate(i12, (ViewGroup) interfaceC42726C.getValue(), false);
        }
        this.f85571c = viewInflate;
        UserIconType userIconType = fVar.f405279g;
        String str = fVar.f405277e;
        C42094b c42094b = this.f85574f;
        String str2 = fVar.f405289q;
        String str3 = fVar.f405283k;
        Float f12 = fVar.f405282j;
        Image image = fVar.f405280h;
        List<SerpBadge> list = fVar.f405285m;
        ServiceSellerType serviceSellerType = fVar.f405286n;
        String str4 = fVar.f405276d;
        String str5 = fVar.f405274b;
        String str6 = fVar.f405273a;
        if (z15) {
            ir.e cVar = this.f85572d;
            if (cVar == null) {
                cVar = new Ba.c(viewInflate, c42094b);
            }
            this.f85572d = cVar;
            a(cVar, fVar);
            cVar.setTitle(str6);
            cVar.e(str5);
            cVar.g(str4);
            cVar.gb(serviceSellerType != null ? serviceSellerType.getText() : null, serviceSellerType != null ? serviceSellerType.getIconName() : null, serviceSellerType != null ? serviceSellerType.getIconColor() : null);
            e.a.a(cVar, str, Integer.valueOf(O2.a(list) ? R.dimen.advert_profile_contact_top_margin : R.dimen.advert_profile_contact_without_badges_top_margin), 2);
            cVar.b(image != null ? com.avito.android.image_loader.b.b(image) : null, userIconType, fVar.f405281i);
            cVar.c(f12, str3);
            cVar.h(str2);
            cVar.P3(list);
            cVar.d(new L(this));
            if (z12) {
                cVar.a(new M(this));
            }
        } else {
            String str7 = fVar.f405275c;
            if (z14) {
                ir.e bVar = this.f85572d;
                if (bVar == null) {
                    bVar = new Ba.b(viewInflate, c42094b);
                }
                this.f85572d = bVar;
                a(bVar, fVar);
                bVar.setTitle(str6);
                bVar.e(str5);
                bVar.setSubtitle(str7);
                bVar.g(str4);
                bVar.gb(serviceSellerType != null ? serviceSellerType.getText() : null, serviceSellerType != null ? serviceSellerType.getIconName() : null, serviceSellerType != null ? serviceSellerType.getIconColor() : null);
                e.a.a(bVar, str, null, 6);
                bVar.b(image != null ? com.avito.android.image_loader.b.b(image) : null, userIconType, null);
                bVar.c(f12, str3);
                bVar.h(str2);
                bVar.P3(list);
                bVar.d(new J(this));
                if (z12) {
                    bVar.a(new K(this));
                }
            } else {
                ir.e gVar = this.f85572d;
                if (gVar == null) {
                    gVar = new ir.g(viewInflate, c42094b);
                }
                this.f85572d = gVar;
                a(gVar, fVar);
                gVar.setTitle(str6);
                gVar.e(str5);
                gVar.setSubtitle(str7);
                gVar.gb(serviceSellerType != null ? serviceSellerType.getText() : null, serviceSellerType != null ? serviceSellerType.getIconName() : null, serviceSellerType != null ? serviceSellerType.getIconColor() : null);
                gVar.g(str4);
                e.a.a(gVar, str, null, 6);
                gVar.b(image != null ? com.avito.android.image_loader.b.b(image) : null, userIconType, null);
                gVar.c(f12, str3);
                gVar.P3(list);
                if (z12) {
                    gVar.a(new N(this));
                }
            }
        }
        if (((ViewGroup) interfaceC42726C.getValue()).getChildCount() == 0) {
            ((ViewGroup) interfaceC42726C.getValue()).addView(viewInflate);
        }
        DeepLink deepLink = fVar.f405290r;
        if (deepLink != null) {
            this.f85576h.accept(deepLink);
        }
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> E3() {
        return this.f85577i;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    /* renamed from: Q1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85578j() {
        return this.f85578j;
    }

    public final void a(ir.e eVar, ir.f fVar) {
        ServiceSellerType serviceSellerType = fVar.f405286n;
        eVar.hb((serviceSellerType == null || serviceSellerType.getOnboarding() == null) ? null : new a());
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    /* renamed from: kb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85575g() {
        return this.f85575g;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> v4() {
        return this.f85576h;
    }
}
