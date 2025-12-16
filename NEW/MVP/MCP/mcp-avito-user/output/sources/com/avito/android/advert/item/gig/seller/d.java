package com.avito.android.advert.item.gig.seller;

import Y41.l;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.util.I5;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsGigSellerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/gig/seller/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/gig/seller/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f75757b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f75758c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageLoadableView f75759d;

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "com/avito/android/image_loader/fresco/q", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Drawable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f75760l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40743a interfaceC40743a) {
            super(1);
            this.f75760l = interfaceC40743a;
        }

        @Override // Y41.l
        public final G0 invoke(Drawable drawable) {
            this.f75760l.setState(State.f135882f);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/image_loader/fresco/r", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f75761l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC40743a interfaceC40743a) {
            super(0);
            this.f75761l = interfaceC40743a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f75761l.setState(State.f135881e);
            return G0.f406611a;
        }
    }

    public d(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_details_gig_seller_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75757b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_details_gig_seller_count);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75758c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_details_gig_seller_logo);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView");
        }
        this.f75759d = (ImageLoadableView) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.gig.seller.c
    public final void On(@k String str, @Y61.l String str2, @Y61.l String str3) {
        I5.a(this.f75757b, str, false);
        I5.a(this.f75758c, str2, false);
        if (str3 != null) {
            Uri uri = Uri.parse(str3);
            ImageLoadableView imageLoadableView = this.f75759d;
            s.c(imageLoadableView, uri, true, new a(imageLoadableView), new b(imageLoadableView));
        }
    }
}
