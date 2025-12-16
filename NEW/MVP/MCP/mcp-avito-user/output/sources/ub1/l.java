package ub1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.core.exception.RuStoreException;
import ub1.D;

/* loaded from: classes9.dex */
public final class l implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f440159b;

    /* renamed from: c, reason: collision with root package name */
    public final String f440160c;

    /* renamed from: d, reason: collision with root package name */
    public final y f440161d;

    /* renamed from: e, reason: collision with root package name */
    public final z f440162e;

    public static final class a extends k {
        public a() {
        }
    }

    public l(Context context, String str, y yVar, z zVar) {
        this.f440159b = context;
        this.f440160c = str;
        this.f440161d = yVar;
        this.f440162e = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        D c12724a;
        try {
            int i12 = D.a.f440127a;
            if (iBinder == null) {
                c12724a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c12724a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof D)) ? new D.a.C12724a(iBinder) : (D) iInterfaceQueryLocalInterface;
            }
            c12724a.V0(this.f440160c, new a());
        } catch (Exception e12) {
            z zVar = this.f440162e;
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            zVar.invoke(new RuStoreException(message));
            ru.rustore.sdk.core.util.c.a(this.f440159b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f440162e.invoke(new RuStoreException("onServiceDisconnected"));
        ru.rustore.sdk.core.util.c.a(this.f440159b, this);
    }
}
