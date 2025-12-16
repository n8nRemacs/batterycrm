package com.avito.android.advert.item.compatibility.v3.item.show_all_brands;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShowAllBrandsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/item/show_all_brands/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/compatibility/v3/item/show_all_brands/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74452b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f74453c;

    /* compiled from: ShowAllBrandsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert.item.compatibility.v3.b f74454l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f74455m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.advert.item.compatibility.v3.b bVar, d dVar) {
            super(0);
            this.f74454l = bVar;
            this.f74455m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f74454l.h(new com.avito.android.advert.item.compatibility.v3.a(this.f74455m.getF74461c(), true));
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f74452b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74453c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.item.show_all_brands.h
    public final void lW(@k com.avito.android.advert.item.compatibility.v3.b bVar, @k d dVar) {
        String f74449d = dVar.getF74462d();
        View view = this.f74452b;
        if (f74449d == null) {
            f74449d = view.getContext().getString(R.string.advert_details_compatibility_v3_show_all_brands_list_default_text);
        }
        this.f74453c.setText(f74449d);
        D6.a(new a(bVar, dVar), view);
    }
}
