package com.avito.android.ux.feedback.impl;

import com.avito.android.util.V2;
import com.avito.android.ux.feedback.impl.x;
import kotlin.Metadata;

/* compiled from: AvitoUxFeedbackRxDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ux/feedback/impl/g;", "LSK0/d;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements SK0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SK0.c f319152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.b<x> f319153c;

    public g(SK0.c cVar, io.reactivex.rxjava3.subjects.b<x> bVar) {
        this.f319152b = cVar;
        this.f319153c = bVar;
    }

    @Override // SK0.d
    public final void Od(@Y61.k String str) {
        V2.f318762a.c("UXFeedback", "Terminated: " + this.f319152b.getF278399a(), null);
        this.f319153c.onNext(x.e.f319187a);
    }

    @Override // SK0.d
    public final void W2(@Y61.k String str) {
        V2.f318762a.c("UXFeedback", "No campaign to start: " + this.f319152b.getF278399a(), null);
        this.f319153c.onNext(x.c.f319185a);
    }

    @Override // SK0.d
    public final void ha(@Y61.k String str) {
        V2.f318762a.c("UXFeedback", "Finished: " + this.f319152b.getF278399a(), null);
        this.f319153c.onNext(x.b.f319184a);
    }

    @Override // SK0.d
    public final void v5(@Y61.k String str) {
        V2.f318762a.c("UXFeedback", "Started: " + this.f319152b.getF278399a(), null);
        this.f319153c.onNext(x.d.f319186a);
    }
}
