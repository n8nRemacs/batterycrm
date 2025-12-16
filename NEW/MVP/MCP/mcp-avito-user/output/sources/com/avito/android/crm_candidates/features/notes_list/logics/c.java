package com.avito.android.crm_candidates.features.notes_list.logics;

import com.avito.android.crm_candidates.view.list_items.notes_list.JobCrmNoteItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmNotesListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-candidates_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    @Y61.k
    public static final ArrayList a(@Y61.k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((JobCrmNoteItem) obj).f130167f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((JobCrmNoteItem) obj2).f130167f) {
                arrayList2.add(obj2);
            }
        }
        return C42745f0.h0(arrayList2, arrayList);
    }
}
