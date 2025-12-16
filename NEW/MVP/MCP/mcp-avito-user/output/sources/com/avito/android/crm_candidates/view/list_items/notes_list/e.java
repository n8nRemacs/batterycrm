package com.avito.android.crm_candidates.view.list_items.notes_list;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: JobCrmNotePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/notes_list/e;", "Lcom/avito/android/crm_candidates/view/list_items/notes_list/c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JobCrmNoteItem, G0> f130174b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super JobCrmNoteItem, G0> lVar) {
        this.f130174b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        JobCrmNoteItem jobCrmNoteItem = (JobCrmNoteItem) aVar;
        gVar.J(jobCrmNoteItem.f130164c);
        gVar.b0(jobCrmNoteItem.f130165d);
        gVar.setText(jobCrmNoteItem.f130166e);
        boolean z12 = jobCrmNoteItem.f130167f;
        gVar.zU(z12);
        d dVar = new d(this, jobCrmNoteItem);
        if (!z12) {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = null;
        }
        gVar.QU(dVar);
    }
}
