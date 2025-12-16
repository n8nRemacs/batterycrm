package ub1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.review.model.ReviewInfo;
import ub1.D;

/* renamed from: ub1.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ServiceConnectionC49025g implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f440150b;

    /* renamed from: c, reason: collision with root package name */
    public final ReviewInfo f440151c;

    /* renamed from: d, reason: collision with root package name */
    public final String f440152d;

    /* renamed from: e, reason: collision with root package name */
    public final u f440153e;

    /* renamed from: f, reason: collision with root package name */
    public final v f440154f;

    /* renamed from: ub1.g$a */
    public static final class a extends h {
        public a() {
        }
    }

    public ServiceConnectionC49025g(Context context, ReviewInfo reviewInfo, String str, u uVar, v vVar) {
        this.f440150b = context;
        this.f440151c = reviewInfo;
        this.f440152d = str;
        this.f440153e = uVar;
        this.f440154f = vVar;
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
            c12724a.v1(this.f440151c.toBundle$sdk_public_review_release(), this.f440152d, new a());
        } catch (Exception e12) {
            v vVar = this.f440154f;
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            vVar.invoke(new RuStoreException(message));
            ru.rustore.sdk.core.util.c.a(this.f440150b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f440154f.invoke(new RuStoreException("onServiceDisconnected"));
        ru.rustore.sdk.core.util.c.a(this.f440150b, this);
    }
}
