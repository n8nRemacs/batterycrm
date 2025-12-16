package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import androidx.collection.C20199a;
import androidx.media.AbstractServiceC23085i;
import j.P;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23081e extends AbstractServiceC23085i.C1812i<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.b f47023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f47024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f47025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i f47026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23081e(AbstractServiceC23085i abstractServiceC23085i, String str, AbstractServiceC23085i.b bVar, String str2, Bundle bundle) {
        super(str);
        this.f47026i = abstractServiceC23085i;
        this.f47023f = bVar;
        this.f47024g = str2;
        this.f47025h = bundle;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> listA = list;
        C20199a<IBinder, AbstractServiceC23085i.b> c20199a = this.f47026i.f47034e;
        AbstractServiceC23085i.b bVar = this.f47023f;
        AbstractServiceC23085i.m mVar = bVar.f47044e;
        if (c20199a.get(mVar.f47066a.getBinder()) != bVar) {
            int i12 = AbstractServiceC23085i.f47030i;
            return;
        }
        int i13 = this.f47063e & 1;
        Bundle bundle = this.f47025h;
        if (i13 != 0) {
            listA = AbstractServiceC23085i.a(listA, bundle);
        }
        try {
            mVar.a(this.f47024g, bundle, listA);
        } catch (RemoteException unused) {
        }
    }
}
