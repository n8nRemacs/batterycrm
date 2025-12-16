package com.avito.android.lib.design.toast_bar;

import HV.a;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.C22771k;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.f0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarViewBase.kt */
@s0
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\b'\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u007f\u001aJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010#\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010<\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010K\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u00108\u001a\u0004\be\u0010\u000eR\u001a\u0010i\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bg\u00108\u001a\u0004\bh\u0010\u000eR\u001a\u0010l\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bj\u00108\u001a\u0004\bk\u0010\u000eR\u001a\u0010o\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bm\u00108\u001a\u0004\bn\u0010\u000eR\u001a\u0010r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bp\u00108\u001a\u0004\bq\u0010\u000eR\u001a\u0010u\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bs\u00108\u001a\u0004\bt\u0010\u000eR\u001a\u0010x\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bv\u00108\u001a\u0004\bw\u0010\u000eR\u001a\u0010{\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\by\u00108\u001a\u0004\bz\u0010\u000eR\u001a\u0010~\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b|\u00108\u001a\u0004\b}\u0010\u000e¨\u0006\u0080\u0001"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/i;", "Landroid/widget/LinearLayout;", "LLV/a;", "Lcom/avito/android/lib/design/toast_bar/state/ToastBarState;", "LHV/a;", "newStyle", "Lkotlin/G0;", "setStyle", "(LHV/a;)V", "newState", "setState", "(Lcom/avito/android/lib/design/toast_bar/state/ToastBarState;)V", "", "getTopMargin", "()I", "Landroid/widget/FrameLayout$LayoutParams;", "getNewLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "", "getStartYByToastBarType", "()F", "getTopWindowInset", "getBottomWindowInset", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "b", "LHV/a;", "getStyle$_design_modules_components", "()LHV/a;", "setStyle$_design_modules_components", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "c", "Z", "isSwipeEnabled", "()Z", "setSwipeEnabled", "(Z)V", "Landroid/widget/FrameLayout;", "d", "Landroid/widget/FrameLayout;", "getContainerView", "()Landroid/widget/FrameLayout;", "setContainerView", "(Landroid/widget/FrameLayout;)V", "containerView", "Landroid/view/View;", "e", "Landroid/view/View;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "f", "I", "getDuration", "setDuration", "(I)V", "duration", "Lcom/avito/android/lib/design/toast_bar/ToastBarPosition;", "g", "Lcom/avito/android/lib/design/toast_bar/ToastBarPosition;", "getPosition", "()Lcom/avito/android/lib/design/toast_bar/ToastBarPosition;", "setPosition", "(Lcom/avito/android/lib/design/toast_bar/ToastBarPosition;)V", "position", "h", "Ljava/lang/Integer;", "getCustomPosition", "()Ljava/lang/Integer;", "setCustomPosition", "(Ljava/lang/Integer;)V", "customPosition", "Lcom/avito/android/lib/design/toast_bar/i$b;", "i", "Lcom/avito/android/lib/design/toast_bar/i$b;", "getDismissListener", "()Lcom/avito/android/lib/design/toast_bar/i$b;", "setDismissListener", "(Lcom/avito/android/lib/design/toast_bar/i$b;)V", "dismissListener", "", "j", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "Lkotlin/Function0;", "k", "LY41/a;", "getOnDismiss", "()LY41/a;", "setOnDismiss", "(LY41/a;)V", "onDismiss", "l", "getButtonStyle", "buttonStyle", "m", "getTextVerticalOffsetPx", "textVerticalOffsetPx", "n", "getRightItemToTextHorizontalSpacing", "rightItemToTextHorizontalSpacing", "o", "getRightItemToTextVerticalSpacing", "rightItemToTextVerticalSpacing", "p", "getToastBarPaddingLeftPx", "toastBarPaddingLeftPx", "q", "getToastBarPaddingRightPx", "toastBarPaddingRightPx", "r", "getMarginLeftPx", "marginLeftPx", "s", "getMarginRightPx", "marginRightPx", "u", "getDisplayWidthPx", "displayWidthPx", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public abstract class i extends LinearLayout implements LV.a<ToastBarState, HV.a> {

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final a f181082D = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public static final LinkedList<WeakReference<i>> f181083E = new LinkedList<>();

    /* renamed from: A, reason: collision with root package name */
    @l
    public FrameLayout f181084A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final d f181085B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public C22771k f181086C;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public HV.a style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isSwipeEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public FrameLayout containerView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public View anchorView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int duration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public ToastBarPosition position;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public Integer customPosition;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    public b dismissListener;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public CharSequence text;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> onDismiss;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @f0
    public final int buttonStyle;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int textVerticalOffsetPx;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int rightItemToTextHorizontalSpacing;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int rightItemToTextVerticalSpacing;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int toastBarPaddingLeftPx;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final int toastBarPaddingRightPx;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int marginLeftPx;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final int marginRightPx;

    /* renamed from: t, reason: collision with root package name */
    public final int f181105t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final int displayWidthPx;

    /* renamed from: v, reason: collision with root package name */
    public boolean f181107v;

    /* renamed from: w, reason: collision with root package name */
    public float f181108w;

    /* renamed from: x, reason: collision with root package name */
    public float f181109x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public WeakReference<View> f181110y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public WeakReference<ViewGroup> f181111z;

    /* compiled from: ToastBarViewBase.kt */
    @s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/i$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Lcom/avito/android/lib/design/toast_bar/i;", "queue", "Ljava/util/LinkedList;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(@Y61.k i iVar) {
            i.f181083E.add(new WeakReference<>(iVar));
            i iVarC = c();
            if (iVar.equals(iVarC) || iVarC == null || iVarC.f181107v) {
                return;
            }
            iVarC.f();
        }

        public static void b() {
            i iVarC = c();
            i.f181083E.clear();
            if (iVarC != null) {
                iVarC.e();
            }
        }

        public static i c() {
            Object next;
            LinkedList<WeakReference<i>> linkedList = i.f181083E;
            if (linkedList.isEmpty()) {
                return null;
            }
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((WeakReference) next).get() != null) {
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) next;
            if (weakReference != null) {
                return (i) weakReference.get();
            }
            return null;
        }

        public static void d() {
            i iVarC = c();
            if (iVarC != null) {
                iVarC.k();
            }
        }

        public a() {
        }
    }

    /* compiled from: ToastBarViewBase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/i$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void invoke();
    }

    /* compiled from: ToastBarViewBase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[ToastBarPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToastBarPosition toastBarPosition2 = ToastBarPosition.f181044b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ToastBarPosition toastBarPosition3 = ToastBarPosition.f181044b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ToastBarPosition toastBarPosition4 = ToastBarPosition.f181044b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: ToastBarViewBase.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/toast_bar/i$e", "Lcom/avito/android/lib/design/toast_bar/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends com.avito.android.lib.design.toast_bar.d {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0.e f181113c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f181114d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f181115e;

        public e(l0.e eVar, i iVar, boolean z12) {
            this.f181113c = eVar;
            this.f181114d = iVar;
            this.f181115e = z12;
        }

        @Override // com.avito.android.lib.design.toast_bar.d
        public final void a() {
            this.f181114d.f();
        }

        @Override // com.avito.android.lib.design.toast_bar.d
        public final void b(float f12) {
            boolean z12 = this.f181115e;
            l0.e eVar = this.f181113c;
            i iVar = this.f181114d;
            if (z12) {
                if (f12 < 0.0f) {
                    iVar.setY(iVar.getY() + f12);
                    iVar.setAlpha(iVar.getY() / eVar.f406839b);
                    return;
                }
                return;
            }
            if (f12 > 0.0f) {
                iVar.setY(iVar.getY() + f12);
                float y12 = iVar.getY();
                float f13 = eVar.f406839b;
                iVar.setAlpha(1 - ((y12 - f13) / f13));
            }
        }

        @Override // com.avito.android.lib.design.toast_bar.d
        public final void c() {
            this.f181113c.f406839b = this.f181114d.getY();
        }
    }

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.toastBar : i12, (i14 & 8) != 0 ? R.style.Design_Widget_ToastBar_Default : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        return C35835l0.a(getContext());
    }

    private final int getBottomWindowInset() {
        C22771k c22771k;
        WeakReference<View> weakReference = this.f181110y;
        if ((weakReference != null ? weakReference.get() : null) == null || (c22771k = this.f181086C) == null) {
            return 0;
        }
        return c22771k.f44778d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout.LayoutParams getNewLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        HV.a aVar = this.style;
        layoutParams.leftMargin = aVar != null ? aVar.f7117q : 0;
        layoutParams.rightMargin = aVar != null ? aVar.f7118r : 0;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getStartYByToastBarType() {
        float f12 = this.f181105t;
        if (this.f181109x > f12 / 2) {
            return f12;
        }
        return 0.0f;
    }

    private final int getTopWindowInset() {
        C22771k c22771k = this.f181086C;
        if (c22771k != null) {
            return c22771k.f44776b;
        }
        return 0;
    }

    public final int d(View view, int i12) {
        HV.a aVar = this.style;
        if (aVar == null) {
            return 0;
        }
        int topWindowInset = getTopWindowInset();
        int i13 = aVar.f7120t;
        int i14 = topWindowInset + i13;
        int bottomWindowInset = ((this.f181105t - getBottomWindowInset()) - i13) - getMeasuredHeight();
        int iOrdinal = this.position.ordinal();
        int i15 = aVar.f7119s;
        if (iOrdinal == 0) {
            return Math.max(i14, (i12 - getMeasuredHeight()) - i15);
        }
        if (iOrdinal == 1) {
            return Math.min(bottomWindowInset, view.getMeasuredHeight() + i12 + i15);
        }
        if (iOrdinal == 2) {
            return Math.max(i14, i12 + i15);
        }
        if (iOrdinal == 3) {
            return Math.min(bottomWindowInset, ((view.getMeasuredHeight() + i12) - getMeasuredHeight()) - i15);
        }
        if (iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Integer num = this.customPosition;
        if (num == null) {
            return Math.min(bottomWindowInset, ((view.getMeasuredHeight() + i12) - getMeasuredHeight()) - i15);
        }
        int iIntValue = num.intValue();
        return Math.min(bottomWindowInset - iIntValue, (((view.getMeasuredHeight() + i12) - getMeasuredHeight()) - i15) - iIntValue);
    }

    public final void e() {
        Application application;
        b bVar = this.dismissListener;
        if (bVar != null) {
            bVar.invoke();
        }
        this.dismissListener = null;
        Y41.a<G0> aVar = this.onDismiss;
        if (aVar != null) {
            aVar.invoke();
        }
        this.onDismiss = null;
        WeakReference<ViewGroup> weakReference = this.f181111z;
        ViewGroup viewGroup = weakReference != null ? weakReference.get() : null;
        if ((viewGroup != null ? viewGroup.indexOfChild(this) : -1) != -1) {
            if (viewGroup != null) {
                viewGroup.removeView(this);
                return;
            }
            return;
        }
        Activity activity = getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this.f181085B);
        }
        f181082D.getClass();
        if (C42745f0.l0(new h(this), f181083E)) {
            a.d();
        }
    }

    public final void f() {
        if (isAttachedToWindow()) {
            animate().alpha(0.0f).translationY(this.f181108w).setDuration(300L).withStartAction(new g(this, 0)).withEndAction(new g(this, 1)).start();
        } else {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.FrameLayout g() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.containerView
            if (r0 == 0) goto L5
            return r0
        L5:
            android.view.View r0 = r4.anchorView
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r0.getParent()
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 == 0) goto L31
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L14:
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L21
            r3 = r2
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4.f181084A = r3
        L21:
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2c
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L14
        L2c:
            android.widget.FrameLayout r0 = r4.f181084A
            if (r0 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L35
            return r0
        L35:
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L4f
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L4f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L4f
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)
            goto L50
        L4f:
            r0 = r1
        L50:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L57
            r1 = r0
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.toast_bar.i.g():android.widget.FrameLayout");
    }

    @l
    public final View getAnchorView() {
        return this.anchorView;
    }

    public final int getButtonStyle() {
        return this.buttonStyle;
    }

    @l
    public final FrameLayout getContainerView() {
        return this.containerView;
    }

    @l
    public final Integer getCustomPosition() {
        return this.customPosition;
    }

    @l
    public final b getDismissListener() {
        return this.dismissListener;
    }

    public final int getDisplayWidthPx() {
        return this.displayWidthPx;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getMarginLeftPx() {
        return this.marginLeftPx;
    }

    public final int getMarginRightPx() {
        return this.marginRightPx;
    }

    @l
    public final Y41.a<G0> getOnDismiss() {
        return this.onDismiss;
    }

    @Y61.k
    public final ToastBarPosition getPosition() {
        return this.position;
    }

    public final int getRightItemToTextHorizontalSpacing() {
        return this.rightItemToTextHorizontalSpacing;
    }

    public final int getRightItemToTextVerticalSpacing() {
        return this.rightItemToTextVerticalSpacing;
    }

    @l
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final HV.a getStyle() {
        return this.style;
    }

    @Y61.k
    public final CharSequence getText() {
        return this.text;
    }

    public final int getTextVerticalOffsetPx() {
        return this.textVerticalOffsetPx;
    }

    public final int getToastBarPaddingLeftPx() {
        return this.toastBarPaddingLeftPx;
    }

    public final int getToastBarPaddingRightPx() {
        return this.toastBarPaddingRightPx;
    }

    public final int getTopMargin() {
        WeakReference<View> weakReference = this.f181110y;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            return 0;
        }
        int i12 = getNewLayoutParams().width;
        measure(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(view.getWidth(), BeduinInputModel.MIN_TEXT_VERSION) : View.MeasureSpec.makeMeasureSpec(0, 0), 0);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int iD2 = d(view, iArr[1]);
        TabBarLayout.a aVar = TabBarLayout.f180679h;
        Context context = getContext();
        aVar.getClass();
        TabBarLayout tabBarLayoutA = TabBarLayout.a.a(context);
        if (tabBarLayoutA == null || getMeasuredHeight() + iD2 <= tabBarLayoutA.getLocationInWindowY()) {
            return iD2;
        }
        this.position = ToastBarPosition.f181044b;
        return d(tabBarLayoutA, tabBarLayoutA.getLocationInWindowY());
    }

    public abstract void h(@Y61.k LayoutInflater layoutInflater);

    public abstract void i();

    public final void j() {
        setOnTouchListener(new e(new l0.e(), this, getStartYByToastBarType() == 0.0f));
    }

    public final void k() {
        FrameLayout frameLayoutG = g();
        if (frameLayoutG == null) {
            return;
        }
        this.f181111z = new WeakReference<>(frameLayoutG);
        View view = this.anchorView;
        this.f181110y = view != null ? new WeakReference<>(view) : this.f181110y;
        i();
        WeakReference<View> weakReference = this.f181110y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 == null) {
            f181082D.getClass();
            C42745f0.l0(new h(this), f181083E);
            a.d();
        }
        if (view2 != null) {
            D6.l(true, view2, new j(this, frameLayoutG));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Application application;
        super.onDetachedFromWindow();
        Activity activity = getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this.f181085B);
        }
        f181082D.getClass();
        if (C42745f0.l0(new h(this), f181083E)) {
            a.d();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        HV.a aVar = this.style;
        int iMin = Math.min(aVar != null ? aVar.f7101a : Integer.MAX_VALUE, size);
        HV.a aVar2 = this.style;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(aVar2 != null ? aVar2.f7102b : 0, iMin), 1073741824), i13);
    }

    public final void setAnchorView(@l View view) {
        this.anchorView = view;
    }

    public final void setContainerView(@l FrameLayout frameLayout) {
        this.containerView = frameLayout;
    }

    public final void setCustomPosition(@l Integer num) {
        this.customPosition = num;
    }

    public final void setDismissListener(@l b bVar) {
        this.dismissListener = bVar;
    }

    public final void setDuration(int i12) {
        this.duration = i12;
    }

    public final void setOnDismiss(@l Y41.a<G0> aVar) {
        this.onDismiss = aVar;
    }

    public final void setPosition(@Y61.k ToastBarPosition toastBarPosition) {
        this.position = toastBarPosition;
    }

    @Override // LV.b
    public void setState(@Y61.k ToastBarState newState) {
    }

    public final void setStyle$_design_modules_components(@l HV.a aVar) {
        this.style = aVar;
    }

    public final void setSwipeEnabled(boolean z12) {
        this.isSwipeEnabled = z12;
    }

    public final void setText(@Y61.k CharSequence charSequence) {
        this.text = charSequence;
    }

    public i(@Y61.k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context);
        this.isSwipeEnabled = true;
        this.duration = 2750;
        this.position = ToastBarPosition.f181047e;
        this.text = "";
        FrameLayout frameLayoutG = g();
        this.f181110y = frameLayoutG != null ? new WeakReference<>(frameLayoutG) : null;
        this.f181085B = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178942Q0, i12, i13);
        HV.a.f7100w.getClass();
        this.style = a.C0407a.c(typedArrayObtainStyledAttributes, context);
        this.buttonStyle = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        HV.a aVar = this.style;
        this.textVerticalOffsetPx = aVar != null ? aVar.f7106f : 0;
        this.rightItemToTextHorizontalSpacing = aVar != null ? aVar.f7108h : 0;
        this.rightItemToTextVerticalSpacing = aVar != null ? aVar.f7109i : 0;
        this.toastBarPaddingLeftPx = aVar != null ? aVar.f7113m : 0;
        this.toastBarPaddingRightPx = aVar != null ? aVar.f7114n : 0;
        this.marginLeftPx = aVar != null ? aVar.f7117q : 0;
        this.marginRightPx = aVar != null ? aVar.f7118r : 0;
        setPadding(aVar != null ? aVar.f7113m : 0, aVar != null ? aVar.f7115o : 0, aVar != null ? aVar.f7114n : 0, aVar != null ? aVar.f7116p : 0);
        typedArrayObtainStyledAttributes.recycle();
        setClipToPadding(false);
        TypedValue typedValue = new TypedValue();
        ContextWrapper contextWrapper = new ContextWrapper(context);
        contextWrapper.setTheme(context.getTheme().resolveAttribute(i12, typedValue, true) ? typedValue.resourceId : i13);
        h(LayoutInflater.from(contextWrapper));
        this.f181105t = C35835l0.i(context).heightPixels;
        this.displayWidthPx = C35835l0.i(context).widthPixels;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k HV.a r9) {
        /*
            r8 = this;
            HV.a r0 = r8.style
            com.avito.android.lib.util.c r1 = new com.avito.android.lib.util.c
            r1.<init>(r9, r0)
            boolean r1 = r1.f181333c
            if (r1 != 0) goto Ld2
            r8.style = r9
            int r1 = r9.f7101a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            if (r0 == 0) goto L1d
            int r3 = r0.f7101a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L1e
        L1d:
            r3 = r2
        L1e:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            int r1 = r9.f7102b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L33
            int r3 = r0.f7102b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L34
        L33:
            r3 = r2
        L34:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3d
        L3a:
            r8.requestLayout()
        L3d:
            int r1 = r9.f7114n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L4c
            int r4 = r0.f7114n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L4d
        L4c:
            r4 = r2
        L4d:
            boolean r3 = r3.equals(r4)
            int r4 = r9.f7116p
            int r5 = r9.f7115o
            int r6 = r9.f7113m
            if (r3 == 0) goto L95
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L66
            int r7 = r0.f7113m
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L67
        L66:
            r7 = r2
        L67:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L95
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L7a
            int r7 = r0.f7115o
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L7b
        L7a:
            r7 = r2
        L7b:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L95
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L8e
            int r7 = r0.f7116p
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L8f
        L8e:
            r7 = r2
        L8f:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L98
        L95:
            r8.setPadding(r6, r5, r1, r4)
        L98:
            int r1 = r9.f7118r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto La7
            int r4 = r0.f7118r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto La8
        La7:
            r4 = r2
        La8:
            boolean r3 = r3.equals(r4)
            int r9 = r9.f7117q
            if (r3 == 0) goto Lc2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            if (r0 == 0) goto Lbc
            int r0 = r0.f7117q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        Lbc:
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto Ld2
        Lc2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r6 = 0
            r7 = 10
            r2 = r8
            com.avito.android.util.D6.c(r2, r3, r4, r5, r6, r7)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.toast_bar.i.setStyle(HV.a):void");
    }

    /* compiled from: ToastBarViewBase.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/toast_bar/i$d", "Landroid/app/Application$ActivityLifecycleCallbacks;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@Y61.k Activity activity) {
            if (activity.equals(i.this.getActivity())) {
                i.f181082D.getClass();
                a.b();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@Y61.k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@Y61.k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @l Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@Y61.k Activity activity, @Y61.k Bundle bundle) {
        }
    }
}
