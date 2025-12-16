package PL;

import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MiUiShowOnLockScreenAnalyticInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPL/b;", "LPL/a;", "a", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements PL.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f13003a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f13004b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f13005c;

    /* compiled from: MiUiShowOnLockScreenAnalyticInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPL/b$a;", "", "<init>", "()V", "", "LOCK_SCREEN_PERMISSION_WAS_DISABLED", "Ljava/lang/String;", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@Y61.k AK0.l lVar, @Y61.k i iVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f13003a = lVar;
        this.f13004b = iVar;
        this.f13005c = interfaceC28373a;
    }

    @Override // PL.a
    public final void a() {
        i iVar = this.f13004b;
        Boolean boolA = iVar.a();
        Boolean bool = Boolean.TRUE;
        if (L.f(boolA, bool)) {
            AK0.l lVar = this.f13003a;
            Boolean boolValueOf = lVar.contains("MiUiShowOnLockScreenAnalyticTask_lock_screen_permission_was_disabled") ? Boolean.valueOf(lVar.getBoolean("MiUiShowOnLockScreenAnalyticTask_lock_screen_permission_was_disabled", false)) : null;
            boolean zF2 = L.f(iVar.c(), bool);
            if (boolValueOf == null) {
                lVar.putBoolean("MiUiShowOnLockScreenAnalyticTask_lock_screen_permission_was_disabled", zF2);
            } else {
                if (boolValueOf.equals(Boolean.valueOf(zF2))) {
                    return;
                }
                lVar.putBoolean("MiUiShowOnLockScreenAnalyticTask_lock_screen_permission_was_disabled", zF2);
                this.f13005c.c(new h(!zF2));
            }
        }
    }
}
