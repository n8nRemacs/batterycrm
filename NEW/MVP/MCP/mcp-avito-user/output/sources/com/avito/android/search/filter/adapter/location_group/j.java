package com.avito.android.search.filter.adapter.location_group;

import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.tooltip.ImageGravity;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.adapter.select.n;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: LocationGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/location_group/j;", "Lcom/avito/android/search/filter/adapter/location_group/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f262512i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f262513b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.util.text.a f262514c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f262515d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f262516e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final n f262517f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f262518g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f262519h;

    /* compiled from: LocationGroupItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f262520a;

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
            f262520a = iArr;
        }
    }

    /* compiled from: LocationGroupItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CharSequence f262522m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CharSequence charSequence) {
            super(0);
            this.f262522m = charSequence;
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = j.f262512i;
            j jVar = j.this;
            jVar.getClass();
            ComponentContainer componentContainer = jVar.f262516e;
            com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(componentContainer.getContext(), 0, 0, 6, null);
            r.a aVar = new r.a(new i.a(new b.c()));
            TooltipState.State state = TooltipState.State.f181285b;
            boolean z12 = true;
            Y41.a aVar2 = null;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            Y41.a aVar3 = null;
            Drawable drawable = null;
            ImageGravity imageGravity = null;
            Drawable drawable2 = null;
            boolean z13 = false;
            kVar.b(new TooltipState(aVar, z12, aVar2, charSequence, this.f262522m, charSequence2, aVar3, drawable, imageGravity, drawable2, z13, new k(kVar), null, state, 5100, null));
            int i13 = kVar.f181229o;
            kVar.f181228n = -1;
            kVar.f181229o = i13;
            kVar.f(componentContainer);
            return G0.f406611a;
        }
    }

    public j(@Y61.k View view, @l com.avito.android.util.text.a aVar) {
        super(view);
        this.f262513b = view;
        this.f262514c = aVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        this.f262515d = constraintLayout;
        View viewFindViewById = constraintLayout.findViewById(R.id.filters_select_filter_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        ComponentContainer componentContainer = (ComponentContainer) viewFindViewById;
        this.f262516e = componentContainer;
        this.f262517f = new n(componentContainer, aVar);
        Drawable drawableA = C43852a.a(view.getContext(), R.drawable.search_filter_local_priority_divider_local_group);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        imageView.setImageDrawable(drawableA);
        this.f262518g = imageView;
        ImageView imageView2 = new ImageView(view.getContext());
        imageView2.setId(View.generateViewId());
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        imageView2.setImageDrawable(drawableA);
        this.f262519h = imageView2;
    }

    @Override // com.avito.android.search.filter.adapter.location_group.i
    public final void Rf(@Y61.k List<? extends SelectParameter.Separator> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i12 = a.f262520a[((SelectParameter.Separator) it.next()).ordinal()];
            ComponentContainer componentContainer = this.f262516e;
            ConstraintLayout constraintLayout = this.f262515d;
            if (i12 == 1) {
                ImageView imageView = this.f262518g;
                constraintLayout.removeView(imageView);
                constraintLayout.addView(imageView);
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                dVar.g(constraintLayout);
                dVar.i(imageView.getId(), 3, constraintLayout.getId(), 3);
                dVar.i(componentContainer.getId(), 3, imageView.getId(), 4);
                dVar.i(imageView.getId(), 6, constraintLayout.getId(), 6);
                dVar.i(imageView.getId(), 7, constraintLayout.getId(), 7);
                dVar.c(constraintLayout);
            } else if (i12 == 2) {
                ImageView imageView2 = this.f262519h;
                constraintLayout.removeView(imageView2);
                constraintLayout.addView(imageView2);
                androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                dVar2.g(constraintLayout);
                dVar2.i(imageView2.getId(), 3, componentContainer.getId(), 4);
                dVar2.i(imageView2.getId(), 6, constraintLayout.getId(), 6);
                dVar2.i(imageView2.getId(), 7, constraintLayout.getId(), 7);
                dVar2.c(constraintLayout);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // com.avito.android.search.filter.adapter.location_group.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S30(@Y61.l com.avito.android.remote.model.text.AttributedText r5) {
        /*
            r4 = this;
            com.avito.android.search.filter.adapter.select.n r0 = r4.f262517f
            if (r5 == 0) goto Ld
            r0.getClass()
            java.lang.String r1 = r5.getText()
            if (r1 != 0) goto Lf
        Ld:
            java.lang.String r1 = ""
        Lf:
            com.avito.android.util.text.a r2 = r0.f262592c
            r3 = 0
            com.avito.android.lib.design.input.Input r0 = r0.f262594e
            if (r2 == 0) goto L22
            android.content.Context r1 = r0.getContext()
            java.lang.CharSequence r5 = r2.c(r1, r5)
            r0.u(r3, r5)
            goto L26
        L22:
            r5 = 6
            com.avito.android.lib.design.input.Input.t(r0, r1, r3, r5)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.adapter.location_group.j.S30(com.avito.android.remote.model.text.AttributedText):void");
    }

    @Override // com.avito.android.search.filter.adapter.location_group.i
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f262517f.a(aVar);
    }

    @Override // com.avito.android.search.filter.adapter.location_group.i
    public final void p8(@l AttributedText attributedText, @Y61.k String str) {
        com.avito.android.util.text.a aVar = this.f262514c;
        CharSequence charSequenceC = aVar != null ? aVar.c(this.f262513b.getContext(), attributedText) : null;
        if (charSequenceC != null) {
            this.f262516e.setTitleTipListener(new b(charSequenceC));
        }
        this.f262517f.setTitle(str);
    }

    public /* synthetic */ j(View view, com.avito.android.util.text.a aVar, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : aVar);
    }
}
