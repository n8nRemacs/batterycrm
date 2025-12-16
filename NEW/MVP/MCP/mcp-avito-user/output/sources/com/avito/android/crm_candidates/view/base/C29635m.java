package com.avito.android.crm_candidates.view.base;

import Ts.InterfaceC15401a;
import android.os.Bundle;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29635m extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29635m(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
        super(2);
        this.f129925l = jobCrmCandidatesFragment;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (str.equals("FILTER_RESULT")) {
            JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129925l;
            jobCrmCandidatesFragment.getParentFragmentManager().g("FILTER_RESULT");
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("FILTER_ARG");
            if (parcelableArrayList != null) {
                JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                jobCrmCandidatesFragment.r5().accept(new InterfaceC15401a.C1085a(parcelableArrayList));
                jobCrmCandidatesFragment.t5();
            }
        }
        return G0.f406611a;
    }
}
