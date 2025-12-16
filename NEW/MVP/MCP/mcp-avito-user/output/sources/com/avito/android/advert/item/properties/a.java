package com.avito.android.advert.item.properties;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u6.InterfaceC48807a;

/* compiled from: PropertiesDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/properties/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final j f78275E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f78276F;

    /* renamed from: G, reason: collision with root package name */
    public RecyclerView f78277G;

    /* compiled from: PropertiesDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.properties.a$a, reason: collision with other inner class name */
    public static final class C2317a extends N implements l<View, G0> {
        public C2317a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View viewFindViewById = view.findViewById(R.id.recycler_view);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            a aVar = a.this;
            aVar.f78277G = recyclerView;
            recyclerView.setAdapter(aVar.f78275E);
            return G0.f406611a;
        }
    }

    public a(@InterfaceC48807a @k j jVar, @InterfaceC48807a @k com.avito.konveyor.adapter.a aVar, @k String str, @k Context context) {
        super(context, R.style.PropertiesDialog);
        this.f78275E = jVar;
        this.f78276F = aVar;
        com.avito.android.lib.design.bottom_sheet.j.c(this, str.length() == 0 ? context.getString(R.string.advert_details_properties_title_vacancy) : str, true, 0, 0, 0, 120);
        C(R.layout.flats_bottom_sheet_layout, new C2317a());
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
    }
}
