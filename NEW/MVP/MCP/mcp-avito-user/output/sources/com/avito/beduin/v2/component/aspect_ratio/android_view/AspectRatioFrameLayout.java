package com.avito.beduin.v2.component.aspect_ratio.android_view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AspectRatioFrameLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/android_view/AspectRatioFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/avito/beduin/v2/component/aspect_ratio/android_view/AspectRatioFrameLayout$a;", "ratio", "Lkotlin/G0;", "setRatio", "(Lcom/avito/beduin/v2/component/aspect_ratio/android_view/AspectRatioFrameLayout$a;)V", "Axis", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public int f335483b;

    /* renamed from: c, reason: collision with root package name */
    public int f335484c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Axis f335485d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AspectRatioFrameLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/android_view/AspectRatioFrameLayout$Axis;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Axis {

        /* renamed from: b, reason: collision with root package name */
        public static final Axis f335486b;

        /* renamed from: c, reason: collision with root package name */
        public static final Axis f335487c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Axis[] f335488d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335489e;

        static {
            Axis axis = new Axis("WIDTH", 0);
            f335486b = axis;
            Axis axis2 = new Axis("HEIGHT", 1);
            f335487c = axis2;
            Axis[] axisArr = {axis, axis2};
            f335488d = axisArr;
            f335489e = kotlin.enums.c.a(axisArr);
        }

        public Axis() {
            throw null;
        }

        public static Axis valueOf(String str) {
            return (Axis) Enum.valueOf(Axis.class, str);
        }

        public static Axis[] values() {
            return (Axis[]) f335488d.clone();
        }
    }

    /* compiled from: AspectRatioFrameLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/android_view/AspectRatioFrameLayout$a;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f335490a;

        /* renamed from: b, reason: collision with root package name */
        public final int f335491b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Axis f335492c;

        public a(int i12, int i13, @k Axis axis) {
            this.f335490a = i12;
            this.f335491b = i13;
            this.f335492c = axis;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f335490a == aVar.f335490a && this.f335491b == aVar.f335491b && this.f335492c == aVar.f335492c;
        }

        public final int hashCode() {
            return this.f335492c.hashCode() + r.e(this.f335491b, Integer.hashCode(this.f335490a) * 31, 31);
        }

        @k
        public final String toString() {
            return "Ratio(aspectRatioWidth=" + this.f335490a + ", aspectRatioHeight=" + this.f335491b + ", orientation=" + this.f335492c + ')';
        }
    }

    /* compiled from: AspectRatioFrameLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Axis.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Axis axis = Axis.f335486b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        this.f335483b = 1;
        this.f335484c = 1;
        this.f335485d = Axis.f335486b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        boolean z12 = mode != 1073741824 && this.f335485d == Axis.f335486b;
        boolean z13 = mode2 != 1073741824 && this.f335485d == Axis.f335487c;
        if (z12 || z13) {
            super.onMeasure(i12, i13);
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        } else {
            measuredWidth = View.MeasureSpec.getSize(i12);
            measuredHeight = View.MeasureSpec.getSize(i13);
        }
        int[] iArr = new int[2];
        int iOrdinal = this.f335485d.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = measuredWidth;
            iArr[1] = (measuredWidth * this.f335484c) / this.f335483b;
        } else if (iOrdinal == 1) {
            iArr[0] = (this.f335483b * measuredHeight) / this.f335484c;
            iArr[1] = measuredHeight;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr[1], 1073741824));
    }

    public final void setRatio(@k a ratio) {
        this.f335483b = ratio.f335490a;
        this.f335484c = ratio.f335491b;
        this.f335485d = ratio.f335492c;
        requestLayout();
    }
}
