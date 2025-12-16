package com.avito.android.offlinization.cache.lru;

import Y61.k;
import Y61.l;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.avito.android.I1;
import com.avito.android.offlinization.memory.OutOfDiskException;
import com.jakewharton.disklrucache.a;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.Util;
import okio.AbstractC44815z;
import okio.M;
import okio.Y;
import okio.Y.a;
import okio.c0;
import okio.e0;
import r40.C47487a;
import r40.C47490d;
import r40.h;
import r40.i;
import x40.C49761a;

/* compiled from: OfflineInnerCacheLruImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/cache/lru/a;", "Lr40/h;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f208564e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C47487a f208565a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.zstd.e f208566b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final I1 f208567c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public com.jakewharton.disklrucache.a f208568d;

    /* compiled from: OfflineInnerCacheLruImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/offlinization/cache/lru/a$a;", "", "<init>", "()V", "", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "", "ZSTD_ENCODING", "Ljava/lang/String;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.offlinization.cache.lru.a$a, reason: collision with other inner class name */
    public static final class C6220a {
        public /* synthetic */ C6220a(C42822w c42822w) {
            this();
        }

        public C6220a() {
        }
    }

    /* compiled from: OfflineInnerCacheLruImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/offlinization/cache/lru/a$b", "Lokio/z;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC44815z {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a.e f208569g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, a.e eVar) {
            super(e0Var);
            this.f208569g = eVar;
        }

        @Override // okio.AbstractC44815z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f208569g.close();
            super.close();
        }
    }

    /* compiled from: OfflineInnerCacheLruImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f208571m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f208571m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f208568d.m(this.f208571m);
            return G0.f406611a;
        }
    }

    static {
        new C6220a(null);
    }

    public a(@k C47487a c47487a, @k com.avito.android.zstd.e eVar, @k I1 i12) {
        this.f208565a = c47487a;
        this.f208566b = eVar;
        this.f208567c = i12;
        this.f208568d = com.jakewharton.disklrucache.a.g(c47487a.f429579a, 1, 2, 10485760L);
    }

    @Override // r40.h
    @l
    public final synchronized C47490d a(@k String str) {
        try {
            try {
                a.e eVarD = this.f208568d.d(str);
                if (eVarD == null) {
                    return null;
                }
                Y y12 = new Y(new b(M.g(eVarD.f364087b[1]), eVarD));
                try {
                    C49761a c49761a = new C49761a(M.g(eVarD.f364087b[0]));
                    if (L.f(c49761a.f442203k, "zstd")) {
                        y12 = new Y(M.g(this.f208566b.c(y12.new a())));
                    }
                    return new C47490d(c49761a, y12);
                } catch (IOException unused) {
                    Util.closeQuietly(eVarD);
                    return null;
                }
            } catch (IOException unused2) {
                return null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, com.jakewharton.disklrucache.a$c] */
    @Override // r40.h
    @l
    public final synchronized i b(@k String str, @k C49761a c49761a) {
        l0.h hVar = new l0.h();
        try {
            ?? C12 = this.f208568d.c(str);
            if (C12 == 0) {
                return null;
            }
            hVar.f406842b = C12;
            c0 c0VarC = M.c(C12.c(0));
            c49761a.f442203k = this.f208567c.x().invoke().booleanValue() ? "zstd" : null;
            c49761a.a(c0VarC);
            OutputStream outputStreamC = ((a.c) hVar.f406842b).c(1);
            if (this.f208567c.x().invoke().booleanValue()) {
                outputStreamC = this.f208566b.d(outputStreamC);
            }
            return new i(M.c(outputStreamC), new d(this, hVar), new f(this, hVar));
        } catch (IOException e12) {
            try {
                new com.avito.android.offlinization.cache.lru.b((a.c) hVar.f406842b).invoke();
            } catch (IOException unused) {
            }
            if (((ErrnoException) e12.getCause()).errno == OsConstants.ENOSPC) {
                throw new OutOfDiskException(e12);
            }
            return null;
        }
    }

    @Override // r40.h
    public final synchronized void clear() {
        com.jakewharton.disklrucache.a aVar = this.f208568d;
        aVar.close();
        com.jakewharton.disklrucache.c.a(aVar.f364061b);
        this.f208568d = com.jakewharton.disklrucache.a.g(this.f208565a.f429579a, 1, 2, 10485760L);
    }

    @Override // r40.h
    public final synchronized void remove(@k String str) {
        try {
            new c(str).invoke();
        } catch (IOException unused) {
        }
    }
}
