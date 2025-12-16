package com.avito.android.inline_filters.dialog.location_group.adapter.local_priority;

import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.SegmentedControlRedesign;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: GroupFilterItemLocalPriorityView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/local_priority/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/local_priority/e;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e, e {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f171750k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f171751b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.util.text.a f171752c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConstraintLayout f171753d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ComponentContainer f171754e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SegmentedControlRedesign f171755f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f171756g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f171757h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinearLayout f171758i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ImageView f171759j;

    /* compiled from: GroupFilterItemLocalPriorityView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171760a;

        static {
            int[] iArr = new int[Filter.Separator.values().length];
            try {
                iArr[Filter.Separator.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Filter.Separator.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f171760a = iArr;
        }
    }

    /* compiled from: GroupFilterItemLocalPriorityView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "position", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Integer, CharSequence, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p<Integer, InlineFilterValue, G0> f171761l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f171762m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<Filter.Value> f171763n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ f f171764o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super Integer, ? super InlineFilterValue, G0> pVar, int i12, List<Filter.Value> list, f fVar) {
            super(2);
            this.f171761l = pVar;
            this.f171762m = i12;
            this.f171763n = list;
            this.f171764o = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            InlineFilterValue.InlineFilterLocalPriorityValue inlineFilterLocalPriorityValue;
            Filter.Value value;
            int iIntValue = num.intValue();
            Integer numValueOf = Integer.valueOf(this.f171762m);
            List<Filter.Value> list = this.f171763n;
            if (list == null || (value = (Filter.Value) C42745f0.K(iIntValue, list)) == null) {
                inlineFilterLocalPriorityValue = null;
            } else {
                int i12 = f.f171750k;
                this.f171764o.getClass();
                inlineFilterLocalPriorityValue = new InlineFilterValue.InlineFilterLocalPriorityValue(Boolean.valueOf(value.getValue()));
            }
            this.f171761l.invoke(numValueOf, inlineFilterLocalPriorityValue);
            return G0.f406611a;
        }
    }

    public f(@k View view, @l com.avito.android.util.text.a aVar) {
        super(view);
        this.f171751b = view;
        this.f171752c = aVar;
        View viewFindViewById = view.findViewById(R.id.inline_filter_local_priority_root_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f171753d = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.filters_segment_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f171754e = (ComponentContainer) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.filters_segments);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.select.SegmentedControlRedesign");
        }
        this.f171755f = (SegmentedControlRedesign) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171756g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f171757h = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.inline_filters_hint_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f171758i = (LinearLayout) viewFindViewById6;
        Drawable drawableA = C43852a.a(view.getContext(), R.drawable.inline_filters_background_divider_drawable);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        imageView.setImageDrawable(drawableA);
        this.f171759j = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.avito.android.select.SegmentedControlRedesign] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.local_priority.e
    public final void NU(@k Filter filter, @k p<? super Integer, ? super InlineFilterValue, G0> pVar, int i12) {
        List<Filter.Value> values;
        int i13;
        ?? arrayList;
        Filter.Value value;
        UniversalImage image;
        Filter.Value value2;
        Filter.Config config;
        List<Filter.Separator> separators;
        Filter.Config config2;
        Filter.Widget widget = filter.getWidget();
        C42822w c42822w = null;
        boolean z12 = false;
        if (widget == null || (config2 = widget.getConfig()) == null || (values = config2.getValues()) == null) {
            values = null;
            i13 = 0;
        } else {
            int i14 = 0;
            i13 = 0;
            for (Object obj : values) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                if (L.f(((InlineFilterValue.InlineFilterLocalPriorityValue) filter.getValue()).getPriority(), Boolean.valueOf(((Filter.Value) obj).getValue()))) {
                    i13 = i14;
                }
                i14 = i15;
            }
        }
        Filter.Widget widget2 = filter.getWidget();
        int i16 = 2;
        if (widget2 != null && (config = widget2.getConfig()) != null && (separators = config.getSeparators()) != null) {
            Iterator it = separators.iterator();
            while (it.hasNext()) {
                int i17 = a.f171760a[((Filter.Separator) it.next()).ordinal()];
                ImageView imageView = this.f171759j;
                ConstraintLayout constraintLayout = this.f171753d;
                if (i17 == 1) {
                    constraintLayout.removeView(imageView);
                    constraintLayout.addView(imageView);
                    androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                    dVar.g(constraintLayout);
                    dVar.i(imageView.getId(), 3, constraintLayout.getId(), 3);
                    dVar.i(this.f171754e.getId(), 3, imageView.getId(), 4);
                    dVar.i(imageView.getId(), 6, constraintLayout.getId(), 6);
                    dVar.i(imageView.getId(), 7, constraintLayout.getId(), 7);
                    dVar.c(constraintLayout);
                } else if (i17 == 2) {
                    constraintLayout.removeView(imageView);
                    constraintLayout.addView(imageView);
                    androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                    dVar2.g(constraintLayout);
                    dVar2.i(imageView.getId(), 3, this.f171758i.getId(), 4);
                    dVar2.i(imageView.getId(), 6, constraintLayout.getId(), 6);
                    dVar2.i(imageView.getId(), 7, constraintLayout.getId(), 7);
                    dVar2.c(constraintLayout);
                }
            }
        }
        j.a(this.f171756g, (values == null || (value2 = values.get(i13)) == null) ? null : value2.getText(), this.f171752c);
        SimpleDraweeView simpleDraweeView = this.f171757h;
        D6.w(simpleDraweeView);
        C35949t5.c(this.f171757h, com.avito.android.image_loader.b.b((values == null || (value = values.get(i13)) == null || (image = value.getImage()) == null) ? null : UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        D6.H(simpleDraweeView);
        if (values != null) {
            List<Filter.Value> list = values;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new SegmentedControl.c(((Filter.Value) it2.next()).getTitle(), z12, i16, c42822w));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        ?? r22 = this.f171755f;
        r22.d(i13, arrayList);
        r22.setOnClickListener(new b(pVar, i12, values, this));
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.local_priority.e
    public final void setTitle(@l String str) {
        this.f171754e.setTitle(str);
    }
}
