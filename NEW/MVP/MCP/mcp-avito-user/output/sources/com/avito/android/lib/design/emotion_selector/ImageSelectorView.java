package com.avito.android.lib.design.emotion_selector;

import Y41.p;
import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.view.y0;
import com.avito.android.util.K2;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageSelectorView.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0003\u001e\u001f J\u001b\u0010\u0006\u001a\u00020\u00052\f\b\u0001\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView;", "Landroid/view/View;", "", "", "images", "Lkotlin/G0;", "setImages", "([I)V", "Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$a;", "listener", "setListener", "(Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$a;)V", "", "value", "h", "Z", "getUseMaxImageSizeForCalculation", "()Z", "setUseMaxImageSizeForCalculation", "(Z)V", "useMaxImageSizeForCalculation", "i", "getExcludeImageEdgePaddings", "setExcludeImageEdgePaddings", "excludeImageEdgePaddings", "getSelectedNumber", "()I", "setSelectedNumber", "(I)V", "selectedNumber", "a", "b", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageSelectorView extends View {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f179147k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public Object f179148b;

    /* renamed from: c, reason: collision with root package name */
    public int f179149c;

    /* renamed from: d, reason: collision with root package name */
    public int f179150d;

    /* renamed from: e, reason: collision with root package name */
    public final float f179151e;

    /* renamed from: f, reason: collision with root package name */
    public final float f179152f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public a f179153g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean useMaxImageSizeForCalculation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean excludeImageEdgePaddings;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final GestureDetector f179156j;

    /* compiled from: ImageSelectorView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$State;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Parcelable f179157b;

        /* renamed from: c, reason: collision with root package name */
        public int f179158c;

        /* compiled from: ImageSelectorView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readParcelable(State.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public /* synthetic */ State(Parcelable parcelable, int i12, int i13, C42822w c42822w) {
            this(parcelable, (i13 & 2) != 0 ? -1 : i12);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f179157b, i12);
            parcel.writeInt(this.f179158c);
        }

        public State(@l Parcelable parcelable, int i12) {
            super(parcelable);
            this.f179157b = parcelable;
            this.f179158c = i12;
        }
    }

    /* compiled from: ImageSelectorView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();

        void b();

        void c();
    }

    /* compiled from: ImageSelectorView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Drawable f179159a;

        /* renamed from: b, reason: collision with root package name */
        public int f179160b;

        /* renamed from: c, reason: collision with root package name */
        public int f179161c;

        /* renamed from: d, reason: collision with root package name */
        public float f179162d = 0.5f;

        /* renamed from: e, reason: collision with root package name */
        public int f179163e;

        /* renamed from: f, reason: collision with root package name */
        public int f179164f;

        /* renamed from: g, reason: collision with root package name */
        public float f179165g;

        /* renamed from: h, reason: collision with root package name */
        public int f179166h;

        /* renamed from: i, reason: collision with root package name */
        public int f179167i;

        /* renamed from: j, reason: collision with root package name */
        public int f179168j;

        /* renamed from: k, reason: collision with root package name */
        public int f179169k;

        public b(@k Drawable drawable) {
            this.f179159a = drawable;
            this.f179165g = ImageSelectorView.this.f179152f;
        }

        public final void a(float f12) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f179165g, f12);
            valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.addUpdateListener(new y0(3, this, ImageSelectorView.this));
            valueAnimatorOfFloat.start();
        }

        public final int b() {
            return ImageSelectorView.this.getUseMaxImageSizeForCalculation() ? this.f179169k : this.f179164f;
        }
    }

    /* compiled from: ImageSelectorView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00060\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;", "Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/emotion_selector/ImageSelectorView$b;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<b, Float, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f179171l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(b bVar, Float f12) {
            bVar.a(f12.floatValue());
            return G0.f406611a;
        }
    }

    public ImageSelectorView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f179148b = C42784z0.f406748b;
        this.f179149c = -1;
        this.f179150d = -1;
        this.f179151e = 1.0f;
        this.f179152f = 0.7f;
        this.f179156j = new GestureDetector(context, new h(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int a(MotionEvent motionEvent) {
        int i12 = 0;
        for (b bVar : this.f179148b) {
            int i13 = bVar.f179160b;
            int i14 = bVar.f179163e + i13;
            int iRound = Math.round(motionEvent.getX());
            if (i13 <= iRound && iRound <= i14) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void b(int i12, p<? super b, ? super Float, G0> pVar) {
        int i13 = this.f179150d;
        if (i13 != i12) {
            b bVar = (b) C42745f0.K(i13, this.f179148b);
            if (bVar != null) {
                pVar.invoke(bVar, Float.valueOf(this.f179152f));
            }
            b bVar2 = (b) C42745f0.K(i12, this.f179148b);
            if (bVar2 != null) {
                pVar.invoke(bVar2, Float.valueOf(this.f179151e));
            }
            this.f179150d = i12;
        }
    }

    public final boolean getExcludeImageEdgePaddings() {
        return this.excludeImageEdgePaddings;
    }

    /* renamed from: getSelectedNumber, reason: from getter */
    public final int getF179150d() {
        return this.f179150d;
    }

    public final boolean getUseMaxImageSizeForCalculation() {
        return this.useMaxImageSizeForCalculation;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        for (b bVar : (Iterable) this.f179148b) {
            int iRound = Math.round(bVar.f179166h * bVar.f179165g);
            int iRound2 = Math.round(bVar.f179167i * bVar.f179165g);
            int iRound3 = Math.round(bVar.f179160b - ((iRound - bVar.f179163e) * bVar.f179162d));
            int iRound4 = Math.round(bVar.f179161c - ((iRound2 - bVar.b()) * 1.0f));
            Drawable drawable = bVar.f179159a;
            drawable.setBounds(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        Iterable iterable = (Iterable) this.f179148b;
        int paddingLeft = getPaddingLeft();
        Iterator it = iterable.iterator();
        int i14 = 0;
        while (true) {
            Object next = null;
            if (!it.hasNext()) {
                int paddingRight = getPaddingRight() + paddingLeft;
                int paddingTop = getPaddingTop();
                Iterator it2 = ((Iterable) this.f179148b).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int iB2 = ((b) next).b();
                        do {
                            Object next2 = it2.next();
                            int iB3 = ((b) next2).b();
                            if (iB2 < iB3) {
                                next = next2;
                                iB2 = iB3;
                            }
                        } while (it2.hasNext());
                    }
                }
                b bVar = (b) next;
                setMeasuredDimension(View.resolveSizeAndState(paddingRight, i12, 0), View.resolveSizeAndState(getPaddingBottom() + paddingTop + (bVar != null ? bVar.b() : 0), i13, 0));
                return;
            }
            Object next3 = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            b bVar2 = (b) next3;
            Drawable drawable = bVar2.f179159a;
            bVar2.f179166h = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            bVar2.f179167i = intrinsicHeight;
            float f12 = bVar2.f179166h;
            ImageSelectorView imageSelectorView = ImageSelectorView.this;
            float f13 = imageSelectorView.f179152f;
            float f14 = 1 - f13;
            bVar2.f179168j = (int) (((bVar2.f179162d * f14) + f13) * f12);
            bVar2.f179169k = (int) (((f14 * 1.0f) + f13) * intrinsicHeight);
            bVar2.f179163e = Math.round(f12 * f13);
            bVar2.f179164f = Math.round(bVar2.f179167i * imageSelectorView.f179152f);
            if (this.excludeImageEdgePaddings) {
                int size = this.f179148b.size() - 1;
            }
            bVar2.f179160b = paddingLeft;
            bVar2.f179161c = getPaddingTop();
            paddingLeft = (i14 == this.f179148b.size() - 1 ? imageSelectorView.getUseMaxImageSizeForCalculation() ? bVar2.f179168j : bVar2.f179163e : bVar2.f179163e) + bVar2.f179160b;
            i14 = i15;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof State)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        State state = (State) parcelable;
        super.onRestoreInstanceState(state.getSuperState());
        b(state.f179158c, g.f179172l);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState(), 0, 2, null);
        state.f179158c = this.f179150d;
        return state;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(@Y61.k android.view.MotionEvent r5) {
        /*
            r4 = this;
            android.view.GestureDetector r0 = r4.f179156j
            boolean r0 = r0.onTouchEvent(r5)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r5.getAction()
            r2 = 0
            if (r0 == 0) goto L40
            if (r0 == r1) goto L24
            r3 = 2
            if (r0 == r3) goto L1a
            r5 = 3
            if (r0 == r5) goto L24
            goto L51
        L1a:
            int r5 = r4.a(r5)
            com.avito.android.lib.design.emotion_selector.ImageSelectorView$c r0 = com.avito.android.lib.design.emotion_selector.ImageSelectorView.c.f179171l
            r4.b(r5, r0)
            goto L51
        L24:
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L2e
            r0 = 0
            r5.requestDisallowInterceptTouchEvent(r0)
        L2e:
            com.avito.android.lib.design.emotion_selector.ImageSelectorView$a r5 = r4.f179153g
            if (r5 != 0) goto L3c
            if (r5 != 0) goto L38
            r5 = -1
            r4.f179149c = r5
            goto L51
        L38:
            r5.b()
            throw r2
        L3c:
            r5.a()
            throw r2
        L40:
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L49
            r5.requestDisallowInterceptTouchEvent(r1)
        L49:
            int r5 = r4.f179150d
            r4.f179149c = r5
            com.avito.android.lib.design.emotion_selector.ImageSelectorView$a r5 = r4.f179153g
            if (r5 != 0) goto L52
        L51:
            return r1
        L52:
            r5.c()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.emotion_selector.ImageSelectorView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean requestFocus(int i12, @l Rect rect) {
        K2.d(this, true);
        return true;
    }

    public final void setExcludeImageEdgePaddings(boolean z12) {
        this.excludeImageEdgePaddings = z12;
        requestLayout();
    }

    public final void setImages(@InterfaceC42165v @k int... images) {
        ArrayList arrayList = new ArrayList(images.length);
        for (int i12 : images) {
            Drawable drawable = androidx.core.content.d.getDrawable(getContext(), i12);
            if (drawable == null) {
                throw new IllegalArgumentException("Incorrect DrawableRes id");
            }
            arrayList.add(new b(drawable));
        }
        this.f179148b = arrayList;
        b bVar = (b) C42745f0.G(arrayList);
        if (bVar != null) {
            bVar.f179162d = 0.0f;
        }
        requestLayout();
        invalidate();
    }

    public final void setListener(@l a listener) {
        this.f179153g = listener;
    }

    public final void setSelectedNumber(int i12) {
        b(i12, g.f179172l);
        a aVar = this.f179153g;
        if (aVar == null) {
            return;
        }
        aVar.a();
        throw null;
    }

    public final void setUseMaxImageSizeForCalculation(boolean z12) {
        this.useMaxImageSizeForCalculation = z12;
        requestLayout();
    }
}
