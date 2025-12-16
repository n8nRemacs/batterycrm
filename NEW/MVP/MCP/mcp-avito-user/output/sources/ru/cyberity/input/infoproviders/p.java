package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: DeviceSecurityInfoProvider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/p;", "Lru/cyberity/fingerprint/infoproviders/o;", "Landroid/app/admin/DevicePolicyManager;", "devicePolicyManager", "Landroid/app/KeyguardManager;", "keyguardManager", "<init>", "(Landroid/app/admin/DevicePolicyManager;Landroid/app/KeyguardManager;)V", "", "b", "()Ljava/lang/String;", "", "Lkotlin/Q;", "a", "()Ljava/util/List;", "", "c", "()Z", "Landroid/app/admin/DevicePolicyManager;", "Landroid/app/KeyguardManager;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final DevicePolicyManager devicePolicyManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final KeyguardManager keyguardManager;

    /* compiled from: DeviceSecurityInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            DevicePolicyManager devicePolicyManager = p.this.devicePolicyManager;
            return q.b(devicePolicyManager != null ? devicePolicyManager.getStorageEncryptionStatus() : 0);
        }
    }

    /* compiled from: DeviceSecurityInfoProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            KeyguardManager keyguardManager = p.this.keyguardManager;
            return Boolean.valueOf(keyguardManager != null ? keyguardManager.isKeyguardSecure() : false);
        }
    }

    /* compiled from: DeviceSecurityInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/Q;", "", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<List<? extends Q<? extends String, ? extends String>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f436037a = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Q<String, String>> invoke() {
            Provider[] providers = Security.getProviders();
            ArrayList arrayList = new ArrayList(providers.length);
            int length = providers.length;
            for (int i12 = 0; i12 < length; i12++) {
                Provider provider = providers[i12];
                String name = provider != null ? provider.getName() : null;
                String str = "";
                if (name == null) {
                    name = "";
                }
                String info = provider.getInfo();
                if (info != null) {
                    str = info;
                }
                arrayList.add(new Q(name, str));
            }
            return arrayList;
        }
    }

    public p(@l DevicePolicyManager devicePolicyManager, @l KeyguardManager keyguardManager) {
        this.devicePolicyManager = devicePolicyManager;
        this.keyguardManager = keyguardManager;
    }

    @Override // ru.cyberity.input.infoproviders.o
    public boolean c() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new b(), 1, null);
        Boolean bool = Boolean.FALSE;
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = bool;
        }
        return ((Boolean) objA).booleanValue();
    }

    @Override // ru.cyberity.input.infoproviders.o
    @k
    public List<Q<String, String>> a() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, c.f436037a, 1, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = c42784z0;
        }
        return (List) objA;
    }

    @Override // ru.cyberity.input.infoproviders.o
    @k
    public String b() {
        Object objA = ru.cyberity.input.tools.threading.safe.c.a(0L, new a(), 1, null);
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = "";
        }
        return (String) objA;
    }
}
