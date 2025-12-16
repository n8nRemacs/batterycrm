package com.avito.android.lib.design.selector_card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.selector_card.SelectorCardState;
import com.avito.android.lib.design.selector_card.style.c;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.lib.design.toggle.Checkmark;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import pK0.InterfaceC46971a;

/* compiled from: SelectorCard.kt */
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001-J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&R$\u0010,\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCard;", "Landroid/widget/FrameLayout;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "Lcom/avito/android/lib/design/selector_card/style/c;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "enabled", "setEnabled", "(Z)V", "selected", "setSelected", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/avito/android/lib/design/selector_card/SelectorCardState$Indicator;", "indicator", "setIndicatorType", "(Lcom/avito/android/lib/design/selector_card/SelectorCardState$Indicator;)V", "Lcom/avito/android/lib/design/selector_card/SelectorCardState$Status;", "status", "setStatus", "(Lcom/avito/android/lib/design/selector_card/SelectorCardState$Status;)V", "Landroid/content/res/ColorStateList;", "colorStateList", "setBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/selector_card/style/c;)V", "newState", "setState", "(Lcom/avito/android/lib/design/selector_card/SelectorCardState;)V", "<set-?>", "b", "Landroid/widget/FrameLayout;", "getContentContainerView", "()Landroid/widget/FrameLayout;", "contentContainerView", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectorCard extends FrameLayout implements InterfaceC46971a, LV.a<SelectorCardState, com.avito.android.lib.design.selector_card.style.c> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f180324g = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final FrameLayout contentContainerView;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public SelectorCardState f180326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.selector_card.style.c f180327d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public a f180328e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.selector_card.a f180329f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCard$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f180330c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f180331d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f180332e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180333f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final int[] f180334b;

        static {
            a aVar = new a(0, "DEFAULT", new int[0]);
            f180330c = aVar;
            a aVar2 = new a(1, "ERROR", new int[]{R.attr.state_error});
            f180331d = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f180332e = aVarArr;
            f180333f = kotlin.enums.c.a(aVarArr);
        }

        public a(int i12, String str, int[] iArr) {
            this.f180334b = iArr;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f180332e.clone();
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[SelectorCardState.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SelectorCardState.Status status = SelectorCardState.Status.f180386b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<SelectorCardState, SelectorCardState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f180335l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12) {
            super(1);
            this.f180335l = z12;
        }

        @Override // Y41.l
        public final SelectorCardState invoke(SelectorCardState selectorCardState) {
            return SelectorCardState.a(selectorCardState, null, null, null, this.f180335l, false, null, 119);
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<SelectorCardState, SelectorCardState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SelectorCardState.Indicator f180336l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SelectorCardState.Indicator indicator) {
            super(1);
            this.f180336l = indicator;
        }

        @Override // Y41.l
        public final SelectorCardState invoke(SelectorCardState selectorCardState) {
            return SelectorCardState.a(selectorCardState, null, this.f180336l, null, false, false, null, 125);
        }
    }

    /* compiled from: SelectorCard.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.l<SelectorCardState, SelectorCardState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f180337l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SelectorCard f180338m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View.OnClickListener onClickListener, SelectorCard selectorCard) {
            super(1);
            this.f180337l = onClickListener;
            this.f180338m = selectorCard;
        }

        @Override // Y41.l
        public final SelectorCardState invoke(SelectorCardState selectorCardState) {
            SelectorCardState selectorCardState2 = selectorCardState;
            View.OnClickListener onClickListener = this.f180337l;
            return SelectorCardState.a(selectorCardState2, null, null, null, false, false, onClickListener != null ? new com.avito.android.lib.design.selector_card.b(onClickListener, this.f180338m) : null, 63);
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.l<SelectorCardState, SelectorCardState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f180339l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z12) {
            super(1);
            this.f180339l = z12;
        }

        @Override // Y41.l
        public final SelectorCardState invoke(SelectorCardState selectorCardState) {
            return SelectorCardState.a(selectorCardState, null, null, null, false, this.f180339l, null, 111);
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f180340l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a<G0> aVar) {
            super(1);
            this.f180340l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            this.f180340l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SelectorCard.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/w;", "invoke", "()Lcom/avito/android/lib/design/selector_card/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<w> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final w invoke() {
            PK0.n nVar;
            PK0.n nVar2;
            SelectorCard selectorCard = SelectorCard.this;
            w wVar = new w(selectorCard.getContext(), null, 0, 6, null);
            com.avito.android.lib.design.selector_card.style.c cVar = selectorCard.f180327d;
            if (cVar != null && (nVar2 = cVar.f180442g) != null) {
                com.avito.android.lib.design.text_view.e.a(wVar.f180461b, nVar2);
            }
            com.avito.android.lib.design.selector_card.style.c cVar2 = selectorCard.f180327d;
            if (cVar2 != null && (nVar = cVar2.f180443h) != null) {
                com.avito.android.lib.design.text_view.e.a(wVar.f180462c, nVar);
            }
            com.avito.android.lib.design.selector_card.style.c cVar3 = selectorCard.f180327d;
            if (cVar3 != null) {
                View view = wVar.f180463d;
                view.getLayoutParams().height = cVar3.f180446k;
                view.requestLayout();
            }
            selectorCard.getContentContainerView().addView(wVar);
            return wVar;
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.l<SelectorCardState, SelectorCardState> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SelectorCardState.Status f180342l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SelectorCardState.Status status) {
            super(1);
            this.f180342l = status;
        }

        @Override // Y41.l
        public final SelectorCardState invoke(SelectorCardState selectorCardState) {
            return SelectorCardState.a(selectorCardState, this.f180342l, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
    }

    /* compiled from: SelectorCard.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/FrameLayout$LayoutParams;", "Lkotlin/G0;", "invoke", "(Landroid/widget/FrameLayout$LayoutParams;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<FrameLayout.LayoutParams, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.b f180343l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c.b bVar) {
            super(1);
            this.f180343l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(FrameLayout.LayoutParams layoutParams) {
            c.b bVar = this.f180343l;
            layoutParams.setMargins(bVar.f180447a, bVar.f180448b, bVar.f180449c, bVar.f180450d);
            return G0.f406611a;
        }
    }

    @X41.j
    public SelectorCard(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static View a(View view, int i12, int i13) {
        if (!(view instanceof ViewGroup)) {
            return view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                int left = childAt.getLeft();
                if (i12 < childAt.getRight() && left <= i12) {
                    int top = childAt.getTop();
                    if (i13 < childAt.getBottom() && top <= i13) {
                        View viewA = a(childAt, i12 - childAt.getLeft(), i13 - childAt.getTop());
                        return viewA == null ? childAt : viewA;
                    }
                }
            }
        }
    }

    public final w b(Y41.a<w> aVar) {
        FrameLayout frameLayout = this.contentContainerView;
        if (frameLayout.getChildCount() != 1) {
            frameLayout = null;
        }
        View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        w wVar = childAt instanceof w ? (w) childAt : null;
        if (wVar != null) {
            return wVar;
        }
        if (aVar != null) {
            return (w) ((h) aVar).invoke();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            com.avito.android.lib.design.selector_card.SelectorCardState r0 = r9.f180326c
            r1 = 0
            if (r0 == 0) goto L17
            boolean r2 = r0.f180373e
            if (r2 == 0) goto Lf
            com.avito.android.lib.design.selector_card.SelectorCardState$Border r2 = com.avito.android.lib.design.selector_card.SelectorCardState.Border.f180376b
            com.avito.android.lib.design.selector_card.SelectorCardState$Border r3 = r0.f180371c
            if (r3 != r2) goto L15
        Lf:
            com.avito.android.lib.design.selector_card.SelectorCardState$Status r2 = com.avito.android.lib.design.selector_card.SelectorCardState.Status.f180387c
            com.avito.android.lib.design.selector_card.SelectorCardState$Status r0 = r0.f180369a
            if (r0 != r2) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = r1
        L18:
            wK0.a$a r2 = wK0.AbstractC49526a.f441376b
            com.avito.android.lib.design.selector_card.style.c r3 = r9.f180327d
            r4 = 0
            if (r3 == 0) goto L2c
            com.avito.android.lib.design.selector_card.style.a r3 = r3.f180438c
            if (r3 == 0) goto L2c
            kotlin.C r3 = r3.f180433e
            java.lang.Object r3 = r3.getValue()
            android.content.res.ColorStateList r3 = (android.content.res.ColorStateList) r3
            goto L2d
        L2c:
            r3 = r4
        L2d:
            com.avito.android.lib.design.selector_card.style.c r5 = r9.f180327d
            if (r5 == 0) goto L35
            float r6 = r5.f180439d
            int r6 = (int) r6
            goto L36
        L35:
            r6 = r1
        L36:
            if (r5 == 0) goto L46
            com.avito.android.lib.design.selector_card.style.a r5 = r5.f180440e
            if (r5 == 0) goto L46
            kotlin.C r5 = r5.f180433e
            java.lang.Object r5 = r5.getValue()
            android.content.res.ColorStateList r5 = (android.content.res.ColorStateList) r5
            r7 = r5
            goto L47
        L46:
            r7 = r4
        L47:
            com.avito.android.lib.design.selector_card.style.c r5 = r9.f180327d
            if (r5 == 0) goto L54
            if (r0 == 0) goto L4e
            r4 = r5
        L4e:
            if (r4 == 0) goto L54
            float r0 = r4.f180441f
            int r0 = (int) r0
            goto L55
        L54:
            r0 = r1
        L55:
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r1)
            r8 = 96
            r5 = r6
            r6 = r7
            r7 = r0
            wK0.b r0 = wK0.AbstractC49526a.C12816a.a(r2, r3, r4, r5, r6, r7, r8)
            r9.setBackground(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.selector_card.SelectorCard.c():void");
    }

    public final void d(Y41.l<? super SelectorCardState, SelectorCardState> lVar) {
        SelectorCardState selectorCardState = this.f180326c;
        if (selectorCardState != null) {
            setState(lVar.invoke(selectorCardState));
        }
    }

    @Y61.k
    public final FrameLayout getContentContainerView() {
        return this.contentContainerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    public final int[] onCreateDrawableState(int i12) {
        return View.mergeDrawableStates(super.onCreateDrawableState(i12 + this.f180328e.f180334b.length), this.f180328e.f180334b);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.k MotionEvent motionEvent) {
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        View viewA = a(this, (int) x12, (int) y12);
        TextView textView = viewA instanceof TextView ? (TextView) viewA : null;
        if (textView != null) {
            CharSequence text = textView.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                int offsetForPosition = textView.getOffsetForPosition(x12 - textView.getLeft(), y12 - textView.getTop());
                z = !(spanned.getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class).length == 0);
            }
        }
        return !z;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f179003x0);
        c.a aVar = com.avito.android.lib.design.selector_card.style.c.f180435l;
        Context context = getContext();
        aVar.getClass();
        com.avito.android.lib.design.selector_card.style.c cVarB = c.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        setStyle(cVarB);
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setBackgroundColor(@Y61.k ColorStateList colorStateList) {
        com.avito.android.lib.design.selector_card.style.c cVar = this.f180327d;
        if (cVar != null) {
            setStyle(new com.avito.android.lib.design.selector_card.style.c(cVar.f180436a, cVar.f180437b, com.avito.android.lib.design.selector_card.style.b.b(colorStateList), cVar.f180439d, cVar.f180440e, cVar.f180441f, cVar.f180442g, cVar.f180443h, cVar.f180444i, cVar.f180445j, cVar.f180446k));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        d(new c(enabled));
    }

    public final void setIndicatorType(@Y61.k SelectorCardState.Indicator indicator) {
        d(new d(indicator));
    }

    @Override // android.view.View
    public void setOnClickListener(@Y61.l View.OnClickListener l12) {
        d(new e(l12, this));
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        d(new f(selected));
    }

    public final void setStatus(@Y61.k SelectorCardState.Status status) {
        d(new i(status));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectorCard(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i15 = (i14 & 4) != 0 ? 0 : i12;
        int i16 = (i14 & 8) == 0 ? i13 : 0;
        super(context, attributeSet2, i15);
        this.f180328e = a.f180330c;
        LayoutInflater.from(context).inflate(R.layout.selector_card_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.selector_card_content_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.contentContainerView = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.selector_card_checkmark);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        Checkmark checkmark = (Checkmark) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.selector_card_switcher);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f180329f = new com.avito.android.lib.design.selector_card.a(checkmark, (Switcher) viewFindViewById3);
        SelectorCardState selectorCardState = new SelectorCardState(SelectorCardState.Status.f180386b, SelectorCardState.Indicator.f180381b, SelectorCardState.Border.f180377c, true, false, null, null, 96, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, d.n.f179003x0, i15, i16);
        com.avito.android.lib.design.selector_card.style.c.f180435l.getClass();
        com.avito.android.lib.design.selector_card.style.c cVarB = c.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        setStyle(cVarB);
        setState(selectorCardState);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.lib.design.selector_card.SelectorCardState r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.selector_card.SelectorCard.setState(com.avito.android.lib.design.selector_card.SelectorCardState):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.selector_card.style.c r9) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.selector_card.SelectorCard.setStyle(com.avito.android.lib.design.selector_card.style.c):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z12) {
    }
}
