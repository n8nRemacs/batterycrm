package com.avito.android.analytics.inhouse_transport;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import androidx.compose.ui.platform.C22491k0;
import java.io.File;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FileStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/f;", "Lcom/avito/android/analytics/inhouse_transport/e;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f90190a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final File f90191b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f90192c;

    /* compiled from: FileStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<File> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f90194m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f90194m = str;
        }

        @Override // Y41.a
        public final File invoke() {
            String str;
            String str2;
            f fVar = f.this;
            fVar.getClass();
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) fVar.f90190a.getSystemService("activity");
            Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (iMyPid == next.pid) {
                    str2 = next.processName;
                    break;
                }
            }
            if (str2 == null) {
                Iterator<ActivityManager.RunningServiceInfo> it2 = activityManager.getRunningServices(100).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningServiceInfo next2 = it2.next();
                    if (iMyPid == next2.pid) {
                        str = next2.process;
                        break;
                    }
                }
                if (str == null) {
                    throw new IllegalStateException("Can not get process name to create folder");
                }
                str2 = str;
            }
            StringBuilder sbB = C22491k0.b(str2, '_');
            sbB.append(this.f90194m);
            File file = new File(fVar.f90191b, sbB.toString());
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }
    }

    public f(@Y61.k String str, @Y61.k Application application) {
        this.f90190a = application;
        this.f90191b = application.getFilesDir();
        this.f90192c = C42727D.c(new a(str));
    }

    @Override // com.avito.android.analytics.inhouse_transport.e
    @Y61.k
    public final File a() {
        return (File) this.f90192c.getValue();
    }
}
