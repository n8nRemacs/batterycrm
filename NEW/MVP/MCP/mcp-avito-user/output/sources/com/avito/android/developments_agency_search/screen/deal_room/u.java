package com.avito.android.developments_agency_search.screen.deal_room;

import Cw.InterfaceC13362a;
import Cw.d;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import m.C43852a;

/* compiled from: DealRoomView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/u;", "Lcom/avito/android/developments_agency_search/screen/deal_room/t;", "Lcom/avito/android/developments_agency_search/screen/deal_room/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements t, com.avito.android.developments_agency_search.screen.deal_room.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f137805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f137806b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f137807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f137808d;

    /* compiled from: DealRoomView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137809a;

        static {
            int[] iArr = new int[DealRoomLink.Status.values().length];
            try {
                DealRoomLink.Status.a aVar = DealRoomLink.Status.f136365c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DealRoomLink.Status.a aVar2 = DealRoomLink.Status.f136365c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DealRoomLink.Status.a aVar3 = DealRoomLink.Status.f136365c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DealRoomLink.Status.a aVar4 = DealRoomLink.Status.f136365c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DealRoomLink.Status.a aVar5 = DealRoomLink.Status.f136365c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DealRoomLink.Status.a aVar6 = DealRoomLink.Status.f136365c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DealRoomLink.Status.a aVar7 = DealRoomLink.Status.f136365c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f137809a = iArr;
        }
    }

    public u(@Y61.k View view, @Y61.k Y41.l<? super InterfaceC13362a, G0> lVar, @Y61.k com.avito.konveyor.adapter.d dVar, boolean z12) {
        this.f137805a = dVar;
        View viewFindViewById = view.findViewById(R.id.appbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        this.f137806b = new c((AppBarLayout) viewFindViewById, lVar);
        if (z12) {
            View viewFindViewById2 = view.findViewById(R.id.appbar);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
            }
            AppBarLayout appBarLayout = (AppBarLayout) viewFindViewById2;
            appBarLayout.getLayoutParams().height = 0;
            D6.h(appBarLayout);
            appBarLayout.requestLayout();
        }
        View viewFindViewById3 = view.findViewById(R.id.recyclerView);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById3).setAdapter(dVar);
        View viewFindViewById4 = view.findViewById(R.id.skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f137807c = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.error_screen);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f137808d = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.reload_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById6).setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(21, lVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.t
    public final void a(@Y61.l DealRoomLink.Status status) {
        int i12;
        D6.g(this.f137806b.f137464a);
        ViewGroup viewGroup = this.f137807c;
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        switch (status == null ? -1 : a.f137809a[status.ordinal()]) {
            case 1:
            case 2:
                i12 = R.layout.developments_agency_search_deal_room_skeleton_step_selection;
                break;
            case 3:
                i12 = R.layout.developments_agency_search_deal_room_skeleton_step_booking;
                break;
            case 4:
                i12 = R.layout.developments_agency_search_deal_room_skeleton_step_deal;
                break;
            case 5:
            case 6:
            case 7:
                i12 = R.layout.developments_agency_search_deal_room_skeleton_step_revenue;
                break;
            default:
                i12 = R.layout.developments_agency_search_deal_room_default_loader;
                break;
        }
        layoutInflaterFrom.inflate(i12, viewGroup, true);
        D6.H(viewGroup);
        D6.w(this.f137808d);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.t
    public final void b() {
        D6.g(this.f137806b.f137464a);
        D6.w(this.f137807c);
        D6.H(this.f137808d);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.t
    public final void c(@Y61.k d.a aVar) {
        c cVar = this.f137806b;
        D6.H(cVar.f137464a);
        D6.w(this.f137807c);
        D6.w(this.f137808d);
        d.C0137d c0137d = aVar.f2787a;
        Image image = c0137d.f2791a;
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        Drawable drawableA = C43852a.a(cVar.f137464a.getContext(), R.drawable.client_item_avatar_background);
        C35949t5.c(cVar.f137466c, aVarB, drawableA, null, null, 12);
        String str = c0137d.f2792b;
        String strValueOf = String.valueOf(C43066x.D(str));
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        TextView textView = cVar.f137467d;
        textView.setText(upperCase);
        D6.G(textView, aVarB == null);
        C35949t5.c(cVar.f137470g, aVarB, drawableA, null, null, 12);
        String upperCase2 = String.valueOf(C43066x.D(str)).toUpperCase(locale);
        TextView textView2 = cVar.f137471h;
        textView2.setText(upperCase2);
        D6.G(textView2, aVarB == null);
        I5.a(cVar.f137468e, str, false);
        I5.a(cVar.f137472i, str, false);
        TextView textView3 = cVar.f137473j;
        String str2 = c0137d.f2793c;
        I5.a(textView3, str2, false);
        D6.G(cVar.f137475l, !(str2 == null || C43066x.K(str2)));
        I5.a(cVar.f137474k, c0137d.f2794d, false);
        this.f137805a.l(aVar.f2788b, null);
    }
}
