package com.avito.android.item_map.view;

import android.text.SpannableString;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.item_map.amenity.ButtonViewState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pO.InterfaceC46983a;

/* compiled from: BottomSheetDataAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/item_map/view/S;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class S extends RecyclerView.Adapter<RecyclerView.C> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46983a f173490c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.item_map.amenity.h f173491d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.item_map.routes.k f173492e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f173493f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final JM.c f173494g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f173495h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.U f173496i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public ArrayList f173497j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f173498k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f173499l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f173500m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f173501n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f173502o;

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f173503b;

        public a(@Y61.k View view) {
            super(view);
            this.f173503b = (TextView) view.findViewById(R.id.address_title);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.util.text.a f173504b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f173505c;

        public b(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
            super(view);
            this.f173504b = aVar;
            this.f173505c = (TextView) view.findViewById(R.id.geo_zone_departure);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$c;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173506b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.item_map.amenity.h f173507c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.item_map.amenity.m f173508d;

        public c(@Y61.k View view, @Y61.k com.avito.android.item_map.amenity.h hVar) {
            super(view);
            this.f173506b = view;
            this.f173507c = hVar;
            this.f173508d = new com.avito.android.item_map.amenity.m((HorizontalScrollView) view.findViewById(R.id.amenity_buttons_container));
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$d;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173509b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.item_map.routes.k f173510c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Button f173511d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.z<G0> f173512e;

        public d(@Y61.k View view, @Y61.k com.avito.android.item_map.routes.k kVar) {
            super(view);
            this.f173509b = view;
            this.f173510c = kVar;
            Button button = (Button) view.findViewById(R.id.button_create_route);
            this.f173511d = button;
            this.f173512e = C37722i.a(button);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$e;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173513b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.z<G0> f173514c;

        public e(@Y61.k View view) {
            super(view);
            this.f173513b = view;
            this.f173514c = C37722i.a((Button) view.findViewById(R.id.button_follow_the_route));
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$f;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173515b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.util.U f173516c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC46983a f173517d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final TextView f173518e;

        public f(@Y61.k View view, @Y61.k com.avito.android.util.U u12, @Y61.k InterfaceC46983a interfaceC46983a) {
            super(view);
            this.f173515b = view;
            this.f173516c = u12;
            this.f173517d = interfaceC46983a;
            this.f173518e = (TextView) view.findViewById(R.id.addressText);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173519b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final os0.g f173520c;

        public g(@Y61.k View view) {
            super(view);
            this.f173519b = view;
            this.f173520c = new os0.g((ViewGroup) view.findViewById(R.id.geo_reference_container), false, 2, null);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$h;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173521b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.deeplink_handler.handler.composite.a f173522c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Button f173523d;

        public h(@Y61.k View view, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
            super(view);
            this.f173521b = view;
            this.f173522c = aVar;
            this.f173523d = (Button) view.findViewById(R.id.button_open_in_another_app);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$i;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f173524b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.item_map.routes.k f173525c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.item_map.routes.d f173526d;

        public i(@Y61.k View view, @Y61.k com.avito.android.item_map.routes.k kVar, @Y61.k com.avito.android.util.text.a aVar) {
            super(view);
            this.f173524b = view;
            this.f173525c = kVar;
            this.f173526d = new com.avito.android.item_map.routes.d((ViewGroup) view.findViewById(R.id.buttons_container), aVar);
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$j;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f173527b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f173528c;

        public j(@Y61.k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f173527b = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.description_text);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f173528c = (TextView) viewFindViewById2;
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$k;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f173529b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f173530c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f173531d;

        public k(@Y61.k ViewGroup viewGroup) {
            super(viewGroup);
            this.f173529b = viewGroup;
            View viewFindViewById = viewGroup.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f173530c = (TextView) viewFindViewById;
            View viewFindViewById2 = viewGroup.findViewById(R.id.schedule_container);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            this.f173531d = (LinearLayout) viewFindViewById2;
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$l;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f173532b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f173533c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f173534d;

        public l(@Y61.k ViewGroup viewGroup) {
            super(viewGroup);
            this.f173532b = viewGroup;
            View viewFindViewById = viewGroup.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f173533c = (TextView) viewFindViewById;
            View viewFindViewById2 = viewGroup.findViewById(R.id.schedule_container);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            this.f173534d = (LinearLayout) viewFindViewById2;
        }
    }

    /* compiled from: BottomSheetDataAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/S$m;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends RecyclerView.C {
    }

    @Inject
    public S(@Y61.k InterfaceC46983a interfaceC46983a, @Y61.k com.avito.android.item_map.amenity.h hVar, @Y61.k com.avito.android.item_map.routes.k kVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k JM.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.util.U u12) {
        this.f173490c = interfaceC46983a;
        this.f173491d = hVar;
        this.f173492e = kVar;
        this.f173493f = aVar;
        this.f173494g = cVar;
        this.f173495h = aVar2;
        this.f173496i = u12;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f173499l = cVar2;
        com.jakewharton.rxrelay3.c<G0> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f173500m = cVar3;
        this.f173501n = cVar2;
        this.f173502o = cVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f173497j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        Object obj = this.f173497j.get(i12);
        if (obj instanceof C31071h) {
            return 0;
        }
        if (obj instanceof GeoReference) {
            return 1;
        }
        if (obj instanceof C31067d) {
            return 3;
        }
        if (obj instanceof d0) {
            return 4;
        }
        if (obj instanceof C31068e) {
            return 5;
        }
        if (obj instanceof C31069f) {
            return 6;
        }
        if (obj instanceof C31064a) {
            return 7;
        }
        if (obj instanceof C31070g) {
            return 8;
        }
        if (obj instanceof c0) {
            return 9;
        }
        if (obj instanceof e0) {
            return 11;
        }
        if (obj instanceof g0) {
            return 12;
        }
        if (obj instanceof f0) {
            return 13;
        }
        return obj instanceof h0 ? 10 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.recyclerview.widget.RecyclerView$C] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@Y61.k RecyclerView.C c12, int i12) {
        ?? text;
        DeepLink deeplink;
        Object obj = this.f173497j.get(i12);
        if (obj instanceof C31071h) {
            f fVar = (f) c12;
            C31071h c31071h = (C31071h) obj;
            CharSequence charSequence = c31071h.f173619a;
            TextView textView = fVar.f173518e;
            I5.a(textView, charSequence, false);
            if (c31071h.f173622d) {
                textView.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(28, fVar, c31071h));
                return;
            }
            return;
        }
        if (obj instanceof GeoReference) {
            ((g) c12).f173520c.b((GeoReference) obj);
            return;
        }
        if (obj instanceof C31065b) {
            c cVar = (c) c12;
            C31065b c31065b = (C31065b) obj;
            com.avito.android.item_map.amenity.m mVar = cVar.f173508d;
            mVar.getClass();
            com.avito.android.item_map.amenity.h hVar = cVar.f173507c;
            hVar.b(mVar);
            LinkedHashMap linkedHashMap = mVar.f173315c;
            if (linkedHashMap.isEmpty()) {
                for (AmenityButton amenityButton : c31065b.f173605a) {
                    String type = amenityButton.getType();
                    if (type != null && type.length() != 0) {
                        LayoutInflater layoutInflater = mVar.f173314b;
                        LinearLayout linearLayout = mVar.f173313a;
                        View viewInflate = layoutInflater.inflate(R.layout.amenity_button, (ViewGroup) linearLayout, false);
                        com.avito.android.item_map.amenity.b bVar = new com.avito.android.item_map.amenity.b(viewInflate);
                        linkedHashMap.put(type, bVar);
                        ButtonViewState buttonViewStateC = hVar.c(type);
                        bVar.f173287f = amenityButton;
                        String type2 = amenityButton.getType();
                        ImageView imageView = bVar.f173285d;
                        imageView.setImageDrawable(androidx.core.content.d.getDrawable(new ContextThemeWrapper(imageView.getContext(), R.style.Theme_DesignSystem_Legacy), BN.b.a(type2)));
                        bVar.a(buttonViewStateC);
                        I5.a(bVar.f173286e, amenityButton.getTitle(), false);
                        bVar.f173282a.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(27, hVar, amenityButton));
                        linearLayout.addView(viewInflate);
                    }
                }
                return;
            }
            return;
        }
        if (obj instanceof d0) {
            i iVar = (i) c12;
            d0 d0Var = (d0) obj;
            com.avito.android.item_map.routes.d dVar = iVar.f173526d;
            if (dVar.f173382d.isEmpty()) {
                AvitoMapPoint avitoMapPoint = d0Var.f173611a;
                iVar.f173525c.c(dVar);
                return;
            }
            return;
        }
        if (obj instanceof C31067d) {
            d dVar2 = (d) c12;
            dVar2.f173510c.g(dVar2.f173511d);
            return;
        }
        if (obj instanceof C31069f) {
            b bVar2 = (b) c12;
            com.avito.android.util.text.j.a(bVar2.f173505c, ((C31069f) obj).f173613a, bVar2.f173504b);
            return;
        }
        if (obj instanceof C31064a) {
            ((a) c12).f173503b.setText(((C31064a) obj).f173603a);
            return;
        }
        if (obj instanceof C31070g) {
            ((JM.b) c12).b70();
            return;
        }
        if (obj instanceof c0) {
            h hVar2 = (h) c12;
            LocationMap.BottomButton bottomButton = ((c0) obj).f173610a;
            String title = bottomButton != null ? bottomButton.getTitle() : null;
            Button button = hVar2.f173523d;
            com.avito.android.lib.design.button.b.a(button, title, false);
            if (bottomButton == null || (deeplink = bottomButton.getDeeplink()) == null) {
                return;
            }
            button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(29, hVar2, deeplink));
            return;
        }
        if (obj instanceof e0) {
            j jVar = (j) c12;
            SellerAddressesInfo.SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo = ((e0) obj).f173612a;
            I5.a(jVar.f173527b, sellerAddressesAdditionalInfo.getTitle(), false);
            com.avito.android.util.text.j.a(jVar.f173528c, sellerAddressesAdditionalInfo.getDescription(), null);
            return;
        }
        if (obj instanceof g0) {
            l lVar = (l) c12;
            g0 g0Var = (g0) obj;
            LinearLayout linearLayout2 = lVar.f173534d;
            linearLayout2.removeAllViews();
            I5.a(lVar.f173533c, g0Var.f173617a, false);
            int i13 = 0;
            for (Object obj2 : g0Var.f173618b) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AttributedText attributedText = (AttributedText) obj2;
                ViewGroup viewGroup = lVar.f173532b;
                TextView textView2 = (TextView) C0.b(viewGroup, R.layout.item_map_list_attributed_text_item, viewGroup, false);
                if (i13 == 0) {
                    D6.c(textView2, null, Integer.valueOf(y6.b(6)), null, null, 13);
                } else {
                    D6.c(textView2, null, Integer.valueOf(y6.b(4)), null, null, 13);
                }
                com.avito.android.util.text.j.a(textView2, attributedText, null);
                linearLayout2.addView(textView2);
                i13 = i14;
            }
            return;
        }
        if (obj instanceof f0) {
            k kVar = (k) c12;
            f0 f0Var = (f0) obj;
            List<SellerAddressesInfo.SellersAddressDetail> list = f0Var.f173615b;
            if (list != null) {
                I5.a(kVar.f173530c, f0Var.f173614a, false);
                int i15 = 0;
                for (Object obj3 : list) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    SellerAddressesInfo.SellersAddressDetail sellersAddressDetail = (SellerAddressesInfo.SellersAddressDetail) obj3;
                    ViewGroup viewGroup2 = kVar.f173529b;
                    TextView textView3 = (TextView) C0.b(viewGroup2, R.layout.item_map_list_attributed_text_item, viewGroup2, false);
                    if (i15 == 0) {
                        D6.c(textView3, null, Integer.valueOf(y6.b(6)), null, null, 13);
                    } else {
                        D6.c(textView3, null, Integer.valueOf(y6.b(4)), null, null, 13);
                    }
                    String icon = sellersAddressDetail.getIcon();
                    String strO = icon != null ? com.avito.android.lib.util.f.o(viewGroup2.getContext(), icon) : null;
                    if (strO != null) {
                        StringBuilder sbZ = androidx.appcompat.app.r.z(strO, "  ");
                        sbZ.append(sellersAddressDetail.getText());
                        text = new SpannableString(sbZ.toString());
                        text.setSpan(new PK0.j(null, 1, null), 0, strO.length(), 33);
                    } else {
                        text = sellersAddressDetail.getText();
                    }
                    I5.a(textView3, text, false);
                    kVar.f173531d.addView(textView3);
                    i15 = i16;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Y61.k
    public final RecyclerView.C onCreateViewHolder(@Y61.k ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f173498k;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f173498k = layoutInflaterFrom;
        }
        com.avito.android.item_map.routes.k kVar = this.f173492e;
        com.avito.android.util.text.a aVar = this.f173493f;
        switch (i12) {
            case 0:
                return new f(layoutInflaterFrom.inflate(R.layout.recycler_item_address, viewGroup, false), this.f173496i, this.f173490c);
            case 1:
                return new g(layoutInflaterFrom.inflate(R.layout.recycler_item_geo_reference, viewGroup, false));
            case 2:
            default:
                return new c(layoutInflaterFrom.inflate(R.layout.recycler_item_amenity_buttons, viewGroup, false), this.f173491d);
            case 3:
                d dVar = new d(layoutInflaterFrom.inflate(R.layout.recycler_item_create_route, viewGroup, false), kVar);
                dVar.f173512e.t0(this.f173499l);
                return dVar;
            case 4:
                return new i(layoutInflaterFrom.inflate(R.layout.recycler_item_route_buttons, viewGroup, false), kVar, aVar);
            case 5:
                e eVar = new e(layoutInflaterFrom.inflate(R.layout.recycler_item_follow_the_route, viewGroup, false));
                eVar.f173514c.t0(this.f173500m);
                return eVar;
            case 6:
                return new b(layoutInflaterFrom.inflate(R.layout.recycler_item_geo_zone_departure, viewGroup, false), aVar);
            case 7:
                return new a(layoutInflaterFrom.inflate(R.layout.recycler_item_parking_address_title, viewGroup, false));
            case 8:
                return this.f173494g.a(viewGroup);
            case 9:
                return new h(layoutInflaterFrom.inflate(R.layout.recycler_item_open_coordinates_in_another_app, viewGroup, false), this.f173495h);
            case 10:
                return new m(layoutInflaterFrom.inflate(R.layout.recycler_item_skeleton, viewGroup, false));
            case 11:
                return new j(layoutInflaterFrom.inflate(R.layout.item_map_recycler_item_seller_addresses_description, viewGroup, false));
            case 12:
                return new l((ViewGroup) layoutInflaterFrom.inflate(R.layout.item_map_recycler_item_seller_addresses_common, viewGroup, false));
            case 13:
                return new k((ViewGroup) layoutInflaterFrom.inflate(R.layout.item_map_recycler_item_seller_addresses_common, viewGroup, false));
        }
    }
}
