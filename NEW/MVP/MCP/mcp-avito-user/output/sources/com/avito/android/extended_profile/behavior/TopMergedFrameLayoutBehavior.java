package com.avito.android.extended_profile.behavior;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import io.reactivex.rxjava3.subjects.b;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TopMergedFrameLayoutBehavior.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/extended_profile/behavior/TopMergedFrameLayoutBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/widget/FrameLayout;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "SavedState", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopMergedFrameLayoutBehavior extends CoordinatorLayout.c<FrameLayout> {

    /* renamed from: a, reason: collision with root package name */
    public int f149394a;

    /* renamed from: b, reason: collision with root package name */
    public int f149395b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Float f149396c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f149397d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public b<G0> f149398e;

    /* compiled from: TopMergedFrameLayoutBehavior.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/behavior/TopMergedFrameLayoutBehavior$SavedState;", "Landroid/os/Parcelable;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState implements Parcelable {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final float f149399b;

        /* compiled from: TopMergedFrameLayoutBehavior.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(float f12) {
            this.f149399b = f12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeFloat(this.f149399b);
        }
    }

    public TopMergedFrameLayoutBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i12) {
        boolean z12;
        RecyclerView recyclerViewA;
        FrameLayout frameLayout = (FrameLayout) view;
        if (coordinatorLayout.indexOfChild(frameLayout) != 0) {
            throw new IllegalStateException("Behavior must be attached to first FrameLayout in CoordinatorLayout!");
        }
        coordinatorLayout.onLayoutChild(frameLayout, i12);
        p6 p6Var = new p6(coordinatorLayout);
        while (true) {
            if (!p6Var.hasNext()) {
                z12 = false;
                break;
            }
            View view2 = (View) p6Var.next();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
            if (((gVar != null ? gVar.f44447a : null) instanceof BottomMergedBehavior) && view2.getVisibility() == 0) {
                z12 = true;
                break;
            }
        }
        this.f149397d = z12;
        if (z12) {
            this.f149395b = frameLayout.getBottom() - frameLayout.getTop();
            Float f12 = this.f149396c;
            if (f12 != null) {
                float fFloatValue = f12.floatValue();
                if (fFloatValue > 0.0f) {
                    this.f149394a = (int) ((this.f149395b * fFloatValue) / 100);
                    Iterator<View> it = new q6(frameLayout).iterator();
                    while (true) {
                        p6 p6Var2 = (p6) it;
                        if (!p6Var2.hasNext()) {
                            recyclerViewA = null;
                            break;
                        }
                        View view3 = (View) p6Var2.next();
                        if (!(view3 instanceof RecyclerView) || !D6.y(view3)) {
                            if ((view3 instanceof BeduinView) && D6.y(view3)) {
                                recyclerViewA = CA.b.a((BeduinView) view3);
                                break;
                            }
                        } else {
                            recyclerViewA = (RecyclerView) view3;
                            break;
                        }
                    }
                    if (recyclerViewA != null) {
                        RecyclerView.m layoutManager = recyclerViewA.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        RecyclerView.Adapter adapter = recyclerViewA.getAdapter();
                        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
                        if (linearLayoutManager != null && numValueOf != null) {
                            recyclerViewA.post(new a(linearLayoutManager, numValueOf, 1));
                        }
                    }
                }
            }
            int i13 = this.f149394a;
            int i14 = this.f149395b;
            if (i13 > i14) {
                this.f149394a = i14;
            }
            frameLayout.offsetTopAndBottom(-this.f149394a);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i12, int i13, int[] iArr, int i14) {
        int i15;
        int i16;
        int i17;
        if (((FrameLayout) view).equals(view2)) {
            if (i13 >= 0 || (i17 = this.f149394a) <= 0) {
                return;
            }
            int i18 = -i13;
            if (i18 <= i17) {
                i17 = i18;
            }
            v(coordinatorLayout, i17);
            iArr[1] = -i17;
            b<G0> bVar = this.f149398e;
            if (bVar != null) {
                bVar.onNext(G0.f406611a);
                return;
            }
            return;
        }
        if (i13 <= 0 || (i15 = this.f149394a) >= (i16 = this.f149395b)) {
            return;
        }
        int i19 = i16 - i15;
        if (i13 > i19) {
            i13 = i19;
        }
        v(coordinatorLayout, -i13);
        iArr[1] = i13;
        b<G0> bVar2 = this.f149398e;
        if (bVar2 != null) {
            bVar2.onNext(G0.f406611a);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i12, int i13, int i14, int i15, int i16, int[] iArr) {
        int i17;
        int i18;
        int i19;
        if (((FrameLayout) view).equals(view2)) {
            if (i15 <= 0 || (i18 = this.f149394a) >= (i19 = this.f149395b)) {
                return;
            }
            int i22 = i19 - i18;
            if (i15 > i22) {
                i15 = i22;
            }
            v(coordinatorLayout, -i15);
            iArr[1] = i15;
            b<G0> bVar = this.f149398e;
            if (bVar != null) {
                bVar.onNext(G0.f406611a);
                return;
            }
            return;
        }
        if (i15 >= 0 || (i17 = this.f149394a) <= 0) {
            return;
        }
        int i23 = -i15;
        if (i23 <= i17) {
            i17 = i23;
        }
        v(coordinatorLayout, i17);
        iArr[1] = -i17;
        b<G0> bVar2 = this.f149398e;
        if (bVar2 != null) {
            bVar2.onNext(G0.f406611a);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(View view, Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f149396c = Float.valueOf(((SavedState) parcelable).f149399b);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable r(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        return new SavedState(frameLayout.getBottom() - frameLayout.getTop() != 0 ? (this.f149394a * 100) / (frameLayout.getBottom() - frameLayout.getTop()) : 0.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i12, int i13) {
        return (i12 & 2) != 0 && this.f149397d;
    }

    public final void v(CoordinatorLayout coordinatorLayout, int i12) {
        this.f149396c = null;
        this.f149394a -= i12;
        p6 p6Var = new p6(coordinatorLayout);
        while (p6Var.hasNext()) {
            ((View) p6Var.next()).offsetTopAndBottom(i12);
        }
    }

    public TopMergedFrameLayoutBehavior(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
