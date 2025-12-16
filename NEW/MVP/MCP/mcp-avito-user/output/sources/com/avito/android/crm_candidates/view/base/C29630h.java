package com.avito.android.crm_candidates.view.base;

import android.view.View;
import com.avito.android.R;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29630h extends kotlin.jvm.internal.N implements Y41.l<JobCrmAddNoteState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmAddNoteFragment f129920l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29630h(JobCrmAddNoteFragment jobCrmAddNoteFragment) {
        super(1);
        this.f129920l = jobCrmAddNoteFragment;
    }

    @Override // Y41.l
    public final G0 invoke(JobCrmAddNoteState jobCrmAddNoteState) {
        JobCrmAddNoteState jobCrmAddNoteState2 = jobCrmAddNoteState;
        JobCrmAddNoteFragment jobCrmAddNoteFragment = this.f129920l;
        NavBar navBar = jobCrmAddNoteFragment.f129776n0;
        if (navBar == null) {
            navBar = null;
        }
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new C29628f(jobCrmAddNoteFragment), false, jobCrmAddNoteFragment.getResources().getString(R.string.crm_note_add_title), null, Collections.singletonList(new a.c(com.avito.android.printable_text.b.f(jobCrmAddNoteFragment.getResources().getString(R.string.crm_remove)), 0, 0, 6, null)), new C29629g(jobCrmAddNoteFragment), 21, null));
        Button button = jobCrmAddNoteFragment.f129779q0;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(jobCrmAddNoteFragment, 13));
        boolean z12 = jobCrmAddNoteState2.f129430b;
        if (z12) {
            Button button2 = jobCrmAddNoteFragment.f129779q0;
            if (button2 == null) {
                button2 = null;
            }
            D6.k(button2);
        } else if (!z12) {
            Button button3 = jobCrmAddNoteFragment.f129779q0;
            if (button3 == null) {
                button3 = null;
            }
            D6.h(button3);
        }
        boolean z13 = jobCrmAddNoteState2.f129431c;
        if (z13) {
            View view = jobCrmAddNoteFragment.f129780r0;
            D6.H(view != null ? view : null);
        } else if (!z13) {
            View view2 = jobCrmAddNoteFragment.f129780r0;
            D6.w(view2 != null ? view2 : null);
        }
        return G0.f406611a;
    }
}
