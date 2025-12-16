package com.yandex.android.beacon;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.android.beacon.a;
import com.yandex.android.beacon.c;
import com.yandex.div.internal.util.n;
import j.l0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SendBeaconWorkerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/android/beacon/k;", "Lcom/yandex/android/beacon/i;", "a", "b", "c", "d", "e", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f367226e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f367227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.android.beacon.b f367228b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f367229c = new e();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f367230d = new b();

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/android/beacon/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/android/beacon/k$b;", "", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @l0
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C f367231a;

        /* compiled from: SendBeaconWorkerImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/android/beacon/k$d;", "Lcom/yandex/android/beacon/k;", "invoke", "()Lcom/yandex/android/beacon/k$d;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends N implements Y41.a<d> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ k f367233l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(0);
                this.f367233l = kVar;
            }

            @Override // Y41.a
            public final d invoke() {
                k kVar = this.f367233l;
                return kVar.new d(kVar.f367227a);
            }
        }

        public b() {
            this.f367231a = C42727D.c(new a(k.this));
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/android/beacon/k$c;", "", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/android/beacon/k$d;", "", "Lcom/yandex/android/beacon/a;", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @l0
    public final class d implements Iterable<com.yandex.android.beacon.a>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.yandex.android.beacon.c f367234b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayDeque f367235c;

        /* compiled from: SendBeaconWorkerImpl.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/yandex/android/beacon/k$d$a", "", "Lcom/yandex/android/beacon/a;", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements Iterator<com.yandex.android.beacon.a>, Z41.d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public com.yandex.android.beacon.a f367237b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator<com.yandex.android.beacon.a> f367238c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d f367239d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends com.yandex.android.beacon.a> it, d dVar) {
                this.f367238c = it;
                this.f367239d = dVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f367238c.hasNext();
            }

            @Override // java.util.Iterator
            public final com.yandex.android.beacon.a next() {
                com.yandex.android.beacon.a next = this.f367238c.next();
                this.f367237b = next;
                return next;
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f367238c.remove();
                d dVar = this.f367239d;
                com.yandex.android.beacon.a aVar = this.f367237b;
                a.b bVarA = aVar == null ? null : aVar.a();
                com.yandex.android.beacon.c cVar = dVar.f367234b;
                if (bVarA == null) {
                    cVar.getClass();
                } else {
                    SQLiteDatabase writableDatabase = cVar.getWritableDatabase();
                    try {
                        writableDatabase.delete("items", "_id = ?", new String[]{String.valueOf(bVarA.f367216d)});
                        kotlin.io.c.a(writableDatabase, null);
                    } finally {
                    }
                }
                dVar.b();
            }
        }

        /* JADX WARN: Finally extract failed */
        public d(@Y61.k Context context) {
            ((c.a) com.yandex.android.beacon.c.f367218c).getClass();
            Cursor cursorQuery = null;
            com.yandex.android.beacon.c cVar = new com.yandex.android.beacon.c(context, null, null, 2);
            boolean z12 = context instanceof Application;
            this.f367234b = cVar;
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase readableDatabase = cVar.getReadableDatabase();
            try {
                cursorQuery = readableDatabase.query("items", com.yandex.android.beacon.c.f367217b, null, null, null, null, null, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(com.yandex.android.beacon.c.a(cursorQuery));
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                ArrayDeque arrayDeque = new ArrayDeque(arrayList);
                this.f367235c = arrayDeque;
                L.j(Integer.valueOf(arrayDeque.size()), "Reading from database, items count: ");
                b();
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                throw th2;
            }
        }

        public final void b() {
            this.f367235c.isEmpty();
            int i12 = k.f367226e;
            k.this.getClass();
        }

        @Override // java.lang.Iterable
        @Y61.k
        public final Iterator<com.yandex.android.beacon.a> iterator() {
            return new a(this.f367235c.iterator(), this);
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/android/beacon/k$e;", "Lcom/yandex/div/internal/util/n;", "beacon_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e extends n {
    }

    static {
        new a(null);
        TimeUnit.DAYS.toMillis(1L);
    }

    public k(@Y61.k Context context, @Y61.k com.yandex.android.beacon.b bVar) {
        this.f367227a = context;
        this.f367228b = bVar;
        new AtomicReference(null);
    }
}
