package com.avito.android.rating_ui.aspects;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.ImageGravity;
import com.avito.android.lib.design.tooltip.q;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.rating_ui.aspects.a;
import com.avito.android.rating_ui.aspects.view.RatingAspectsChipable;
import com.avito.android.rating_ui.aspects.view.RatingAspectsView;
import com.avito.android.rating_ui.aspects.view.button.c;
import com.avito.android.rating_ui.aspects.view.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qh0.C47399a;

/* compiled from: RatingAspectsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/aspects/i;", "Lcom/avito/android/rating_ui/aspects/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f249877b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatingAspectsView f249878c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f249879d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super Long, G0> f249880e;

    /* compiled from: RatingAspectsItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a.C7491a f249882m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.C7491a c7491a) {
            super(1);
            this.f249882m = c7491a;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.booleanValue();
            Y41.l<? super Long, G0> lVar = i.this.f249880e;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(this.f249882m.f249863c));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.b f249884c;

        public b(a.b bVar) {
            this.f249884c = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r26 = this;
                r0 = r26
                com.avito.android.lib.design.tooltip.k r7 = new com.avito.android.lib.design.tooltip.k
                com.avito.android.rating_ui.aspects.i r8 = com.avito.android.rating_ui.aspects.i.this
                android.view.View r1 = r8.f249877b
                android.content.Context r2 = r1.getContext()
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                KV.a$a r1 = KV.a.f9464v
                android.view.View r2 = r8.f249877b
                android.content.Context r3 = r2.getContext()
                android.content.Context r2 = r2.getContext()
                r4 = 2130975707(0x7f041bdb, float:1.7560273E38)
                int r2 = com.avito.android.util.C35835l0.j(r4, r2)
                r1.getClass()
                KV.a r1 = KV.a.C0572a.b(r2, r3)
                r2 = 248(0xf8, float:3.48E-43)
                int r2 = com.avito.android.util.y6.b(r2)
                r3 = 2097150(0x1ffffe, float:2.938733E-39)
                r4 = 0
                KV.a r1 = KV.a.a(r1, r2, r4, r4, r3)
                r7.c(r1)
                r1 = 1
                com.avito.android.rating_ui.aspects.view.RatingAspectsView r2 = r8.f249878c
                androidx.recyclerview.widget.RecyclerView$C r1 = r2.P(r1)
                if (r1 == 0) goto L66
                android.view.View r1 = r1.itemView
                if (r1 == 0) goto L66
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                boolean r5 = r1.getGlobalVisibleRect(r3)
                if (r5 != 0) goto L59
            L57:
                r1 = r2
                goto L67
            L59:
                int r3 = r3.width()
                int r5 = r1.getWidth()
                int r5 = r5 / 2
                if (r3 < r5) goto L57
                goto L67
            L66:
                r1 = 0
            L67:
                if (r1 != 0) goto L6c
                r22 = r2
                goto L6e
            L6c:
                r22 = r1
            L6e:
                com.avito.android.lib.design.tooltip.r$a r10 = new com.avito.android.lib.design.tooltip.r$a
                com.avito.android.lib.design.tooltip.i$a r1 = new com.avito.android.lib.design.tooltip.i$a
                com.avito.android.lib.design.tooltip.b$a r2 = new com.avito.android.lib.design.tooltip.b$a
                r2.<init>()
                r1.<init>(r2)
                r10.<init>(r1)
                r1 = -12
                int r1 = com.avito.android.util.y6.b(r1)
                r10.j(r1)
                int r1 = com.avito.android.util.y6.b(r4)
                r10.m(r1)
                com.avito.android.rating_ui.aspects.a$b r1 = r0.f249884c
                java.lang.String r14 = r1.f249865a
                com.avito.android.lib.design.tooltip.state.TooltipState$State r23 = com.avito.android.lib.design.tooltip.state.TooltipState.State.f181285b
                com.avito.android.lib.design.tooltip.state.TooltipState r2 = new com.avito.android.lib.design.tooltip.state.TooltipState
                r9 = r2
                com.avito.android.rating_ui.aspects.i$c r3 = new com.avito.android.rating_ui.aspects.i$c
                r16 = r3
                r3.<init>(r7)
                com.avito.android.rating_ui.aspects.i$d r3 = new com.avito.android.rating_ui.aspects.i$d
                r21 = r3
                r3.<init>(r7)
                r19 = 0
                r20 = 1
                r11 = 1
                r12 = 0
                r13 = 0
                java.lang.String r15 = r1.f249866b
                r17 = 0
                r18 = 0
                r24 = 908(0x38c, float:1.272E-42)
                r25 = 0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                r7.b(r2)
                r8.f249879d = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_ui.aspects.i.b.run():void");
        }
    }

    /* compiled from: RatingAspectsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f249885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.lib.design.tooltip.k kVar) {
            super(0);
            this.f249885l = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            q qVar = null;
            boolean z12 = false;
            Y41.a aVar = null;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            CharSequence charSequence3 = null;
            Y41.a aVar2 = null;
            Drawable drawable = null;
            ImageGravity imageGravity = null;
            Drawable drawable2 = null;
            boolean z13 = false;
            this.f249885l.b(new TooltipState(qVar, z12, aVar, charSequence, charSequence2, charSequence3, aVar2, drawable, imageGravity, drawable2, z13, null, null, TooltipState.State.f181286c, 8191, null));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingAspectsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f249886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.lib.design.tooltip.k kVar) {
            super(0);
            this.f249886l = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            q qVar = null;
            boolean z12 = false;
            Y41.a aVar = null;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            CharSequence charSequence3 = null;
            Y41.a aVar2 = null;
            Drawable drawable = null;
            ImageGravity imageGravity = null;
            Drawable drawable2 = null;
            boolean z13 = false;
            this.f249886l.b(new TooltipState(qVar, z12, aVar, charSequence, charSequence2, charSequence3, aVar2, drawable, imageGravity, drawable2, z13, null, null, TooltipState.State.f181286c, 8191, null));
            return G0.f406611a;
        }
    }

    public i(@k View view) throws Resources.NotFoundException {
        super(view);
        this.f249877b = view;
        View viewFindViewById = view.findViewById(R.id.rating_aspects);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.rating_ui.aspects.view.RatingAspectsView");
        }
        RatingAspectsView ratingAspectsView = (RatingAspectsView) viewFindViewById;
        this.f249878c = ratingAspectsView;
        c.a aVar = com.avito.android.rating_ui.aspects.view.c.f249931e;
        Context context = view.getContext();
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.RatingAspects_Default, C47399a.i.f429346a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int[] iArr = C47399a.i.f429347b;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
        com.avito.android.rating_ui.aspects.view.button.c.f249919i.getClass();
        com.avito.android.rating_ui.aspects.view.button.c cVarB = c.a.b(typedArrayObtainStyledAttributes2, context);
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(5, 0), iArr);
        com.avito.android.rating_ui.aspects.view.button.c cVarB2 = c.a.b(typedArrayObtainStyledAttributes3, context);
        typedArrayObtainStyledAttributes3.recycle();
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(1, 0), iArr);
        com.avito.android.rating_ui.aspects.view.button.c cVarB3 = c.a.b(typedArrayObtainStyledAttributes4, context);
        typedArrayObtainStyledAttributes4.recycle();
        com.avito.android.rating_ui.aspects.view.c cVar = new com.avito.android.rating_ui.aspects.view.c(cVarB, cVarB2, cVarB3, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        ratingAspectsView.setStyle(cVar);
    }

    @Override // com.avito.android.rating_ui.aspects.h
    public final void Cq(@k List<a.C7491a> list, boolean z12) {
        List<a.C7491a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.C7491a c7491a = (a.C7491a) obj;
            arrayList.add(new RatingAspectsChipable(i12, c7491a.f249861a, c7491a.f249862b, c7491a.f249864d, !z12, new a(c7491a)));
            i12 = i13;
        }
        this.f249878c.setState(new j(arrayList));
    }

    @Override // com.avito.android.rating_ui.aspects.h
    public final void So(@k Y41.l<? super Long, G0> lVar) {
        this.f249880e = lVar;
    }

    @Override // com.avito.android.rating_ui.aspects.h
    public final void ZX(@k a.b bVar) {
        this.f249878c.postDelayed(new b(bVar), 300L);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f249879d;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f249879d = null;
    }
}
