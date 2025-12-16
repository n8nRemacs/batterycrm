package com.avito.android.crm_candidates.view.base;

import Ns.InterfaceC14606a;
import com.avito.android.crm_candidates.view.base.JobCrmAddNoteFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29626d extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmAddNoteFragment f129916l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29626d(JobCrmAddNoteFragment jobCrmAddNoteFragment) {
        super(1);
        this.f129916l = jobCrmAddNoteFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        JobCrmAddNoteFragment.a aVar = JobCrmAddNoteFragment.f129775v0;
        ((com.avito.android.crm_candidates.features.add_note.logics.n) this.f129916l.f129782t0.getValue()).accept(new InterfaceC14606a.b(str));
        return G0.f406611a;
    }
}
