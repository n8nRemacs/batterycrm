package Yb;

import AK0.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MicroPermissionStateAnalyticInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LYb/f;", "LYb/e;", "a", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f19533a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f19535c;

    /* compiled from: MicroPermissionStateAnalyticInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYb/f$a;", "", "<init>", "()V", "", "MICRO_PERMISSION_IS_ENABLED", "Ljava/lang/String;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k l lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k u uVar) {
        this.f19533a = lVar;
        this.f19534b = interfaceC28373a;
        this.f19535c = uVar;
    }

    @Override // Yb.e
    public final void a() {
        l lVar = this.f19533a;
        Boolean boolValueOf = lVar.contains("MicroPermissionStateAnalyticInteractor_micro_permission_is_enabled") ? Boolean.valueOf(lVar.getBoolean("MicroPermissionStateAnalyticInteractor_micro_permission_is_enabled", false)) : null;
        boolean zB2 = this.f19535c.b("android.permission.RECORD_AUDIO");
        if (boolValueOf == null) {
            lVar.putBoolean("MicroPermissionStateAnalyticInteractor_micro_permission_is_enabled", zB2);
        } else {
            if (boolValueOf.equals(Boolean.valueOf(zB2))) {
                return;
            }
            lVar.putBoolean("MicroPermissionStateAnalyticInteractor_micro_permission_is_enabled", zB2);
            this.f19534b.c(new h(zB2));
        }
    }
}
