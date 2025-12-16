package com.avito.android.serp.adapter.gallery;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryHeaderPagerAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/j;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/serp/adapter/gallery/j$b;", "a", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends RecyclerView.Adapter<b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f270034e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f270035c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public List<GalleryHeaderWidget.GalleryItem> f270036d = C42784z0.f406748b;

    /* compiled from: GalleryHeaderPagerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/j$a;", "", "<init>", "()V", "", "ADAPTER_ITEMS_COUNT", "I", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GalleryHeaderPagerAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/j$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends RecyclerView.C {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f270037d = 0;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SimpleDraweeView f270038b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final View f270039c;

        public b(@Y61.k j jVar, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.drawee_view);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
            this.f270038b = simpleDraweeView;
            View viewFindViewById2 = view.findViewById(R.id.overlay);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            this.f270039c = viewFindViewById2;
            k.f270041b.setValue(view, k.f270040a[0], viewFindViewById2);
            float dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.gallery_header_image_size) / 2.0f;
            com.avito.android.lib.util.v.a(simpleDraweeView, dimensionPixelSize);
            com.avito.android.lib.util.v.a(viewFindViewById2, dimensionPixelSize);
            simpleDraweeView.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(13, jVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f270035c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1073741823;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        int size = this.f270036d.size();
        f270034e.getClass();
        GalleryHeaderWidget.GalleryItem galleryItem = this.f270036d.get(i12 % size);
        SimpleDraweeView simpleDraweeView = ((b) c12).f270038b;
        Context context = simpleDraweeView.getContext();
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169492j = new ColorDrawable(C35835l0.d(R.attr.gray84, context));
        aVarA.f169493k = null;
        aVarA.d(com.avito.android.image_loader.n.a(UniversalImageKt.getImageDependsOnThemeOrDefault(galleryItem.getImage(), com.avito.android.lib.util.darkTheme.c.b(context))));
        aVarA.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new b(this, C0.b(viewGroup, R.layout.serp_gallery_header_widget_pager_item, viewGroup, false));
    }
}
