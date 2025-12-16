package com.google.android.play.core.review;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import com.google.android.play.core.review.internal.t;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
class g extends com.google.android.play.core.review.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.review.internal.i f358612a;

    /* renamed from: b, reason: collision with root package name */
    public final C37028k f358613b;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f358614p;

    public g(i iVar, com.google.android.play.core.review.internal.i iVar2, C37028k c37028k) {
        this.f358614p = iVar;
        this.f358612a = iVar2;
        this.f358613b = c37028k;
    }

    @Override // com.google.android.play.core.review.internal.h
    public void l(Bundle bundle) {
        t tVar = this.f358614p.f358616a;
        if (tVar != null) {
            tVar.c(this.f358613b);
        }
        this.f358612a.a("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
