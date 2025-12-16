package com.avito.android.rating_persistence.llm_summary;

import androidx.room.O0;
import com.avito.android.rating_persistence.RatingDatabase_Impl;
import j.N;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: RatingLLMSummaryDao_Impl.java */
/* loaded from: classes16.dex */
class e implements Callable<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f249802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f249803c;

    public e(f fVar, long j12) {
        this.f249803c = fVar;
        this.f249802b = j12;
    }

    @Override // java.util.concurrent.Callable
    @N
    public final G0 call() {
        f fVar = this.f249803c;
        O0 o02 = fVar.f249806c;
        RatingDatabase_Impl ratingDatabase_Impl = fVar.f249804a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, this.f249802b);
        try {
            ratingDatabase_Impl.c();
            try {
                iVarA.B3();
                ratingDatabase_Impl.s();
                return G0.f406611a;
            } finally {
                ratingDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }
}
