package com.avito.android.lib.design.page_indicator_re23;

import X41.j;
import Y61.k;
import Y61.l;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.r;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.page_indicator_re23.DotsStateManager;
import com.avito.android.lib.design.page_indicator_re23.state.PageIndicatorState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.O2;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import rV.InterfaceC47597a;
import sV.C48110a;
import sV.C48111b;

/* compiled from: PageIndicatorRe23.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u000245J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000fR?\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u00103\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00038@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u0010\f¨\u00066"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23;", "Landroid/widget/LinearLayout;", "LLV/a;", "Lcom/avito/android/lib/design/page_indicator_re23/state/PageIndicatorState;", "LsV/b;", "", "color", "Lkotlin/G0;", "setBackgroundColor", "(I)V", "newState", "setState", "(Lcom/avito/android/lib/design/page_indicator_re23/state/PageIndicatorState;)V", "newStyle", "setStyle", "(LsV/b;)V", "b", "LsV/b;", "getStyle$_design_modules_components", "()LsV/b;", "setStyle$_design_modules_components", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/Function1;", "Lkotlin/S;", "name", "index", "h", "LY41/l;", "getSelectedIndexListener$_design_modules_components", "()LY41/l;", "setSelectedIndexListener$_design_modules_components", "(LY41/l;)V", "selectedIndexListener", "LrV/a;", "i", "LrV/a;", "getAttachDelegate$_design_modules_components", "()LrV/a;", "setAttachDelegate$_design_modules_components", "(LrV/a;)V", "attachDelegate", "LrV/f;", "j", "LrV/f;", "getPageIndicatorCallback$_design_modules_components", "()LrV/f;", "pageIndicatorCallback", "value", "getState$_design_modules_components", "()Lcom/avito/android/lib/design/page_indicator_re23/state/PageIndicatorState;", "setState$_design_modules_components", VoiceInfo.STATE, "SavedState", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PageIndicatorRe23 extends LinearLayout implements LV.a<PageIndicatorState, C48111b> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f179906k = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public C48111b style;

    /* renamed from: c, reason: collision with root package name */
    @l
    public DotsStateManager f179908c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C48110a f179909d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public List<? extends DotsStateManager.DotState> f179910e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AnimatorSet f179911f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedList<View> f179912g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.l<? super Integer, G0> selectedIndexListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    public InterfaceC47597a<?> attachDelegate;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final d f179915j;

    /* compiled from: PageIndicatorRe23.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f179916b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PageIndicatorState f179917c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final List<DotsStateManager.DotState> f179918d;

        /* compiled from: PageIndicatorRe23.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Parcelable parcelable = parcel.readParcelable(SavedState.class.getClassLoader());
                PageIndicatorState pageIndicatorStateCreateFromParcel = PageIndicatorState.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList2.add(DotsStateManager.DotState.valueOf(parcel.readString()));
                    }
                    arrayList = arrayList2;
                }
                return new SavedState(parcelable, pageIndicatorStateCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SavedState(@k Parcelable parcelable, @k PageIndicatorState pageIndicatorState, @l List<? extends DotsStateManager.DotState> list) {
            super(parcelable);
            this.f179916b = parcelable;
            this.f179917c = pageIndicatorState;
            this.f179918d = list;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f179916b, i12);
            this.f179917c.writeToParcel(parcel, i12);
            List<DotsStateManager.DotState> list = this.f179918d;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeString(((DotsStateManager.DotState) itA.next()).name());
            }
        }
    }

    /* compiled from: PageIndicatorRe23.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23$a;", "Landroid/animation/TypeEvaluator;", "Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23$a$a;", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TypeEvaluator<C5291a> {

        /* compiled from: PageIndicatorRe23.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23$a$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5291a {

            /* renamed from: a, reason: collision with root package name */
            public final int f179919a;

            /* renamed from: b, reason: collision with root package name */
            public final int f179920b;

            /* renamed from: c, reason: collision with root package name */
            public final int f179921c;

            public C5291a(int i12, int i13, int i14) {
                this.f179919a = i12;
                this.f179920b = i13;
                this.f179921c = i14;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5291a)) {
                    return false;
                }
                C5291a c5291a = (C5291a) obj;
                return this.f179919a == c5291a.f179919a && this.f179920b == c5291a.f179920b && this.f179921c == c5291a.f179921c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f179921c) + r.e(this.f179920b, Integer.hashCode(this.f179919a) * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Size(width=");
                sb2.append(this.f179919a);
                sb2.append(", height=");
                sb2.append(this.f179920b);
                sb2.append(", spacing=");
                return r.t(sb2, this.f179921c, ')');
            }
        }

        @Override // android.animation.TypeEvaluator
        public final C5291a evaluate(float f12, C5291a c5291a, C5291a c5291a2) {
            C5291a c5291a3 = c5291a;
            C5291a c5291a4 = c5291a2;
            int i12 = c5291a4.f179919a;
            int i13 = c5291a3.f179919a;
            int i14 = c5291a4.f179920b;
            int i15 = c5291a3.f179920b;
            int i16 = c5291a4.f179921c;
            return new C5291a(kotlin.math.b.b((i12 - i13) * f12) + i13, kotlin.math.b.b((i14 - i15) * f12) + i15, kotlin.math.b.b((i16 - r7) * f12) + c5291a3.f179921c);
        }
    }

    /* compiled from: PageIndicatorRe23.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DotsStateManager.DotState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DotsStateManager.DotState dotState = DotsStateManager.DotState.f179899b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DotsStateManager.DotState dotState2 = DotsStateManager.DotState.f179899b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DotsStateManager.DotState dotState3 = DotsStateManager.DotState.f179899b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DotsStateManager.DotState dotState4 = DotsStateManager.DotState.f179899b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: PageIndicatorRe23.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c implements DotsStateManager.b, D {
        public c() {
        }

        @Override // com.avito.android.lib.design.page_indicator_re23.DotsStateManager.b
        public final void a(@k ArrayList arrayList) {
            int i12 = PageIndicatorRe23.f179906k;
            PageIndicatorRe23.this.a(arrayList);
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof DotsStateManager.b) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, PageIndicatorRe23.this, PageIndicatorRe23.class, "applyDotsState", "applyDotsState(Ljava/util/List;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: PageIndicatorRe23.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23$d", "LrV/f;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements rV.f {
        public d() {
        }

        @Override // rV.f
        public final void a(int i12, int i13) {
            PageIndicatorRe23 pageIndicatorRe23 = PageIndicatorRe23.this;
            pageIndicatorRe23.e(i12, pageIndicatorRe23.getState$_design_modules_components().f179932b);
        }

        @Override // rV.f
        public final void b(int i12) {
            PageIndicatorRe23 pageIndicatorRe23 = PageIndicatorRe23.this;
            PageIndicatorState state$_design_modules_components = pageIndicatorRe23.getState$_design_modules_components();
            int i13 = state$_design_modules_components.f179932b;
            boolean z12 = state$_design_modules_components.f179934d;
            state$_design_modules_components.getClass();
            pageIndicatorRe23.setState$_design_modules_components(new PageIndicatorState(i13, i12, z12));
        }
    }

    /* compiled from: PageIndicatorRe23.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e implements DotsStateManager.b, D {
        public e() {
        }

        @Override // com.avito.android.lib.design.page_indicator_re23.DotsStateManager.b
        public final void a(@k ArrayList arrayList) {
            int i12 = PageIndicatorRe23.f179906k;
            PageIndicatorRe23.this.a(arrayList);
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof DotsStateManager.b) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, PageIndicatorRe23.this, PageIndicatorRe23.class, "applyDotsState", "applyDotsState(Ljava/util/List;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: PageIndicatorRe23.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f implements DotsStateManager.b, D {
        public f() {
        }

        @Override // com.avito.android.lib.design.page_indicator_re23.DotsStateManager.b
        public final void a(@k ArrayList arrayList) {
            int i12 = PageIndicatorRe23.f179906k;
            PageIndicatorRe23.this.a(arrayList);
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof DotsStateManager.b) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, PageIndicatorRe23.this, PageIndicatorRe23.class, "applyDotsState", "applyDotsState(Ljava/util/List;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @j
    public PageIndicatorRe23(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(List<? extends DotsStateManager.DotState> list) {
        AnimatorSet animatorSet = this.f179911f;
        if (animatorSet != null) {
            animatorSet.end();
        }
        kotlin.ranges.l lVarB = b(list);
        List<? extends DotsStateManager.DotState> list2 = this.f179910e;
        int i12 = lVarB.f406906c;
        int i13 = lVarB.f406905b;
        if (list2 != null) {
            kotlin.ranges.l lVarB2 = b(list2);
            int i14 = lVarB2.f406906c;
            boolean z12 = i12 > i14;
            int i15 = lVarB2.f406905b;
            boolean z13 = i13 < i15;
            if (z13 || z12) {
                ImageView imageViewD = d(DotsStateManager.DotState.f179903f, z13 ? Integer.MIN_VALUE : Integer.MAX_VALUE);
                if (z13) {
                    addView(imageViewD, 0);
                } else {
                    addView(imageViewD);
                }
            }
            boolean z14 = i12 < i14;
            int i16 = i13 > i15 ? 1 : 0;
            int childCount = getChildCount();
            if (z14) {
                childCount--;
            }
            ArrayList arrayList = new ArrayList();
            List listX0 = C42745f0.x0(list, lVarB);
            kotlin.ranges.k it = s.r(i16, childCount).iterator();
            int i17 = 0;
            while (it.f406910d) {
                int iA2 = it.a();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                ImageView imageView = (ImageView) getChildAt(iA2);
                DotsStateManager.DotState dotState = (DotsStateManager.DotState) imageView.getTag();
                DotsStateManager.DotState dotState2 = (DotsStateManager.DotState) listX0.get(i17);
                if (dotState != dotState2) {
                    arrayList.add(c(imageView, dotState2, i17 + i13, iA2));
                }
                i17 = i18;
            }
            if (i16 != 0 || z14) {
                arrayList.add(c((ImageView) getChildAt(i16 != 0 ? 0 : getChildCount() - 1), DotsStateManager.DotState.f179903f, i16 != 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE, BeduinInputModel.MIN_TEXT_VERSION));
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setDuration(this.style.f437685k);
            animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f179911f = animatorSet2;
            animatorSet2.start();
        } else if (O2.a(list) && i13 <= i12) {
            while (true) {
                addView(d(list.get(i13), i13));
                if (i13 == i12) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f179910e = list;
    }

    public final kotlin.ranges.l b(List<? extends DotsStateManager.DotState> list) {
        int i12 = getState$_design_modules_components().f179932b;
        while (true) {
            int i13 = i12 - 1;
            if (i13 < 0 || list.get(i13) == DotsStateManager.DotState.f179903f) {
                break;
            }
            i12--;
        }
        int i14 = getState$_design_modules_components().f179932b;
        while (true) {
            int i15 = i14 + 1;
            if (i15 > C42745f0.J(list) || list.get(i15) == DotsStateManager.DotState.f179903f) {
                break;
            }
            i14 = i15;
        }
        return new kotlin.ranges.l(i12, i14, 1);
    }

    public final AnimatorSet c(ImageView imageView, DotsStateManager.DotState dotState, int i12, int i13) {
        C48110a c48110aH = h(dotState);
        int i14 = (i13 == 0 || (i13 == 1 && dotState == DotsStateManager.DotState.f179902e) || dotState == DotsStateManager.DotState.f179903f) ? 0 : this.style.f437679e;
        GradientDrawable gradientDrawable = (GradientDrawable) imageView.getDrawable();
        ColorStateList color = gradientDrawable.getColor();
        int defaultColor = color != null ? color.getDefaultColor() : 0;
        int i15 = c48110aH.f437672c;
        if (getState$_design_modules_components().f179934d && i12 < getState$_design_modules_components().f179932b) {
            i15 = this.style.f437680f;
        }
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(gradientDrawable, "color", defaultColor, i15);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new a(), new a.C5291a(((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).width, ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).height, ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).getMarginStart()), new a.C5291a(c48110aH.f437670a, c48110aH.f437671b, i14));
        valueAnimatorOfObject.addUpdateListener(new AV.a(imageView, 10));
        valueAnimatorOfObject.addListener(new com.avito.android.lib.design.page_indicator_re23.a(dotState, this, imageView, gradientDrawable, dotState, gradientDrawable));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfArgb, valueAnimatorOfObject);
        return animatorSet;
    }

    public final ImageView d(DotsStateManager.DotState dotState, int i12) {
        ImageView imageView;
        loop0: while (true) {
            imageView = null;
            do {
                LinkedList<View> linkedList = this.f179912g;
                if (linkedList.size() <= 0 || imageView != null) {
                    break loop0;
                }
                imageView = (ImageView) linkedList.pop();
            } while (imageView.getParent() == null);
        }
        if (imageView == null) {
            imageView = new ImageView(getContext());
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            imageView.setId(View.generateViewId());
            imageView.setImageDrawable(new GradientDrawable());
        }
        C48110a c48110aH = h(dotState);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(c48110aH.f437670a, c48110aH.f437671b);
        marginLayoutParams.setMarginStart((i12 == 0 || dotState == DotsStateManager.DotState.f179903f) ? 0 : this.style.f437679e);
        imageView.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) imageView.getDrawable();
        gradientDrawable.setColor((!getState$_design_modules_components().f179934d || i12 >= getState$_design_modules_components().f179932b) ? c48110aH.f437672c : this.style.f437680f);
        if (dotState == DotsStateManager.DotState.f179899b) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(c48110aH.f437673d);
        } else {
            gradientDrawable.setShape(1);
        }
        imageView.setTag(dotState);
        return imageView;
    }

    public final void e(int i12, int i13) {
        int i14;
        if (Math.abs(i13 - i12) > 1) {
            f();
        }
        DotsStateManager dotsStateManager = this.f179908c;
        if (dotsStateManager != null && ((i14 = dotsStateManager.f179897f) != i12 || dotsStateManager.f179895d == null)) {
            dotsStateManager.f179896e = i12 > i14;
            dotsStateManager.f179897f = i12;
            dotsStateManager.b();
        }
        Y41.l<? super Integer, G0> lVar = this.selectedIndexListener;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i12));
        }
    }

    public final void f() {
        this.f179910e = null;
        Iterator<View> it = new C22829k0(this).iterator();
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                removeAllViews();
                return;
            } else {
                this.f179912g.push((View) c22833m0.next());
            }
        }
    }

    public final void g(int i12, boolean z12) {
        DotsStateManager dotsStateManager = this.f179908c;
        if (dotsStateManager == null) {
            this.f179908c = new DotsStateManager(i12, new e(), null, 0, z12, 12, null);
        } else {
            if (dotsStateManager.f179892a == i12 && dotsStateManager.f179898g == z12) {
                return;
            }
            this.f179908c = new DotsStateManager(i12, new f(), null, 0, z12, 12, null);
            f();
        }
    }

    @l
    public final InterfaceC47597a<?> getAttachDelegate$_design_modules_components() {
        return this.attachDelegate;
    }

    @k
    public final rV.f getPageIndicatorCallback$_design_modules_components() {
        return this.f179915j;
    }

    @l
    public final Y41.l<Integer, G0> getSelectedIndexListener$_design_modules_components() {
        return this.selectedIndexListener;
    }

    @k
    public final PageIndicatorState getState$_design_modules_components() {
        DotsStateManager dotsStateManager = this.f179908c;
        return new PageIndicatorState(dotsStateManager != null ? dotsStateManager.f179897f : -1, dotsStateManager != null ? dotsStateManager.f179892a : 0, dotsStateManager != null ? dotsStateManager.f179898g : false);
    }

    @k
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final C48111b getStyle() {
        return this.style;
    }

    public final C48110a h(DotsStateManager.DotState dotState) {
        int iOrdinal = dotState.ordinal();
        if (iOrdinal == 0) {
            return this.style.f437681g;
        }
        if (iOrdinal == 1) {
            return this.style.f437682h;
        }
        if (iOrdinal == 2) {
            return this.style.f437683i;
        }
        if (iOrdinal == 3) {
            return this.style.f437684j;
        }
        if (iOrdinal == 4) {
            return this.f179909d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f179911f;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        f();
        PageIndicatorState pageIndicatorState = savedState.f179917c;
        int i12 = pageIndicatorState.f179933c;
        c cVar = new c();
        List<DotsStateManager.DotState> list = savedState.f179918d;
        this.f179908c = new DotsStateManager(i12, cVar, list, pageIndicatorState.f179932b, pageIndicatorState.f179934d);
        if (list != null) {
            a(list);
        }
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        PageIndicatorState state$_design_modules_components = getState$_design_modules_components();
        DotsStateManager dotsStateManager = this.f179908c;
        return new SavedState(parcelableOnSaveInstanceState, state$_design_modules_components, dotsStateManager != null ? dotsStateManager.f179895d : null);
    }

    public final void setAttachDelegate$_design_modules_components(@l InterfaceC47597a<?> interfaceC47597a) {
        this.attachDelegate = interfaceC47597a;
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC42156l int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(this.style.f437676b);
        setBackground(gradientDrawable);
    }

    public final void setSelectedIndexListener$_design_modules_components(@l Y41.l<? super Integer, G0> lVar) {
        this.selectedIndexListener = lVar;
    }

    public final void setState$_design_modules_components(@k PageIndicatorState pageIndicatorState) {
        g(pageIndicatorState.f179933c, pageIndicatorState.f179934d);
    }

    public final void setStyle$_design_modules_components(@k C48111b c48111b) {
        this.style = c48111b;
    }

    public /* synthetic */ PageIndicatorRe23(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.pageIndicatorDefault : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    @Override // LV.b
    public void setState(@k PageIndicatorState newState) {
        DotsStateManager dotsStateManager;
        PageIndicatorState state$_design_modules_components = getState$_design_modules_components();
        if (state$_design_modules_components == null) {
            state$_design_modules_components = null;
        }
        if (new com.avito.android.lib.util.c(newState, state$_design_modules_components).f181333c) {
            return;
        }
        setState$_design_modules_components(newState);
        int i12 = newState.f179933c;
        if (!L.f(Integer.valueOf(i12), state$_design_modules_components != null ? Integer.valueOf(state$_design_modules_components.f179933c) : null)) {
            g(i12, getState$_design_modules_components().f179934d);
        }
        int i13 = newState.f179932b;
        if (!L.f(Integer.valueOf(i13), state$_design_modules_components != null ? Integer.valueOf(state$_design_modules_components.f179932b) : null)) {
            e(i13, state$_design_modules_components != null ? state$_design_modules_components.f179932b : -1);
            return;
        }
        if (L.f(Integer.valueOf(i12), state$_design_modules_components != null ? Integer.valueOf(state$_design_modules_components.f179933c) : null) || (dotsStateManager = this.f179908c) == null) {
            return;
        }
        dotsStateManager.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k sV.C48111b r6) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23.setStyle(sV.b):void");
    }

    @j
    public PageIndicatorRe23(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178967f0, i12, i13);
        C48111b.f437674l.getClass();
        this.style = C48111b.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(17);
        int i14 = this.style.f437675a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i14);
        gradientDrawable.setCornerRadius(this.style.f437676b);
        setBackground(gradientDrawable);
        C48111b c48111b = this.style;
        int i15 = c48111b.f437677c;
        int i16 = c48111b.f437678d;
        setPadding(i15, i16, i15, i16);
        C48110a c48110a = this.style.f437684j;
        this.f179909d = new C48110a(0, 0, c48110a.f437672c, c48110a.f437673d);
        this.f179912g = new LinkedList<>();
        this.f179915j = new d();
    }
}
