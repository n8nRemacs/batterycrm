package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
class t extends com.google.android.play.core.appupdate.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.appupdate.internal.s f358074a;

    /* renamed from: b, reason: collision with root package name */
    public final C37028k f358075b;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w f358076p;

    public t(w wVar, com.google.android.play.core.appupdate.internal.s sVar, C37028k c37028k) {
        this.f358076p = wVar;
        this.f358074a = sVar;
        this.f358075b = c37028k;
    }

    @Override // com.google.android.play.core.appupdate.internal.n
    public void k(Bundle bundle) {
        this.f358076p.f358080a.d(this.f358075b);
        this.f358074a.c("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.appupdate.internal.n
    public void l(Bundle bundle) {
        this.f358076p.f358080a.d(this.f358075b);
        this.f358074a.c("onCompleteUpdate", new Object[0]);
    }
}
