package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CredentialProviderFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/z;", "", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f45338a;

    /* compiled from: CredentialProviderFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/credentials/z$a;", "", "<init>", "()V", "", "CREDENTIAL_PROVIDER_KEY", "Ljava/lang/String;", "", "MAX_CRED_MAN_PRE_FRAMEWORK_API_LEVEL", "I", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public z(@Y61.k Context context) {
        this.f45338a = context;
    }

    public static y a(z zVar) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            B b12 = new B(zVar.f45338a);
            B b13 = b12.isAvailableOnDevice() ? b12 : null;
            return b13 == null ? zVar.b() : b13;
        }
        if (i12 <= 33) {
            return zVar.b();
        }
        return null;
    }

    public final y b() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f45338a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listM0 = C42745f0.M0(arrayList);
        if (listM0.isEmpty()) {
            return null;
        }
        Iterator it = listM0.iterator();
        y yVar = null;
        while (it.hasNext()) {
            try {
                y yVar2 = (y) Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                if (!yVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (yVar != null) {
                        return null;
                    }
                    yVar = yVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return yVar;
    }
}
