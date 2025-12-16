package com.avito.android.favorite_comparison.presentation.items.comparison_list_item;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonListItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/i;", "a", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f155337b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ListItem f155338c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f155339d;

    /* compiled from: ComparisonListItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/j$a;", "", "<init>", "()V", "", "OVERLAY_SIZE", "I", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public j(@k View view) {
        super(view);
        this.f155337b = view;
        View viewFindViewById = view.findViewById(R.id.comparison_list_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        this.f155338c = (ListItem) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f155339d = (FrameLayout) viewFindViewById2;
    }

    @Override // com.avito.android.favorite_comparison.presentation.items.comparison_list_item.i
    public final void K5(@l List<Image> list) {
        FrameLayout frameLayout = this.f155339d;
        frameLayout.removeAllViews();
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) LayoutInflater.from(this.f155337b.getContext()).inflate(R.layout.favorite_comparison_image_preview, (ViewGroup) frameLayout, false);
                ((FrameLayout.LayoutParams) simpleDraweeView.getLayoutParams()).setMarginEnd(y6.b(16) * i12);
                frameLayout.addView(simpleDraweeView);
                Uri uriB = C35829k2.c((Image) obj, simpleDraweeView, 1, 22).b();
                if (uriB != null) {
                    ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                    aVarA.f(uriB);
                    aVarA.c();
                }
                i12 = i13;
            }
        }
    }

    @Override // com.avito.android.favorite_comparison.presentation.items.comparison_list_item.i
    public final void b(@k String str) {
        this.f155338c.setTitle(str);
    }

    @Override // com.avito.android.favorite_comparison.presentation.items.comparison_list_item.i
    public final void j(@l String str) {
        this.f155338c.setMessage(str);
    }
}
