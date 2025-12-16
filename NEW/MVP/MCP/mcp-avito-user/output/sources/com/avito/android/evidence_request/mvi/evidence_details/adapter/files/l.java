package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import android.animation.Animator;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35872q;
import kotlin.Metadata;

/* compiled from: FilesViewHolderProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/l;", "Lcom/avito/android/util/q$b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends C35872q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f148800a;

    public l(ProgressBar progressBar) {
        this.f148800a = progressBar;
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Y61.k Animator animator) {
        ProgressBar progressBar = this.f148800a;
        progressBar.setEmptyColor(C35835l0.d(R.attr.blue100, progressBar.getContext()));
        progressBar.setFillColor(C35835l0.d(R.attr.blue600, progressBar.getContext()));
    }
}
