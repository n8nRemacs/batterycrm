package com.avito.android.profile.pro.impl.screen.item.dashboard_stats;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.C22241a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.i;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StatsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/h;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "b", "c", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends RecyclerView.Adapter<RecyclerView.C> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f223174f = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f223175c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<D90.a, G0> f223176d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223177e;

    /* compiled from: StatsAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/h$a;", "", "<init>", "()V", "", "COLUMN_MAX_HEIGHT", "I", "COLUMN_WIDTH", "DATA_HOLDER", "EMPTY_HOLDER", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StatsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/h$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ConstraintLayout f223178b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f223179c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final SimpleDraweeView f223180d;

        public b(@k View view) {
            super(view);
            this.f223178b = (ConstraintLayout) view.findViewById(R.id.cl_dashboard_empty_stats);
            this.f223179c = (TextView) view.findViewById(R.id.tv_dashboard_empty);
            this.f223180d = (SimpleDraweeView) view.findViewById(R.id.sdv_dashboard_empty);
        }
    }

    /* compiled from: StatsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/h$c;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ConstraintLayout f223181b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f223182c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f223183d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final TextView f223184e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final SimpleDraweeView f223185f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final LinearLayout f223186g;

        public c(@k View view) {
            super(view);
            this.f223181b = (ConstraintLayout) view.findViewById(R.id.cl_dashboard_stats);
            this.f223182c = (TextView) view.findViewById(R.id.tv_dashboard_stats_title);
            this.f223183d = (TextView) view.findViewById(R.id.tv_dashboard_stats_count);
            this.f223184e = (TextView) view.findViewById(R.id.tv_dashboard_stats_percent);
            this.f223185f = (SimpleDraweeView) view.findViewById(R.id.sdv_dashboard_stats_icon);
            this.f223186g = (LinearLayout) view.findViewById(R.id.ll_dashboard_stats_days);
        }
    }

    static {
        new a(null);
    }

    public h(@k l lVar, @k com.avito.android.util.text.a aVar, @k ArrayList arrayList) {
        this.f223175c = arrayList;
        this.f223176d = lVar;
        this.f223177e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f223175c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        return ((StatsItem) this.f223175c.get(i12)).f223163k ? 0 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@k RecyclerView.C c12, int i12) {
        Context context;
        String colorKey;
        boolean z12 = c12 instanceof c;
        ArrayList arrayList = this.f223175c;
        com.avito.android.util.text.a aVar = this.f223177e;
        if (!z12) {
            if (c12 instanceof b) {
                b bVar = (b) c12;
                bVar.f223178b.setOnClickListener(new com.avito.android.fakedoor_dialog.a(i12, 4, this));
                UniversalImage universalImage = ((StatsItem) arrayList.get(i12)).f223158f;
                if (universalImage != null) {
                    SimpleDraweeView simpleDraweeView = bVar.f223180d;
                    C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
                }
                AttributedText attributedText = ((StatsItem) arrayList.get(i12)).f223157e;
                if (attributedText != null) {
                    j.c(bVar.f223179c, attributedText, aVar);
                    return;
                }
                return;
            }
            return;
        }
        c cVar = (c) c12;
        ConstraintLayout constraintLayout = cVar.f223181b;
        Context context2 = constraintLayout.getContext();
        StatsItem statsItem = (StatsItem) arrayList.get(i12);
        int i13 = 0;
        if (i12 == 0) {
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
            bVar2.setMargins(D6.i(10, context2), 0, D6.i(4, context2), 0);
            constraintLayout.setLayoutParams(bVar2);
        }
        AttributedText attributedText2 = statsItem.f223157e;
        if (attributedText2 != null) {
            j.c(cVar.f223182c, attributedText2, aVar);
        }
        AttributedText attributedText3 = statsItem.f223159g;
        if (attributedText3 != null) {
            j.c(cVar.f223183d, attributedText3, aVar);
        }
        AttributedText attributedText4 = statsItem.f223160h;
        if (attributedText4 != null) {
            j.c(cVar.f223184e, attributedText4, aVar);
        }
        UniversalImage universalImage2 = statsItem.f223158f;
        if (universalImage2 != null) {
            SimpleDraweeView simpleDraweeView2 = cVar.f223185f;
            C35949t5.c(simpleDraweeView2, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage2, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView2.getContext()))), null, null, null, 14);
        }
        constraintLayout.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(24, this, statsItem));
        LinearLayout linearLayout = cVar.f223186g;
        linearLayout.removeAllViews();
        for (StatsDay statsDay : statsItem.f223155c) {
            List<UniversalColor> list = statsItem.f223162j;
            UniversalColor universalColor = list != null ? (UniversalColor) C42745f0.G(list) : null;
            View viewInflate = LayoutInflater.from(context2).inflate(R.layout.profile_pro_item_dashboard_stats_day, (ViewGroup) null);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(R.id.cl_column);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_column);
            j.c(textView, statsDay.f223153c, aVar);
            long j12 = statsDay.f223152b;
            int i14 = j12 != 0 ? 1 : i13;
            View viewFindViewById = viewInflate.findViewById(R.id.v_column);
            if (i14 == 0) {
                i13 = 8;
            }
            viewFindViewById.setVisibility(i13);
            if (i14 != 0) {
                context = context2;
                viewFindViewById.setLayoutParams(new ConstraintLayout.b(D6.i(20, textView.getContext()), D6.i((int) ((j12 * 52) / statsItem.f223154b), textView.getContext())));
                Resources resources = viewInflate.getResources();
                ThreadLocal<TypedValue> threadLocal = i.f44673a;
                viewFindViewById.setBackground(resources.getDrawable(R.drawable.bg_profile_pro_dashboard_stats_blue, null));
                if (universalColor != null && (colorKey = universalColor.getColorKey()) != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable background = viewFindViewById.getBackground();
                        C22241a.e();
                        background.setColorFilter(C22241a.d(Color.parseColor(colorKey), BlendMode.SRC_ATOP));
                    } else {
                        viewFindViewById.getBackground().setColorFilter(new PorterDuffColorFilter(Color.parseColor(colorKey), PorterDuff.Mode.SRC_ATOP));
                    }
                }
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                dVar.g(constraintLayout2);
                dVar.j(R.id.v_column, 4, R.id.v_substrate, 4, 0);
                dVar.j(R.id.v_column, 6, R.id.v_substrate, 6, 0);
                dVar.c(constraintLayout2);
            } else {
                context = context2;
            }
            linearLayout.addView(viewInflate);
            context2 = context;
            i13 = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    public final RecyclerView.C onCreateViewHolder(@k ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i12 == 0 ? new b(layoutInflaterFrom.inflate(R.layout.profile_pro_item_dashboard_stats_empty, viewGroup, false)) : new c(layoutInflaterFrom.inflate(R.layout.profile_pro_item_dashboard_stats, viewGroup, false));
    }
}
