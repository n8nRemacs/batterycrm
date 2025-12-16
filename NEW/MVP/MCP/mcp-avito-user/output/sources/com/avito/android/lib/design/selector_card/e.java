package com.avito.android.lib.design.selector_card;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardItemState;
import com.avito.android.lib.design.selector_card.SelectorCardState;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/selector_card/e;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/lib/design/selector_card/e$a;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v f180399c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180400d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180401e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SelectorCardOrientation f180402f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f180403g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f180404h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f180405i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f180406j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SelectorCardState.Indicator f180407k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final ColorStateList f180408l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Boolean f180409m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ArrayList f180410n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ArrayList f180411o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public g f180412p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f180413q;

    /* compiled from: SelectorCardAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/e$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final f f180414b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SelectorCard f180415c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f180416d;

        public a(@Y61.l f fVar, @Y61.k View view) {
            super(view);
            this.f180414b = fVar;
            this.f180415c = (SelectorCard) view.findViewById(R.id.selector_card);
            this.f180416d = (TextView) view.findViewById(R.id.selector_card_error);
        }
    }

    public e(@Y61.k v vVar, int i12, int i13, @Y61.k SelectorCardOrientation selectorCardOrientation, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l SelectorCardState.Indicator indicator, @Y61.l ColorStateList colorStateList, @Y61.l Boolean bool) {
        this.f180399c = vVar;
        this.f180400d = i12;
        this.f180401e = i13;
        this.f180402f = selectorCardOrientation;
        this.f180403g = num;
        this.f180404h = num2;
        this.f180405i = num3;
        this.f180406j = num4;
        this.f180407k = indicator;
        this.f180408l = colorStateList;
        this.f180409m = bool;
        ArrayList arrayList = new ArrayList();
        this.f180410n = arrayList;
        this.f180411o = arrayList;
        this.f180413q = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f180410n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return ((s) this.f180410n.get(i12)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        return m0.f406844a.b(this.f180410n.get(i12).getClass()).hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C r10, final int r11) throws android.content.res.Resources.NotFoundException {
        /*
            r9 = this;
            com.avito.android.lib.design.selector_card.e$a r10 = (com.avito.android.lib.design.selector_card.e.a) r10
            com.avito.android.lib.design.selector_card.v r0 = r9.f180399c
            boolean r1 = r0.a(r11)
            java.util.ArrayList r2 = r9.f180410n
            java.lang.Object r2 = r2.get(r11)
            com.avito.android.lib.design.selector_card.s r2 = (com.avito.android.lib.design.selector_card.s) r2
            com.avito.android.lib.design.selector_card.r r3 = r2.f180422a
            com.avito.android.lib.design.selector_card.f r4 = r10.f180414b
            if (r4 == 0) goto L19
            r4.b(r3)
        L19:
            r4 = 0
            com.avito.android.lib.design.selector_card.SelectorCard r5 = r10.f180415c
            r5.setOnClickListener(r4)
            int r4 = r9.f180401e
            r5.setAppearance(r4)
            com.avito.android.lib.design.selector_card.SelectorCardState$Indicator r4 = r9.f180407k
            if (r4 == 0) goto L2b
            r5.setIndicatorType(r4)
        L2b:
            android.content.res.ColorStateList r4 = r9.f180408l
            if (r4 == 0) goto L32
            r5.setBackgroundColor(r4)
        L32:
            java.lang.Boolean r4 = r9.f180409m
            if (r4 == 0) goto L42
            boolean r4 = r4.booleanValue()
            com.avito.android.lib.design.selector_card.c r6 = new com.avito.android.lib.design.selector_card.c
            r6.<init>(r4)
            r5.d(r6)
        L42:
            r5.setSelected(r1)
            boolean r4 = r9.f180413q
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L6d
            int r4 = r0.f180459i
            r8 = -1
            if (r4 == r8) goto L5c
            java.util.LinkedHashSet r4 = r0.f180460j
            int r4 = r4.size()
            int r8 = r0.f180459i
            if (r4 != r8) goto L5c
            r4 = r6
            goto L5d
        L5c:
            r4 = r7
        L5d:
            if (r4 == 0) goto L65
            boolean r0 = r0.a(r11)
            if (r0 == 0) goto L6d
        L65:
            boolean r0 = r3.getF309669f()
            if (r0 == 0) goto L6d
            r0 = r6
            goto L6e
        L6d:
            r0 = r7
        L6e:
            r5.setEnabled(r0)
            com.avito.android.lib.design.selector_card.d r0 = new com.avito.android.lib.design.selector_card.d
            r0.<init>()
            r5.setOnClickListener(r0)
            com.avito.android.lib.design.selector_card.SelectorCardItemState r11 = r2.f180423b
            boolean r0 = r11 instanceof com.avito.android.lib.design.selector_card.SelectorCardItemState.Error
            android.widget.TextView r10 = r10.f180416d
            if (r0 == 0) goto L99
            com.avito.android.lib.design.selector_card.SelectorCardItemState$Error r11 = (com.avito.android.lib.design.selector_card.SelectorCardItemState.Error) r11
            java.lang.String r0 = r11.f180357b
            r10.setText(r0)
            if (r1 == 0) goto L8f
            java.lang.String r11 = r11.f180357b
            if (r11 == 0) goto L8f
            goto L90
        L8f:
            r6 = r7
        L90:
            com.avito.android.util.D6.G(r10, r6)
            com.avito.android.lib.design.selector_card.SelectorCardState$Status r10 = com.avito.android.lib.design.selector_card.SelectorCardState.Status.f180387c
            r5.setStatus(r10)
            goto La9
        L99:
            com.avito.android.lib.design.selector_card.SelectorCardItemState$Normal r0 = com.avito.android.lib.design.selector_card.SelectorCardItemState.Normal.f180358b
            boolean r11 = kotlin.jvm.internal.L.f(r11, r0)
            if (r11 == 0) goto La9
            com.avito.android.util.D6.w(r10)
            com.avito.android.lib.design.selector_card.SelectorCardState$Status r10 = com.avito.android.lib.design.selector_card.SelectorCardState.Status.f180386b
            r5.setStatus(r10)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.selector_card.e.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$C, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.C onCreateViewHolder(android.view.ViewGroup r11, int r12) {
        /*
            r10 = this;
            r12 = 2131562427(0x7f0d0fbb, float:1.8750282E38)
            r0 = 0
            android.view.View r12 = com.akita.compose.theme.re23.style.C0.b(r11, r12, r11, r0)
            int r1 = r10.f180400d
            r2 = 0
            if (r1 == 0) goto Ld3
            r3 = 2131370954(0x7f0a23ca, float:1.836193E38)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 2131370951(0x7f0a23c7, float:1.8361923E38)
            android.view.View r4 = r12.findViewById(r4)
            com.avito.android.lib.design.selector_card.SelectorCard r4 = (com.avito.android.lib.design.selector_card.SelectorCard) r4
            java.lang.Integer r5 = r10.f180404h
            if (r5 == 0) goto L2a
            int r5 = r5.intValue()
            r4.setMinimumWidth(r5)
        L2a:
            java.lang.Integer r5 = r10.f180406j
            if (r5 == 0) goto L35
            int r5 = r5.intValue()
            r4.setMinimumHeight(r5)
        L35:
            java.lang.Integer r5 = r10.f180403g
            com.avito.android.lib.design.selector_card.SelectorCardOrientation r6 = r10.f180402f
            r7 = -1
            r8 = 1
            if (r5 != 0) goto L56
            com.avito.android.lib.design.selector_card.SelectorCardOrientation r9 = com.avito.android.lib.design.selector_card.SelectorCardOrientation.f180360d
            if (r6 != r9) goto L56
            if (r3 == 0) goto L48
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 != 0) goto L4c
            goto L4e
        L4c:
            r5.width = r7
        L4e:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r5.width = r7
        L54:
            r5 = r8
            goto L99
        L56:
            if (r5 != 0) goto L71
            com.avito.android.lib.design.selector_card.SelectorCardOrientation r9 = com.avito.android.lib.design.selector_card.SelectorCardOrientation.f180359c
            if (r6 != r9) goto L71
            if (r3 == 0) goto L63
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            goto L64
        L63:
            r5 = r2
        L64:
            r6 = -2
            if (r5 != 0) goto L68
            goto L6a
        L68:
            r5.width = r6
        L6a:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r5.width = r6
            goto L54
        L71:
            if (r5 != 0) goto L8b
            com.avito.android.lib.design.selector_card.SelectorCardOrientation r9 = com.avito.android.lib.design.selector_card.SelectorCardOrientation.f180361e
            if (r6 != r9) goto L8b
            if (r3 == 0) goto L7e
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            goto L7f
        L7e:
            r5 = r2
        L7f:
            if (r5 != 0) goto L82
            goto L84
        L82:
            r5.width = r7
        L84:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r5.width = r7
            goto L54
        L8b:
            if (r5 == 0) goto L98
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            int r5 = r5.intValue()
            r6.width = r5
            goto L54
        L98:
            r5 = r0
        L99:
            java.lang.Integer r6 = r10.f180405i
            if (r6 == 0) goto La8
            int r5 = r6.intValue()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            r6.height = r5
            goto La9
        La8:
            r8 = r5
        La9:
            if (r8 == 0) goto Lb0
            if (r3 == 0) goto Lb0
            r3.requestLayout()
        Lb0:
            android.widget.FrameLayout r3 = r4.getContentContainerView()
            android.content.Context r11 = r11.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            android.view.View r11 = r11.inflate(r1, r3, r0)
            com.avito.android.lib.design.selector_card.g r0 = r10.f180412p
            if (r0 == 0) goto Lc8
            com.avito.android.lib.design.selector_card.f r2 = r0.create()
        Lc8:
            if (r2 == 0) goto Lcd
            r2.a(r11)
        Lcd:
            r3.removeAllViews()
            r3.addView(r11)
        Ld3:
            com.avito.android.lib.design.selector_card.e$a r11 = new com.avito.android.lib.design.selector_card.e$a
            r11.<init>(r2, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.selector_card.e.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$C");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12, List list) {
        a aVar = (a) c12;
        if (list.isEmpty()) {
            super.onBindViewHolder(aVar, i12, list);
            return;
        }
        boolean zA2 = this.f180399c.a(i12);
        SelectorCardItemState selectorCardItemState = ((s) this.f180410n.get(i12)).f180423b;
        aVar.f180415c.setSelected(zA2);
        boolean z12 = selectorCardItemState instanceof SelectorCardItemState.Error;
        TextView textView = aVar.f180416d;
        if (z12) {
            D6.G(textView, zA2 && ((SelectorCardItemState.Error) selectorCardItemState).f180357b != null);
        } else if (L.f(selectorCardItemState, SelectorCardItemState.Normal.f180358b)) {
            D6.w(textView);
        }
    }
}
