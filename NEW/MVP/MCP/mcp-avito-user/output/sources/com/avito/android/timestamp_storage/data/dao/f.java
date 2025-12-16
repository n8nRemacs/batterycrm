package com.avito.android.timestamp_storage.data.dao;

import V1.g;
import Z1.c;
import Z1.i;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.compose.foundation.H;
import androidx.room.C0;
import androidx.room.C23481y;
import androidx.room.F0;
import androidx.room.L;
import androidx.room.O0;
import com.avito.android.timestamp_storage.data.database.TimestampDatabase_Impl;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import wE0.C49498a;
import wE0.C49499b;
import xE0.C49826a;

/* compiled from: TimestampDao_Impl.java */
/* loaded from: classes4.dex */
public final class f implements com.avito.android.timestamp_storage.data.dao.a {

    /* renamed from: a, reason: collision with root package name */
    public final TimestampDatabase_Impl f301458a;

    /* renamed from: b, reason: collision with root package name */
    public final L<C49826a> f301459b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f301460c;

    /* renamed from: d, reason: collision with root package name */
    public final O0 f301461d;

    /* compiled from: TimestampDao_Impl.java */
    public class a implements Callable<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C49826a f301462b;

        public a(C49826a c49826a) {
            this.f301462b = c49826a;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final Long call() {
            f fVar = f.this;
            TimestampDatabase_Impl timestampDatabase_Impl = fVar.f301458a;
            timestampDatabase_Impl.c();
            try {
                Long lValueOf = Long.valueOf(fVar.f301459b.f(this.f301462b));
                timestampDatabase_Impl.s();
                return lValueOf;
            } finally {
                timestampDatabase_Impl.l();
            }
        }
    }

    /* compiled from: TimestampDao_Impl.java */
    public class b implements Callable<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f301464b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f301465c;

        public b(String str, String str2) {
            this.f301464b = str;
            this.f301465c = str2;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final G0 call() {
            f fVar = f.this;
            O0 o02 = fVar.f301460c;
            TimestampDatabase_Impl timestampDatabase_Impl = fVar.f301458a;
            i iVarA = o02.a();
            iVarA.h4(1, this.f301464b);
            iVarA.h4(2, this.f301465c);
            try {
                timestampDatabase_Impl.c();
                try {
                    iVarA.B3();
                    timestampDatabase_Impl.s();
                    return G0.f406611a;
                } finally {
                    timestampDatabase_Impl.l();
                }
            } finally {
                o02.c(iVarA);
            }
        }
    }

    /* compiled from: TimestampDao_Impl.java */
    public class c implements Callable<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f301467b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f301468c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f301469d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f301470e;

        public c(long j12, Map map, String str, String str2) {
            this.f301467b = j12;
            this.f301468c = map;
            this.f301469d = str;
            this.f301470e = str2;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final G0 call() {
            f fVar = f.this;
            O0 o02 = fVar.f301461d;
            TimestampDatabase_Impl timestampDatabase_Impl = fVar.f301458a;
            i iVarA = o02.a();
            iVarA.g1(1, this.f301467b);
            int i12 = C49499b.f441336a;
            iVarA.h4(2, new com.google.gson.d().a().l(this.f301468c));
            iVarA.h4(3, this.f301469d);
            iVarA.h4(4, this.f301470e);
            try {
                timestampDatabase_Impl.c();
                try {
                    iVarA.B3();
                    timestampDatabase_Impl.s();
                    return G0.f406611a;
                } finally {
                    timestampDatabase_Impl.l();
                }
            } finally {
                o02.c(iVarA);
            }
        }
    }

    /* compiled from: TimestampDao_Impl.java */
    public class d implements Callable<C49826a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f301472b;

        public d(F0 f02) {
            this.f301472b = f02;
        }

        @Override // java.util.concurrent.Callable
        @P
        public final C49826a call() {
            C49826a c49826a;
            TimestampDatabase_Impl timestampDatabase_Impl = f.this.f301458a;
            F0 f02 = this.f301472b;
            Cursor cursorP = timestampDatabase_Impl.p(f02);
            try {
                int iB2 = V1.b.b(cursorP, "key");
                int iB3 = V1.b.b(cursorP, "uid");
                int iB4 = V1.b.b(cursorP, "timestamp");
                int iB5 = V1.b.b(cursorP, "inners");
                if (cursorP.moveToFirst()) {
                    String string = cursorP.getString(iB2);
                    String string2 = cursorP.getString(iB3);
                    long j12 = cursorP.getLong(iB4);
                    String string3 = cursorP.getString(iB5);
                    int i12 = C49499b.f441336a;
                    c49826a = new C49826a(j12, string, string2, (Map) new com.google.gson.d().a().e(string3, new C49498a().getType()));
                } else {
                    c49826a = null;
                }
                return c49826a;
            } finally {
                cursorP.close();
                f02.d();
            }
        }
    }

    /* compiled from: TimestampDao_Impl.java */
    public class e implements Callable<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f301474b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f301475c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f301476d;

        public e(Set set, String str, String str2) {
            this.f301474b = set;
            this.f301475c = str;
            this.f301476d = str2;
        }

        @Override // java.util.concurrent.Callable
        @N
        public final G0 call() {
            StringBuilder sbR = H.r("UPDATE timestamps SET inners = inners - ");
            Set set = this.f301474b;
            int size = set.size();
            g.a(size, sbR);
            sbR.append(" WHERE `key` = ");
            sbR.append("?");
            sbR.append(" AND uid = ");
            sbR.append("?");
            String string = sbR.toString();
            f fVar = f.this;
            i iVarE = fVar.f301458a.e(string);
            Iterator it = set.iterator();
            int i12 = 1;
            while (it.hasNext()) {
                iVarE.h4(i12, (String) it.next());
                i12++;
            }
            iVarE.h4(size + 1, this.f301475c);
            iVarE.h4(size + 2, this.f301476d);
            TimestampDatabase_Impl timestampDatabase_Impl = fVar.f301458a;
            timestampDatabase_Impl.c();
            try {
                iVarE.B3();
                timestampDatabase_Impl.s();
                return G0.f406611a;
            } finally {
                timestampDatabase_Impl.l();
            }
        }
    }

    public f(@N TimestampDatabase_Impl timestampDatabase_Impl) {
        this.f301458a = timestampDatabase_Impl;
        this.f301459b = new com.avito.android.timestamp_storage.data.dao.b(timestampDatabase_Impl);
        new com.avito.android.timestamp_storage.data.dao.c(timestampDatabase_Impl);
        this.f301460c = new com.avito.android.timestamp_storage.data.dao.d(timestampDatabase_Impl);
        this.f301461d = new com.avito.android.timestamp_storage.data.dao.e(timestampDatabase_Impl);
    }

    @Override // com.avito.android.timestamp_storage.data.dao.a
    public final Object a(C49826a c49826a, Continuation<? super Long> continuation) {
        return C23481y.c(this.f301458a, new a(c49826a), continuation);
    }

    @Override // com.avito.android.timestamp_storage.data.dao.a
    public final Object b(String str, String str2, Set<String> set, Continuation<? super G0> continuation) {
        return C23481y.c(this.f301458a, new e(set, str, str2), continuation);
    }

    @Override // com.avito.android.timestamp_storage.data.dao.a
    public final Object c(String str, String str2, long j12, Map<String, Long> map, Continuation<? super G0> continuation) {
        return C23481y.c(this.f301458a, new c(j12, map, str, str2), continuation);
    }

    @Override // com.avito.android.timestamp_storage.data.dao.a
    public final Object d(C49826a c49826a, Continuation<? super G0> continuation) {
        return C0.a(this.f301458a, new M11.c(1, this, c49826a), continuation);
    }

    @Override // com.avito.android.timestamp_storage.data.dao.a
    public final Object e(String str, String str2, Continuation<? super C49826a> continuation) {
        F0 f0C = F0.c(2, "SELECT * FROM timestamps WHERE `key` = ? AND uid = ?");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = c.a.f19817a;
        return C23481y.b(this.f301458a, new CancellationSignal(), new d(f0C), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.timestamp_storage.data.dao.a
    public final Object f(String str, String str2, Continuation<? super G0> continuation) {
        return C23481y.c(this.f301458a, new b(str, str2), continuation);
    }
}
