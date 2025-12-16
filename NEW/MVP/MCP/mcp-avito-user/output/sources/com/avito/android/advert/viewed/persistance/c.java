package com.avito.android.advert.viewed.persistance;

import Z1.c;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C23481y;
import androidx.room.F0;
import androidx.room.L;
import androidx.room.O0;
import j.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ViewedAdvertsDao_Impl.java */
/* loaded from: classes10.dex */
public final class c implements com.avito.android.advert.viewed.persistance.b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewedAdvertsDb_Impl f81036a;

    /* renamed from: b, reason: collision with root package name */
    public final L<com.avito.android.advert.viewed.persistance.a> f81037b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f81038c;

    /* compiled from: ViewedAdvertsDao_Impl.java */
    public class a implements Callable<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f81039b;

        public a(F0 f02) {
            this.f81039b = f02;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final Long call() {
            ViewedAdvertsDb_Impl viewedAdvertsDb_Impl = c.this.f81036a;
            F0 f02 = this.f81039b;
            Cursor cursorP = viewedAdvertsDb_Impl.p(f02);
            try {
                long jValueOf = cursorP.moveToFirst() ? Long.valueOf(cursorP.getLong(0)) : 0L;
                cursorP.close();
                f02.d();
                return jValueOf;
            } catch (Throwable th2) {
                cursorP.close();
                f02.d();
                throw th2;
            }
        }
    }

    /* compiled from: ViewedAdvertsDao_Impl.java */
    public class b implements Callable<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.advert.viewed.persistance.a f81041b;

        public b(com.avito.android.advert.viewed.persistance.a aVar) {
            this.f81041b = aVar;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final G0 call() {
            c cVar = c.this;
            ViewedAdvertsDb_Impl viewedAdvertsDb_Impl = cVar.f81036a;
            viewedAdvertsDb_Impl.c();
            try {
                cVar.f81037b.e(this.f81041b);
                viewedAdvertsDb_Impl.s();
                return G0.f406611a;
            } finally {
                viewedAdvertsDb_Impl.l();
            }
        }
    }

    /* compiled from: ViewedAdvertsDao_Impl.java */
    /* renamed from: com.avito.android.advert.viewed.persistance.c$c, reason: collision with other inner class name */
    public class CallableC2403c implements Callable<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f81043b;

        public CallableC2403c(List list) {
            this.f81043b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        @N
        public final G0 call() {
            c cVar = c.this;
            ViewedAdvertsDb_Impl viewedAdvertsDb_Impl = cVar.f81036a;
            viewedAdvertsDb_Impl.c();
            try {
                L<com.avito.android.advert.viewed.persistance.a> l12 = cVar.f81037b;
                List list = this.f81043b;
                Z1.i iVarA = l12.a();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        l12.d(iVarA, it.next());
                        iVarA.E2();
                    }
                    l12.c(iVarA);
                    viewedAdvertsDb_Impl.s();
                    return G0.f406611a;
                } catch (Throwable th2) {
                    l12.c(iVarA);
                    throw th2;
                }
            } finally {
                viewedAdvertsDb_Impl.l();
            }
        }
    }

    /* compiled from: ViewedAdvertsDao_Impl.java */
    public class d implements Callable<List<String>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f81045b;

        public d(F0 f02) {
            this.f81045b = f02;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final List<String> call() {
            Cursor cursorP = c.this.f81036a.p(this.f81045b);
            try {
                ArrayList arrayList = new ArrayList(cursorP.getCount());
                while (cursorP.moveToNext()) {
                    arrayList.add(cursorP.getString(0));
                }
                return arrayList;
            } finally {
                cursorP.close();
            }
        }

        public final void finalize() {
            this.f81045b.d();
        }
    }

    public c(@N ViewedAdvertsDb_Impl viewedAdvertsDb_Impl) {
        this.f81036a = viewedAdvertsDb_Impl;
        this.f81037b = new com.avito.android.advert.viewed.persistance.d(viewedAdvertsDb_Impl);
        this.f81038c = new e(viewedAdvertsDb_Impl);
    }

    @Override // com.avito.android.advert.viewed.persistance.b
    public final Object a(Continuation continuation) {
        return C23481y.c(this.f81036a, new f(this), continuation);
    }

    @Override // com.avito.android.advert.viewed.persistance.b
    public final InterfaceC43160i<List<String>> b() {
        d dVar = new d(F0.c(0, "SELECT advert_string_id FROM viewed_adverts"));
        return C23481y.a(this.f81036a, new String[]{"viewed_adverts"}, dVar);
    }

    @Override // com.avito.android.advert.viewed.persistance.b
    public final Object c(List<com.avito.android.advert.viewed.persistance.a> list, Continuation<? super G0> continuation) {
        return C23481y.c(this.f81036a, new CallableC2403c(list), continuation);
    }

    @Override // com.avito.android.advert.viewed.persistance.b
    public final InterfaceC43160i d() {
        F0 f0C = F0.c(1, "SELECT advert_string_id, add_time FROM viewed_adverts ORDER BY add_time DESC LIMIT ?");
        f0C.g1(1, 50);
        return C23481y.a(this.f81036a, new String[]{"viewed_adverts"}, new i(this, f0C));
    }

    @Override // com.avito.android.advert.viewed.persistance.b
    public final Object e(com.avito.android.advert.viewed.persistance.a aVar, Continuation<? super G0> continuation) {
        return C23481y.c(this.f81036a, new b(aVar), continuation);
    }

    @Override // com.avito.android.advert.viewed.persistance.b
    public final Object f(Continuation<? super Long> continuation) {
        F0 f0C = F0.c(0, "SELECT MAX(add_time) FROM viewed_adverts");
        int i12 = c.a.f19817a;
        return C23481y.b(this.f81036a, new CancellationSignal(), new a(f0C), (ContinuationImpl) continuation);
    }
}
