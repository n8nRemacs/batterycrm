package com.avito.android.advert_details_items.sellerprofile;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSellerProfileView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/sellerprofile/h;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_details_items.sellerprofile.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28279i extends com.avito.konveyor.adapter.b implements InterfaceC28278h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f85619b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I f85620c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f85621d;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_details_items.sellerprofile.i$a */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f85622b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28279i f85623c;

        public a(View view, C28279i c28279i) {
            this.f85622b = view;
            this.f85623c = c28279i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            Y41.a<G0> aVar = this.f85623c.f85621d;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f85622b.removeOnLayoutChangeListener(this);
        }
    }

    public C28279i(@Y61.k View view) {
        super(view);
        this.f85619b = view;
        this.f85620c = new I(view);
        View view2 = this.itemView;
        view2.addOnLayoutChangeListener(new a(view2, this));
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    public final void DZ(@Y61.k ir.f fVar, boolean z12) {
        this.f85620c.DZ(fVar, z12);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> E3() {
        return this.f85620c.f85577i;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    /* renamed from: Q1 */
    public final com.jakewharton.rxrelay3.c getF85578j() {
        return this.f85620c.f85578j;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f85621d = null;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28278h
    public final void j8(@Y61.k Y41.a<G0> aVar) {
        this.f85621d = aVar;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.InterfaceC28278h
    public final void k3(int i12) {
        View view = this.f85619b;
        D6.c(view, null, Integer.valueOf(D6.j(view, 28)), null, null, 13);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    /* renamed from: kb */
    public final com.jakewharton.rxrelay3.c getF85575g() {
        return this.f85620c.f85575g;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.H
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> v4() {
        return this.f85620c.f85576h;
    }
}
