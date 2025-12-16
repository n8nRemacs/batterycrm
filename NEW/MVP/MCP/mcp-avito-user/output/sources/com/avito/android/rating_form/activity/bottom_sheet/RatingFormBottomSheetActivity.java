package com.avito.android.rating_form.activity.bottom_sheet;

import A91.p;
import Fc1.G3;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C22823h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.J;
import com.avito.android.R;
import com.avito.android.lib.util.b;
import com.avito.android.rating_form.B;
import com.avito.android.rating_form.ToastInfo;
import com.avito.android.rating_form.activity.c;
import com.avito.android.rating_form.api.remote.model.RatingFormToastPreset;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import com.avito.android.util.C35835l0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dh0.InterfaceC39727a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormBottomSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/activity/bottom_sheet/RatingFormBottomSheetActivity;", "Lcom/avito/android/rating_form/activity/c;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormBottomSheetActivity extends c {

    /* renamed from: z, reason: collision with root package name */
    @k
    public static final a f247948z = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public final boolean f247949v = true;

    /* renamed from: w, reason: collision with root package name */
    public BottomSheetBehavior<View> f247950w;

    /* renamed from: x, reason: collision with root package name */
    public ViewGroup f247951x;

    /* renamed from: y, reason: collision with root package name */
    public ViewGroup f247952y;

    /* compiled from: RatingFormBottomSheetActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/activity/bottom_sheet/RatingFormBottomSheetActivity$a;", "", "<init>", "()V", "", "DIM_AMOUNT", "F", "", "FAKE_FRAGMENT_TAG", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_rating_form_bottom_sheet;
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void a2(@k H h12) {
        Fragment fragmentG = getSupportFragmentManager().G(R.id.rating_form_fragment_container);
        if (fragmentG != null) {
            View viewRequireView = fragmentG.requireView();
            String transitionName = fragmentG.requireView().getTransitionName();
            if (J.f46467a != null || J.f46468b != null) {
                String strP = C22823h0.p(viewRequireView);
                if (strP == null) {
                    throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                }
                if (h12.f46455n == null) {
                    h12.f46455n = new ArrayList<>();
                    h12.f46456o = new ArrayList<>();
                } else {
                    if (h12.f46456o.contains(transitionName)) {
                        throw new IllegalArgumentException(AK.c.k("A shared element with the target name '", transitionName, "' has already been added to the transaction."));
                    }
                    if (h12.f46455n.contains(strP)) {
                        throw new IllegalArgumentException(AK.c.k("A shared element with the source name '", strP, "' has already been added to the transaction."));
                    }
                }
                h12.f46455n.add(strP);
                h12.f46456o.add(transitionName);
            }
        }
        h12.f46457p = true;
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void b2(@l Integer num, @l Intent intent) {
        super.b2(num, intent);
        BottomSheetBehavior<View> bottomSheetBehavior = this.f247950w;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        b.a(bottomSheetBehavior);
    }

    @Override // com.avito.android.rating_form.activity.c
    @k
    public final String c2() {
        return "bottomSheet";
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void e2() {
        b2(3, B.a(new ToastInfo(getString(R.string.rating_form_toast_error_message), null, null, RatingFormToastPreset.ERROR, ToastInfo.Position.f247934b, null, null, false, 4, null), null, false));
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void f2() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.coordinatorLayout);
        this.f247952y = viewGroup;
        viewGroup.setOnClickListener(new p(this, 17));
        Window window = getWindow();
        if (window != null) {
            window.addFlags(2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.5f);
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.rating_form_bottom_behavior);
        this.f247951x = viewGroup2;
        viewGroup2.setBackgroundTintList(C35835l0.e(R.attr.bg_elevation1, this));
        ViewGroup viewGroup3 = this.f247951x;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        BottomSheetBehavior<View> bottomSheetBehaviorB = BottomSheetBehavior.B(viewGroup3);
        this.f247950w = bottomSheetBehaviorB;
        b.a(bottomSheetBehaviorB);
        BottomSheetBehavior<View> bottomSheetBehavior = this.f247950w;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.v(new Ug0.c(this));
        ViewGroup viewGroup4 = this.f247952y;
        (viewGroup4 != null ? viewGroup4 : null).post(new G3(this, 2));
    }

    @Override // com.avito.android.rating_form.activity.c
    /* renamed from: g2, reason: from getter */
    public final boolean getF247949v() {
        return this.f247949v;
    }

    @Override // com.avito.android.rating_form.activity.c
    public final void h2(@k RatingFormState ratingFormState) {
        if (!ratingFormState.f248753k) {
            ViewGroup viewGroup = this.f247951x;
            (viewGroup != null ? viewGroup : null).getLayoutParams().height = -2;
            return;
        }
        ViewGroup viewGroup2 = this.f247951x;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        ViewGroup viewGroup3 = this.f247952y;
        layoutParams.height = ((viewGroup3 != null ? viewGroup3 : null).getHeight() / 2) + ((int) viewGroup2.getResources().getDimension(R.dimen.rating_form_bottom_sheet_behavior_top_margin));
        Fragment fragmentG = getSupportFragmentManager().G(R.id.rating_form_fragment_container);
        H hE2 = getSupportFragmentManager().e();
        if (fragmentG == null) {
            hE2.f46457p = true;
            hE2.n(R.id.rating_form_fragment_container, new RatingFormFakeFragment(), "fake_fragment");
        }
        hE2.e();
    }

    @Override // com.avito.android.rating_form.activity.c, com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        d2().accept(InterfaceC39727a.b.f393997a);
    }
}
