package com.avito.android.rating_persistence.llm_summary;

import Z1.c;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C23481y;
import androidx.room.F0;
import androidx.room.L;
import androidx.room.O0;
import com.avito.android.rating_persistence.RatingDatabase_Impl;
import j.N;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingLLMSummaryDao_Impl.java */
/* loaded from: classes16.dex */
public final class f implements com.avito.android.rating_persistence.llm_summary.a {

    /* renamed from: a, reason: collision with root package name */
    public final RatingDatabase_Impl f249804a;

    /* renamed from: b, reason: collision with root package name */
    public final L<g> f249805b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f249806c;

    /* compiled from: RatingLLMSummaryDao_Impl.java */
    public class a implements Callable<List<g>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f249807b;

        public a(F0 f02) {
            this.f249807b = f02;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final List<g> call() {
            RatingDatabase_Impl ratingDatabase_Impl = f.this.f249804a;
            F0 f02 = this.f249807b;
            Cursor cursorP = ratingDatabase_Impl.p(f02);
            try {
                int iB2 = V1.b.b(cursorP, "summary_key");
                int iB3 = V1.b.b(cursorP, "feedback_sending_timestamp");
                ArrayList arrayList = new ArrayList(cursorP.getCount());
                while (cursorP.moveToNext()) {
                    arrayList.add(new g(cursorP.getString(iB2), cursorP.getLong(iB3)));
                }
                return arrayList;
            } finally {
                cursorP.close();
                f02.d();
            }
        }
    }

    /* compiled from: RatingLLMSummaryDao_Impl.java */
    public class b implements Callable<List<g>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f249809b;

        public b(F0 f02) {
            this.f249809b = f02;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final List<g> call() {
            Cursor cursorP = f.this.f249804a.p(this.f249809b);
            try {
                int iB2 = V1.b.b(cursorP, "summary_key");
                int iB3 = V1.b.b(cursorP, "feedback_sending_timestamp");
                ArrayList arrayList = new ArrayList(cursorP.getCount());
                while (cursorP.moveToNext()) {
                    arrayList.add(new g(cursorP.getString(iB2), cursorP.getLong(iB3)));
                }
                return arrayList;
            } finally {
                cursorP.close();
            }
        }

        public final void finalize() {
            this.f249809b.d();
        }
    }

    public f(@N RatingDatabase_Impl ratingDatabase_Impl) {
        this.f249804a = ratingDatabase_Impl;
        this.f249805b = new com.avito.android.rating_persistence.llm_summary.b(ratingDatabase_Impl);
        this.f249806c = new c(ratingDatabase_Impl);
    }

    @Override // com.avito.android.rating_persistence.llm_summary.a
    public final Object a(long j12, ContinuationImpl continuationImpl) {
        return C23481y.c(this.f249804a, new e(this, j12), continuationImpl);
    }

    @Override // com.avito.android.rating_persistence.llm_summary.a
    public final InterfaceC43160i<List<g>> b(String str) {
        F0 f0C = F0.c(1, "SELECT * FROM rating_llm_summary WHERE summary_key = ?");
        f0C.h4(1, str);
        b bVar = new b(f0C);
        return C23481y.a(this.f249804a, new String[]{"rating_llm_summary"}, bVar);
    }

    @Override // com.avito.android.rating_persistence.llm_summary.a
    public final Object c(String str, Continuation<? super List<g>> continuation) {
        F0 f0C = F0.c(1, "SELECT * FROM rating_llm_summary WHERE summary_key = ?");
        f0C.h4(1, str);
        int i12 = c.a.f19817a;
        return C23481y.b(this.f249804a, new CancellationSignal(), new a(f0C), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.rating_persistence.llm_summary.a
    public final Object d(g gVar, SuspendLambda suspendLambda) {
        return C23481y.c(this.f249804a, new d(this, gVar), suspendLambda);
    }
}
