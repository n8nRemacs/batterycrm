package androidx.profileinstaller;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.my.target.T;
import com.my.tracker.MyTracker;
import e11.C39887m0;
import e11.C39921y;
import e11.K0;
import e11.m2;
import e11.r2;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f53626c;

    public /* synthetic */ h(Context context, int i12) {
        this.f53625b = i12;
        this.f53626c = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i12 = 1;
        Context context = this.f53626c;
        switch (this.f53625b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(context, i12));
                break;
            case 1:
                f.b(context, new androidx.arch.core.executor.a(1), f.f53621a, false);
                break;
            case 2:
                int i13 = C39921y.f394904a;
                r2 r2VarA = r2.a(context);
                int i14 = C39921y.f394904a;
                try {
                    SharedPreferences.Editor editorEdit = r2VarA.f394776a.edit();
                    editorEdit.putInt("sdk_flags", i14);
                    editorEdit.commit();
                    break;
                } catch (Throwable th2) {
                    th2.toString();
                    return;
                }
            default:
                AtomicBoolean atomicBoolean = f11.e.f395643a;
                C39887m0.b(context);
                T t12 = T.f364598o;
                t12.getClass();
                if (!m2.b()) {
                    t12.f364599b.g(context);
                    t12.f364600c.h(context);
                    t12.f364602e.h(context);
                    t12.f364604g.h(context);
                }
                if (!K0.f394384a) {
                    try {
                        String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
                        if (str != null) {
                            MyTracker.initTracker(str, (Application) context.getApplicationContext());
                        }
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    K0.f394384a = true;
                    break;
                }
                break;
        }
    }
}
