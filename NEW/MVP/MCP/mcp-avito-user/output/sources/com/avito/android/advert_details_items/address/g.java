package com.avito.android.advert_details_items.address;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.user_address_public.api.AdditionalInfo;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAddressView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/address/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/address/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f84444g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84445b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final View f84446c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f84447d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f84448e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f84449f;

    /* compiled from: AdvertDetailsAddressView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(g.this.f84445b, R.dimen.advert_details_address_padding_top);
        }
    }

    /* compiled from: AdvertDetailsAddressView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f84451l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f84452m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ g f84453n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, String str, g gVar) {
            super(0);
            this.f84451l = z12;
            this.f84452m = str;
            this.f84453n = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            boolean z12 = this.f84451l;
            String str = this.f84452m;
            g gVar = this.f84453n;
            if (z12) {
                SpannableString spannableString = new SpannableString(r.q(str, " >"));
                Drawable drawable = gVar.f84445b.getContext().getDrawable(R.drawable.advert_details_address_arrow);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                spannableString.setSpan(new ImageSpan(drawable, 0), spannableString.length() - 1, spannableString.length(), 33);
                gVar.f84447d.setText(spannableString);
            } else {
                gVar.f84447d.setText(str);
            }
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f84445b = view;
        View viewFindViewById = view.findViewById(R.id.address_container);
        this.f84446c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_address);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84447d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.more_addresses);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84448e = (TextView) viewFindViewById3;
        this.f84449f = C42727D.c(new a());
        if (viewFindViewById == null) {
            View viewInflate = ((ViewStub) view.findViewById(R.id.part_address_stub)).inflate();
            this.f84446c = viewInflate.findViewById(R.id.address_container);
            this.f84447d = (TextView) viewInflate.findViewById(R.id.advert_address);
        }
    }

    public final void B80(String str, Coordinates coordinates, String str2, boolean z12, f.b bVar, boolean z13, RouteButtons routeButtons, Integer num, Y41.a<G0> aVar) {
        if (coordinates != null) {
            View view = this.f84446c;
            if (!z13 && view != null) {
                view.setOnClickListener(new com.avito.android.advert.item.beduin.v2.favorite.a(bVar, str, coordinates, str2, routeButtons));
            }
            D6.f(this.f84447d, 0, z12 ? 0 : ((Number) this.f84449f.getValue()).intValue(), 0, 0, 13);
            if (view != null) {
                view.setOnLongClickListener(new com.avito.android.advert.item.parking.i(1, bVar, str));
            }
            if (num != null) {
                this.f84447d.setMaxLines(num.intValue());
            }
            aVar.invoke();
        }
    }

    @Override // com.avito.android.advert_details_items.address.f
    public final void Pj(@k String str, @l String str2, @l Coordinates coordinates, @k String str3, boolean z12, @k f.b bVar, boolean z13, @l RouteButtons routeButtons, int i12) {
        if (str2 != null) {
            B80(r.r(str, ", ", str2), coordinates, str3, z12, bVar, z13, routeButtons, Integer.valueOf(i12), new i(str2, this, str, i12, bVar));
        } else {
            B80(str, coordinates, str3, z12, bVar, z13, routeButtons, Integer.valueOf(i12), new j(this, str, bVar));
        }
    }

    @Override // com.avito.android.advert_details_items.address.f
    public final void d40(@k String str, @l Coordinates coordinates, @k String str2, boolean z12, boolean z13, @k f.b bVar, boolean z14, @l RouteButtons routeButtons, @l Integer num, @l MultiAddressesInfo multiAddressesInfo) {
        AdditionalInfo additionalInfo;
        I5.a(this.f84448e, (multiAddressesInfo == null || (additionalInfo = multiAddressesInfo.getAdditionalInfo()) == null) ? null : additionalInfo.getContent(), false);
        B80(str, coordinates, str2, z12, bVar, z14, routeButtons, num, new b(z13, str, this));
    }
}
