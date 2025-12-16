package com.avito.android.publish.slots.item_info;

import Y61.k;
import Y61.l;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.util.D1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: ItemInfoConfettiAnimation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/item_info/c;", "", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f244350a;

    /* compiled from: ItemInfoConfettiAnimation.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/item_info/c$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f244351a;

        /* renamed from: b, reason: collision with root package name */
        public final int f244352b;

        /* renamed from: c, reason: collision with root package name */
        public final float f244353c;

        /* renamed from: d, reason: collision with root package name */
        public final int f244354d;

        public a(long j12, int i12, float f12, int i13) {
            this.f244351a = j12;
            this.f244352b = i12;
            this.f244353c = f12;
            this.f244354d = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f244351a == aVar.f244351a && this.f244352b == aVar.f244352b && Float.compare(this.f244353c, aVar.f244353c) == 0 && this.f244354d == aVar.f244354d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f244354d) + r.d(this.f244353c, r.e(this.f244352b, Long.hashCode(this.f244351a) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Confetti(delay=");
            sb2.append(this.f244351a);
            sb2.append(", count=");
            sb2.append(this.f244352b);
            sb2.append(", radius=");
            sb2.append(this.f244353c);
            sb2.append(", duration=");
            return r.t(sb2, this.f244354d, ')');
        }
    }

    /* compiled from: ItemInfoConfettiAnimation.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/item_info/c$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f244355a;

        /* renamed from: b, reason: collision with root package name */
        public final double f244356b;

        /* renamed from: c, reason: collision with root package name */
        public final long f244357c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PointF f244358d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PointF f244359e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ArrayList f244360f;

        public b(float f12, double d12, long j12, @k PointF pointF, @k PointF pointF2, @k ArrayList arrayList) {
            this.f244355a = f12;
            this.f244356b = d12;
            this.f244357c = j12;
            this.f244358d = pointF;
            this.f244359e = pointF2;
            this.f244360f = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f244355a, bVar.f244355a) == 0 && Double.compare(this.f244356b, bVar.f244356b) == 0 && this.f244357c == bVar.f244357c && this.f244358d.equals(bVar.f244358d) && this.f244359e.equals(bVar.f244359e) && this.f244360f.equals(bVar.f244360f);
        }

        public final int hashCode() {
            return this.f244360f.hashCode() + ((this.f244359e.hashCode() + ((this.f244358d.hashCode() + r.g(androidx.compose.ui.graphics.colorspace.e.d(Float.hashCode(this.f244355a) * 31, 31, this.f244356b), 31, this.f244357c)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DotParameters(scale=");
            sb2.append(this.f244355a);
            sb2.append(", duration=");
            sb2.append(this.f244356b);
            sb2.append(", delay=");
            sb2.append(this.f244357c);
            sb2.append(", startPoint=");
            sb2.append(this.f244358d);
            sb2.append(", endPoint=");
            sb2.append(this.f244359e);
            sb2.append(", bezierPoints=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f244360f, ')');
        }
    }

    public c(@k ViewGroup viewGroup) {
        this.f244350a = viewGroup;
    }

    public static double a(double d12, double d13) {
        kotlin.random.f.f406882b.getClass();
        return kotlin.random.f.f406883c.f(d12, d13);
    }

    public final void b(@k a aVar) {
        ViewGroup viewGroup;
        c cVar = this;
        a aVar2 = aVar;
        kotlin.ranges.l lVarR = s.r(0, aVar2.f244352b);
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.k it = lVarR.iterator();
        while (true) {
            boolean z12 = it.f406910d;
            viewGroup = cVar.f244350a;
            if (!z12) {
                break;
            }
            it.a();
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            kotlin.ranges.k kVar = it;
            float fA2 = (float) a(0.5d, 1.0d);
            double dA2 = a(1.0d, aVar2.f244354d);
            double dA3 = a(0.0d, 6.283185307179586d);
            double dA4 = a(0.0d, Math.max(width, height) * 0.8d);
            PointF pointF = new PointF(width * 0.5f, 0.4f * height);
            double d12 = height;
            PointF pointF2 = new PointF((float) ((Math.cos(dA3) * 0.8d * dA4) + pointF.x), (float) (r.b(dA3, dA4, pointF.y) - (0.3d * d12)));
            PointF pointF3 = new PointF((float) a(0.0d, width), (float) (((r6 - r8) * 0.5d) + pointF.y));
            PointF pointF4 = new PointF(pointF2.x, (float) (a(20.0d, 40.0d) + d12));
            int i12 = 100;
            kotlin.ranges.l lVarR2 = s.r(0, 100);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(lVarR2, 10));
            kotlin.ranges.k it2 = lVarR2.iterator();
            while (it2.f406910d) {
                float fA3 = it2.a() / i12;
                float f12 = 1 - fA3;
                double d13 = f12;
                double d14 = 3;
                float fPow = (float) Math.pow(d13, d14);
                double d15 = 2;
                float f13 = 3;
                float fPow2 = ((float) Math.pow(d13, d15)) * fA3 * f13;
                kotlin.ranges.k kVar2 = it2;
                double d16 = fA3;
                float fPow3 = ((float) Math.pow(d16, d15)) * f12 * f13;
                float fPow4 = (float) Math.pow(d16, d14);
                arrayList2.add(new PointF((pointF4.x * fPow4) + (pointF3.x * fPow3) + (pointF2.x * fPow2) + (pointF.x * fPow), (fPow4 * pointF4.y) + (fPow3 * pointF3.y) + (fPow2 * pointF2.y) + (fPow * pointF.y)));
                it2 = kVar2;
                arrayList = arrayList;
                i12 = 100;
            }
            ArrayList arrayList3 = arrayList;
            aVar2 = aVar;
            arrayList3.add(new b(fA2, dA2, aVar2.f244351a, pointF, pointF4, arrayList2));
            cVar = this;
            arrayList = arrayList3;
            it = kVar;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            b bVar = (b) it3.next();
            com.avito.android.publish.slots.item_info.b bVar2 = new com.avito.android.publish.slots.item_info.b(viewGroup.getContext(), null, 0, aVar2.f244353c, 6, null);
            viewGroup.postDelayed(new RunnableC28882d(28, this, bVar2), bVar.f244357c);
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION_X, 0.0f, 360.0f);
            Property property = View.ROTATION_Y;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bVar2, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 60.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property, 60.0f, 0.0f));
            double d17 = bVar.f244356b;
            objectAnimatorOfPropertyValuesHolder.setDuration((long) (d17 / 10));
            D1.a(objectAnimatorOfPropertyValuesHolder, -1);
            Property property2 = View.SCALE_X;
            float f14 = bVar.f244355a;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(bVar2, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.0f, f14), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, f14));
            long j12 = (long) d17;
            objectAnimatorOfPropertyValuesHolder2.setDuration(j12);
            D1.a(objectAnimatorOfPropertyValuesHolder2, -1);
            Property property3 = View.TRANSLATION_X;
            ArrayList arrayList4 = bVar.f244360f;
            ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Float.valueOf(((PointF) it4.next()).x));
            }
            float[] fArrJ0 = C42745f0.J0(arrayList5);
            PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, Arrays.copyOf(fArrJ0, fArrJ0.length));
            Property property4 = View.TRANSLATION_Y;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                arrayList6.add(Float.valueOf(((PointF) it5.next()).y));
            }
            float[] fArrJ02 = C42745f0.J0(arrayList6);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(bVar2, propertyValuesHolderOfFloat2, PropertyValuesHolder.ofFloat((Property<?, Float>) property4, Arrays.copyOf(fArrJ02, fArrJ02.length)));
            objectAnimatorOfPropertyValuesHolder3.setDuration(j12);
            objectAnimatorOfPropertyValuesHolder3.setInterpolator(new PathInterpolator(1.0f, 1.0f, 0.5f, 0.5f));
            objectAnimatorOfPropertyValuesHolder3.addListener(new d(this, bVar2));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
            animatorSet.setStartDelay(bVar.f244357c);
            animatorSet.start();
        }
    }
}
