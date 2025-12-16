package com.avito.android.crm_candidates.view.base;

import android.os.Bundle;
import com.avito.android.crm_candidates.view.list_items.notes_list.JobCrmNoteItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmNotesListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class M extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f129894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f129895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f129896n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f129897o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f129898p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f129899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(List<JobCrmNoteItem> list, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.f129894l = list;
        this.f129895m = str;
        this.f129896n = str2;
        this.f129897o = str3;
        this.f129898p = str4;
        this.f129899q = str5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        com.avito.android.util.G.e("job_crm_notes_arg", bundle2, this.f129894l);
        bundle2.putString("ARG_CANDIDATE_NAME", this.f129895m);
        bundle2.putString("ARG_APPLICANT_ID", this.f129896n);
        bundle2.putString("ARG_APPLICATION_ID", this.f129897o);
        bundle2.putString("ARG_VACANCY_ID", this.f129898p);
        bundle2.putString("ARG_CV_ID", this.f129899q);
        return G0.f406611a;
    }
}
