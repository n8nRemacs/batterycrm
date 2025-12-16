package com.avito.android.crm_candidates.view.base;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmCandidatesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.crm_candidates.view.base.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29633k extends kotlin.jvm.internal.N implements Y41.a<View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129923l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29633k(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
        super(0);
        this.f129923l = jobCrmCandidatesFragment;
    }

    @Override // Y41.a
    public final View invoke() {
        View viewFindViewById = this.f129923l.requireView().findViewById(R.id.content_container);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }
}
