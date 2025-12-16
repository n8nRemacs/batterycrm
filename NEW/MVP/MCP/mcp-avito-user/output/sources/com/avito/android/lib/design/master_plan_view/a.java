package com.avito.android.lib.design.master_plan_view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.e;
import com.avito.android.select.group_clearance_select.k;
import com.avito.android.select.group_clearance_select.n;
import com.avito.android.util.D1;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f179681c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f179682d;

    public /* synthetic */ a(float f12, int i12, Object obj) {
        this.f179680b = i12;
        this.f179682d = obj;
        this.f179681c = f12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f12 = this.f179681c;
        Object obj = this.f179682d;
        int i12 = 2;
        switch (this.f179680b) {
            case 0:
                MasterPlanView masterPlanView = (MasterPlanView) obj;
                masterPlanView.f179672i = f12;
                masterPlanView.f179673j = f12;
                int width = ((ViewGroup) masterPlanView.getParent()).getWidth();
                masterPlanView.f179669f = width;
                masterPlanView.scrollTo(((int) (masterPlanView.f179670g * f12)) - (width / 2), 0);
                masterPlanView.setOnScrollChangeListener(new e(masterPlanView, i12));
                break;
            case 1:
                n nVar = (n) obj;
                ImageView imageView = nVar.f265540i;
                float height = imageView.getHeight() / (-2);
                float f13 = -imageView.getWidth();
                imageView.setTranslationX(f13);
                imageView.setTranslationY(height);
                imageView.setVisibility(0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f);
                objectAnimatorOfFloat.setDuration(700L);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "translationY", height, height + 20.0f, height);
                objectAnimatorOfFloat2.setDuration(700L);
                D1.a(objectAnimatorOfFloat2, 1);
                objectAnimatorOfFloat2.setRepeatMode(2);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(nVar.f265539h, "translationY", f12, 20.0f, f12);
                objectAnimatorOfFloat3.setDuration(700L);
                D1.a(objectAnimatorOfFloat3, 1);
                objectAnimatorOfFloat3.setRepeatMode(2);
                objectAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "translationX", f13);
                objectAnimatorOfFloat4.setDuration(700L);
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                G0 g02 = G0.f406611a;
                animatorSet.playSequentially(objectAnimatorOfFloat, animatorSet2, objectAnimatorOfFloat4);
                animatorSet.addListener(new k(nVar));
                animatorSet.start();
                break;
            default:
                ((MotionLayout) obj).setProgress(f12);
                break;
        }
    }
}
