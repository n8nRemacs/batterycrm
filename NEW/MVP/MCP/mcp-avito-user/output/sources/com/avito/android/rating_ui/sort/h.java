package com.avito.android.rating_ui.sort;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.tooltip.ImageGravity;
import com.avito.android.lib.design.tooltip.q;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.rating_ui.sort.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingSortItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/sort/h;", "Lcom/avito/android/rating_ui/sort/g;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final int f250453g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f250454b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f250455c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f250456d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f250457e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f250458f;

    /* compiled from: RatingSortItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ui/sort/h$a;", "", "<init>", "()V", "", "ICON_SPACING", "I", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingSortItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC7507a.b f250460m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a.AbstractC7507a.b bVar) {
            super(1);
            this.f250460m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.getClass();
            Y41.l<? super String, G0> lVar = h.this.f250457e;
            if (lVar != null) {
                lVar.invoke(this.f250460m.f250438d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RatingSortItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC7507a.C7508a f250462m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a.AbstractC7507a.C7508a c7508a) {
            super(1);
            this.f250462m = c7508a;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.getClass();
            Y41.l<? super String, G0> lVar = h.this.f250458f;
            if (lVar != null) {
                lVar.invoke(this.f250462m.f250435d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC7507a.b.C7509a f250464c;

        public d(a.AbstractC7507a.b.C7509a c7509a) {
            this.f250464c = c7509a;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
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
                com.avito.android.rating_ui.sort.h r8 = com.avito.android.rating_ui.sort.h.this
                android.view.View r1 = r8.f250454b
                android.content.Context r2 = r1.getContext()
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                KV.a$a r1 = KV.a.f9464v
                android.view.View r2 = r8.f250454b
                android.content.Context r3 = r2.getContext()
                android.content.Context r2 = r2.getContext()
                r4 = 2130975707(0x7f041bdb, float:1.7560273E38)
                int r2 = com.avito.android.util.C35835l0.j(r4, r2)
                r1.getClass()
                KV.a r1 = KV.a.C0572a.b(r2, r3)
                r2 = 284(0x11c, float:3.98E-43)
                int r2 = com.avito.android.util.y6.b(r2)
                r3 = 2097150(0x1ffffe, float:2.938733E-39)
                r4 = 0
                KV.a r1 = KV.a.a(r1, r2, r4, r4, r3)
                r7.c(r1)
                com.avito.android.lib.design.chips.ui.Chips r1 = r8.f250455c
                androidx.recyclerview.widget.RecyclerView$C r2 = r1.P(r4)
                if (r2 == 0) goto L65
                android.view.View r2 = r2.itemView
                if (r2 == 0) goto L65
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                boolean r5 = r2.getGlobalVisibleRect(r3)
                if (r5 != 0) goto L58
            L56:
                r2 = r1
                goto L66
            L58:
                int r3 = r3.width()
                int r5 = r2.getWidth()
                int r5 = r5 / 2
                if (r3 < r5) goto L56
                goto L66
            L65:
                r2 = 0
            L66:
                if (r2 != 0) goto L6b
                r22 = r1
                goto L6d
            L6b:
                r22 = r2
            L6d:
                com.avito.android.lib.design.tooltip.r$a r10 = new com.avito.android.lib.design.tooltip.r$a
                com.avito.android.lib.design.tooltip.i$b r1 = new com.avito.android.lib.design.tooltip.i$b
                com.avito.android.lib.design.tooltip.b$b r2 = new com.avito.android.lib.design.tooltip.b$b
                r2.<init>()
                r1.<init>(r2)
                r10.<init>(r1)
                r1 = -12
                int r1 = com.avito.android.util.y6.b(r1)
                r10.j(r1)
                int r1 = com.avito.android.util.y6.b(r4)
                r10.m(r1)
                com.avito.android.rating_ui.sort.a$a$b$a r1 = r0.f250464c
                java.lang.String r14 = r1.f250441a
                com.avito.android.lib.design.tooltip.state.TooltipState$State r23 = com.avito.android.lib.design.tooltip.state.TooltipState.State.f181285b
                com.avito.android.lib.design.tooltip.state.TooltipState r2 = new com.avito.android.lib.design.tooltip.state.TooltipState
                r9 = r2
                com.avito.android.rating_ui.sort.h$e r3 = new com.avito.android.rating_ui.sort.h$e
                r16 = r3
                r3.<init>(r7)
                com.avito.android.rating_ui.sort.h$f r3 = new com.avito.android.rating_ui.sort.h$f
                r21 = r3
                r3.<init>(r7)
                r19 = 0
                r20 = 1
                r11 = 1
                r12 = 0
                r13 = 0
                java.lang.String r15 = r1.f250442b
                r17 = 0
                r18 = 0
                r24 = 908(0x38c, float:1.272E-42)
                r25 = 0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                r7.b(r2)
                r8.f250456d = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_ui.sort.h.d.run():void");
        }
    }

    /* compiled from: RatingSortItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f250465l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.lib.design.tooltip.k kVar) {
            super(0);
            this.f250465l = kVar;
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
            this.f250465l.b(new TooltipState(qVar, z12, aVar, charSequence, charSequence2, charSequence3, aVar2, drawable, imageGravity, drawable2, z13, null, null, TooltipState.State.f181286c, 8191, null));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingSortItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f250466l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.lib.design.tooltip.k kVar) {
            super(0);
            this.f250466l = kVar;
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
            this.f250466l.b(new TooltipState(qVar, z12, aVar, charSequence, charSequence2, charSequence3, aVar2, drawable, imageGravity, drawable2, z13, null, null, TooltipState.State.f181286c, 8191, null));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f250453g = y6.b(4);
    }

    public h(@k View view) {
        super(view);
        this.f250454b = view;
        View viewFindViewById = view.findViewById(R.id.rating_sort_block_chips);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.ui.Chips");
        }
        Chips chips = (Chips) viewFindViewById;
        this.f250455c = chips;
        g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = view.getContext();
        int iJ2 = C35835l0.j(R.attr.chipsDisableablePrimarySmall, view.getContext());
        bVar.getClass();
        chips.setStyle(g.b.c(iJ2, context));
    }

    @Override // com.avito.android.rating_ui.sort.g
    public final void JV(@k List<? extends a.AbstractC7507a> list, boolean z12) {
        ItemChipable itemChipable;
        ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
        List<? extends a.AbstractC7507a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.AbstractC7507a abstractC7507a = (a.AbstractC7507a) obj;
            if (abstractC7507a instanceof a.AbstractC7507a.b) {
                FV.a aVar = FV.a.f4720a;
                a.AbstractC7507a.b bVar = (a.AbstractC7507a.b) abstractC7507a;
                String str = bVar.f250437c;
                itemChipable = new ItemChipable(i12, null, null, new b(bVar), false, null, aVar.e(new StringBuilder(str != null ? str : ""), this.f250454b.getContext(), R.attr.textIconCompare, f250453g), !z12, false, 294, null);
            } else {
                if (!(abstractC7507a instanceof a.AbstractC7507a.C7508a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.AbstractC7507a.C7508a c7508a = (a.AbstractC7507a.C7508a) abstractC7507a;
                String str2 = c7508a.f250434c;
                itemChipable = new ItemChipable(i12, null, null, new c(c7508a), ((a.AbstractC7507a.C7508a) abstractC7507a).f250436e, null, str2 == null ? "" : str2, !z12, false, 294, null);
            }
            arrayList.add(itemChipable);
            i12 = i13;
        }
        this.f250455c.setState(new ChipsState(0, displayType, null, arrayList, null, 21, null));
    }

    @Override // com.avito.android.rating_ui.sort.g
    public final void Jv(@k a.AbstractC7507a.b.C7509a c7509a) {
        this.f250455c.postDelayed(new d(c7509a), 300L);
    }

    @Override // com.avito.android.rating_ui.sort.g
    public final void N10(@k Y41.l<? super String, G0> lVar) {
        this.f250458f = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f250456d;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f250456d = null;
    }

    @Override // com.avito.android.rating_ui.sort.g
    public final void l10(@k Y41.l<? super String, G0> lVar) {
        this.f250457e = lVar;
    }
}
