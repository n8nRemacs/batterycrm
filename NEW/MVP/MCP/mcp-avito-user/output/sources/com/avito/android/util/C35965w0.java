package com.avito.android.util;

import android.annotation.TargetApi;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.sequences.o0;
import kotlin.text.C43047d;

/* compiled from: DataDiskUsageOreoDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/w0;", "Lcom/avito/android/util/u0;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
/* renamed from: com.avito.android.util.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35965w0 implements InterfaceC35951u0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f319104a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final StorageStatsManager f319105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final StorageManager f319106c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UserHandle f319107d = Process.myUserHandle();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f319108e = C42727D.c(new e());

    /* compiled from: DataDiskUsageOreoDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;", "invoke", "(Ljava/util/UUID;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.w0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<UUID, Long> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Long invoke(UUID uuid) {
            C35965w0 c35965w0 = C35965w0.this;
            String packageName = c35965w0.f319104a.getPackageName();
            UserHandle userHandle = c35965w0.f319107d;
            return Long.valueOf(c35965w0.f319105b.queryStatsForPackage(uuid, packageName, userHandle).getCacheBytes());
        }
    }

    /* compiled from: DataDiskUsageOreoDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;", "invoke", "(Ljava/util/UUID;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.w0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<UUID, Long> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Long invoke(UUID uuid) {
            C35965w0 c35965w0 = C35965w0.this;
            String packageName = c35965w0.f319104a.getPackageName();
            UserHandle userHandle = c35965w0.f319107d;
            return Long.valueOf(c35965w0.f319105b.queryStatsForPackage(uuid, packageName, userHandle).getDataBytes());
        }
    }

    /* compiled from: DataDiskUsageOreoDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;", "invoke", "(Ljava/util/UUID;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.w0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<UUID, Long> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Long invoke(UUID uuid) {
            C35965w0 c35965w0 = C35965w0.this;
            String packageName = c35965w0.f319104a.getPackageName();
            UserHandle userHandle = c35965w0.f319107d;
            return Long.valueOf(c35965w0.f319105b.queryStatsForPackage(uuid, packageName, userHandle).getAppBytes());
        }
    }

    /* compiled from: DataDiskUsageOreoDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;", "invoke", "(Ljava/util/UUID;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.w0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<UUID, Long> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f319112l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super UUID, Long> lVar) {
            super(1);
            this.f319112l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final Long invoke(UUID uuid) {
            return (Long) this.f319112l.invoke(uuid);
        }
    }

    /* compiled from: DataDiskUsageOreoDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/util/UUID;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.w0$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Set<? extends UUID>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends UUID> invoke() {
            UUID uuidNameUUIDFromBytes;
            List<StorageVolume> storageVolumes = C35965w0.this.f319106c.getStorageVolumes();
            ArrayList arrayList = new ArrayList(C42745f0.q(storageVolumes, 10));
            Iterator<T> it = storageVolumes.iterator();
            while (it.hasNext()) {
                String uuid = ((StorageVolume) it.next()).getUuid();
                if (uuid == null) {
                    uuidNameUUIDFromBytes = StorageManager.UUID_DEFAULT;
                } else {
                    try {
                        uuidNameUUIDFromBytes = UUID.fromString(uuid);
                    } catch (IllegalArgumentException unused) {
                        uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(uuid.getBytes(C43047d.f410589b));
                    }
                }
                arrayList.add(uuidNameUUIDFromBytes);
            }
            return C42745f0.P0(arrayList);
        }
    }

    public C35965w0(@Y61.k Context context) {
        this.f319104a = context;
        this.f319105b = (StorageStatsManager) context.getSystemService("storagestats");
        this.f319106c = (StorageManager) context.getSystemService("storage");
    }

    @Override // com.avito.android.util.InterfaceC35951u0
    public final long a() {
        return d(new a());
    }

    @Override // com.avito.android.util.InterfaceC35951u0
    public final long b() {
        return d(new b());
    }

    @Override // com.avito.android.util.InterfaceC35951u0
    public final long c() {
        return d(new c());
    }

    public final long d(Y41.l<? super UUID, Long> lVar) {
        o0.a aVar = new o0.a(new kotlin.sequences.o0(new C42770s0((Set) this.f319108e.getValue()), new d(lVar)));
        long jLongValue = 0;
        while (aVar.f410559b.hasNext()) {
            jLongValue += ((Number) aVar.next()).longValue();
        }
        return jLongValue;
    }
}
