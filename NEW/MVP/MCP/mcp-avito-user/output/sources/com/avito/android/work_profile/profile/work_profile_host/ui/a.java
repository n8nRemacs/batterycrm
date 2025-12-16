package com.avito.android.work_profile.profile.work_profile_host.ui;

import Y61.k;
import androidx.fragment.app.Fragment;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import com.avito.android.work_profile.profile.about_me.ui.AboutMeFragment;
import com.avito.android.work_profile.profile.applies.ui.AppliesToVacancyFragment;
import com.avito.android.work_profile.profile.cvs.ui.CvsFragment;
import com.avito.android.work_profile.profile.gig.ui.GigFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WorkProfileHostAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/a;", "Landroidx/viewpager2/adapter/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @k
    public List<? extends WorkProfileTab> f331311k;

    /* compiled from: WorkProfileHostAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.work_profile.profile.work_profile_host.ui.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10300a {
        static {
            int[] iArr = new int[WorkProfileTab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkProfileTab workProfileTab = WorkProfileTab.f330693d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkProfileTab workProfileTab2 = WorkProfileTab.f330693d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WorkProfileTab workProfileTab3 = WorkProfileTab.f330693d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f331311k.size();
    }

    @Override // androidx.viewpager2.adapter.b
    @k
    public final Fragment l(int i12) {
        int iOrdinal = this.f331311k.get(i12).ordinal();
        if (iOrdinal == 0) {
            CvsFragment.f331065s0.getClass();
            return new CvsFragment();
        }
        if (iOrdinal == 1) {
            AppliesToVacancyFragment.f330911u0.getClass();
            return new AppliesToVacancyFragment();
        }
        if (iOrdinal == 2) {
            AboutMeFragment.f330814x0.getClass();
            return new AboutMeFragment();
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        GigFragment.f331151s0.getClass();
        return new GigFragment();
    }
}
