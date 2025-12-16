package e21;

import Y61.k;
import Y61.l;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import i21.InterfaceC41214a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: CallingAppRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le21/a;", "Li21/a;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: e21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39931a implements InterfaceC41214a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.vk.push.core.data.source.a f394930a;

    public C39931a(@k com.vk.push.core.data.source.a aVar) {
        this.f394930a = aVar;
    }

    @Override // i21.InterfaceC41214a
    @l
    public final String a(@k String str) throws NoSuchAlgorithmException {
        Context context = this.f394930a.f367021a;
        try {
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 134217728) : context.getPackageManager().getPackageInfo(str, 64);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : com.vk.push.core.utils.l.c(packageInfo)) {
                messageDigest.update(signature.toByteArray());
            }
            return com.vk.push.core.utils.l.a(messageDigest.digest());
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Override // i21.InterfaceC41214a
    @l
    public final String b(int i12) {
        Object bVar;
        Object next;
        String str;
        Context context = this.f394930a.f367021a;
        try {
            int i13 = Z.f406624c;
            ActivityManager activityManager = (ActivityManager) androidx.core.content.d.getSystemService(context.getApplicationContext(), ActivityManager.class);
            bVar = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        } catch (Throwable th2) {
            int i14 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        List list = (List) bVar;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).pid == i12) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) {
            return null;
        }
        return (String) C42745f0.G(C43066x.f0(str, new String[]{":"}, 0, 6));
    }

    @Override // i21.InterfaceC41214a
    @l
    public final String c(int i12) {
        return this.f394930a.f367021a.getPackageManager().getNameForUid(i12);
    }
}
