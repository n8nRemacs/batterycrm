package androidx.work.multiprocess;

import android.os.IInterface;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import j.N;

/* compiled from: RemoteWorkManagerClient.java */
/* loaded from: classes10.dex */
class A implements InterfaceC23629j<InterfaceC23621b> {
    @Override // androidx.work.multiprocess.InterfaceC23629j
    public final void i(@N IInterface iInterface, @N m mVar) {
        ((InterfaceC23621b) iInterface).b0(mVar, androidx.work.multiprocess.parcelable.a.a(new ParcelableWorkQuery()));
    }
}
