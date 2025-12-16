package aY0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: aY0.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19842b {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Context f20921a;

    public C19842b(@N Context context) {
        this.f20921a = context;
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public final ApplicationInfo a(int i12, @N String str) {
        return this.f20921a.getPackageManager().getApplicationInfo(str, i12);
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public final PackageInfo b(@N String str, int i12) {
        return this.f20921a.getPackageManager().getPackageInfo(str, i12);
    }

    @RX0.a
    public final boolean c() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f20921a;
        if (callingUid == iMyUid) {
            return C19841a.a(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
