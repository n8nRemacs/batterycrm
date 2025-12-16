package iY0;

import android.content.Context;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* renamed from: iY0.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC41364b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f398557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f398558c;

    public /* synthetic */ RunnableC41364b(Context context, C37028k c37028k) {
        this.f398557b = context;
        this.f398558c = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f398557b;
        C37028k c37028k = this.f398558c;
        try {
            C41363a.a(context);
            c37028k.b(null);
        } catch (Exception e12) {
            c37028k.a(e12);
        }
    }
}
