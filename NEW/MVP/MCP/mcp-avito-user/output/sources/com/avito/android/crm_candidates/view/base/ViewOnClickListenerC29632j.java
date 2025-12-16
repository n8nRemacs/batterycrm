package com.avito.android.crm_candidates.view.base;

import Ps.InterfaceC14833a;
import Ts.InterfaceC15401a;
import android.view.View;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.crm_candidates.view.base.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC29632j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129922c;

    public /* synthetic */ ViewOnClickListenerC29632j(JobCrmCandidatesFragment jobCrmCandidatesFragment, int i12) {
        this.f129921b = i12;
        this.f129922c = jobCrmCandidatesFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129922c;
        switch (this.f129921b) {
            case 0:
                JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                jobCrmCandidatesFragment.requireActivity().getF21241d().c();
                break;
            case 1:
                JobCrmCandidatesFragment.a aVar2 = JobCrmCandidatesFragment.f129791O0;
                jobCrmCandidatesFragment.r5().accept(InterfaceC15401a.b.f15956a);
                jobCrmCandidatesFragment.s5().accept(InterfaceC14833a.l.f13356a);
                break;
            default:
                JobCrmCandidatesFragment.a aVar3 = JobCrmCandidatesFragment.f129791O0;
                jobCrmCandidatesFragment.s5().accept(InterfaceC14833a.l.f13356a);
                break;
        }
    }
}
