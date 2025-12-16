package ru.cyberity.input.infoproviders;

import Y61.k;
import android.os.Build;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: OsBuildInfoProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/a0;", "Lru/cyberity/fingerprint/infoproviders/z;", "", "f", "e", "c", "a", "d", "b", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a0 implements z {

    /* compiled from: OsBuildInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f435992a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.VERSION.RELEASE;
        }
    }

    /* compiled from: OsBuildInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f435993a = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.FINGERPRINT;
        }
    }

    /* compiled from: OsBuildInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f435994a = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return System.getProperty("os.version");
        }
    }

    /* compiled from: OsBuildInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f435995a = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.MANUFACTURER;
        }
    }

    /* compiled from: OsBuildInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f435996a = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.MODEL;
        }
    }

    /* compiled from: OsBuildInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f435997a = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
    }

    @Override // ru.cyberity.input.infoproviders.z
    @k
    public String a() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, f.f435997a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.z
    @k
    public String b() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, b.f435993a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.z
    @k
    public String c() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, a.f435992a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.z
    @k
    public String d() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, c.f435994a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.z
    @k
    public String e() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, d.f435995a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }

    @Override // ru.cyberity.input.infoproviders.z
    @k
    public String f() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, e.f435996a, 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }
}
