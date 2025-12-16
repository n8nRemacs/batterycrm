package com.avito.android.motivation_screen.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.motivation_screen.ui.confetti.c;
import com.avito.android.util.D1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.motivation_screen.ui.confetti.c f206393b;

    public G(com.avito.android.motivation_screen.ui.confetti.c cVar, c.a aVar) {
        this.f206393b = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        FrameLayout frameLayout;
        view.removeOnLayoutChangeListener(this);
        com.avito.android.motivation_screen.ui.confetti.c cVar = this.f206393b;
        kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, 300);
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.k it = lVarR.iterator();
        while (true) {
            boolean z12 = it.f406910d;
            frameLayout = cVar.f206417a;
            if (!z12) {
                break;
            }
            it.a();
            int width = frameLayout.getWidth();
            int height = frameLayout.getHeight();
            com.avito.android.motivation_screen.ui.confetti.c cVar2 = cVar;
            float fA2 = (float) com.avito.android.motivation_screen.ui.confetti.c.a(0.5d, 1.0d);
            double dA2 = com.avito.android.motivation_screen.ui.confetti.c.a(1.0d, 3000);
            double dA3 = com.avito.android.motivation_screen.ui.confetti.c.a(0.0d, 6.283185307179586d);
            double dA4 = com.avito.android.motivation_screen.ui.confetti.c.a(0.0d, Math.max(width, height) * 0.8d);
            float f12 = height;
            PointF pointF = new PointF(width * 0.5f, f12 * 0.4f);
            double d12 = height;
            PointF pointF2 = new PointF((float) ((Math.cos(dA3) * 0.8d * dA4) + pointF.x), (float) (androidx.appcompat.app.r.b(dA3, dA4, pointF.y) - (0.3d * d12)));
            kotlin.ranges.k kVar = it;
            ArrayList arrayList2 = arrayList;
            float fA3 = (float) com.avito.android.motivation_screen.ui.confetti.c.a(0.0d, width);
            float f13 = pointF.y;
            double d13 = f13;
            float f14 = f12 - f13;
            kotlin.ranges.k kVar2 = kVar;
            PointF pointF3 = new PointF(fA3, (float) ((f14 * 0.5d) + d13));
            PointF pointF4 = new PointF(pointF2.x, (float) (com.avito.android.motivation_screen.ui.confetti.c.a(20.0d, 40.0d) + d12));
            int i22 = 100;
            kotlin.ranges.l lVarR2 = kotlin.ranges.s.r(0, 100);
            ArrayList arrayList3 = new ArrayList(C42745f0.q(lVarR2, 10));
            kotlin.ranges.k it2 = lVarR2.iterator();
            while (it2.f406910d) {
                float fA4 = it2.a() / i22;
                float f15 = 1 - fA4;
                double d14 = f15;
                double d15 = 3;
                float fPow = (float) Math.pow(d14, d15);
                kotlin.ranges.k kVar3 = kVar2;
                ArrayList arrayList4 = arrayList3;
                double d16 = 2;
                float f16 = 3;
                float fPow2 = ((float) Math.pow(d14, d16)) * fA4 * f16;
                kotlin.ranges.k kVar4 = it2;
                PointF pointF5 = pointF3;
                double d17 = fA4;
                float fPow3 = ((float) Math.pow(d17, d16)) * f15 * f16;
                float fPow4 = (float) Math.pow(d17, d15);
                arrayList4.add(new PointF((pointF4.x * fPow4) + (pointF5.x * fPow3) + (pointF2.x * fPow2) + (pointF.x * fPow), (fPow4 * pointF4.y) + (fPow3 * pointF5.y) + (fPow2 * pointF2.y) + (fPow * pointF.y)));
                arrayList3 = arrayList4;
                pointF3 = pointF5;
                it2 = kVar4;
                kVar2 = kVar3;
                i22 = 100;
            }
            kotlin.ranges.k kVar5 = kVar2;
            arrayList2.add(new c.b(fA2, dA2, pointF, pointF4, arrayList3));
            cVar = cVar2;
            arrayList = arrayList2;
            it = kVar5;
        }
        com.avito.android.motivation_screen.ui.confetti.c cVar3 = cVar;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            c.b bVar = (c.b) it3.next();
            com.avito.android.motivation_screen.ui.confetti.b bVar2 = new com.avito.android.motivation_screen.ui.confetti.b(frameLayout.getContext(), null, 0, 6.0f, 6, null);
            com.avito.android.motivation_screen.ui.confetti.c cVar4 = cVar3;
            RunnableC28882d runnableC28882d = new RunnableC28882d(19, cVar4, bVar2);
            bVar.getClass();
            frameLayout.postDelayed(runnableC28882d, 0L);
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION_X, 0.0f, 360.0f);
            Property property = View.ROTATION_Y;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bVar2, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 60.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property, 60.0f, 0.0f));
            double d18 = bVar.f206419b;
            objectAnimatorOfPropertyValuesHolder.setDuration((long) (d18 / 10));
            D1.a(objectAnimatorOfPropertyValuesHolder, -1);
            Property property2 = View.SCALE_X;
            float f17 = bVar.f206418a;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(bVar2, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.0f, f17), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, f17));
            long j12 = (long) d18;
            objectAnimatorOfPropertyValuesHolder2.setDuration(j12);
            D1.a(objectAnimatorOfPropertyValuesHolder2, -1);
            Property property3 = View.TRANSLATION_X;
            ArrayList arrayList5 = bVar.f206422e;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(Float.valueOf(((PointF) it4.next()).x));
            }
            float[] fArrJ0 = C42745f0.J0(arrayList6);
            PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, Arrays.copyOf(fArrJ0, fArrJ0.length));
            Property property4 = View.TRANSLATION_Y;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList7.add(Float.valueOf(((PointF) it5.next()).y));
            }
            float[] fArrJ02 = C42745f0.J0(arrayList7);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(bVar2, propertyValuesHolderOfFloat2, PropertyValuesHolder.ofFloat((Property<?, Float>) property4, Arrays.copyOf(fArrJ02, fArrJ02.length)));
            objectAnimatorOfPropertyValuesHolder3.setDuration(j12);
            objectAnimatorOfPropertyValuesHolder3.setInterpolator(new PathInterpolator(1.0f, 1.0f, 0.5f, 0.5f));
            objectAnimatorOfPropertyValuesHolder3.addListener(new com.avito.android.motivation_screen.ui.confetti.d(cVar4, bVar2));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
            animatorSet.setStartDelay(0L);
            animatorSet.start();
            cVar3 = cVar4;
        }
    }
}
