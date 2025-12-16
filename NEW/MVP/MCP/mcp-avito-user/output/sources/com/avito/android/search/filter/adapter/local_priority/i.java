package com.avito.android.search.filter.adapter.local_priority;

import Y41.l;
import Y41.p;
import Y61.k;
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
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.search.filter.converter.ParameterElement;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: LocalPriorityItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/local_priority/i;", "Lcom/avito/android/search/filter/adapter/local_priority/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f262491b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f262492c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ComponentContainer f262493d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SegmentedControlRedesign f262494e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f262495f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f262496g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f262497h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f262498i;

    /* compiled from: LocalPriorityItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f262499a;

        static {
            int[] iArr = new int[SelectParameter.Separator.values().length];
            try {
                iArr[SelectParameter.Separator.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectParameter.Separator.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f262499a = iArr;
        }
    }

    /* compiled from: LocalPriorityItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "position", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Integer, CharSequence, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Cp0.e, G0> f262500l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.v f262501m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Cp0.e, G0> lVar, ParameterElement.v vVar) {
            super(2);
            this.f262500l = lVar;
            this.f262501m = vVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            this.f262500l.invoke(((ParameterElement.v.b) this.f262501m).f262862t.get(num.intValue()));
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f262491b = view;
        View viewFindViewById = view.findViewById(R.id.search_filter_local_priority_item_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f262492c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.filters_segment_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f262493d = (ComponentContainer) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.filters_segments);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.select.SegmentedControlRedesign");
        }
        this.f262494e = (SegmentedControlRedesign) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262495f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f262496g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.search_filter_hint_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f262497h = (LinearLayout) viewFindViewById6;
        Drawable drawableA = C43852a.a(view.getContext(), R.drawable.search_filter_local_priority_divider);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        imageView.setImageDrawable(drawableA);
        this.f262498i = imageView;
    }

    @Override // com.avito.android.search.filter.adapter.local_priority.h
    public final void on(@k l lVar, @k ParameterElement.v vVar) {
        UniversalImage universalImage;
        Image imageDependsOnThemeOrDefault;
        List<SelectParameter.Separator> separators;
        ParameterElement.v.b bVar = (ParameterElement.v.b) vVar;
        SelectParameter.Displaying displaying = vVar.f262855r;
        if (displaying != null && (separators = displaying.getSeparators()) != null) {
            Iterator<T> it = separators.iterator();
            while (it.hasNext()) {
                int i12 = a.f262499a[((SelectParameter.Separator) it.next()).ordinal()];
                ImageView imageView = this.f262498i;
                ConstraintLayout constraintLayout = this.f262492c;
                if (i12 == 1) {
                    constraintLayout.removeView(imageView);
                    constraintLayout.addView(imageView);
                    androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                    dVar.g(constraintLayout);
                    dVar.i(imageView.getId(), 3, constraintLayout.getId(), 3);
                    dVar.i(this.f262493d.getId(), 3, imageView.getId(), 4);
                    dVar.i(imageView.getId(), 6, constraintLayout.getId(), 6);
                    dVar.i(imageView.getId(), 7, constraintLayout.getId(), 7);
                    dVar.c(constraintLayout);
                } else if (i12 == 2) {
                    constraintLayout.removeView(imageView);
                    constraintLayout.addView(imageView);
                    androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                    dVar2.g(constraintLayout);
                    dVar2.i(imageView.getId(), 3, this.f262497h.getId(), 4);
                    dVar2.i(imageView.getId(), 6, constraintLayout.getId(), 6);
                    dVar2.i(imageView.getId(), 7, constraintLayout.getId(), 7);
                    dVar2.c(constraintLayout);
                }
            }
        }
        List<Cp0.e> list = bVar.f262862t;
        Iterator<Cp0.e> it2 = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            } else if (L.f(it2.next(), vVar.f262844g)) {
                break;
            } else {
                i13++;
            }
        }
        List<Cp0.e> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList.add(new SegmentedControl.c(!r5.f2705j, ((Cp0.e) it3.next()).f2698c));
        }
        SegmentedControlRedesign segmentedControlRedesign = this.f262494e;
        segmentedControlRedesign.d(i13, arrayList);
        segmentedControlRedesign.e(i13, false);
        segmentedControlRedesign.setOnClickListener(new b(lVar, vVar));
        SimpleDraweeView simpleDraweeView = this.f262496g;
        D6.w(simpleDraweeView);
        Cp0.e eVar = vVar.f262844g;
        if (eVar != null && (universalImage = eVar.f2707l) != null && (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) != null) {
            C35949t5.c(this.f262496g, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            D6.H(simpleDraweeView);
        }
        Cp0.e eVar2 = vVar.f262844g;
        j.a(this.f262495f, eVar2 != null ? eVar2.f2699d : null, null);
    }

    @Override // com.avito.android.search.filter.adapter.local_priority.h
    public final void setTitle(@k String str) {
        this.f262493d.setTitle(str);
    }
}
