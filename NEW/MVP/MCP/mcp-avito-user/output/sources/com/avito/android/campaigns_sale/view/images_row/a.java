package com.avito.android.campaigns_sale.view.images_row;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.campaigns_sale.view.images_row.ImagesRowItem;
import com.avito.android.image_loader.n;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesRowAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/a;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/campaigns_sale/view/images_row/ImagesRowItem;", "Lcom/avito/android/campaigns_sale/view/images_row/a$b;", "<init>", "()V", "a", "b", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends B<ImagesRowItem, b> {

    /* compiled from: ImagesRowAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/a$a;", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/campaigns_sale/view/images_row/ImagesRowItem;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.campaigns_sale.view.images_row.a$a, reason: collision with other inner class name */
    public static final class C3341a extends C23424o.f<ImagesRowItem> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3341a f114439a = new C3341a();

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(ImagesRowItem imagesRowItem, ImagesRowItem imagesRowItem2) {
            return imagesRowItem.equals(imagesRowItem2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(ImagesRowItem imagesRowItem, ImagesRowItem imagesRowItem2) {
            return imagesRowItem.equals(imagesRowItem2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final /* bridge */ /* synthetic */ Object c(ImagesRowItem imagesRowItem, ImagesRowItem imagesRowItem2) {
            return G0.f406611a;
        }
    }

    /* compiled from: ImagesRowAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/a$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f114440b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SimpleDraweeView f114441c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f114442d;

        public b(@k View view) {
            super(view);
            this.f114440b = view;
            View viewFindViewById = view.findViewById(R.id.image_container);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            this.f114441c = (SimpleDraweeView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.image_counter);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f114442d = (TextView) viewFindViewById2;
        }
    }

    public a() {
        super(C3341a.f114439a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        ImagesRowItem item = getItem(i12);
        View view = bVar.f114440b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(item.f114428e);
        view.setLayoutParams(marginLayoutParams);
        SimpleDraweeView simpleDraweeView = bVar.f114441c;
        ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Size size = item.f114426c;
        layoutParams2.height = size.getHeight();
        layoutParams2.width = size.getWidth();
        simpleDraweeView.setLayoutParams(layoutParams2);
        C35949t5.c(bVar.f114441c, n.a(item.f114425b), com.avito.android.campaigns_sale.view.images_row.b.a(size, item.f114429f, 1.0f), null, null, 12);
        v.a(simpleDraweeView, y6.b(6));
        ImagesRowItem.Overlay overlay = item.f114427d;
        if (overlay != null) {
            simpleDraweeView.getOverlay().add(com.avito.android.campaigns_sale.view.images_row.b.a(size, overlay.f114430b, overlay.f114431c));
        } else {
            simpleDraweeView.getOverlay().clear();
        }
        I5.a(bVar.f114442d, overlay != null ? overlay.f114432d : null, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new b(C0.b(viewGroup, R.layout.item_image_row, viewGroup, false));
    }
}
