package com.avito.android.crm_candidates.view.base;

import com.avito.android.R;
import com.avito.android.crm_candidates.features.notes_list.entity.JobCrmNotesListState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmNotesListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class P extends kotlin.jvm.internal.N implements Y41.l<JobCrmNotesListState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmNotesListFragment f129902l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(JobCrmNotesListFragment jobCrmNotesListFragment) {
        super(1);
        this.f129902l = jobCrmNotesListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(JobCrmNotesListState jobCrmNotesListState) {
        JobCrmNotesListState jobCrmNotesListState2 = jobCrmNotesListState;
        JobCrmNotesListFragment jobCrmNotesListFragment = this.f129902l;
        NavBar navBar = jobCrmNotesListFragment.f129882r0;
        if (navBar == null) {
            navBar = null;
        }
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new O(jobCrmNotesListFragment), false, jobCrmNotesListFragment.getResources().getString(R.string.crm_notes), null, null, null, 117, null));
        com.avito.konveyor.adapter.d dVar = jobCrmNotesListFragment.f129880p0;
        androidx.recyclerview.widget.B b12 = dVar;
        if (dVar == null) {
            b12 = 0;
        }
        b12.l(jobCrmNotesListState2.f129704b, null);
        boolean z12 = jobCrmNotesListState2.f129705c;
        if (z12) {
            Button button = jobCrmNotesListFragment.f129884t0;
            if (button == null) {
                button = null;
            }
            D6.H(button);
        } else if (!z12) {
            Button button2 = jobCrmNotesListFragment.f129884t0;
            if (button2 == null) {
                button2 = null;
            }
            D6.w(button2);
        }
        Button button3 = jobCrmNotesListFragment.f129884t0;
        (button3 != null ? button3 : null).setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(jobCrmNotesListFragment, 14));
        return G0.f406611a;
    }
}
