package com.avito.android.crm_candidates.view.base;

import Ws.InterfaceC15795b;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.crm_candidates.view.base.JobCrmAddNoteFragment;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmNotesListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWs/b;", "event", "Lkotlin/G0;", "invoke", "(LWs/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<InterfaceC15795b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmNotesListFragment f129900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(JobCrmNotesListFragment jobCrmNotesListFragment) {
        super(1);
        this.f129900l = jobCrmNotesListFragment;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC15795b interfaceC15795b) throws Resources.NotFoundException {
        InterfaceC15795b interfaceC15795b2 = interfaceC15795b;
        if (interfaceC15795b2 instanceof InterfaceC15795b.a) {
            JobCrmNotesListFragment jobCrmNotesListFragment = this.f129900l;
            androidx.fragment.app.H hE2 = jobCrmNotesListFragment.getParentFragmentManager().e();
            hE2.c("JobCrmNotesListFragment");
            JobCrmAddNoteFragment.a aVar = JobCrmAddNoteFragment.f129775v0;
            InterfaceC15795b.a aVar2 = (InterfaceC15795b.a) interfaceC15795b2;
            Resources resources = jobCrmNotesListFragment.getResources();
            String str = aVar2.f18073a;
            String string = resources.getString(str == null ? R.string.crm_create : R.string.crm_save);
            if (str == null) {
                str = "";
            }
            aVar.getClass();
            JobCrmAddNoteFragment jobCrmAddNoteFragment = new JobCrmAddNoteFragment();
            C35966w1.a(jobCrmAddNoteFragment, -1, new C29625c(aVar2.f18074b, string, str, aVar2.f18075c, aVar2.f18076d, aVar2.f18077e, aVar2.f18078f));
            hE2.n(R.id.fragment_container, jobCrmAddNoteFragment, null);
            hE2.e();
        }
        return G0.f406611a;
    }
}
