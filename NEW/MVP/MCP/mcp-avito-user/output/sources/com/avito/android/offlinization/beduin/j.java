package com.avito.android.offlinization.beduin;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.avito.android.offlinization.memory.OutOfDiskException;
import com.jakewharton.disklrucache.a;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okio.M;
import okio.X;
import p40.InterfaceC46890a;

/* compiled from: BeduinPatternCacheStorageImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/beduin/j;", "Lcom/avito/android/offlinization/beduin/i;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f208555a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46890a f208556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, com.jakewharton.disklrucache.a> f208557c = new ConcurrentHashMap<>();

    /* compiled from: BeduinPatternCacheStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/offlinization/beduin/j$a;", "", "<init>", "()V", "", "DIRECTORY_NAME", "Ljava/lang/String;", "", "ENTRY_PATTERN", "I", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinPatternCacheStorageImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            kotlin.io.j.c(j.this.f208555a.f208563a);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k p pVar, @Y61.k InterfaceC46890a interfaceC46890a) {
        this.f208555a = pVar;
        this.f208556b = interfaceC46890a;
    }

    @Override // com.avito.android.offlinization.beduin.i
    @Y61.k
    public final synchronized List<String> a(@Y61.k String str) {
        List<String> arrayList;
        try {
            String[] list = d(str).f364061b.list();
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list) {
                    if (!L.f(str2, "journal.tmp") && !L.f(str2, "journal.bkp") && !L.f(str2, "journal")) {
                        arrayList2.add(str2);
                    }
                }
                arrayList = new ArrayList<>(C42745f0.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C43066x.y(2, (String) it.next()));
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // com.avito.android.offlinization.beduin.i
    @Y61.l
    public final synchronized String b(@Y61.k String str, @Y61.k String str2) {
        a.e eVarD;
        InputStream inputStream;
        eVarD = d(str).d(str2.toLowerCase(Locale.ROOT));
        return (eVarD == null || (inputStream = eVarD.f364087b[0]) == null) ? null : this.f208556b.b(kotlin.io.b.c(inputStream));
    }

    @Override // com.avito.android.offlinization.beduin.i
    public final synchronized void c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        a.c cVarC;
        try {
            cVarC = d(str).c(str2.toLowerCase(Locale.ROOT));
        } catch (IOException e12) {
            try {
                new k(null).invoke();
            } catch (IOException unused) {
            }
            if (((ErrnoException) e12.getCause()).errno == OsConstants.ENOSPC) {
                throw new OutOfDiskException(e12);
            }
        }
        if (cVarC == null) {
            return;
        }
        X x12 = new X(M.c(cVarC.c(0)));
        this.f208556b.a(x12, str3);
        x12.flush();
        cVarC.b();
    }

    @Override // com.avito.android.offlinization.beduin.i
    public final synchronized void clear() {
        try {
            Iterator<Map.Entry<String, com.jakewharton.disklrucache.a>> it = this.f208557c.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().close();
            }
            this.f208557c.clear();
            try {
                new b().invoke();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.jakewharton.disklrucache.a d(java.lang.String r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.jakewharton.disklrucache.a> r0 = r5.f208557c
            java.lang.Object r0 = r0.get(r6)
            com.jakewharton.disklrucache.a r0 = (com.jakewharton.disklrucache.a) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            monitor-enter(r0)
            java.io.BufferedWriter r3 = r0.f364069j     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            monitor-exit(r0)
            if (r3 == 0) goto L32
            goto L1b
        L18:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r6
        L1b:
            monitor-enter(r5)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L33
            com.avito.android.offlinization.beduin.p r3 = r5.f208555a     // Catch: java.lang.Throwable -> L33
            java.io.File r3 = r3.f208563a     // Catch: java.lang.Throwable -> L33
            r0.<init>(r3, r6)     // Catch: java.lang.Throwable -> L33
            r3 = 524288(0x80000, double:2.590327E-318)
            com.jakewharton.disklrucache.a r0 = com.jakewharton.disklrucache.a.g(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.jakewharton.disklrucache.a> r1 = r5.f208557c     // Catch: java.lang.Throwable -> L33
            r1.put(r6, r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
        L32:
            return r0
        L33:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.offlinization.beduin.j.d(java.lang.String):com.jakewharton.disklrucache.a");
    }
}
