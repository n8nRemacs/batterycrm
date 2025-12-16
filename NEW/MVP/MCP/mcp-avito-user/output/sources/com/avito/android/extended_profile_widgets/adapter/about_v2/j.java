package com.avito.android.extended_profile_widgets.adapter.about_v2;

import Y41.p;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.compatibility.v2.m;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.tns_gallery.r;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AboutV2ItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/about_v2/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/about_v2/i;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f154188i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f154189b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f154190c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f154191d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f154192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f154193f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f154194g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final t f154195h;

    /* compiled from: AboutV2ItemView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "images", "", "index", "Lkotlin/G0;", "invoke", "(Ljava/util/List;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<List<? extends Image>, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p<List<Image>, Integer, G0> f154196l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super List<Image>, ? super Integer, G0> pVar) {
            super(2);
            this.f154196l = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(List<? extends Image> list, Integer num) {
            List<? extends Image> list2 = list;
            int iIntValue = num.intValue();
            p<List<Image>, Integer, G0> pVar = this.f154196l;
            if (pVar != 0) {
                pVar.invoke(list2, Integer.valueOf(iIntValue));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AboutV2ItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "it", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Parcelable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Parcelable, G0> f154197l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Parcelable, G0> lVar) {
            super(1);
            this.f154197l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(Parcelable parcelable) {
            this.f154197l.invoke(parcelable);
            return G0.f406611a;
        }
    }

    public j(@Y61.k View view, boolean z12, @Y61.k Activity activity) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_about_v2_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154189b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_about_v2_images);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f154190c = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.extended_about_v2_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154191d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_about_v2_expand_label);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154192e = (TextView) viewFindViewById4;
        this.f154193f = z12 ? 2 : 6;
        this.f154194g = view.getContext().getString(R.string.extended_profile_expand_info_label);
        Resources resources = recyclerView.getResources();
        int iB2 = kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_gallery_base_height));
        int iB3 = kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_gallery_space_between_items));
        this.f154195h = new t(recyclerView, activity, new r(Integer.valueOf(iB2), Integer.valueOf(kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_widget_horizontal_margin))), Integer.valueOf(kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_widget_horizontal_margin))), Integer.valueOf(iB3), 0, 0, 48, null));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.about_v2.i
    public final void bx(@Y61.k AboutV2Item aboutV2Item, @Y61.l Y41.a<G0> aVar) {
        String str = aboutV2Item.f154167g;
        TextView textView = this.f154192e;
        TextView textView2 = this.f154191d;
        if (str == null || str.length() == 0) {
            I5.a(textView2, null, false);
            I5.a(textView, null, false);
            textView.setOnClickListener(null);
            return;
        }
        if (aboutV2Item.f154170j) {
            Integer num = aboutV2Item.f154168h;
            textView2.setMaxLines(num != null ? num.intValue() : this.f154193f);
            textView.setOnClickListener(aVar != null ? new m(28, new k(aVar)) : null);
        } else {
            textView2.setMaxLines(Integer.MAX_VALUE);
        }
        I5.a(textView2, str, false);
        textView2.post(new com.avito.android.app.coldstart.d(this, 23));
        String str2 = aboutV2Item.f154169i;
        if (str2 == null) {
            str2 = this.f154194g;
        }
        I5.a(textView, str2, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154195h.d();
        this.f154192e.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.about_v2.i
    public final void lh(@Y61.k AboutV2Item aboutV2Item, @Y61.l p<? super List<Image>, ? super Integer, G0> pVar, @Y61.k Y41.l<? super Parcelable, G0> lVar) throws Resources.NotFoundException {
        int i12;
        List<TnsGalleryImage> list = aboutV2Item.f154165e;
        List<TnsGalleryImage> list2 = list;
        t tVar = this.f154195h;
        if (list2 == null || list2.isEmpty()) {
            tVar.c();
            return;
        }
        RecyclerView recyclerView = this.f154190c;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        boolean z12 = aboutV2Item.f154172l;
        if (z12) {
            i12 = R.dimen.extended_profile_about_gallery_top_margin;
        } else {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.dimen.extended_profile_about_gallery_no_tabs_top_margin;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, recyclerView.getResources().getDimensionPixelSize(i12), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        recyclerView.setLayoutParams(marginLayoutParams);
        tVar.b(list, new a(pVar), new b(lVar));
        tVar.a(aboutV2Item.f154166f);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.about_v2.i
    public final void qO(@Y61.k AboutV2Item aboutV2Item) {
        I5.a(this.f154189b, aboutV2Item.f154164d, false);
    }
}
