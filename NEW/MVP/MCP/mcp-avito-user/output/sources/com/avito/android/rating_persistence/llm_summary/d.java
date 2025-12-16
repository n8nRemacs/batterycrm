package com.avito.android.rating_persistence.llm_summary;

import com.avito.android.rating_persistence.RatingDatabase_Impl;
import j.N;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: RatingLLMSummaryDao_Impl.java */
/* loaded from: classes16.dex */
class d implements Callable<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f249800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f249801c;

    public d(f fVar, g gVar) {
        this.f249801c = fVar;
        this.f249800b = gVar;
    }

    @Override // java.util.concurrent.Callable
    @N
    public final G0 call() {
        f fVar = this.f249801c;
        RatingDatabase_Impl ratingDatabase_Impl = fVar.f249804a;
        ratingDatabase_Impl.c();
        try {
            fVar.f249805b.e(this.f249800b);
            ratingDatabase_Impl.s();
            return G0.f406611a;
        } finally {
            ratingDatabase_Impl.l();
        }
    }
}
