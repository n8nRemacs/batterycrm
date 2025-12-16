package com.avito.android.rating_persistence.aspects;

import Z1.c;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C23481y;
import androidx.room.F0;
import androidx.room.L;
import com.avito.android.rating_persistence.RatingDatabase_Impl;
import j.N;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RatingAspectsDao_Impl.java */
/* loaded from: classes16.dex */
public final class c implements com.avito.android.rating_persistence.aspects.a {

    /* renamed from: a, reason: collision with root package name */
    public final RatingDatabase_Impl f249783a;

    /* renamed from: b, reason: collision with root package name */
    public final L<d> f249784b;

    /* compiled from: RatingAspectsDao_Impl.java */
    public class a implements Callable<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f249785b;

        public a(d dVar) {
            this.f249785b = dVar;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final G0 call() {
            c cVar = c.this;
            RatingDatabase_Impl ratingDatabase_Impl = cVar.f249783a;
            ratingDatabase_Impl.c();
            try {
                cVar.f249784b.e(this.f249785b);
                ratingDatabase_Impl.s();
                return G0.f406611a;
            } finally {
                ratingDatabase_Impl.l();
            }
        }
    }

    /* compiled from: RatingAspectsDao_Impl.java */
    public class b implements Callable<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f249787b;

        public b(F0 f02) {
            this.f249787b = f02;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final Boolean call() {
            Boolean boolValueOf;
            RatingDatabase_Impl ratingDatabase_Impl = c.this.f249783a;
            F0 f02 = this.f249787b;
            Cursor cursorP = ratingDatabase_Impl.p(f02);
            try {
                if (cursorP.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorP.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                cursorP.close();
                f02.d();
                return boolValueOf;
            } catch (Throwable th2) {
                cursorP.close();
                f02.d();
                throw th2;
            }
        }
    }

    public c(@N RatingDatabase_Impl ratingDatabase_Impl) {
        this.f249783a = ratingDatabase_Impl;
        this.f249784b = new com.avito.android.rating_persistence.aspects.b(ratingDatabase_Impl);
    }

    @Override // com.avito.android.rating_persistence.aspects.a
    public final Object a(String str, Continuation<? super Boolean> continuation) {
        F0 f0C = F0.c(1, "SELECT EXISTS(SELECT 1 FROM rating_aspects WHERE aspect_key = ?)");
        f0C.h4(1, str);
        int i12 = c.a.f19817a;
        return C23481y.b(this.f249783a, new CancellationSignal(), new b(f0C), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.rating_persistence.aspects.a
    public final Object b(d dVar, Continuation<? super G0> continuation) {
        return C23481y.c(this.f249783a, new a(dVar), continuation);
    }
}
