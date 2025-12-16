package com.avito.android.reward_bug_entry_impl;

import Y41.l;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.reward_bug_entry_impl.mvi.a;
import com.avito.android.reward_bug_entry_impl.mvi.r;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import mn0.C44109b;

/* compiled from: RewardBugEntryLifecycleCallbacksImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/reward_bug_entry_impl/mvi/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<r, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f255625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Activity f255626m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Activity activity) {
        super(1);
        this.f255625l = fVar;
        this.f255626m = activity;
    }

    @Override // Y41.l
    public final G0 invoke(r rVar) {
        ViewGroup viewGroup;
        int i12 = 1;
        r rVar2 = rVar;
        f fVar = this.f255625l;
        fVar.getClass();
        boolean zF2 = L.f(rVar2, r.b.f255673c);
        IdentityHashMap<Activity, C44109b> identityHashMap = fVar.f255630f;
        Activity activity = this.f255626m;
        if (zF2) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            C44109b c44109b = identityHashMap.get(activity);
            if (viewGroup != null) {
                viewGroup.removeView(c44109b);
            }
            fVar.i(activity);
        } else if (L.f(rVar2, r.c.f255674c)) {
            C44109b c44109b2 = identityHashMap.get(activity);
            if (c44109b2 != null) {
                c44109b2.setVisible(false);
            }
        } else if (rVar2 instanceof r.d) {
            C44109b c44109b3 = identityHashMap.get(activity);
            if (c44109b3 == null) {
                c44109b3 = new C44109b(activity, null, 0, 6, null);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                c44109b3.setId(View.generateViewId());
                c44109b3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                c44109b3.setOnPositionOnScreenChanged(new c(fVar));
                identityHashMap.put(activity, c44109b3);
                View rootView2 = activity.getWindow().getDecorView().getRootView();
                viewGroup = rootView2 instanceof ViewGroup ? (ViewGroup) rootView2 : null;
                if (viewGroup != null) {
                    viewGroup.addView(c44109b3);
                }
            }
            r.d dVar = (r.d) rVar2;
            if (dVar.f255679g) {
                fVar.f255629e.accept(a.d.f255635a);
            }
            c44109b3.getImageView().setAspectRatio(1.0f);
            SimpleDraweeView imageView = c44109b3.getImageView();
            ImageRequest.a aVarA = C35949t5.a(imageView);
            aVarA.d(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(dVar.f255676d, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()))));
            aVarA.f169500r = false;
            aVarA.c();
            c44109b3.getImageView().getLayoutParams().width = y6.b(64);
            c44109b3.setVisible(true);
            c44109b3.getCloseIcon().setOnClickListener(new com.avito.android.review_gallery.g(fVar, i12));
            c44109b3.getImageView().setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(fVar, dVar.f255675c, activity, 13));
            c44109b3.setPositionOnScreen(dVar.f255678f);
        }
        return G0.f406611a;
    }
}
