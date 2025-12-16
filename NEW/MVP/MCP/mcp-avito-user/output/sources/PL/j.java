package PL;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Process;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: MiuiUtilsImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPL/j;", "LPL/i;", "a", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f13016a;

    /* compiled from: MiuiUtilsImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LPL/j$a;", "", "<init>", "()V", "", "MIUI_SHOW_ON_LOCK_SCREEN_PERMISSION", "I", "", "SYSTEM_PROPERTY_KEY_MIUI_VERSION", "Ljava/lang/String;", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public j(@Y61.k Context context) {
        this.f13016a = context;
    }

    @Override // PL.i
    @Y61.l
    @SuppressLint({"PrivateApi", "ObfuscationSensitiveReflection"})
    public final Boolean a() {
        try {
            return Boolean.valueOf(!C43066x.K((String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // PL.i
    @Y61.l
    @SuppressLint({"PrivateApi", "ObfuscationSensitiveReflection", "KotlinReflection"})
    public final Boolean b() {
        Context context = this.f13016a;
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class cls = Integer.TYPE;
            return Boolean.valueOf(((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // PL.i
    @Y61.l
    public final Boolean c() {
        try {
            return Boolean.valueOf(((KeyguardManager) this.f13016a.getSystemService("keyguard")).isKeyguardSecure());
        } catch (Throwable unused) {
            return null;
        }
    }
}
