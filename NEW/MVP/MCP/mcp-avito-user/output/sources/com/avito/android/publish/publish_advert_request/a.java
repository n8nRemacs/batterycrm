package com.avito.android.publish.publish_advert_request;

import Y41.l;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.publish.publish_advert_request.e;
import com.avito.android.publish.uploading_dialog.UploadingErrorFragment;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishAdvertRequestFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/publish_advert_request/e$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements l<e.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishAdvertRequestFragment f238963l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PublishAdvertRequestFragment publishAdvertRequestFragment) {
        super(1);
        this.f238963l = publishAdvertRequestFragment;
    }

    @Override // Y41.l
    public final G0 invoke(e.a aVar) {
        FragmentManager supportFragmentManager;
        e.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof e.a.f;
        PublishAdvertRequestFragment publishAdvertRequestFragment = this.f238963l;
        if (z12) {
            e.a.f fVar = (e.a.f) aVar2;
            TextView textView = publishAdvertRequestFragment.f238960k0;
            if (textView == null) {
                textView = null;
            }
            String str = publishAdvertRequestFragment.f238959j0;
            if (str == null) {
                str = null;
            }
            Integer numValueOf = Integer.valueOf(fVar.f239016a);
            int i12 = fVar.f239017b;
            textView.setText(String.format(str, Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(i12)}, 2)));
            ProgressBar progressBar = publishAdvertRequestFragment.f238961l0;
            if (progressBar == null) {
                progressBar = null;
            }
            progressBar.setMax(i12 * 200);
            int i13 = fVar.f239016a;
            if (i13 > 0) {
                Object tag = progressBar.getTag(R.id.progress_indicator);
                if (tag instanceof Animator) {
                    ((Animator) tag).cancel();
                }
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i13 * 200);
                objectAnimatorOfInt.setDuration(300L);
                objectAnimatorOfInt.setInterpolator(new androidx.interpolator.view.animation.b());
                objectAnimatorOfInt.start();
                progressBar.setTag(R.id.progress_indicator, objectAnimatorOfInt);
            } else {
                progressBar.setProgress(50);
            }
            com.avito.android.progress_overlay.l lVar = publishAdvertRequestFragment.f238962m0;
            (lVar != null ? lVar : null).j();
        } else if (aVar2 instanceof e.a.C7183e) {
            com.avito.android.progress_overlay.l lVar2 = publishAdvertRequestFragment.f238962m0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.k(null);
        } else if (aVar2 instanceof e.a.d) {
            UploadingErrorFragment uploadingErrorFragment = new UploadingErrorFragment();
            uploadingErrorFragment.setTargetFragment(publishAdvertRequestFragment, 4);
            ActivityC22955m activityC22955mL1 = publishAdvertRequestFragment.l1();
            if (activityC22955mL1 != null && (supportFragmentManager = activityC22955mL1.getSupportFragmentManager()) != null) {
                Fragment fragmentH = supportFragmentManager.H("tag_dialog");
                if (fragmentH != null) {
                    ((DialogFragment) fragmentH).dismissAllowingStateLoss();
                }
                uploadingErrorFragment.show(supportFragmentManager, "tag_dialog");
            }
        } else if (aVar2 instanceof e.a.c) {
            com.avito.android.progress_overlay.l lVar3 = publishAdvertRequestFragment.f238962m0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.k(null);
        } else if (aVar2 instanceof e.a.C7182a) {
            com.avito.android.progress_overlay.l lVar4 = publishAdvertRequestFragment.f238962m0;
            (lVar4 != null ? lVar4 : null).a(((e.a.C7182a) aVar2).f239011a.getF244063c());
        } else if (aVar2 instanceof e.a.b) {
            com.avito.android.progress_overlay.l lVar5 = publishAdvertRequestFragment.f238962m0;
            (lVar5 != null ? lVar5 : null).a(((e.a.b) aVar2).f239012a);
        }
        return G0.f406611a;
    }
}
