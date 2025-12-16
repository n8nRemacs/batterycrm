package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AbstractServiceC23085i;
import androidx.media.AbstractServiceC23085i.b;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f47084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47085g;

    public t(int i12, int i13, Bundle bundle, AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str) {
        this.f47085g = kVar;
        this.f47080b = mVar;
        this.f47081c = str;
        this.f47082d = i12;
        this.f47083e = i13;
        this.f47084f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        AbstractServiceC23085i.m mVar = this.f47080b;
        IBinder binder = mVar.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f47085g;
        AbstractServiceC23085i.this.f47034e.remove(binder);
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        String str = this.f47081c;
        AbstractServiceC23085i.b bVar = abstractServiceC23085i.new b(str, this.f47082d, this.f47083e, mVar);
        abstractServiceC23085i.f47035f = bVar;
        AbstractServiceC23085i.a aVarD = abstractServiceC23085i.d(str, this.f47083e, this.f47084f);
        bVar.f47046g = aVarD;
        abstractServiceC23085i.f47035f = null;
        if (aVarD == null) {
            try {
                mVar.b(2, null);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        try {
            abstractServiceC23085i.f47034e.put(binder, bVar);
            binder.linkToDeath(bVar, 0);
            MediaSessionCompat.Token token = abstractServiceC23085i.f47037h;
            if (token != null) {
                AbstractServiceC23085i.a aVar = bVar.f47046g;
                String str2 = aVar.f47038a;
                Bundle bundle = aVar.f47039b;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", token);
                bundle2.putBundle("data_root_hints", bundle);
                mVar.b(1, bundle2);
            }
        } catch (RemoteException unused2) {
            abstractServiceC23085i.f47034e.remove(binder);
        }
    }
}
