package com.avito.android.publish.merge_pretend_premoderation;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.publish.merge_pretend_premoderation.MergePretendPremoderationFragment;
import com.avito.android.publish.premoderation.AdvertDuplicateFragment;
import com.avito.android.publish.premoderation.p;
import com.avito.android.publish.screen.wrongcategory.WrongCategoryFragment;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import qe0.AbstractC47390a;

/* compiled from: MergePretendPremoderationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class c extends H implements Y41.l<AbstractC47390a, G0> {
    @Override // Y41.l
    public final G0 invoke(AbstractC47390a abstractC47390a) {
        Fragment fragmentA;
        FragmentManager supportFragmentManager;
        AbstractC47390a abstractC47390a2 = abstractC47390a;
        MergePretendPremoderationFragment mergePretendPremoderationFragment = (MergePretendPremoderationFragment) this.receiver;
        MergePretendPremoderationFragment.a aVar = MergePretendPremoderationFragment.f237393t0;
        mergePretendPremoderationFragment.getClass();
        if (abstractC47390a2 instanceof AbstractC47390a.C12331a) {
            AdvertDuplicateResult advertDuplicateResult = ((AbstractC47390a.C12331a) abstractC47390a2).f429329a;
            ActivityC22955m activityC22955mL1 = mergePretendPremoderationFragment.l1();
            if (activityC22955mL1 != null && (supportFragmentManager = activityC22955mL1.getSupportFragmentManager()) != null) {
                AdvertDuplicateFragment advertDuplicateFragmentA = com.avito.android.publish.premoderation.b.a(advertDuplicateResult);
                advertDuplicateFragmentA.setTargetFragment(mergePretendPremoderationFragment, 4);
                advertDuplicateFragmentA.show(supportFragmentManager, "tag_advert_duplicate_dialog");
            }
        } else {
            if (abstractC47390a2 instanceof AbstractC47390a.c) {
                AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest = ((AbstractC47390a.c) abstractC47390a2).f429331a;
                Q1 q12 = mergePretendPremoderationFragment.f237398r0;
                if (q12 == null) {
                    q12 = null;
                }
                q12.getClass();
                kotlin.reflect.n<Object> nVar = Q1.f67448x0[32];
                if (((Boolean) q12.f67455G.a().invoke()).booleanValue()) {
                    WrongCategoryFragment.f242558s0.getClass();
                    fragmentA = WrongCategoryFragment.b.a(wrongCategorySuggest);
                } else {
                    fragmentA = p.a(wrongCategorySuggest);
                }
                androidx.fragment.app.H hE2 = mergePretendPremoderationFragment.getChildFragmentManager().e();
                hE2.n(R.id.progress_overlay_container, fragmentA, null);
                hE2.c(null);
                hE2.e();
            } else if (abstractC47390a2 instanceof AbstractC47390a.b) {
                e eVar = mergePretendPremoderationFragment.f237394n0;
                (eVar != null ? eVar : null).c8();
            }
        }
        return G0.f406611a;
    }
}
