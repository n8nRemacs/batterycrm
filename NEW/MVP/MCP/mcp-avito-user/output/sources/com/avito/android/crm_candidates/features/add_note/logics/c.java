package com.avito.android.crm_candidates.features.add_note.logics;

import Ms.InterfaceC14524a;
import Ns.InterfaceC14606a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteState;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JobCrmAddNoteActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_candidates/features/add_note/logics/c;", "Lcom/avito/android/arch/mvi/a;", "LNs/a;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteState;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC14606a, JobCrmAddNoteInternalAction, JobCrmAddNoteState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14524a f129442a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f129443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f129444c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f129445d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f129446e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f129447f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f129448g;

    @Inject
    public c(@Y61.k InterfaceC14524a interfaceC14524a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k @Named("APPLICANT_ID") String str, @Y61.k @Named("APPLICATION_ID") String str2, @Y61.l @Named("VACANCY_ID") String str3, @Y61.l @Named("CV_ID") String str4) {
        this.f129442a = interfaceC14524a;
        this.f129443b = interfaceC28373a;
        this.f129444c = e12;
        this.f129445d = str;
        this.f129446e = str2;
        this.f129447f = str3;
        this.f129448g = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.crm_candidates.features.add_note.logics.c r8, kotlinx.coroutines.flow.InterfaceC43172j r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof com.avito.android.crm_candidates.features.add_note.logics.b
            if (r0 == 0) goto L16
            r0 = r11
            com.avito.android.crm_candidates.features.add_note.logics.b r0 = (com.avito.android.crm_candidates.features.add_note.logics.b) r0
            int r1 = r0.f129441v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f129441v = r1
            goto L1b
        L16:
            com.avito.android.crm_candidates.features.add_note.logics.b r0 = new com.avito.android.crm_candidates.features.add_note.logics.b
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f129439t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129441v
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L53
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            goto L3b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.C42729a0.b(r11)
            goto L9e
        L3f:
            java.lang.Object r8 = r0.f129436q
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            kotlin.C42729a0.b(r11)
            goto L80
        L47:
            java.lang.String r10 = r0.f129438s
            kotlinx.coroutines.flow.j r9 = r0.f129437r
            java.lang.Object r8 = r0.f129436q
            com.avito.android.crm_candidates.features.add_note.logics.c r8 = (com.avito.android.crm_candidates.features.add_note.logics.c) r8
            kotlin.C42729a0.b(r11)
            goto L6a
        L53:
            kotlin.C42729a0.b(r11)
            com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction$ShowLoading r11 = new com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction$ShowLoading
            r11.<init>()
            r0.f129436q = r8
            r0.f129437r = r9
            r0.f129438s = r10
            r0.f129441v = r6
            java.lang.Object r11 = r9.emit(r11, r0)
            if (r11 != r1) goto L6a
            goto Lba
        L6a:
            Ms.a r11 = r8.f129442a
            r0.f129436q = r9
            r0.f129437r = r7
            r0.f129438s = r7
            r0.f129441v = r5
            java.lang.String r2 = r8.f129445d
            java.lang.String r8 = r8.f129446e
            java.lang.Object r11 = r11.b(r2, r8, r10, r0)
            if (r11 != r1) goto L7f
            goto Lba
        L7f:
            r8 = r9
        L80:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r9 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto La1
            com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction$ChangesSaved r9 = new com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction$ChangesSaved
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r10 = r11.getResult()
            com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r10 = (com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem) r10
            r9.<init>(r10)
            r0.f129436q = r7
            r0.f129441v = r4
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L9e
            goto Lba
        L9e:
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lba
        La1:
            boolean r9 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L9e
            com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction$ShowError r9 = new com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction$ShowError
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r10 = r11.getError()
            r9.<init>(r10)
            r0.f129436q = r7
            r0.f129441v = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L9e
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.add_note.logics.c.c(com.avito.android.crm_candidates.features.add_note.logics.c, kotlinx.coroutines.flow.j, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<JobCrmAddNoteInternalAction> b(InterfaceC14606a interfaceC14606a, JobCrmAddNoteState jobCrmAddNoteState) {
        return C43175k.G(new a(interfaceC14606a, this, null));
    }
}
