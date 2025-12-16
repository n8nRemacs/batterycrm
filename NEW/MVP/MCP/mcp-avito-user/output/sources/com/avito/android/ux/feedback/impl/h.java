package com.avito.android.ux.feedback.impl;

import SK0.b;
import kotlin.Metadata;

/* compiled from: AvitoUxFeedbackRxDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f319154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SK0.c f319155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.b<x> f319156d;

    public h(j jVar, SK0.c cVar, io.reactivex.rxjava3.subjects.b<x> bVar) {
        this.f319154b = jVar;
        this.f319155c = cVar;
        this.f319156d = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        io.reactivex.rxjava3.subjects.b<x> bVar = this.f319156d;
        SK0.c cVar = this.f319155c;
        b.a.a(this.f319154b.f319158a, cVar, null, null, new g(cVar, bVar), 6);
    }
}
