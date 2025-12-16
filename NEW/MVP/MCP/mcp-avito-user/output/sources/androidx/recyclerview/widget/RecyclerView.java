package androidx.recyclerview.widget;

import S1.a;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.RestrictTo;
import androidx.collection.C20204c0;
import androidx.collection.o1;
import androidx.compose.runtime.C22026a;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C23410a;
import androidx.recyclerview.widget.C23416g;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.X;
import androidx.recyclerview.widget.Y;
import androidx.recyclerview.widget.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager;
import j.InterfaceC42153i;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.T, androidx.core.view.E, androidx.core.view.F {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[] f53734C0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: D0, reason: collision with root package name */
    public static final Class<?>[] f53735D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final Interpolator f53736E0;

    /* renamed from: A, reason: collision with root package name */
    public int f53737A;

    /* renamed from: A0, reason: collision with root package name */
    public int f53738A0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f53739B;

    /* renamed from: B0, reason: collision with root package name */
    public final d f53740B0;

    /* renamed from: C, reason: collision with root package name */
    public final AccessibilityManager f53741C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f53742D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f53743E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f53744F;

    /* renamed from: G, reason: collision with root package name */
    public int f53745G;

    /* renamed from: H, reason: collision with root package name */
    public int f53746H;

    /* renamed from: I, reason: collision with root package name */
    @j.N
    public i f53747I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f53748J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f53749K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f53750L;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f53751M;

    /* renamed from: N, reason: collision with root package name */
    public j f53752N;

    /* renamed from: O, reason: collision with root package name */
    public int f53753O;

    /* renamed from: P, reason: collision with root package name */
    public int f53754P;

    /* renamed from: Q, reason: collision with root package name */
    public VelocityTracker f53755Q;

    /* renamed from: R, reason: collision with root package name */
    public int f53756R;

    /* renamed from: S, reason: collision with root package name */
    public int f53757S;

    /* renamed from: T, reason: collision with root package name */
    public int f53758T;

    /* renamed from: U, reason: collision with root package name */
    public int f53759U;

    /* renamed from: V, reason: collision with root package name */
    public int f53760V;

    /* renamed from: W, reason: collision with root package name */
    public p f53761W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f53762a0;

    /* renamed from: b, reason: collision with root package name */
    public final w f53763b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f53764b0;

    /* renamed from: c, reason: collision with root package name */
    public final u f53765c;

    /* renamed from: c0, reason: collision with root package name */
    public final float f53766c0;

    /* renamed from: d, reason: collision with root package name */
    public SavedState f53767d;

    /* renamed from: d0, reason: collision with root package name */
    public final float f53768d0;

    /* renamed from: e, reason: collision with root package name */
    public final C23410a f53769e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f53770e0;

    /* renamed from: f, reason: collision with root package name */
    public final C23416g f53771f;

    /* renamed from: f0, reason: collision with root package name */
    public final B f53772f0;

    /* renamed from: g, reason: collision with root package name */
    public final Y f53773g;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.recyclerview.widget.r f53774g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f53775h;

    /* renamed from: h0, reason: collision with root package name */
    public final r.b f53776h0;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f53777i;

    /* renamed from: i0, reason: collision with root package name */
    public final z f53778i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f53779j;

    /* renamed from: j0, reason: collision with root package name */
    public r f53780j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f53781k;

    /* renamed from: k0, reason: collision with root package name */
    public ArrayList f53782k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f53783l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f53784l0;

    /* renamed from: m, reason: collision with root package name */
    public Adapter f53785m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f53786m0;

    /* renamed from: n, reason: collision with root package name */
    @k0
    public m f53787n;

    /* renamed from: n0, reason: collision with root package name */
    public final k f53788n0;

    /* renamed from: o, reason: collision with root package name */
    public v f53789o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f53790o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f53791p;

    /* renamed from: p0, reason: collision with root package name */
    public M f53792p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList<l> f53793q;

    /* renamed from: q0, reason: collision with root package name */
    public h f53794q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<q> f53795r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f53796r0;

    /* renamed from: s, reason: collision with root package name */
    public q f53797s;

    /* renamed from: s0, reason: collision with root package name */
    public androidx.core.view.H f53798s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f53799t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f53800t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f53801u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f53802u0;

    /* renamed from: v, reason: collision with root package name */
    @k0
    public boolean f53803v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f53804v0;

    /* renamed from: w, reason: collision with root package name */
    public int f53805w;

    /* renamed from: w0, reason: collision with root package name */
    @k0
    public final ArrayList f53806w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f53807x;

    /* renamed from: x0, reason: collision with root package name */
    public final Runnable f53808x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f53809y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f53810y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f53811z;

    /* renamed from: z0, reason: collision with root package name */
    public int f53812z0;

    public static abstract class A {
        @j.P
        public abstract View a();
    }

    public class B implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public int f53815b;

        /* renamed from: c, reason: collision with root package name */
        public int f53816c;

        /* renamed from: d, reason: collision with root package name */
        public OverScroller f53817d;

        /* renamed from: e, reason: collision with root package name */
        public Interpolator f53818e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f53819f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f53820g;

        public B() {
            Interpolator interpolator = RecyclerView.f53736E0;
            this.f53818e = interpolator;
            this.f53819f = false;
            this.f53820g = false;
            this.f53817d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a() {
            if (this.f53819f) {
                this.f53820g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            recyclerView.postOnAnimation(this);
        }

        public final void b(int i12, int i13, int i14, @j.P Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i14 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i12);
                int iAbs2 = Math.abs(i13);
                boolean z12 = iAbs > iAbs2;
                int width = z12 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z12) {
                    iAbs = iAbs2;
                }
                i14 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i15 = i14;
            if (interpolator == null) {
                interpolator = RecyclerView.f53736E0;
            }
            if (this.f53818e != interpolator) {
                this.f53818e = interpolator;
                this.f53817d = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f53816c = 0;
            this.f53815b = 0;
            recyclerView.setScrollState(2);
            this.f53817d.startScroll(0, 0, i12, i13, i15);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i12;
            int i13;
            int i14;
            int i15;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f53787n == null) {
                recyclerView.removeCallbacks(this);
                this.f53817d.abortAnimation();
                return;
            }
            this.f53820g = false;
            this.f53819f = true;
            recyclerView.u();
            OverScroller overScroller = this.f53817d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i16 = currX - this.f53815b;
                int i17 = currY - this.f53816c;
                this.f53815b = currX;
                this.f53816c = currY;
                int[] iArr = recyclerView.f53804v0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zA2 = recyclerView.A(i16, i17, 1, iArr, null);
                int[] iArr2 = recyclerView.f53804v0;
                if (zA2) {
                    i16 -= iArr2[0];
                    i17 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.t(i16, i17);
                }
                if (recyclerView.f53785m != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.z0(i16, i17, iArr2);
                    int i18 = iArr2[0];
                    int i19 = iArr2[1];
                    int i22 = i16 - i18;
                    int i23 = i17 - i19;
                    y yVar = recyclerView.f53787n.f53840f;
                    if (yVar != null && !yVar.f53881d && yVar.f53882e) {
                        int iB2 = recyclerView.f53778i0.b();
                        if (iB2 == 0) {
                            yVar.f();
                        } else if (yVar.f53878a >= iB2) {
                            yVar.f53878a = iB2 - 1;
                            yVar.b(i18, i19);
                        } else {
                            yVar.b(i18, i19);
                        }
                    }
                    i15 = i18;
                    i12 = i22;
                    i13 = i23;
                    i14 = i19;
                } else {
                    i12 = i16;
                    i13 = i17;
                    i14 = 0;
                    i15 = 0;
                }
                if (!recyclerView.f53793q.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f53804v0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i24 = i14;
                recyclerView.B(i15, i14, i12, i13, null, 1, iArr3);
                int i25 = i12 - iArr2[0];
                int i26 = i13 - iArr2[1];
                if (i15 != 0 || i24 != 0) {
                    recyclerView.C(i15, i24);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z12 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i25 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i26 != 0));
                y yVar2 = recyclerView.f53787n.f53840f;
                if ((yVar2 == null || !yVar2.f53881d) && z12) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i27 = i25 < 0 ? -currVelocity : i25 > 0 ? currVelocity : 0;
                        if (i26 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i26 <= 0) {
                            currVelocity = 0;
                        }
                        if (i27 < 0) {
                            recyclerView.E();
                            if (recyclerView.f53748J.isFinished()) {
                                recyclerView.f53748J.onAbsorb(-i27);
                            }
                        } else if (i27 > 0) {
                            recyclerView.F();
                            if (recyclerView.f53750L.isFinished()) {
                                recyclerView.f53750L.onAbsorb(i27);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.G();
                            if (recyclerView.f53749K.isFinished()) {
                                recyclerView.f53749K.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.D();
                            if (recyclerView.f53751M.isFinished()) {
                                recyclerView.f53751M.onAbsorb(currVelocity);
                            }
                        }
                        if (i27 != 0 || currVelocity != 0) {
                            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    r.b bVar = recyclerView.f53776h0;
                    int[] iArr4 = bVar.f54138c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    bVar.f54139d = 0;
                } else {
                    a();
                    androidx.recyclerview.widget.r rVar = recyclerView.f53774g0;
                    if (rVar != null) {
                        rVar.a(recyclerView, i15, i24);
                    }
                }
            }
            y yVar3 = recyclerView.f53787n.f53840f;
            if (yVar3 != null && yVar3.f53881d) {
                yVar3.b(0, 0);
            }
            this.f53819f = false;
            if (!this.f53820g) {
                recyclerView.setScrollState(0);
                recyclerView.I0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class C {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @j.N
        public final View itemView;
        Adapter<? extends C> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        C mShadowedHolder = null;
        C mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        u mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @k0
        int mPendingAccessibilityState = -1;

        public C(@j.N View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i12) {
            this.mFlags = i12 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i12, int i13, boolean z12) {
            addFlags(8);
            offsetPosition(i13, z12);
            this.mPosition = i12;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.S(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @j.P
        public final Adapter<? extends C> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int iS2;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iS2 = this.mOwnerRecyclerView.S(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iS2);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i12 = this.mPreLayoutPosition;
            return i12 == -1 ? this.mPosition : i12;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i12 = this.mPreLayoutPosition;
            return i12 == -1 ? this.mPosition : i12;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i12) {
            return (i12 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i12, boolean z12) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z12) {
                this.mPreLayoutPosition += i12;
            }
            this.mPosition += i12;
            if (this.itemView.getLayoutParams() != null) {
                ((n) this.itemView.getLayoutParams()).f53860d = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i12 = this.mPendingAccessibilityState;
            if (i12 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i12;
            } else {
                View view = this.itemView;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            if (recyclerView.d0()) {
                this.mPendingAccessibilityState = 4;
                recyclerView.f53806w0.add(this);
            } else {
                View view2 = this.itemView;
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                view2.setImportantForAccessibility(4);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i12 = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.d0()) {
                this.mPendingAccessibilityState = i12;
                recyclerView.f53806w0.add(this);
            } else {
                View view = this.itemView;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                view.setImportantForAccessibility(i12);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.q(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i12, int i13) {
            this.mFlags = (i12 & i13) | (this.mFlags & (~i13));
        }

        public final void setIsRecyclable(boolean z12) {
            int i12 = this.mIsRecyclableCount;
            int i13 = z12 ? i12 - 1 : i12 + 1;
            this.mIsRecyclableCount = i13;
            if (i13 < 0) {
                this.mIsRecyclableCount = 0;
                toString();
            } else if (!z12 && i13 == 1) {
                this.mFlags |= 16;
            } else if (z12 && i13 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(u uVar, boolean z12) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z12;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbZ = androidx.appcompat.app.r.z(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbZ.append(Integer.toHexString(hashCode()));
            sbZ.append(" position=");
            sbZ.append(this.mPosition);
            sbZ.append(" id=");
            sbZ.append(this.mItemId);
            sbZ.append(", oldPos=");
            sbZ.append(this.mOldPosition);
            sbZ.append(", pLpos:");
            sbZ.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbZ.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.k(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    @RestrictTo
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f53822d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f53822d = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f53822d, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC23407a implements Runnable {
        public RunnableC23407a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f53803v || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.f53799t) {
                recyclerView.requestLayout();
            } else if (recyclerView.f53809y) {
                recyclerView.f53807x = true;
            } else {
                recyclerView.u();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC23408b implements Runnable {
        public RunnableC23408b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            j jVar = recyclerView.f53752N;
            if (jVar != null) {
                jVar.n();
            }
            recyclerView.f53790o0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public class InterpolatorC23409c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f12) {
            float f13 = f12 - 1.0f;
            return (f13 * f13 * f13 * f13 * f13) + 1.0f;
        }
    }

    public class d implements Y.b {
        public d() {
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53826a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f53826a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53826a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i12, int i13) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i12, i13);
            }
        }

        public final void d(int i12, int i13, @j.P Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i12, i13, obj);
            }
        }

        public final void e(int i12, int i13) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i12, i13);
            }
        }

        public final void f(int i12, int i13) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i12, i13);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    public interface h {
        int e(int i12, int i13);
    }

    public static class i {

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public k f53827a = null;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f53828b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public long f53829c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f53830d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f53831e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f53832f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public interface b {
            void a();
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f53833a;

            /* renamed from: b, reason: collision with root package name */
            public int f53834b;
        }

        public static int e(C c12) {
            int i12 = c12.mFlags;
            int i13 = i12 & 14;
            if (c12.isInvalid()) {
                return 4;
            }
            if ((i12 & 4) != 0) {
                return i13;
            }
            int oldPosition = c12.getOldPosition();
            int absoluteAdapterPosition = c12.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i13 : i13 | 2048;
        }

        public abstract boolean a(@j.N C c12, @j.P d dVar, @j.N d dVar2);

        public abstract boolean b(@j.N C c12, @j.N C c13, @j.N d dVar, @j.N d dVar2);

        public abstract boolean c(@j.N C c12, @j.N d dVar, @j.P d dVar2);

        public abstract boolean d(@j.N C c12, @j.N d dVar, @j.N d dVar2);

        public boolean f(@j.N C c12) {
            return true;
        }

        public boolean g(@j.N C c12, @j.N List<Object> list) {
            return f(c12);
        }

        public final void h(@j.N C c12) {
            k kVar = this.f53827a;
            if (kVar != null) {
                boolean z12 = true;
                c12.setIsRecyclable(true);
                if (c12.mShadowedHolder != null && c12.mShadowingHolder == null) {
                    c12.mShadowedHolder = null;
                }
                c12.mShadowingHolder = null;
                if (c12.shouldBeKeptAsChild()) {
                    return;
                }
                View view = c12.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.G0();
                C23416g c23416g = recyclerView.f53771f;
                K k12 = c23416g.f54010a;
                int iIndexOfChild = k12.f53682a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    c23416g.f(view);
                } else {
                    C23416g.a aVar = c23416g.f54011b;
                    if (aVar.d(iIndexOfChild)) {
                        aVar.f(iIndexOfChild);
                        c23416g.f(view);
                        k12.b(iIndexOfChild);
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    C cX2 = RecyclerView.X(view);
                    u uVar = recyclerView.f53765c;
                    uVar.k(cX2);
                    uVar.h(cX2);
                }
                recyclerView.H0(!z12);
                if (z12 || !c12.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(c12.itemView, false);
            }
        }

        public final void i() {
            ArrayList<b> arrayList = this.f53828b;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.get(i12).a();
            }
            arrayList.clear();
        }

        public abstract void j(@j.N C c12);

        public abstract void k();

        public abstract boolean l();

        public final boolean m(@j.P b bVar) {
            boolean zL2 = l();
            if (bVar != null) {
                if (zL2) {
                    this.f53828b.add(bVar);
                } else {
                    bVar.a();
                }
            }
            return zL2;
        }

        public abstract void n();
    }

    public class k implements j.c {
        public k() {
        }
    }

    public static abstract class l {
        @Deprecated
        public void getItemOffsets(@j.N Rect rect, int i12, @j.N RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@j.N Canvas canvas, @j.N RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@j.N Canvas canvas, @j.N RecyclerView recyclerView) {
        }

        public void getItemOffsets(@j.N Rect rect, @j.N View view, @j.N RecyclerView recyclerView, @j.N z zVar) {
            getItemOffsets(rect, ((n) view.getLayoutParams()).f53858b.getLayoutPosition(), recyclerView);
        }

        public void onDraw(@j.N Canvas canvas, @j.N RecyclerView recyclerView, @j.N z zVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@j.N Canvas canvas, @j.N RecyclerView recyclerView, @j.N z zVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public interface o {
        void d(@j.N View view);

        void j(@j.N View view);
    }

    public static abstract class p {
        public abstract boolean a(int i12, int i13);
    }

    public interface q {
        void a(boolean z12);

        boolean b(@j.N RecyclerView recyclerView, @j.N MotionEvent motionEvent);

        void g2(@j.N MotionEvent motionEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface s {
    }

    public static class t {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f53862a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public int f53863b = 0;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<C> f53864a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public int f53865b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f53866c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f53867d = 0;
        }

        public void a() {
            int i12 = 0;
            while (true) {
                SparseArray<a> sparseArray = this.f53862a;
                if (i12 >= sparseArray.size()) {
                    return;
                }
                sparseArray.valueAt(i12).f53864a.clear();
                i12++;
            }
        }

        @j.P
        public C b(int i12) {
            a aVar = this.f53862a.get(i12);
            if (aVar == null) {
                return null;
            }
            ArrayList<C> arrayList = aVar.f53864a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a c(int i12) {
            SparseArray<a> sparseArray = this.f53862a;
            a aVar = sparseArray.get(i12);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i12, aVar2);
            return aVar2;
        }

        public void d(C c12) {
            int itemViewType = c12.getItemViewType();
            ArrayList<C> arrayList = c(itemViewType).f53864a;
            if (this.f53862a.get(itemViewType).f53865b <= arrayList.size()) {
                return;
            }
            c12.resetInternal();
            arrayList.add(c12);
        }

        public final void e(int i12, int i13) {
            a aVarC = c(i12);
            aVarC.f53865b = i13;
            ArrayList<C> arrayList = aVarC.f53864a;
            while (arrayList.size() > i13) {
                C22026a.e(1, arrayList);
            }
        }
    }

    public final class u {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<C> f53868a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<C> f53869b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<C> f53870c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C> f53871d;

        /* renamed from: e, reason: collision with root package name */
        public int f53872e;

        /* renamed from: f, reason: collision with root package name */
        public int f53873f;

        /* renamed from: g, reason: collision with root package name */
        public t f53874g;

        /* renamed from: h, reason: collision with root package name */
        public A f53875h;

        public u() {
            ArrayList<C> arrayList = new ArrayList<>();
            this.f53868a = arrayList;
            this.f53869b = null;
            this.f53870c = new ArrayList<>();
            this.f53871d = Collections.unmodifiableList(arrayList);
            this.f53872e = 2;
            this.f53873f = 2;
        }

        public final void a(@j.N C c12, boolean z12) {
            RecyclerView.q(c12);
            View view = c12.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            M m12 = recyclerView.f53792p0;
            if (m12 != null) {
                C22808a c22808aJ = m12.j();
                C22823h0.C(view, c22808aJ instanceof M.a ? (C22808a) ((M.a) c22808aJ).f53726e.remove(view) : null);
            }
            if (z12) {
                v vVar = recyclerView.f53789o;
                if (vVar != null) {
                    vVar.a();
                }
                ArrayList arrayList = recyclerView.f53791p;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((v) arrayList.get(i12)).a();
                }
                Adapter adapter = recyclerView.f53785m;
                if (adapter != null) {
                    adapter.onViewRecycled(c12);
                }
                if (recyclerView.f53778i0 != null) {
                    recyclerView.f53773g.d(c12);
                }
            }
            c12.mBindingAdapter = null;
            c12.mOwnerRecyclerView = null;
            c().d(c12);
        }

        public final int b(int i12) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 >= 0 && i12 < recyclerView.f53778i0.b()) {
                return !recyclerView.f53778i0.f53897g ? i12 : recyclerView.f53769e.f(i12, 0);
            }
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "invalid position ", ". State item count is ");
            sbJ.append(recyclerView.f53778i0.b());
            sbJ.append(recyclerView.H());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }

        public final t c() {
            if (this.f53874g == null) {
                this.f53874g = new t();
            }
            return this.f53874g;
        }

        @j.N
        public final View d(int i12) {
            return j(i12, Long.MAX_VALUE).itemView;
        }

        public final void e() {
            ArrayList<C> arrayList = this.f53870c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                f(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.f53734C0;
            r.b bVar = RecyclerView.this.f53776h0;
            int[] iArr2 = bVar.f54138c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f54139d = 0;
        }

        public final void f(int i12) {
            ArrayList<C> arrayList = this.f53870c;
            a(arrayList.get(i12), true);
            arrayList.remove(i12);
        }

        public final void g(@j.N View view) {
            C cX2 = RecyclerView.X(view);
            boolean zIsTmpDetached = cX2.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (cX2.isScrap()) {
                cX2.unScrap();
            } else if (cX2.wasReturnedFromScrap()) {
                cX2.clearReturnedFromScrapFlag();
            }
            h(cX2);
            if (recyclerView.f53752N == null || cX2.isRecyclable()) {
                return;
            }
            recyclerView.f53752N.j(cX2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
        
            r5 = r5 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(androidx.recyclerview.widget.RecyclerView.C r12) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.h(androidx.recyclerview.widget.RecyclerView$C):void");
        }

        public final void i(View view) {
            j jVar;
            C cX2 = RecyclerView.X(view);
            boolean zHasAnyOfTheFlags = cX2.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && cX2.isUpdated() && (jVar = recyclerView.f53752N) != null && !jVar.g(cX2, cX2.getUnmodifiedPayloads())) {
                if (this.f53869b == null) {
                    this.f53869b = new ArrayList<>();
                }
                cX2.setScrapContainer(this, true);
                this.f53869b.add(cX2);
                return;
            }
            if (cX2.isInvalid() && !cX2.isRemoved() && !recyclerView.f53785m.hasStableIds()) {
                throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            cX2.setScrapContainer(this, false);
            this.f53868a.add(cX2);
        }

        /* JADX WARN: Removed duplicated region for block: B:270:0x04b7  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x04de  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
        @j.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.recyclerview.widget.RecyclerView.C j(int r28, long r29) {
            /*
                Method dump skipped, instructions count: 1286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.j(int, long):androidx.recyclerview.widget.RecyclerView$C");
        }

        public final void k(C c12) {
            if (c12.mInChangeScrap) {
                this.f53869b.remove(c12);
            } else {
                this.f53868a.remove(c12);
            }
            c12.mScrapContainer = null;
            c12.mInChangeScrap = false;
            c12.clearReturnedFromScrapFlag();
        }

        public final void l() {
            m mVar = RecyclerView.this.f53787n;
            this.f53873f = this.f53872e + (mVar != null ? mVar.f53846l : 0);
            ArrayList<C> arrayList = this.f53870c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f53873f; size--) {
                f(size);
            }
        }
    }

    public interface v {
        void a();
    }

    public class w extends g {
        public w() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.p(null);
            recyclerView.f53778i0.f53896f = true;
            recyclerView.p0(true);
            if (recyclerView.f53769e.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.p(null);
            C23410a c23410a = recyclerView.f53769e;
            if (i13 < 1) {
                c23410a.getClass();
                return;
            }
            ArrayList<C23410a.b> arrayList = c23410a.f53972b;
            arrayList.add(c23410a.h(obj, 4, i12, i13));
            c23410a.f53976f |= 4;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.p(null);
            C23410a c23410a = recyclerView.f53769e;
            if (i13 < 1) {
                c23410a.getClass();
                return;
            }
            ArrayList<C23410a.b> arrayList = c23410a.f53972b;
            arrayList.add(c23410a.h(null, 1, i12, i13));
            c23410a.f53976f |= 1;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.p(null);
            C23410a c23410a = recyclerView.f53769e;
            c23410a.getClass();
            if (i12 == i13) {
                return;
            }
            ArrayList<C23410a.b> arrayList = c23410a.f53972b;
            arrayList.add(c23410a.h(null, 8, i12, i13));
            c23410a.f53976f |= 8;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.p(null);
            C23410a c23410a = recyclerView.f53769e;
            if (i13 < 1) {
                c23410a.getClass();
                return;
            }
            ArrayList<C23410a.b> arrayList = c23410a.f53972b;
            arrayList.add(c23410a.h(null, 2, i12, i13));
            c23410a.f53976f |= 2;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f53767d == null || (adapter = recyclerView.f53785m) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }

        public final void h() {
            int[] iArr = RecyclerView.f53734C0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f53801u || !recyclerView.f53799t) {
                recyclerView.f53739B = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.f53777i;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                recyclerView.postOnAnimation(runnable);
            }
        }
    }

    public static abstract class y {

        /* renamed from: a, reason: collision with root package name */
        public int f53878a = -1;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f53879b;

        /* renamed from: c, reason: collision with root package name */
        public m f53880c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53881d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f53882e;

        /* renamed from: f, reason: collision with root package name */
        public View f53883f;

        /* renamed from: g, reason: collision with root package name */
        public final a f53884g;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f53885a;

            /* renamed from: b, reason: collision with root package name */
            public int f53886b;

            /* renamed from: c, reason: collision with root package name */
            public int f53887c;

            /* renamed from: d, reason: collision with root package name */
            public int f53888d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f53889e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f53890f;

            public final void a(RecyclerView recyclerView) {
                int i12 = this.f53888d;
                if (i12 >= 0) {
                    this.f53888d = -1;
                    recyclerView.e0(i12);
                    this.f53890f = false;
                } else if (this.f53890f) {
                    Interpolator interpolator = this.f53889e;
                    if (interpolator != null && this.f53887c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i13 = this.f53887c;
                    if (i13 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    recyclerView.f53772f0.b(this.f53885a, this.f53886b, i13, interpolator);
                    this.f53890f = false;
                }
            }

            public final void b(@j.U int i12, @j.U int i13, int i14, @j.P Interpolator interpolator) {
                this.f53885a = i12;
                this.f53886b = i13;
                this.f53887c = i14;
                this.f53889e = interpolator;
                this.f53890f = true;
            }
        }

        public interface b {
            @j.P
            PointF o(int i12);
        }

        public y() {
            a aVar = new a();
            aVar.f53888d = -1;
            aVar.f53890f = false;
            aVar.f53885a = 0;
            aVar.f53886b = 0;
            aVar.f53887c = BeduinInputModel.MIN_TEXT_VERSION;
            aVar.f53889e = null;
            this.f53884g = aVar;
        }

        @j.P
        public PointF a(int i12) {
            Object obj = this.f53880c;
            if (obj instanceof b) {
                return ((b) obj).o(i12);
            }
            return null;
        }

        public final void b(int i12, int i13) {
            PointF pointFA;
            RecyclerView recyclerView = this.f53879b;
            if (this.f53878a == -1 || recyclerView == null) {
                f();
            }
            if (this.f53881d && this.f53883f == null && this.f53880c != null && (pointFA = a(this.f53878a)) != null) {
                float f12 = pointFA.x;
                if (f12 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.z0((int) Math.signum(f12), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f53881d = false;
            View view = this.f53883f;
            a aVar = this.f53884g;
            if (view != null) {
                this.f53879b.getClass();
                if (RecyclerView.V(view) == this.f53878a) {
                    View view2 = this.f53883f;
                    z zVar = recyclerView.f53778i0;
                    e(view2, aVar);
                    aVar.a(recyclerView);
                    f();
                } else {
                    this.f53883f = null;
                }
            }
            if (this.f53882e) {
                c(i12, i13, recyclerView.f53778i0, aVar);
                boolean z12 = aVar.f53888d >= 0;
                aVar.a(recyclerView);
                if (z12 && this.f53882e) {
                    this.f53881d = true;
                    recyclerView.f53772f0.a();
                }
            }
        }

        public abstract void c(@j.U int i12, @j.U int i13, @j.N z zVar, @j.N a aVar);

        public abstract void d();

        public abstract void e(@j.N View view, @j.N a aVar);

        public final void f() {
            if (this.f53882e) {
                this.f53882e = false;
                d();
                this.f53879b.f53778i0.f53891a = -1;
                this.f53883f = null;
                this.f53878a = -1;
                this.f53881d = false;
                m mVar = this.f53880c;
                if (mVar.f53840f == this) {
                    mVar.f53840f = null;
                }
                this.f53880c = null;
                this.f53879b = null;
            }
        }
    }

    public static class z {

        /* renamed from: a, reason: collision with root package name */
        public int f53891a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f53892b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f53893c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f53894d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f53895e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f53896f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f53897g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f53898h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f53899i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f53900j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f53901k = false;

        /* renamed from: l, reason: collision with root package name */
        public int f53902l;

        /* renamed from: m, reason: collision with root package name */
        public long f53903m;

        /* renamed from: n, reason: collision with root package name */
        public int f53904n;

        public final void a(int i12) {
            if ((this.f53894d & i12) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i12) + " but it is " + Integer.toBinaryString(this.f53894d));
        }

        public final int b() {
            return this.f53897g ? this.f53892b - this.f53893c : this.f53895e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f53891a);
            sb2.append(", mData=null, mItemCount=");
            sb2.append(this.f53895e);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.f53899i);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f53892b);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f53893c);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f53896f);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f53897g);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.f53900j);
            sb2.append(", mRunPredictiveAnimations=");
            return androidx.appcompat.app.r.x(sb2, this.f53901k, '}');
        }
    }

    static {
        Class cls = Integer.TYPE;
        f53735D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f53736E0 = new InterpolatorC23409c();
    }

    public RecyclerView(@j.N Context context, @j.P AttributeSet attributeSet) {
        this(context, attributeSet, com.avito.android.R.attr.recyclerViewStyle);
    }

    @j.P
    public static RecyclerView O(@j.N View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            RecyclerView recyclerViewO = O(viewGroup.getChildAt(i12));
            if (recyclerViewO != null) {
                return recyclerViewO;
            }
        }
        return null;
    }

    public static int U(@j.N View view) {
        C cX2 = X(view);
        if (cX2 != null) {
            return cX2.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static int V(@j.N View view) {
        C cX2 = X(view);
        if (cX2 != null) {
            return cX2.getLayoutPosition();
        }
        return -1;
    }

    public static C X(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f53858b;
    }

    public static void Y(View view, Rect rect) {
        n nVar = (n) view.getLayoutParams();
        Rect rect2 = nVar.f53859c;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
    }

    private androidx.core.view.H getScrollingChildHelper() {
        if (this.f53798s0 == null) {
            this.f53798s0 = new androidx.core.view.H(this);
        }
        return this.f53798s0;
    }

    public static void q(@j.N C c12) {
        WeakReference<RecyclerView> weakReference = c12.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c12.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            c12.mNestedRecyclerView = null;
        }
    }

    public final boolean A(int i12, int i13, int i14, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i12, i13, i14, iArr, iArr2);
    }

    public final void A0(int i12) {
        if (this.f53809y) {
            return;
        }
        J0();
        m mVar = this.f53787n;
        if (mVar == null) {
            return;
        }
        mVar.l1(i12);
        awakenScrollBars();
    }

    public final void B(int i12, int i13, int i14, int i15, int[] iArr, int i16, @j.N int[] iArr2) {
        getScrollingChildHelper().d(i12, i13, i14, i15, iArr, i16, iArr2);
    }

    public final void B0(@j.P Adapter adapter, boolean z12, boolean z13) {
        Adapter adapter2 = this.f53785m;
        w wVar = this.f53763b;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(wVar);
            this.f53785m.onDetachedFromRecyclerView(this);
        }
        u uVar = this.f53765c;
        if (!z12 || z13) {
            j jVar = this.f53752N;
            if (jVar != null) {
                jVar.k();
            }
            m mVar = this.f53787n;
            if (mVar != null) {
                mVar.c1(uVar);
                this.f53787n.d1(uVar);
            }
            uVar.f53868a.clear();
            uVar.e();
        }
        C23410a c23410a = this.f53769e;
        c23410a.k(c23410a.f53972b);
        c23410a.k(c23410a.f53973c);
        c23410a.f53976f = 0;
        Adapter adapter3 = this.f53785m;
        this.f53785m = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(wVar);
            adapter.onAttachedToRecyclerView(this);
        }
        m mVar2 = this.f53787n;
        if (mVar2 != null) {
            mVar2.G0();
        }
        Adapter adapter4 = this.f53785m;
        uVar.f53868a.clear();
        uVar.e();
        t tVarC = uVar.c();
        if (adapter3 != null) {
            tVarC.f53863b--;
        }
        if (!z12 && tVarC.f53863b == 0) {
            tVarC.a();
        }
        if (adapter4 != null) {
            tVarC.f53863b++;
        } else {
            tVarC.getClass();
        }
        this.f53778i0.f53896f = true;
    }

    public final void C(int i12, int i13) {
        this.f53746H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i12, scrollY - i13);
        m0(i12);
        r rVar = this.f53780j0;
        if (rVar != null) {
            rVar.k(this, i12, i13);
        }
        ArrayList arrayList = this.f53782k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) this.f53782k0.get(size)).k(this, i12, i13);
            }
        }
        this.f53746H--;
    }

    public void C0(@j.U int i12, @j.U int i13) {
        D0(i12, i13, null);
    }

    public final void D() {
        if (this.f53751M != null) {
            return;
        }
        this.f53747I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f53751M = edgeEffect;
        if (this.f53775h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void D0(@j.U int i12, @j.U int i13, @j.P AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        E0(i12, i13, accelerateDecelerateInterpolator, BeduinInputModel.MIN_TEXT_VERSION, false);
    }

    public final void E() {
        if (this.f53748J != null) {
            return;
        }
        this.f53747I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f53748J = edgeEffect;
        if (this.f53775h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void E0(@j.U int i12, @j.U int i13, @j.P AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i14, boolean z12) {
        m mVar = this.f53787n;
        if (mVar == null || this.f53809y) {
            return;
        }
        if (!mVar.I()) {
            i12 = 0;
        }
        if (!this.f53787n.J()) {
            i13 = 0;
        }
        if (i12 == 0 && i13 == 0) {
            return;
        }
        if (i14 != Integer.MIN_VALUE && i14 <= 0) {
            scrollBy(i12, i13);
            return;
        }
        if (z12) {
            int i15 = i12 != 0 ? 1 : 0;
            if (i13 != 0) {
                i15 |= 2;
            }
            getScrollingChildHelper().h(i15, 1);
        }
        this.f53772f0.b(i12, i13, i14, accelerateDecelerateInterpolator);
    }

    public final void F() {
        if (this.f53750L != null) {
            return;
        }
        this.f53747I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f53750L = edgeEffect;
        if (this.f53775h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void F0(int i12) {
        m mVar;
        if (this.f53809y || (mVar = this.f53787n) == null) {
            return;
        }
        mVar.w1(i12, this);
    }

    public final void G() {
        if (this.f53749K != null) {
            return;
        }
        this.f53747I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f53749K = edgeEffect;
        if (this.f53775h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void G0() {
        int i12 = this.f53805w + 1;
        this.f53805w = i12;
        if (i12 != 1 || this.f53809y) {
            return;
        }
        this.f53807x = false;
    }

    public final String H() {
        return " " + super.toString() + ", adapter:" + this.f53785m + ", layout:" + this.f53787n + ", context:" + getContext();
    }

    public final void H0(boolean z12) {
        if (this.f53805w < 1) {
            this.f53805w = 1;
        }
        if (!z12 && !this.f53809y) {
            this.f53807x = false;
        }
        if (this.f53805w == 1) {
            if (z12 && this.f53807x && !this.f53809y && this.f53787n != null && this.f53785m != null) {
                x();
            }
            if (!this.f53809y) {
                this.f53807x = false;
            }
        }
        this.f53805w--;
    }

    public final void I(z zVar) {
        if (getScrollState() != 2) {
            zVar.getClass();
            return;
        }
        OverScroller overScroller = this.f53772f0.f53817d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        zVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final void I0(int i12) {
        getScrollingChildHelper().i(i12);
    }

    @j.P
    public final View J(float f12, float f13) {
        for (int iC2 = this.f53771f.c() - 1; iC2 >= 0; iC2--) {
            View viewB = this.f53771f.b(iC2);
            float translationX = viewB.getTranslationX();
            float translationY = viewB.getTranslationY();
            if (f12 >= viewB.getLeft() + translationX && f12 <= viewB.getRight() + translationX && f13 >= viewB.getTop() + translationY && f13 <= viewB.getBottom() + translationY) {
                return viewB;
            }
        }
        return null;
    }

    public final void J0() {
        y yVar;
        setScrollState(0);
        B b12 = this.f53772f0;
        RecyclerView.this.removeCallbacks(b12);
        b12.f53817d.abortAnimation();
        m mVar = this.f53787n;
        if (mVar == null || (yVar = mVar.f53840f) == null) {
            return;
        }
        yVar.f();
    }

    @j.P
    public final View K(@j.N View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final void K0(@j.P Adapter adapter, boolean z12) {
        setLayoutFrozen(false);
        B0(adapter, true, z12);
        p0(true);
        requestLayout();
    }

    @j.P
    public final C L(@j.N View view) {
        View viewK = K(view);
        if (viewK == null) {
            return null;
        }
        return W(viewK);
    }

    public final boolean M(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<q> arrayList = this.f53795r;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = arrayList.get(i12);
            if (qVar.b(this, motionEvent) && action != 3) {
                this.f53797s = qVar;
                return true;
            }
        }
        return false;
    }

    public final void N(int[] iArr) {
        int iC2 = this.f53771f.c();
        if (iC2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i12 = Integer.MAX_VALUE;
        int i13 = BeduinInputModel.MIN_TEXT_VERSION;
        for (int i14 = 0; i14 < iC2; i14++) {
            C cX2 = X(this.f53771f.b(i14));
            if (!cX2.shouldIgnore()) {
                int layoutPosition = cX2.getLayoutPosition();
                if (layoutPosition < i12) {
                    i12 = layoutPosition;
                }
                if (layoutPosition > i13) {
                    i13 = layoutPosition;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
    }

    @j.P
    public final C P(int i12) {
        C c12 = null;
        if (this.f53743E) {
            return null;
        }
        int childCount = this.f53771f.f54010a.f53682a.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            C cX2 = X(this.f53771f.f54010a.f53682a.getChildAt(i13));
            if (cX2 != null && !cX2.isRemoved() && S(cX2) == i12) {
                C23416g c23416g = this.f53771f;
                if (!c23416g.f54012c.contains(cX2.itemView)) {
                    return cX2;
                }
                c12 = cX2;
            }
        }
        return c12;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.C Q(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.f53771f
            androidx.recyclerview.widget.K r0 = r0.f54010a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f53682a
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = 0
        Lc:
            if (r2 >= r0) goto L44
            androidx.recyclerview.widget.g r3 = r5.f53771f
            androidx.recyclerview.widget.K r3 = r3.f54010a
            androidx.recyclerview.widget.RecyclerView r3 = r3.f53682a
            android.view.View r3 = r3.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$C r3 = X(r3)
            if (r3 == 0) goto L41
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L41
            if (r7 == 0) goto L2b
            int r4 = r3.mPosition
            if (r4 == r6) goto L32
            goto L41
        L2b:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L32
            goto L41
        L32:
            androidx.recyclerview.widget.g r1 = r5.f53771f
            android.view.View r4 = r3.itemView
            java.util.ArrayList r1 = r1.f54012c
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L40
            r1 = r3
            goto L41
        L40:
            return r3
        L41:
            int r2 = r2 + 1
            goto Lc
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q(int, boolean):androidx.recyclerview.widget.RecyclerView$C");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public boolean R(int i12, int i13) {
        m mVar = this.f53787n;
        if (mVar == null || this.f53809y) {
            return false;
        }
        int I12 = mVar.I();
        boolean zJ2 = this.f53787n.J();
        int i14 = this.f53762a0;
        int i15 = (I12 == 0 || Math.abs(i12) < i14) ? 0 : i12;
        int i16 = (!zJ2 || Math.abs(i13) < i14) ? 0 : i13;
        if (i15 == 0 && i16 == 0) {
            return false;
        }
        float f12 = i15;
        float f13 = i16;
        if (!dispatchNestedPreFling(f12, f13)) {
            boolean z12 = I12 != 0 || zJ2;
            dispatchNestedFling(f12, f13, z12);
            p pVar = this.f53761W;
            if (pVar != null && pVar.a(i15, i16)) {
                return true;
            }
            if (z12) {
                if (zJ2) {
                    I12 = (I12 == true ? 1 : 0) | 2;
                }
                getScrollingChildHelper().h(I12, 1);
                int i17 = this.f53764b0;
                int i18 = -i17;
                int iMax = Math.max(i18, Math.min(i15, i17));
                int iMax2 = Math.max(i18, Math.min(i16, i17));
                B b12 = this.f53772f0;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.setScrollState(2);
                b12.f53816c = 0;
                b12.f53815b = 0;
                Interpolator interpolator = b12.f53818e;
                Interpolator interpolator2 = f53736E0;
                if (interpolator != interpolator2) {
                    b12.f53818e = interpolator2;
                    b12.f53817d = new OverScroller(recyclerView.getContext(), interpolator2);
                }
                b12.f53817d.fling(0, 0, iMax, iMax2, BeduinInputModel.MIN_TEXT_VERSION, Integer.MAX_VALUE, BeduinInputModel.MIN_TEXT_VERSION, Integer.MAX_VALUE);
                b12.a();
                return true;
            }
        }
        return false;
    }

    public final int S(C c12) {
        if (c12.hasAnyOfTheFlags(524) || !c12.isBound()) {
            return -1;
        }
        C23410a c23410a = this.f53769e;
        int i12 = c12.mPosition;
        ArrayList<C23410a.b> arrayList = c23410a.f53972b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C23410a.b bVar = arrayList.get(i13);
            int i14 = bVar.f53977a;
            if (i14 != 1) {
                if (i14 == 2) {
                    int i15 = bVar.f53978b;
                    if (i15 <= i12) {
                        int i16 = bVar.f53980d;
                        if (i15 + i16 > i12) {
                            return -1;
                        }
                        i12 -= i16;
                    } else {
                        continue;
                    }
                } else if (i14 == 8) {
                    int i17 = bVar.f53978b;
                    if (i17 == i12) {
                        i12 = bVar.f53980d;
                    } else {
                        if (i17 < i12) {
                            i12--;
                        }
                        if (bVar.f53980d <= i12) {
                            i12++;
                        }
                    }
                }
            } else if (bVar.f53978b <= i12) {
                i12 += bVar.f53980d;
            }
        }
        return i12;
    }

    public final long T(C c12) {
        return this.f53785m.hasStableIds() ? c12.getItemId() : c12.mPosition;
    }

    public final C W(@j.N View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return X(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect Z(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z12 = nVar.f53860d;
        Rect rect = nVar.f53859c;
        if (!z12) {
            return rect;
        }
        z zVar = this.f53778i0;
        if (zVar.f53897g && (nVar.f53858b.isUpdated() || nVar.f53858b.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<l> arrayList = this.f53793q;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Rect rect2 = this.f53779j;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i12).getItemOffsets(rect2, view, this, zVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f53860d = false;
        return rect;
    }

    @j.N
    public final l a0(int i12) {
        int itemDecorationCount = getItemDecorationCount();
        if (i12 >= 0 && i12 < itemDecorationCount) {
            return this.f53793q.get(i12);
        }
        throw new IndexOutOfBoundsException(i12 + " is an invalid index for size " + itemDecorationCount);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i12, int i13) {
        m mVar = this.f53787n;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i12, i13);
    }

    public final boolean b0() {
        return !this.f53803v || this.f53743E || this.f53769e.g();
    }

    public final void c0() {
        if (this.f53793q.size() == 0) {
            return;
        }
        m mVar = this.f53787n;
        if (mVar != null) {
            mVar.F("Cannot invalidate item decorations during a scroll or layout");
        }
        f0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.f53787n.K((n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.f53787n;
        if (mVar != null && mVar.I()) {
            return this.f53787n.O(this.f53778i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.f53787n;
        if (mVar != null && mVar.I()) {
            return this.f53787n.P(this.f53778i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.f53787n;
        if (mVar != null && mVar.I()) {
            return this.f53787n.Q(this.f53778i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.f53787n;
        if (mVar != null && mVar.J()) {
            return this.f53787n.R(this.f53778i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.f53787n;
        if (mVar != null && mVar.J()) {
            return this.f53787n.S(this.f53778i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.f53787n;
        if (mVar != null && mVar.J()) {
            return this.f53787n.T(this.f53778i0);
        }
        return 0;
    }

    public final boolean d0() {
        return this.f53745G > 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f12, float f13, boolean z12) {
        return getScrollingChildHelper().a(f12, f13, z12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f12, float f13) {
        return getScrollingChildHelper().b(f12, f13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i12, int i13, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i12, i13, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i12, int i13, int i14, int i15, int[] iArr) {
        return getScrollingChildHelper().d(i12, i13, i14, i15, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z12;
        super.draw(canvas);
        ArrayList<l> arrayList = this.f53793q;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).onDrawOver(canvas, this, this.f53778i0);
        }
        EdgeEffect edgeEffect = this.f53748J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z12 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f53775h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f53748J;
            z12 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f53749K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f53775h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f53749K;
            z12 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f53750L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f53775h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f53750L;
            z12 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f53751M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f53775h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f53751M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z12 |= z13;
            canvas.restoreToCount(iSave4);
        }
        if ((z12 || this.f53752N == null || arrayList.size() <= 0 || !this.f53752N.l()) ? z12 : true) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j12) {
        return super.drawChild(canvas, view, j12);
    }

    public final void e0(int i12) {
        if (this.f53787n == null) {
            return;
        }
        setScrollState(2);
        this.f53787n.l1(i12);
        awakenScrollBars();
    }

    public final void f0() {
        int childCount = this.f53771f.f54010a.f53682a.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((n) this.f53771f.f54010a.f53682a.getChildAt(i12).getLayoutParams()).f53860d = true;
        }
        ArrayList<C> arrayList = this.f53765c.f53870c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n nVar = (n) arrayList.get(i13).itemView.getLayoutParams();
            if (nVar != null) {
                nVar.f53860d = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i12, int i13, boolean z12) {
        int i14 = i12 + i13;
        int childCount = this.f53771f.f54010a.f53682a.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            C cX2 = X(this.f53771f.f54010a.f53682a.getChildAt(i15));
            if (cX2 != null && !cX2.shouldIgnore()) {
                int i16 = cX2.mPosition;
                z zVar = this.f53778i0;
                if (i16 >= i14) {
                    cX2.offsetPosition(-i13, z12);
                    zVar.f53896f = true;
                } else if (i16 >= i12) {
                    cX2.flagRemovedAndOffsetPosition(i12 - 1, -i13, z12);
                    zVar.f53896f = true;
                }
            }
        }
        u uVar = this.f53765c;
        ArrayList<C> arrayList = uVar.f53870c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c12 = arrayList.get(size);
            if (c12 != null) {
                int i17 = c12.mPosition;
                if (i17 >= i14) {
                    c12.offsetPosition(-i13, z12);
                } else if (i17 >= i12) {
                    c12.addFlags(8);
                    uVar.f(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.f53787n;
        if (mVar != null) {
            return mVar.a0();
        }
        throw new IllegalStateException(androidx.media3.exoplayer.analytics.m.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.f53787n;
        if (mVar != null) {
            return mVar.b0(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.media3.exoplayer.analytics.m.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @j.P
    public Adapter getAdapter() {
        return this.f53785m;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.f53787n;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i12, int i13) {
        h hVar = this.f53794q0;
        return hVar == null ? super.getChildDrawingOrder(i12, i13) : hVar.e(i12, i13);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f53775h;
    }

    @j.P
    public M getCompatAccessibilityDelegate() {
        return this.f53792p0;
    }

    @j.N
    public i getEdgeEffectFactory() {
        return this.f53747I;
    }

    @j.P
    public j getItemAnimator() {
        return this.f53752N;
    }

    public int getItemDecorationCount() {
        return this.f53793q.size();
    }

    @j.P
    public m getLayoutManager() {
        return this.f53787n;
    }

    public int getMaxFlingVelocity() {
        return this.f53764b0;
    }

    public int getMinFlingVelocity() {
        return this.f53762a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    @j.P
    public p getOnFlingListener() {
        return this.f53761W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f53770e0;
    }

    @j.N
    public t getRecycledViewPool() {
        return this.f53765c.c();
    }

    public int getScrollState() {
        return this.f53753O;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i0() {
        this.f53745G++;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f53799t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f53809y;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f44937d;
    }

    public final void j0(boolean z12) {
        int i12;
        AccessibilityManager accessibilityManager;
        int i13 = this.f53745G - 1;
        this.f53745G = i13;
        if (i13 < 1) {
            this.f53745G = 0;
            if (z12) {
                int i14 = this.f53737A;
                this.f53737A = 0;
                if (i14 != 0 && (accessibilityManager = this.f53741C) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i14);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f53806w0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C c12 = (C) arrayList.get(size);
                    if (c12.itemView.getParent() == this && !c12.shouldIgnore() && (i12 = c12.mPendingAccessibilityState) != -1) {
                        View view = c12.itemView;
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        view.setImportantForAccessibility(i12);
                        c12.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void k(C c12) {
        View view = c12.itemView;
        boolean z12 = view.getParent() == this;
        this.f53765c.k(W(view));
        if (c12.isTmpDetached()) {
            this.f53771f.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (z12) {
            C23416g c23416g = this.f53771f;
            int iIndexOfChild = c23416g.f54010a.f53682a.indexOfChild(view);
            if (iIndexOfChild < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            c23416g.f54011b.h(iIndexOfChild);
            c23416g.f54012c.add(view);
            K k12 = c23416g.f54010a;
            C cX2 = X(view);
            if (cX2 != null) {
                cX2.onEnteredHiddenState(k12.f53682a);
                return;
            }
            return;
        }
        C23416g c23416g2 = this.f53771f;
        RecyclerView recyclerView = c23416g2.f54010a.f53682a;
        int childCount = recyclerView.getChildCount();
        c23416g2.f54011b.e(childCount, true);
        c23416g2.f54012c.add(view);
        C cX3 = X(view);
        if (cX3 != null) {
            cX3.onEnteredHiddenState(recyclerView);
        }
        recyclerView.addView(view, childCount);
        C cX4 = X(view);
        recyclerView.h0(view);
        Adapter adapter = recyclerView.f53785m;
        if (adapter != null && cX4 != null) {
            adapter.onViewAttachedToWindow(cX4);
        }
        ArrayList arrayList = recyclerView.f53742D;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o) recyclerView.f53742D.get(size)).j(view);
            }
        }
    }

    public final void k0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f53754P) {
            int i12 = actionIndex == 0 ? 1 : 0;
            this.f53754P = motionEvent.getPointerId(i12);
            int x12 = (int) (motionEvent.getX(i12) + 0.5f);
            this.f53758T = x12;
            this.f53756R = x12;
            int y12 = (int) (motionEvent.getY(i12) + 0.5f);
            this.f53759U = y12;
            this.f53757S = y12;
        }
    }

    public final void l(@j.N l lVar, int i12) {
        m mVar = this.f53787n;
        if (mVar != null) {
            mVar.F("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.f53793q;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i12 < 0) {
            arrayList.add(lVar);
        } else {
            arrayList.add(i12, lVar);
        }
        f0();
        requestLayout();
    }

    public final void m(@j.N o oVar) {
        if (this.f53742D == null) {
            this.f53742D = new ArrayList();
        }
        this.f53742D.add(oVar);
    }

    public final void n(@j.N q qVar) {
        this.f53795r.add(qVar);
    }

    public final void n0() {
        if (this.f53790o0 || !this.f53799t) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        postOnAnimation(this.f53808x0);
        this.f53790o0 = true;
    }

    public final void o(@j.N r rVar) {
        if (this.f53782k0 == null) {
            this.f53782k0 = new ArrayList();
        }
        this.f53782k0.add(rVar);
    }

    public final void o0() {
        boolean z12;
        boolean z13 = false;
        if (this.f53743E) {
            C23410a c23410a = this.f53769e;
            c23410a.k(c23410a.f53972b);
            c23410a.k(c23410a.f53973c);
            c23410a.f53976f = 0;
            if (this.f53744F) {
                this.f53787n.P0();
            }
        }
        if (this.f53752N == null || !this.f53787n.y1()) {
            this.f53769e.c();
        } else {
            this.f53769e.j();
        }
        boolean z14 = this.f53784l0 || this.f53786m0;
        boolean z15 = this.f53803v && this.f53752N != null && ((z12 = this.f53743E) || z14 || this.f53787n.f53841g) && (!z12 || this.f53785m.hasStableIds());
        z zVar = this.f53778i0;
        zVar.f53900j = z15;
        if (z15 && z14 && !this.f53743E && this.f53752N != null && this.f53787n.y1()) {
            z13 = true;
        }
        zVar.f53901k = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f53745G = r0
            r1 = 1
            r5.f53799t = r1
            boolean r2 = r5.f53803v
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f53803v = r2
            androidx.recyclerview.widget.RecyclerView$m r2 = r5.f53787n
            if (r2 == 0) goto L21
            r2.f53842h = r1
            r2.H0(r5)
        L21:
            r5.f53790o0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.r> r0 = androidx.recyclerview.widget.r.f54130f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.r r1 = (androidx.recyclerview.widget.r) r1
            r5.f53774g0 = r1
            if (r1 != 0) goto L5d
            androidx.recyclerview.widget.r r1 = new androidx.recyclerview.widget.r
            r1.<init>()
            r5.f53774g0 = r1
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r1 = androidx.core.view.C22823h0.f45055a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4f
            if (r1 == 0) goto L4f
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4f
            goto L51
        L4f:
            r1 = 1114636288(0x42700000, float:60.0)
        L51:
            androidx.recyclerview.widget.r r2 = r5.f53774g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f54134d = r3
            r0.set(r2)
        L5d:
            androidx.recyclerview.widget.r r0 = r5.f53774g0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f54132b
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f53752N;
        if (jVar != null) {
            jVar.k();
        }
        J0();
        this.f53799t = false;
        m mVar = this.f53787n;
        if (mVar != null) {
            mVar.f53842h = false;
            mVar.I0(this, this.f53765c);
        }
        this.f53806w0.clear();
        removeCallbacks(this.f53808x0);
        this.f53773g.getClass();
        while (Y.a.f53967d.b() != null) {
        }
        androidx.recyclerview.widget.r rVar = this.f53774g0;
        if (rVar != null) {
            rVar.f54132b.remove(this);
            this.f53774g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.f53793q;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).onDraw(canvas, this, this.f53778i0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z12;
        if (this.f53809y) {
            return false;
        }
        this.f53797s = null;
        if (M(motionEvent)) {
            x0();
            setScrollState(0);
            return true;
        }
        m mVar = this.f53787n;
        if (mVar == null) {
            return false;
        }
        boolean zI2 = mVar.I();
        boolean zJ2 = this.f53787n.J();
        if (this.f53755Q == null) {
            this.f53755Q = VelocityTracker.obtain();
        }
        this.f53755Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f53811z) {
                this.f53811z = false;
            }
            this.f53754P = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.f53758T = x12;
            this.f53756R = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.f53759U = y12;
            this.f53757S = y12;
            if (this.f53753O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                I0(1);
            }
            int[] iArr = this.f53802u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = zI2;
            if (zJ2) {
                i12 = (zI2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i12, 0);
        } else if (actionMasked == 1) {
            this.f53755Q.clear();
            I0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f53754P);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x13 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y13 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f53753O != 1) {
                int i13 = x13 - this.f53756R;
                int i14 = y13 - this.f53757S;
                if (zI2 == 0 || Math.abs(i13) <= this.f53760V) {
                    z12 = false;
                } else {
                    this.f53758T = x13;
                    z12 = true;
                }
                if (zJ2 && Math.abs(i14) > this.f53760V) {
                    this.f53759U = y13;
                    z12 = true;
                }
                if (z12) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            x0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f53754P = motionEvent.getPointerId(actionIndex);
            int x14 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f53758T = x14;
            this.f53756R = x14;
            int y14 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f53759U = y14;
            this.f53757S = y14;
        } else if (actionMasked == 6) {
            k0(motionEvent);
        }
        return this.f53753O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = androidx.core.os.K.f44794a;
        Trace.beginSection("RV OnLayout");
        x();
        Trace.endSection();
        this.f53803v = true;
    }

    @Override // android.view.View
    public void onMeasure(int i12, int i13) {
        m mVar = this.f53787n;
        if (mVar == null) {
            v(i12, i13);
            return;
        }
        boolean zX02 = mVar.x0();
        u uVar = this.f53765c;
        boolean z12 = false;
        z zVar = this.f53778i0;
        if (zX02) {
            int mode = View.MeasureSpec.getMode(i12);
            int mode2 = View.MeasureSpec.getMode(i13);
            this.f53787n.W0(uVar, zVar, i12, i13);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z12 = true;
            }
            this.f53810y0 = z12;
            if (z12 || this.f53785m == null) {
                return;
            }
            if (zVar.f53894d == 1) {
                y();
            }
            this.f53787n.p1(i12, i13);
            zVar.f53899i = true;
            z();
            this.f53787n.r1(i12, i13);
            if (this.f53787n.u1()) {
                this.f53787n.p1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                zVar.f53899i = true;
                z();
                this.f53787n.r1(i12, i13);
            }
            this.f53812z0 = getMeasuredWidth();
            this.f53738A0 = getMeasuredHeight();
            return;
        }
        if (this.f53801u) {
            this.f53787n.W0(uVar, zVar, i12, i13);
            return;
        }
        if (this.f53739B) {
            G0();
            i0();
            o0();
            j0(true);
            if (zVar.f53901k) {
                zVar.f53897g = true;
            } else {
                this.f53769e.c();
                zVar.f53897g = false;
            }
            this.f53739B = false;
            H0(false);
        } else if (zVar.f53901k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.f53785m;
        if (adapter != null) {
            zVar.f53895e = adapter.getItemCount();
        } else {
            zVar.f53895e = 0;
        }
        G0();
        this.f53787n.W0(uVar, zVar, i12, i13);
        H0(false);
        zVar.f53897g = false;
    }

    public void onNestedPreScroll(@Y61.k View view, int i12, int i13, @Y61.k int[] iArr, int i14) {
        onNestedPreScroll(view, i12, i13, iArr);
    }

    public void onNestedScroll(@Y61.k View view, int i12, int i13, int i14, int i15, int i16) {
        onNestedScroll(view, i12, i13, i14, i15);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i12, Rect rect) {
        if (d0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i12, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f53767d = savedState;
        super.onRestoreInstanceState(savedState.f45355b);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f53767d;
        if (savedState2 != null) {
            savedState.f53822d = savedState2.f53822d;
        } else {
            m mVar = this.f53787n;
            if (mVar != null) {
                savedState.f53822d = mVar.Y0();
            } else {
                savedState.f53822d = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        if (i12 == i14 && i13 == i15) {
            return;
        }
        this.f53751M = null;
        this.f53749K = null;
        this.f53750L = null;
        this.f53748J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[PHI: r0
  0x00e2: PHI (r0v44 int) = (r0v31 int), (r0v48 int) binds: [B:49:0x00cb, B:53:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(String str) {
        if (d0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.media3.exoplayer.analytics.m.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f53746H > 0) {
            new IllegalStateException(androidx.media3.exoplayer.analytics.m.j(this, new StringBuilder("")));
        }
    }

    public final void p0(boolean z12) {
        this.f53744F = z12 | this.f53744F;
        this.f53743E = true;
        int childCount = this.f53771f.f54010a.f53682a.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            C cX2 = X(this.f53771f.f54010a.f53682a.getChildAt(i12));
            if (cX2 != null && !cX2.shouldIgnore()) {
                cX2.addFlags(6);
            }
        }
        f0();
        u uVar = this.f53765c;
        ArrayList<C> arrayList = uVar.f53870c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C c12 = arrayList.get(i13);
            if (c12 != null) {
                c12.addFlags(6);
                c12.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.f53785m;
        if (adapter == null || !adapter.hasStableIds()) {
            uVar.e();
        }
    }

    public final void q0(C c12, j.d dVar) {
        c12.setFlags(0, 8192);
        boolean z12 = this.f53778i0.f53898h;
        Y y12 = this.f53773g;
        if (z12 && c12.isUpdated() && !c12.isRemoved() && !c12.shouldIgnore()) {
            y12.f53966b.l(T(c12), c12);
        }
        o1<C, Y.a> o1Var = y12.f53965a;
        Y.a aVarA = o1Var.get(c12);
        if (aVarA == null) {
            aVarA = Y.a.a();
            o1Var.put(c12, aVarA);
        }
        aVarA.f53969b = dVar;
        aVarA.f53968a |= 4;
    }

    public final void r() {
        int childCount = this.f53771f.f54010a.f53682a.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            C cX2 = X(this.f53771f.f54010a.f53682a.getChildAt(i12));
            if (!cX2.shouldIgnore()) {
                cX2.clearOldPosition();
            }
        }
        u uVar = this.f53765c;
        ArrayList<C> arrayList = uVar.f53870c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.get(i13).clearOldPosition();
        }
        ArrayList<C> arrayList2 = uVar.f53868a;
        int size2 = arrayList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            arrayList2.get(i14).clearOldPosition();
        }
        ArrayList<C> arrayList3 = uVar.f53869b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                uVar.f53869b.get(i15).clearOldPosition();
            }
        }
    }

    public final void r0(@j.N l lVar) {
        m mVar = this.f53787n;
        if (mVar != null) {
            mVar.F("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.f53793q;
        arrayList.remove(lVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        f0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z12) {
        C cX2 = X(view);
        if (cX2 != null) {
            if (cX2.isTmpDetached()) {
                cX2.clearTmpDetachFlag();
            } else if (!cX2.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(cX2);
                throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(this, sb2));
            }
        }
        view.clearAnimation();
        w(view);
        super.removeDetachedView(view, z12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f53787n.z0() && !d0() && view2 != null) {
            w0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z12) {
        return this.f53787n.h1(this, view, rect, z12, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z12) {
        ArrayList<q> arrayList = this.f53795r;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).a(z12);
        }
        super.requestDisallowInterceptTouchEvent(z12);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f53805w != 0 || this.f53809y) {
            this.f53807x = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        ArrayList arrayList = this.f53782k0;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void s0(int i12) {
        int itemDecorationCount = getItemDecorationCount();
        if (i12 >= 0 && i12 < itemDecorationCount) {
            r0(a0(i12));
            return;
        }
        throw new IndexOutOfBoundsException(i12 + " is an invalid index for size " + itemDecorationCount);
    }

    @Override // android.view.View
    public final void scrollBy(int i12, int i13) {
        m mVar = this.f53787n;
        if (mVar == null || this.f53809y) {
            return;
        }
        boolean zI2 = mVar.I();
        boolean zJ2 = this.f53787n.J();
        if (zI2 || zJ2) {
            if (!zI2) {
                i12 = 0;
            }
            if (!zJ2) {
                i13 = 0;
            }
            y0(i12, i13, null, 0);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!d0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f53737A |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(@j.P M m12) {
        this.f53792p0 = m12;
        C22823h0.C(this, m12);
    }

    public void setAdapter(@j.P Adapter adapter) {
        setLayoutFrozen(false);
        B0(adapter, false, true);
        p0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@j.P h hVar) {
        if (hVar == this.f53794q0) {
            return;
        }
        this.f53794q0 = hVar;
        setChildrenDrawingOrderEnabled(hVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z12) {
        if (z12 != this.f53775h) {
            this.f53751M = null;
            this.f53749K = null;
            this.f53750L = null;
            this.f53748J = null;
        }
        this.f53775h = z12;
        super.setClipToPadding(z12);
        if (this.f53803v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@j.N i iVar) {
        iVar.getClass();
        this.f53747I = iVar;
        this.f53751M = null;
        this.f53749K = null;
        this.f53750L = null;
        this.f53748J = null;
    }

    public void setHasFixedSize(boolean z12) {
        this.f53801u = z12;
    }

    public void setItemAnimator(@j.P j jVar) {
        j jVar2 = this.f53752N;
        if (jVar2 != null) {
            jVar2.k();
            this.f53752N.f53827a = null;
        }
        this.f53752N = jVar;
        if (jVar != null) {
            jVar.f53827a = this.f53788n0;
        }
    }

    public void setItemViewCacheSize(int i12) {
        u uVar = this.f53765c;
        uVar.f53872e = i12;
        uVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z12) {
        suppressLayout(z12);
    }

    public void setLayoutManager(@j.P m mVar) {
        K k12;
        if (mVar == this.f53787n) {
            return;
        }
        J0();
        m mVar2 = this.f53787n;
        u uVar = this.f53765c;
        if (mVar2 != null) {
            j jVar = this.f53752N;
            if (jVar != null) {
                jVar.k();
            }
            this.f53787n.c1(uVar);
            this.f53787n.d1(uVar);
            uVar.f53868a.clear();
            uVar.e();
            if (this.f53799t) {
                m mVar3 = this.f53787n;
                mVar3.f53842h = false;
                mVar3.I0(this, uVar);
            }
            this.f53787n.s1(null);
            this.f53787n = null;
        } else {
            uVar.f53868a.clear();
            uVar.e();
        }
        C23416g c23416g = this.f53771f;
        c23416g.f54011b.g();
        ArrayList arrayList = c23416g.f54012c;
        int size = arrayList.size() - 1;
        while (true) {
            k12 = c23416g.f54010a;
            if (size < 0) {
                break;
            }
            k12.a((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = k12.f53682a;
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f53787n = mVar;
        if (mVar != null) {
            if (mVar.f53837c != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(mVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(mVar.f53837c, sb2));
            }
            mVar.s1(this);
            if (this.f53799t) {
                m mVar4 = this.f53787n;
                mVar4.f53842h = true;
                mVar4.H0(this);
            }
        }
        uVar.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z12) {
        getScrollingChildHelper().g(z12);
    }

    public void setOnFlingListener(@j.P p pVar) {
        this.f53761W = pVar;
    }

    @Deprecated
    public void setOnScrollListener(@j.P r rVar) {
        this.f53780j0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z12) {
        this.f53770e0 = z12;
    }

    public void setRecycledViewPool(@j.P t tVar) {
        u uVar = this.f53765c;
        if (uVar.f53874g != null) {
            r1.f53863b--;
        }
        uVar.f53874g = tVar;
        if (tVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        uVar.f53874g.f53863b++;
    }

    @Deprecated
    public void setRecyclerListener(@j.P v vVar) {
        this.f53789o = vVar;
    }

    public void setScrollState(int i12) {
        y yVar;
        if (i12 == this.f53753O) {
            return;
        }
        this.f53753O = i12;
        if (i12 != 2) {
            B b12 = this.f53772f0;
            RecyclerView.this.removeCallbacks(b12);
            b12.f53817d.abortAnimation();
            m mVar = this.f53787n;
            if (mVar != null && (yVar = mVar.f53840f) != null) {
                yVar.f();
            }
        }
        m mVar2 = this.f53787n;
        if (mVar2 != null) {
            mVar2.Z0(i12);
        }
        l0(i12);
        r rVar = this.f53780j0;
        if (rVar != null) {
            rVar.i(i12, this);
        }
        ArrayList arrayList = this.f53782k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) this.f53782k0.get(size)).i(i12, this);
            }
        }
    }

    public void setScrollingTouchSlop(int i12) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i12 != 1) {
            this.f53760V = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f53760V = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@j.P A a12) {
        this.f53765c.f53875h = a12;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i12) {
        return getScrollingChildHelper().h(i12, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z12) {
        if (z12 != this.f53809y) {
            p("Do not suppressLayout in layout or scroll");
            if (z12) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f53809y = true;
                this.f53811z = true;
                J0();
                return;
            }
            this.f53809y = false;
            if (this.f53807x && this.f53787n != null && this.f53785m != null) {
                requestLayout();
            }
            this.f53807x = false;
        }
    }

    public final void t(int i12, int i13) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f53748J;
        if (edgeEffect == null || edgeEffect.isFinished() || i12 <= 0) {
            zIsFinished = false;
        } else {
            this.f53748J.onRelease();
            zIsFinished = this.f53748J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f53750L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i12 < 0) {
            this.f53750L.onRelease();
            zIsFinished |= this.f53750L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f53749K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i13 > 0) {
            this.f53749K.onRelease();
            zIsFinished |= this.f53749K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f53751M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i13 < 0) {
            this.f53751M.onRelease();
            zIsFinished |= this.f53751M.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public final void t0(@j.N o oVar) {
        ArrayList arrayList = this.f53742D;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(oVar);
    }

    public final void u() {
        C23416g c23416g = this.f53771f;
        C23410a c23410a = this.f53769e;
        if (!this.f53803v || this.f53743E) {
            int i12 = androidx.core.os.K.f44794a;
            Trace.beginSection("RV FullInvalidate");
            x();
            Trace.endSection();
            return;
        }
        if (c23410a.g()) {
            int i13 = c23410a.f53976f;
            if ((i13 & 4) == 0 || (i13 & 11) != 0) {
                if (c23410a.g()) {
                    int i14 = androidx.core.os.K.f44794a;
                    Trace.beginSection("RV FullInvalidate");
                    x();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i15 = androidx.core.os.K.f44794a;
            Trace.beginSection("RV PartialInvalidate");
            G0();
            i0();
            c23410a.j();
            if (!this.f53807x) {
                int iC2 = c23416g.c();
                int i16 = 0;
                while (true) {
                    if (i16 < iC2) {
                        C cX2 = X(c23416g.b(i16));
                        if (cX2 != null && !cX2.shouldIgnore() && cX2.isUpdated()) {
                            x();
                            break;
                        }
                        i16++;
                    } else {
                        c23410a.b();
                        break;
                    }
                }
            }
            H0(true);
            j0(true);
            Trace.endSection();
        }
    }

    public final void u0(@j.N q qVar) {
        this.f53795r.remove(qVar);
        if (this.f53797s == qVar) {
            this.f53797s = null;
        }
    }

    public final void v(int i12, int i13) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setMeasuredDimension(m.L(i12, paddingRight, getMinimumWidth()), m.L(i13, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void v0(@j.N r rVar) {
        ArrayList arrayList = this.f53782k0;
        if (arrayList != null) {
            arrayList.remove(rVar);
        }
    }

    public final void w(View view) {
        C cX2 = X(view);
        Adapter adapter = this.f53785m;
        if (adapter != null && cX2 != null) {
            adapter.onViewDetachedFromWindow(cX2);
        }
        ArrayList arrayList = this.f53742D;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o) this.f53742D.get(size)).d(view);
            }
        }
    }

    public final void w0(@j.N View view, @j.P View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f53779j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f53860d) {
                int i12 = rect.left;
                Rect rect2 = nVar.f53859c;
                rect.left = i12 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f53787n.h1(this, view, this.f53779j, !this.f53803v, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x():void");
    }

    public final void x0() {
        VelocityTracker velocityTracker = this.f53755Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        I0(0);
        EdgeEffect edgeEffect = this.f53748J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f53748J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f53749K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f53749K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f53750L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f53750L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f53751M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f53751M.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public final void y() {
        Y.a aVar;
        z zVar = this.f53778i0;
        zVar.a(1);
        I(zVar);
        zVar.f53899i = false;
        G0();
        Y y12 = this.f53773g;
        y12.f53965a.clear();
        C20204c0<C> c20204c0 = y12.f53966b;
        c20204c0.a();
        i0();
        o0();
        View focusedChild = (this.f53770e0 && hasFocus() && this.f53785m != null) ? getFocusedChild() : null;
        C cL2 = focusedChild != null ? L(focusedChild) : null;
        if (cL2 == null) {
            zVar.f53903m = -1L;
            zVar.f53902l = -1;
            zVar.f53904n = -1;
        } else {
            zVar.f53903m = this.f53785m.hasStableIds() ? cL2.getItemId() : -1L;
            zVar.f53902l = this.f53743E ? -1 : cL2.isRemoved() ? cL2.mOldPosition : cL2.getAbsoluteAdapterPosition();
            View focusedChild2 = cL2.itemView;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            zVar.f53904n = id2;
        }
        zVar.f53898h = zVar.f53900j && this.f53786m0;
        this.f53786m0 = false;
        this.f53784l0 = false;
        zVar.f53897g = zVar.f53901k;
        zVar.f53895e = this.f53785m.getItemCount();
        N(this.f53796r0);
        boolean z12 = zVar.f53900j;
        o1<C, Y.a> o1Var = y12.f53965a;
        if (z12) {
            int iC2 = this.f53771f.c();
            for (int i12 = 0; i12 < iC2; i12++) {
                C cX2 = X(this.f53771f.b(i12));
                if (!cX2.shouldIgnore() && (!cX2.isInvalid() || this.f53785m.hasStableIds())) {
                    j jVar = this.f53752N;
                    j.e(cX2);
                    cX2.getUnmodifiedPayloads();
                    jVar.getClass();
                    j.d dVar = new j.d();
                    View view = cX2.itemView;
                    dVar.f53833a = view.getLeft();
                    dVar.f53834b = view.getTop();
                    view.getRight();
                    view.getBottom();
                    Y.a aVarA = o1Var.get(cX2);
                    if (aVarA == null) {
                        aVarA = Y.a.a();
                        o1Var.put(cX2, aVarA);
                    }
                    aVarA.f53969b = dVar;
                    aVarA.f53968a |= 4;
                    if (zVar.f53898h && cX2.isUpdated() && !cX2.isRemoved() && !cX2.shouldIgnore() && !cX2.isInvalid()) {
                        c20204c0.l(T(cX2), cX2);
                    }
                }
            }
        }
        if (zVar.f53901k) {
            int childCount = this.f53771f.f54010a.f53682a.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C cX3 = X(this.f53771f.f54010a.f53682a.getChildAt(i13));
                if (!cX3.shouldIgnore()) {
                    cX3.saveOldPosition();
                }
            }
            boolean z13 = zVar.f53896f;
            zVar.f53896f = false;
            this.f53787n.U0(this.f53765c, zVar);
            zVar.f53896f = z13;
            for (int i14 = 0; i14 < this.f53771f.c(); i14++) {
                C cX4 = X(this.f53771f.b(i14));
                if (!cX4.shouldIgnore() && ((aVar = o1Var.get(cX4)) == null || (aVar.f53968a & 4) == 0)) {
                    j.e(cX4);
                    boolean zHasAnyOfTheFlags = cX4.hasAnyOfTheFlags(8192);
                    j jVar2 = this.f53752N;
                    cX4.getUnmodifiedPayloads();
                    jVar2.getClass();
                    j.d dVar2 = new j.d();
                    View view2 = cX4.itemView;
                    dVar2.f53833a = view2.getLeft();
                    dVar2.f53834b = view2.getTop();
                    view2.getRight();
                    view2.getBottom();
                    if (zHasAnyOfTheFlags) {
                        q0(cX4, dVar2);
                    } else {
                        Y.a aVarA2 = o1Var.get(cX4);
                        if (aVarA2 == null) {
                            aVarA2 = Y.a.a();
                            o1Var.put(cX4, aVarA2);
                        }
                        aVarA2.f53968a |= 2;
                        aVarA2.f53969b = dVar2;
                    }
                }
            }
            r();
        } else {
            r();
        }
        j0(true);
        H0(false);
        zVar.f53894d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.y0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void z() {
        G0();
        i0();
        z zVar = this.f53778i0;
        zVar.a(6);
        this.f53769e.c();
        zVar.f53895e = this.f53785m.getItemCount();
        zVar.f53893c = 0;
        if (this.f53767d != null && this.f53785m.canRestoreState()) {
            Parcelable parcelable = this.f53767d.f53822d;
            if (parcelable != null) {
                this.f53787n.X0(parcelable);
            }
            this.f53767d = null;
        }
        zVar.f53897g = false;
        this.f53787n.U0(this.f53765c, zVar);
        zVar.f53896f = false;
        zVar.f53900j = zVar.f53900j && this.f53752N != null;
        zVar.f53894d = 4;
        j0(true);
        H0(false);
    }

    public final void z0(int i12, int i13, @j.P int[] iArr) {
        C c12;
        C23416g c23416g = this.f53771f;
        G0();
        i0();
        int i14 = androidx.core.os.K.f44794a;
        Trace.beginSection("RV Scroll");
        z zVar = this.f53778i0;
        I(zVar);
        u uVar = this.f53765c;
        int iK1 = i12 != 0 ? this.f53787n.k1(i12, uVar, zVar) : 0;
        int iM1 = i13 != 0 ? this.f53787n.m1(i13, uVar, zVar) : 0;
        Trace.endSection();
        int iC2 = c23416g.c();
        for (int i15 = 0; i15 < iC2; i15++) {
            View viewB = c23416g.b(i15);
            C cW2 = W(viewB);
            if (cW2 != null && (c12 = cW2.mShadowingHolder) != null) {
                View view = c12.itemView;
                int left = viewB.getLeft();
                int top = viewB.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        j0(true);
        H0(false);
        if (iArr != null) {
            iArr[0] = iK1;
            iArr[1] = iM1;
        }
    }

    public static abstract class Adapter<VH extends C> {
        private final f mObservable = new f();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.f53813b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {

            /* renamed from: b, reason: collision with root package name */
            public static final StateRestorationPolicy f53813b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ StateRestorationPolicy[] f53814c;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                f53813b = stateRestorationPolicy;
                f53814c = new StateRestorationPolicy[]{stateRestorationPolicy, new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new StateRestorationPolicy("PREVENT", 2)};
            }

            public StateRestorationPolicy() {
                throw null;
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) f53814c.clone();
            }
        }

        public void b(int i12, int i13) {
            notifyItemRangeRemoved(i12, i13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@j.N VH vh2, int i12) {
            boolean z12 = vh2.mBindingAdapter == null;
            if (z12) {
                vh2.mPosition = i12;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i12);
                }
                vh2.setFlags(1, 519);
                int i13 = androidx.core.os.K.f44794a;
                Trace.beginSection("RV OnBindView");
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i12, vh2.getUnmodifiedPayloads());
            if (z12) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof n) {
                    ((n) layoutParams).f53860d = true;
                }
                int i14 = androidx.core.os.K.f44794a;
                Trace.endSection();
            }
        }

        public void c(int i12, int i13) {
            notifyItemRangeInserted(i12, i13);
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
        }

        @j.N
        public final VH createViewHolder(@j.N ViewGroup viewGroup, int i12) {
            try {
                int i13 = androidx.core.os.K.f44794a;
                Trace.beginSection("RV CreateView");
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i12);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i12;
                Trace.endSection();
                return vh2;
            } catch (Throwable th2) {
                int i14 = androidx.core.os.K.f44794a;
                Trace.endSection();
                throw th2;
            }
        }

        public void d(int i12, int i13) {
            notifyItemMoved(i12, i13);
        }

        public int findRelativeAdapterPositionIn(@j.N Adapter<? extends C> adapter, @j.N C c12, int i12) {
            if (adapter == this) {
                return i12;
            }
            return -1;
        }

        public int getCount() {
            return getItemCount();
        }

        public abstract int getItemCount();

        public long getItemId(int i12) {
            return -1L;
        }

        public int getItemViewType(int i12) {
            return 0;
        }

        @j.N
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public void i(int i12, int i13, @Y61.l Object obj) {
            notifyItemRangeChanged(i12, i13, obj);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i12) {
            this.mObservable.d(i12, 1, null);
        }

        public final void notifyItemInserted(int i12) {
            this.mObservable.e(i12, 1);
        }

        public final void notifyItemMoved(int i12, int i13) {
            this.mObservable.c(i12, i13);
        }

        public final void notifyItemRangeChanged(int i12, int i13) {
            this.mObservable.d(i12, i13, null);
        }

        public final void notifyItemRangeInserted(int i12, int i13) {
            this.mObservable.e(i12, i13);
        }

        public final void notifyItemRangeRemoved(int i12, int i13) {
            this.mObservable.f(i12, i13);
        }

        public final void notifyItemRemoved(int i12) {
            this.mObservable.f(i12, 1);
        }

        public abstract void onBindViewHolder(@j.N VH vh2, int i12);

        public void onBindViewHolder(@j.N VH vh2, int i12, @j.N List<Object> list) {
            onBindViewHolder(vh2, i12);
        }

        @j.N
        public abstract VH onCreateViewHolder(@j.N ViewGroup viewGroup, int i12);

        public boolean onFailedToRecycleView(@j.N VH vh2) {
            return false;
        }

        public void registerAdapterDataObserver(@j.N g gVar) {
            this.mObservable.registerObserver(gVar);
        }

        public void setHasStableIds(boolean z12) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z12;
        }

        public void setStateRestorationPolicy(@j.N StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(@j.N g gVar) {
            this.mObservable.unregisterObserver(gVar);
        }

        public final void notifyItemChanged(int i12, @j.P Object obj) {
            this.mObservable.d(i12, 1, obj);
        }

        public final void notifyItemRangeChanged(int i12, int i13, @j.P Object obj) {
            this.mObservable.d(i12, i13, obj);
        }

        public void onAttachedToRecyclerView(@j.N RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(@j.N RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(@j.N VH vh2) {
        }

        public void onViewDetachedFromWindow(@j.N VH vh2) {
        }

        public void onViewRecycled(@j.N VH vh2) {
        }
    }

    public RecyclerView(@j.N Context context, @j.P AttributeSet attributeSet, int i12) throws NoSuchMethodException, SecurityException {
        int i13;
        TypedArray typedArray;
        char c12;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i12);
        this.f53763b = new w();
        this.f53765c = new u();
        this.f53773g = new Y();
        this.f53777i = new RunnableC23407a();
        this.f53779j = new Rect();
        this.f53781k = new Rect();
        this.f53783l = new RectF();
        this.f53791p = new ArrayList();
        this.f53793q = new ArrayList<>();
        this.f53795r = new ArrayList<>();
        this.f53805w = 0;
        this.f53743E = false;
        this.f53744F = false;
        this.f53745G = 0;
        this.f53746H = 0;
        this.f53747I = new i();
        this.f53752N = new C23418i();
        this.f53753O = 0;
        this.f53754P = -1;
        this.f53766c0 = Float.MIN_VALUE;
        this.f53768d0 = Float.MIN_VALUE;
        this.f53770e0 = true;
        this.f53772f0 = new B();
        this.f53776h0 = new r.b();
        this.f53778i0 = new z();
        this.f53784l0 = false;
        this.f53786m0 = false;
        k kVar = new k();
        this.f53788n0 = kVar;
        this.f53790o0 = false;
        this.f53796r0 = new int[2];
        this.f53800t0 = new int[2];
        this.f53802u0 = new int[2];
        this.f53804v0 = new int[2];
        this.f53806w0 = new ArrayList();
        this.f53808x0 = new RunnableC23408b();
        this.f53812z0 = 0;
        this.f53738A0 = 0;
        this.f53740B0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f53760V = viewConfiguration.getScaledTouchSlop();
        this.f53766c0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f53768d0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f53762a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f53764b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f53752N.f53827a = kVar;
        this.f53769e = new C23410a(new L(this));
        this.f53771f = new C23416g(new K(this));
        if (C22823h0.m(this) == 0) {
            C22823h0.I(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f53741C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new M(this));
        int[] iArr = a.j.f14788a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i12, 0);
        C22823h0.B(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i12);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f53775h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i13 = 4;
            typedArray = typedArrayObtainStyledAttributes;
            c12 = 2;
            new C23426q(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.avito.android.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.avito.android.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.avito.android.R.dimen.fastscroll_margin));
        } else {
            i13 = 4;
            typedArray = typedArrayObtainStyledAttributes;
            c12 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f53735D0);
                        objArr = new Object[i13];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c12] = Integer.valueOf(i12);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e12) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e13) {
                            e13.initCause(e12);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e13);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e14);
                } catch (ClassNotFoundException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e15);
                } catch (IllegalAccessException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e16);
                } catch (InstantiationException e17) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e17);
                } catch (InvocationTargetException e18) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e18);
                }
            }
        }
        int[] iArr2 = f53734C0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i12, 0);
        C22823h0.B(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i12);
        boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
    }

    public void onNestedScroll(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, @Y61.k int[] iArr) {
        onNestedScroll(view, i12, i13, i14, i15);
    }

    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: b, reason: collision with root package name */
        public C f53858b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f53859c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53860d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f53861e;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53859c = new Rect();
            this.f53860d = true;
            this.f53861e = false;
        }

        public n(int i12, int i13) {
            super(i12, i13);
            this.f53859c = new Rect();
            this.f53860d = true;
            this.f53861e = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f53859c = new Rect();
            this.f53860d = true;
            this.f53861e = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f53859c = new Rect();
            this.f53860d = true;
            this.f53861e = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f53859c = new Rect();
            this.f53860d = true;
            this.f53861e = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f53787n;
        if (mVar != null) {
            return mVar.c0(layoutParams);
        }
        throw new IllegalStateException(androidx.media3.exoplayer.analytics.m.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public static abstract class g {
        public void c(int i12, int i13, @j.P Object obj) {
            b(i12, i13);
        }

        public void a() {
        }

        public void g() {
        }

        public void b(int i12, int i13) {
        }

        public void d(int i12, int i13) {
        }

        public void e(int i12, int i13) {
        }

        public void f(int i12, int i13) {
        }
    }

    public static abstract class m {

        /* renamed from: b, reason: collision with root package name */
        public C23416g f53836b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView f53837c;

        /* renamed from: d, reason: collision with root package name */
        public final X f53838d;

        /* renamed from: e, reason: collision with root package name */
        public final X f53839e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public y f53840f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f53841g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f53842h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f53843i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f53844j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f53845k;

        /* renamed from: l, reason: collision with root package name */
        public int f53846l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f53847m;

        /* renamed from: n, reason: collision with root package name */
        public int f53848n;

        /* renamed from: o, reason: collision with root package name */
        public int f53849o;

        /* renamed from: p, reason: collision with root package name */
        public int f53850p;

        /* renamed from: q, reason: collision with root package name */
        public int f53851q;

        public class a implements X.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.X.b
            public final View a(int i12) {
                return m.this.d0(i12);
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int b() {
                m mVar = m.this;
                return mVar.f53850p - mVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int c(View view) {
                return m.j0(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int d() {
                return m.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int e(View view) {
                return m.m0(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements X.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.X.b
            public final View a(int i12) {
                return m.this.d0(i12);
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int b() {
                m mVar = m.this;
                return mVar.f53851q - mVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int c(View view) {
                return m.n0(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int d() {
                return m.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.X.b
            public final int e(View view) {
                return m.h0(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f53854a;

            /* renamed from: b, reason: collision with root package name */
            public int f53855b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f53856c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f53857d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.f53838d = new X(aVar);
            this.f53839e = new X(bVar);
            this.f53841g = false;
            this.f53842h = false;
            this.f53843i = false;
            this.f53844j = true;
            this.f53845k = true;
        }

        public static void B0(@j.N View view, int i12, int i13, int i14, int i15) {
            Rect rect = ((n) view.getLayoutParams()).f53859c;
            view.layout(i12 + rect.left, i13 + rect.top, i14 - rect.right, i15 - rect.bottom);
        }

        public static int L(int i12, int i13, int i14) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i13, i14) : size : Math.min(size, Math.max(i13, i14));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int f0(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.f0(int, int, int, int, boolean):int");
        }

        public static int h0(@j.N View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).f53859c.bottom;
        }

        public static int j0(@j.N View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).f53859c.left;
        }

        public static int m0(@j.N View view) {
            return view.getRight() + ((n) view.getLayoutParams()).f53859c.right;
        }

        public static int n0(@j.N View view) {
            return view.getTop() - ((n) view.getLayoutParams()).f53859c.top;
        }

        public static int p0(@j.N View view) {
            return RecyclerView.X(view).getItemViewType();
        }

        public static int t0(@j.N View view) {
            return ((n) view.getLayoutParams()).f53858b.getLayoutPosition();
        }

        public static d u0(@j.N Context context, @j.P AttributeSet attributeSet, int i12, int i13) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f14788a, i12, i13);
            dVar.f53854a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f53855b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f53856c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f53857d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean y0(int i12, int i13, int i14) {
            int mode = View.MeasureSpec.getMode(i13);
            int size = View.MeasureSpec.getSize(i13);
            if (i14 > 0 && i12 != i14) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i12;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i12;
            }
            return true;
        }

        public final boolean A0(@j.N View view, boolean z12) {
            boolean z13 = this.f53838d.b(view) && this.f53839e.b(view);
            return z12 ? z13 : !z13;
        }

        @Y61.l
        public View C(int i12) {
            return d0(i12);
        }

        public void C0(@j.N View view, int i12, int i13, int i14, int i15) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f53859c;
            view.layout(i12 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i13 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i14 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i15 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public final void D(View view) {
            E(view, -1, false);
        }

        public void D0(@j.N View view) {
            n nVar = (n) view.getLayoutParams();
            Rect rectZ = this.f53837c.Z(view);
            int i12 = rectZ.left + rectZ.right;
            int i13 = rectZ.top + rectZ.bottom;
            int iF02 = f0(this.f53850p, this.f53848n, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) nVar).width, I());
            int iF03 = f0(this.f53851q, this.f53849o, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) nVar).height, J());
            if (t1(view, iF02, iF03, nVar)) {
                view.measure(iF02, iF03);
            }
        }

        public final void E(View view, int i12, boolean z12) {
            C cX2 = RecyclerView.X(view);
            if (z12 || cX2.isRemoved()) {
                o1<C, Y.a> o1Var = this.f53837c.f53773g.f53965a;
                Y.a aVarA = o1Var.get(cX2);
                if (aVarA == null) {
                    aVarA = Y.a.a();
                    o1Var.put(cX2, aVarA);
                }
                aVarA.f53968a |= 1;
            } else {
                this.f53837c.f53773g.c(cX2);
            }
            n nVar = (n) view.getLayoutParams();
            if (cX2.wasReturnedFromScrap() || cX2.isScrap()) {
                if (cX2.isScrap()) {
                    cX2.unScrap();
                } else {
                    cX2.clearReturnedFromScrapFlag();
                }
                this.f53836b.a(view, i12, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f53837c) {
                int iE2 = this.f53836b.e(view);
                if (i12 == -1) {
                    i12 = this.f53836b.c();
                }
                if (iE2 == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f53837c.indexOfChild(view));
                    throw new IllegalStateException(androidx.media3.exoplayer.analytics.m.j(this.f53837c, sb2));
                }
                if (iE2 != i12) {
                    m mVar = this.f53837c.f53787n;
                    View viewD0 = mVar.d0(iE2);
                    if (viewD0 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iE2 + mVar.f53837c.toString());
                    }
                    mVar.X(iE2);
                    mVar.G(viewD0, i12);
                }
            } else {
                C23416g c23416g = this.f53836b;
                RecyclerView recyclerView = c23416g.f54010a.f53682a;
                int childCount = i12 < 0 ? recyclerView.getChildCount() : c23416g.d(i12);
                c23416g.f54011b.e(childCount, false);
                recyclerView.addView(view, childCount);
                C cX3 = RecyclerView.X(view);
                recyclerView.h0(view);
                Adapter adapter = recyclerView.f53785m;
                if (adapter != null && cX3 != null) {
                    adapter.onViewAttachedToWindow(cX3);
                }
                ArrayList arrayList = recyclerView.f53742D;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((o) recyclerView.f53742D.get(size)).j(view);
                    }
                }
                nVar.f53860d = true;
                y yVar = this.f53840f;
                if (yVar != null && yVar.f53882e) {
                    yVar.f53879b.getClass();
                    if (RecyclerView.V(view) == yVar.f53878a) {
                        yVar.f53883f = view;
                    }
                }
            }
            if (nVar.f53861e) {
                cX2.itemView.invalidate();
                nVar.f53861e = false;
            }
        }

        public void E0(@j.U int i12) {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                int iC2 = recyclerView.f53771f.c();
                for (int i13 = 0; i13 < iC2; i13++) {
                    recyclerView.f53771f.b(i13).offsetLeftAndRight(i12);
                }
            }
        }

        public void F(String str) {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public void F0(@j.U int i12) {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                int iC2 = recyclerView.f53771f.c();
                for (int i13 = 0; i13 < iC2; i13++) {
                    recyclerView.f53771f.b(i13).offsetTopAndBottom(i12);
                }
            }
        }

        public final void G(@j.N View view, int i12) {
            n nVar = (n) view.getLayoutParams();
            C cX2 = RecyclerView.X(view);
            if (cX2.isRemoved()) {
                o1<C, Y.a> o1Var = this.f53837c.f53773g.f53965a;
                Y.a aVarA = o1Var.get(cX2);
                if (aVarA == null) {
                    aVarA = Y.a.a();
                    o1Var.put(cX2, aVarA);
                }
                aVarA.f53968a |= 1;
            } else {
                this.f53837c.f53773g.c(cX2);
            }
            this.f53836b.a(view, i12, nVar, cX2.isRemoved());
        }

        public final void H(@j.N View view, @j.N Rect rect) {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.Z(view));
            }
        }

        public boolean I() {
            return this instanceof DynamicScrollGridLayoutManager;
        }

        public boolean J() {
            return this instanceof DynamicScrollGridLayoutManager;
        }

        @j.P
        public View J0(@j.N View view, int i12, @j.N u uVar, @j.N z zVar) {
            return null;
        }

        public boolean K(n nVar) {
            return nVar != null;
        }

        public void K0(@j.N AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f53837c;
            u uVar = recyclerView.f53765c;
            z zVar = recyclerView.f53778i0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z12 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f53837c.canScrollVertically(-1) && !this.f53837c.canScrollHorizontally(-1) && !this.f53837c.canScrollHorizontally(1)) {
                z12 = false;
            }
            accessibilityEvent.setScrollable(z12);
            Adapter adapter = this.f53837c.f53785m;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void L0(@j.N u uVar, @j.N z zVar, @j.N androidx.core.view.accessibility.f fVar) {
            if (this.f53837c.canScrollVertically(-1) || this.f53837c.canScrollHorizontally(-1)) {
                fVar.a(8192);
                fVar.t(true);
            }
            if (this.f53837c.canScrollVertically(1) || this.f53837c.canScrollHorizontally(1)) {
                fVar.a(4096);
                fVar.t(true);
            }
            fVar.m(f.C1754f.a(v0(uVar, zVar), g0(uVar, zVar), 0));
        }

        public final void M0(View view, androidx.core.view.accessibility.f fVar) {
            C cX2 = RecyclerView.X(view);
            if (cX2 == null || cX2.isRemoved()) {
                return;
            }
            C23416g c23416g = this.f53836b;
            if (c23416g.f54012c.contains(cX2.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f53837c;
            N0(recyclerView.f53765c, recyclerView.f53778i0, view, fVar);
        }

        public int O(@j.N z zVar) {
            return 0;
        }

        public int P(@j.N z zVar) {
            return 0;
        }

        public int Q(@j.N z zVar) {
            return 0;
        }

        public int R(@j.N z zVar) {
            return 0;
        }

        public int S(@j.N z zVar) {
            return 0;
        }

        public int T(@j.N z zVar) {
            return 0;
        }

        public void T0(@j.N RecyclerView recyclerView, int i12, int i13) {
            S0(i12);
        }

        public final void U(@j.N u uVar) {
            for (int iE02 = e0() - 1; iE02 >= 0; iE02--) {
                j1(uVar, iE02, d0(iE02));
            }
        }

        public final void V(@j.N View view, @j.N u uVar) {
            j1(uVar, this.f53836b.e(view), view);
        }

        public final void W(@j.N View view) {
            C cX2;
            int iE2 = this.f53836b.e(view);
            if (iE2 >= 0) {
                C23416g c23416g = this.f53836b;
                int iD2 = c23416g.d(iE2);
                c23416g.f54011b.f(iD2);
                RecyclerView recyclerView = c23416g.f54010a.f53682a;
                View childAt = recyclerView.getChildAt(iD2);
                if (childAt != null && (cX2 = RecyclerView.X(childAt)) != null) {
                    if (cX2.isTmpDetached() && !cX2.shouldIgnore()) {
                        StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                        sb2.append(cX2);
                        throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(recyclerView, sb2));
                    }
                    cX2.addFlags(256);
                }
                recyclerView.detachViewFromParent(iD2);
            }
        }

        public void W0(@j.N u uVar, @j.N z zVar, int i12, int i13) {
            this.f53837c.v(i12, i13);
        }

        public void X(int i12) {
            C cX2;
            d0(i12);
            C23416g c23416g = this.f53836b;
            int iD2 = c23416g.d(i12);
            c23416g.f54011b.f(iD2);
            RecyclerView recyclerView = c23416g.f54010a.f53682a;
            View childAt = recyclerView.getChildAt(iD2);
            if (childAt != null && (cX2 = RecyclerView.X(childAt)) != null) {
                if (cX2.isTmpDetached() && !cX2.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(cX2);
                    throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(recyclerView, sb2));
                }
                cX2.addFlags(256);
            }
            recyclerView.detachViewFromParent(iD2);
        }

        @j.P
        public final View Y(@j.N View view) {
            View viewK;
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView == null || (viewK = recyclerView.K(view)) == null || this.f53836b.f54012c.contains(viewK)) {
                return null;
            }
            return viewK;
        }

        @j.P
        public Parcelable Y0() {
            return null;
        }

        @j.P
        public View Z(int i12) {
            int iE02 = e0();
            for (int i13 = 0; i13 < iE02; i13++) {
                View viewD0 = d0(i13);
                C cX2 = RecyclerView.X(viewD0);
                if (cX2 != null && cX2.getLayoutPosition() == i12 && !cX2.shouldIgnore() && (this.f53837c.f53778i0.f53897g || !cX2.isRemoved())) {
                    return viewD0;
                }
            }
            return null;
        }

        public abstract n a0();

        public boolean a1(@j.N u uVar, @j.N z zVar, int i12, @j.P Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i13;
            int i14;
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView == null) {
                return false;
            }
            if (i12 == 4096) {
                paddingTop = recyclerView.canScrollVertically(1) ? (this.f53851q - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f53837c.canScrollHorizontally(1)) {
                    paddingLeft = (this.f53850p - getPaddingLeft()) - getPaddingRight();
                    i13 = paddingTop;
                    i14 = paddingLeft;
                }
                i13 = paddingTop;
                i14 = 0;
            } else if (i12 != 8192) {
                i14 = 0;
                i13 = 0;
            } else {
                paddingTop = recyclerView.canScrollVertically(-1) ? -((this.f53851q - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f53837c.canScrollHorizontally(-1)) {
                    paddingLeft = -((this.f53850p - getPaddingLeft()) - getPaddingRight());
                    i13 = paddingTop;
                    i14 = paddingLeft;
                }
                i13 = paddingTop;
                i14 = 0;
            }
            if (i13 == 0 && i14 == 0) {
                return false;
            }
            this.f53837c.E0(i14, i13, null, BeduinInputModel.MIN_TEXT_VERSION, true);
            return true;
        }

        public n b0(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public final void b1() {
            for (int iE02 = e0() - 1; iE02 >= 0; iE02--) {
                C23416g c23416g = this.f53836b;
                int iD2 = c23416g.d(iE02);
                K k12 = c23416g.f54010a;
                View childAt = k12.f53682a.getChildAt(iD2);
                if (childAt != null) {
                    if (c23416g.f54011b.f(iD2)) {
                        c23416g.f(childAt);
                    }
                    k12.b(iD2);
                }
            }
        }

        public n c0(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public void c1(@j.N u uVar) {
            for (int iE02 = e0() - 1; iE02 >= 0; iE02--) {
                if (!RecyclerView.X(d0(iE02)).shouldIgnore()) {
                    View viewD0 = d0(iE02);
                    g1(iE02);
                    uVar.g(viewD0);
                }
            }
        }

        @j.P
        public final View d0(int i12) {
            C23416g c23416g = this.f53836b;
            if (c23416g != null) {
                return c23416g.b(i12);
            }
            return null;
        }

        public final void d1(u uVar) {
            ArrayList<C> arrayList;
            int size = uVar.f53868a.size();
            int i12 = size - 1;
            while (true) {
                arrayList = uVar.f53868a;
                if (i12 < 0) {
                    break;
                }
                View view = arrayList.get(i12).itemView;
                C cX2 = RecyclerView.X(view);
                if (!cX2.shouldIgnore()) {
                    cX2.setIsRecyclable(false);
                    if (cX2.isTmpDetached()) {
                        this.f53837c.removeDetachedView(view, false);
                    }
                    j jVar = this.f53837c.f53752N;
                    if (jVar != null) {
                        jVar.j(cX2);
                    }
                    cX2.setIsRecyclable(true);
                    C cX3 = RecyclerView.X(view);
                    cX3.mScrapContainer = null;
                    cX3.mInChangeScrap = false;
                    cX3.clearReturnedFromScrapFlag();
                    uVar.h(cX3);
                }
                i12--;
            }
            arrayList.clear();
            ArrayList<C> arrayList2 = uVar.f53869b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f53837c.invalidate();
            }
        }

        public final int e0() {
            C23416g c23416g = this.f53836b;
            if (c23416g != null) {
                return c23416g.c();
            }
            return 0;
        }

        public final void e1(@j.N View view, @j.N u uVar) {
            f1(view);
            uVar.g(view);
        }

        public void f1(View view) {
            C23416g c23416g = this.f53836b;
            K k12 = c23416g.f54010a;
            int iIndexOfChild = k12.f53682a.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (c23416g.f54011b.f(iIndexOfChild)) {
                c23416g.f(view);
            }
            k12.b(iIndexOfChild);
        }

        public int g0(@j.N u uVar, @j.N z zVar) {
            return -1;
        }

        public void g1(int i12) {
            if (d0(i12) != null) {
                C23416g c23416g = this.f53836b;
                int iD2 = c23416g.d(i12);
                K k12 = c23416g.f54010a;
                View childAt = k12.f53682a.getChildAt(iD2);
                if (childAt == null) {
                    return;
                }
                if (c23416g.f54011b.f(iD2)) {
                    c23416g.f(childAt);
                }
                k12.b(iD2);
            }
        }

        @j.U
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @j.U
        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return recyclerView.getPaddingEnd();
        }

        @j.U
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @j.U
        public int getPaddingRight() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @j.U
        public final int getPaddingStart() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return recyclerView.getPaddingStart();
        }

        @j.U
        public int getPaddingTop() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean h1(@j.N androidx.recyclerview.widget.RecyclerView r9, @j.N android.view.View r10, @j.N android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.getPaddingLeft()
                int r1 = r8.getPaddingTop()
                int r2 = r8.f53850p
                int r3 = r8.getPaddingRight()
                int r2 = r2 - r3
                int r3 = r8.f53851q
                int r4 = r8.getPaddingBottom()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.q0()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                int[] r10 = new int[]{r2, r1}
                r11 = r10[r0]
                r10 = r10[r7]
                if (r13 == 0) goto Lae
                android.view.View r13 = r9.getFocusedChild()
                if (r13 != 0) goto L7c
                goto Lb3
            L7c:
                int r1 = r8.getPaddingLeft()
                int r2 = r8.getPaddingTop()
                int r3 = r8.f53850p
                int r4 = r8.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r8.f53851q
                int r5 = r8.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f53837c
                android.graphics.Rect r5 = r5.f53779j
                r8.i0(r13, r5)
                int r13 = r5.left
                int r13 = r13 - r11
                if (r13 >= r3) goto Lb3
                int r13 = r5.right
                int r13 = r13 - r11
                if (r13 <= r1) goto Lb3
                int r13 = r5.top
                int r13 = r13 - r10
                if (r13 >= r4) goto Lb3
                int r13 = r5.bottom
                int r13 = r13 - r10
                if (r13 > r2) goto Lae
                goto Lb3
            Lae:
                if (r11 != 0) goto Lb4
                if (r10 == 0) goto Lb3
                goto Lb4
            Lb3:
                return r0
            Lb4:
                if (r12 == 0) goto Lba
                r9.scrollBy(r11, r10)
                goto Lbd
            Lba:
                r9.C0(r11, r10)
            Lbd:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.h1(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void i0(@j.N View view, @j.N Rect rect) {
            RecyclerView.Y(view, rect);
        }

        public final void i1() {
            RecyclerView recyclerView = this.f53837c;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final void j1(u uVar, int i12, View view) {
            C cX2 = RecyclerView.X(view);
            if (cX2.shouldIgnore()) {
                return;
            }
            if (cX2.isInvalid() && !cX2.isRemoved() && !this.f53837c.f53785m.hasStableIds()) {
                g1(i12);
                uVar.h(cX2);
            } else {
                X(i12);
                uVar.i(view);
                this.f53837c.f53773g.c(cX2);
            }
        }

        public int k0(@j.N View view) {
            Rect rect = ((n) view.getLayoutParams()).f53859c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int k1(int i12, u uVar, z zVar) {
            return 0;
        }

        public int l0(@j.N View view) {
            Rect rect = ((n) view.getLayoutParams()).f53859c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int m1(int i12, u uVar, z zVar) {
            return 0;
        }

        public final void n1(RecyclerView recyclerView) {
            p1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final int o0() {
            RecyclerView recyclerView = this.f53837c;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public final void o1() {
            if (true != this.f53845k) {
                this.f53845k = true;
                this.f53846l = 0;
                RecyclerView recyclerView = this.f53837c;
                if (recyclerView != null) {
                    recyclerView.f53765c.l();
                }
            }
        }

        public final void p1(int i12, int i13) {
            this.f53850p = View.MeasureSpec.getSize(i12);
            int mode = View.MeasureSpec.getMode(i12);
            this.f53848n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.f53734C0;
            }
            this.f53851q = View.MeasureSpec.getSize(i13);
            int mode2 = View.MeasureSpec.getMode(i13);
            this.f53849o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.f53734C0;
            }
        }

        public final int q0() {
            RecyclerView recyclerView = this.f53837c;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return recyclerView.getLayoutDirection();
        }

        public void q1(Rect rect, int i12, int i13) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            this.f53837c.setMeasuredDimension(L(i12, paddingRight, s0()), L(i13, paddingBottom, r0()));
        }

        @j.U
        public final int r0() {
            RecyclerView recyclerView = this.f53837c;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return recyclerView.getMinimumHeight();
        }

        public final void r1(int i12, int i13) {
            int iE02 = e0();
            if (iE02 == 0) {
                this.f53837c.v(i12, i13);
                return;
            }
            int i14 = BeduinInputModel.MIN_TEXT_VERSION;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MIN_VALUE;
            int i17 = Integer.MAX_VALUE;
            for (int i18 = 0; i18 < iE02; i18++) {
                View viewD0 = d0(i18);
                Rect rect = this.f53837c.f53779j;
                i0(viewD0, rect);
                int i19 = rect.left;
                if (i19 < i17) {
                    i17 = i19;
                }
                int i22 = rect.right;
                if (i22 > i14) {
                    i14 = i22;
                }
                int i23 = rect.top;
                if (i23 < i15) {
                    i15 = i23;
                }
                int i24 = rect.bottom;
                if (i24 > i16) {
                    i16 = i24;
                }
            }
            this.f53837c.f53779j.set(i17, i15, i14, i16);
            q1(this.f53837c.f53779j, i12, i13);
        }

        @j.U
        public final int s0() {
            RecyclerView recyclerView = this.f53837c;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return recyclerView.getMinimumWidth();
        }

        public final void s1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f53837c = null;
                this.f53836b = null;
                this.f53850p = 0;
                this.f53851q = 0;
            } else {
                this.f53837c = recyclerView;
                this.f53836b = recyclerView.f53771f;
                this.f53850p = recyclerView.getWidth();
                this.f53851q = recyclerView.getHeight();
            }
            this.f53848n = 1073741824;
            this.f53849o = 1073741824;
        }

        final boolean t1(View view, int i12, int i13, n nVar) {
            return (!view.isLayoutRequested() && this.f53844j && y0(view.getWidth(), i12, ((ViewGroup.MarginLayoutParams) nVar).width) && y0(view.getHeight(), i13, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public boolean u1() {
            return false;
        }

        public int v0(@j.N u uVar, @j.N z zVar) {
            return -1;
        }

        public final boolean v1(View view, int i12, int i13, n nVar) {
            return (this.f53844j && y0(view.getMeasuredWidth(), i12, ((ViewGroup.MarginLayoutParams) nVar).width) && y0(view.getMeasuredHeight(), i13, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public final void w0(@j.N View view, @j.N Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).f53859c;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f53837c != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f53837c.f53783l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean x0() {
            return this.f53843i;
        }

        public final void x1(y yVar) {
            y yVar2 = this.f53840f;
            if (yVar2 != null && yVar != yVar2 && yVar2.f53882e) {
                yVar2.f();
            }
            this.f53840f = yVar;
            RecyclerView recyclerView = this.f53837c;
            yVar.getClass();
            B b12 = recyclerView.f53772f0;
            RecyclerView.this.removeCallbacks(b12);
            b12.f53817d.abortAnimation();
            yVar.f53879b = recyclerView;
            yVar.f53880c = this;
            int i12 = yVar.f53878a;
            if (i12 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f53778i0.f53891a = i12;
            yVar.f53882e = true;
            yVar.f53881d = true;
            yVar.f53883f = recyclerView.f53787n.Z(i12);
            yVar.f53879b.f53772f0.a();
        }

        public boolean y1() {
            return false;
        }

        public final boolean z0() {
            y yVar = this.f53840f;
            return yVar != null && yVar.f53882e;
        }

        public void G0() {
        }

        public void P0() {
        }

        @InterfaceC42153i
        public void H0(RecyclerView recyclerView) {
        }

        public void S0(int i12) {
        }

        public void V0(z zVar) {
        }

        public void X0(Parcelable parcelable) {
        }

        public void Z0(int i12) {
        }

        public void l1(int i12) {
        }

        @InterfaceC42153i
        public void I0(RecyclerView recyclerView, u uVar) {
        }

        public void N(int i12, c cVar) {
        }

        public void O0(int i12, int i13) {
        }

        public void Q0(int i12, int i13) {
        }

        public void R0(int i12, int i13) {
        }

        public void U0(u uVar, z zVar) {
        }

        public void w1(int i12, RecyclerView recyclerView) {
        }

        public void M(int i12, int i13, z zVar, c cVar) {
        }

        public void N0(@j.N u uVar, @j.N z zVar, @j.N View view, @j.N androidx.core.view.accessibility.f fVar) {
        }
    }

    public static class x implements q {
        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean b(@j.N RecyclerView recyclerView, @j.N MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(boolean z12) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void g2(@j.N MotionEvent motionEvent) {
        }
    }

    public void h0(@j.N View view) {
    }

    public void l0(int i12) {
    }

    public void m0(@j.U int i12) {
    }

    public static abstract class r {
        public void i(int i12, @j.N RecyclerView recyclerView) {
        }

        public void k(@j.N RecyclerView recyclerView, int i12, int i13) {
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i12, int i13) {
    }
}
