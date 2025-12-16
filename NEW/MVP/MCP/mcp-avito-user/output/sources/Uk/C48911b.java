package uK;

import Y61.k;
import android.content.Context;
import android.os.PowerManager;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacProximityWakeLocker.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LuK/b;", "LuK/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: uK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48911b implements InterfaceC48910a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PowerManager.WakeLock f439903a;

    /* compiled from: IacProximityWakeLocker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LuK/b$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "PROXIMITY_WAKE_LOCK_TAG", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uK.b$a */
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
    public C48911b(@k Context context) {
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(32, "Avito:IacProximityWakeLockerImpl");
        this.f439903a = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // uK.InterfaceC48910a
    public final void lock() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacProximityWakeLocker", "lock", null);
        this.f439903a.acquire();
    }

    @Override // uK.InterfaceC48910a
    public final void release() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacProximityWakeLocker", "release", null);
        PowerManager.WakeLock wakeLock = this.f439903a;
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }
}
