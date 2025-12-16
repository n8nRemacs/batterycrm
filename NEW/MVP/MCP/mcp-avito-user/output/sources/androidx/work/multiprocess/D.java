package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.L;
import androidx.work.WorkInfo;
import androidx.work.impl.Y;
import androidx.work.impl.utils.C23593c;
import androidx.work.impl.utils.O;
import androidx.work.impl.utils.Q;
import androidx.work.multiprocess.AbstractC23623d;
import androidx.work.multiprocess.InterfaceC23621b;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import j.K;
import j.N;
import java.util.List;
import java.util.UUID;

/* compiled from: RemoteWorkManagerImpl.java */
@RestrictTo
/* loaded from: classes10.dex */
public class D extends InterfaceC23621b.AbstractBinderC1968b {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f56088p = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final Y f56089b;

    /* compiled from: RemoteWorkManagerImpl.java */
    public class a extends AbstractC23623d<L.b.c> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N L.b.c cVar) {
            return D.f56088p;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class b extends AbstractC23623d<L.b.c> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N L.b.c cVar) {
            return D.f56088p;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class c extends AbstractC23623d<L.b.c> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N L.b.c cVar) {
            return D.f56088p;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class d extends AbstractC23623d<L.b.c> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N L.b.c cVar) {
            return D.f56088p;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class e extends AbstractC23623d<List<WorkInfo>> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N List<WorkInfo> list) {
            return androidx.work.multiprocess.parcelable.a.a(new ParcelableWorkInfos(list));
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class f extends AbstractC23623d<Void> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N Void r12) {
            return D.f56088p;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class g extends AbstractC23623d<Void> {
        @Override // androidx.work.multiprocess.AbstractC23623d
        @N
        public final byte[] b(@N Void r12) {
            return D.f56088p;
        }
    }

    public D(@N RemoteWorkManagerService remoteWorkManagerService) {
        this.f56089b = Y.f(remoteWorkManagerService);
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    @K
    public final void A(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
        Y y12 = this.f56089b;
        try {
            new a(y12.f55560e.f56028a, interfaceC23622c, y12.e(((ParcelableWorkRequests) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableWorkRequests.CREATOR)).f56198b).a()).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    public final void E1(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
        Y y12 = this.f56089b;
        try {
            ParcelableForegroundRequestInfo parcelableForegroundRequestInfo = (ParcelableForegroundRequestInfo) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableForegroundRequestInfo.CREATOR);
            androidx.work.impl.utils.taskexecutor.c cVar = y12.f55560e;
            new g(cVar.f56028a, interfaceC23622c, new O(y12.f55559d, y12.f55562g, cVar).a(y12.f55557b, UUID.fromString(parcelableForegroundRequestInfo.f56177b), parcelableForegroundRequestInfo.f56178c)).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    public final void J0(@N String str, @N InterfaceC23622c interfaceC23622c) {
        Y y12 = this.f56089b;
        try {
            y12.getClass();
            new b(y12.f55560e.f56028a, interfaceC23622c, C23593c.e(y12, str).a()).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    public final void X2(@N InterfaceC23622c interfaceC23622c) {
        Y y12 = this.f56089b;
        try {
            y12.getClass();
            new d(y12.f55560e.f56028a, interfaceC23622c, C23593c.b(y12).a()).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    public final void b0(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
        Y y12 = this.f56089b;
        try {
            ParcelableWorkQuery parcelableWorkQuery = (ParcelableWorkQuery) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableWorkQuery.CREATOR);
            androidx.work.impl.utils.taskexecutor.c cVar = y12.f55560e;
            new e(cVar.f56028a, interfaceC23622c, androidx.work.impl.utils.G.b(y12.f55559d, cVar, parcelableWorkQuery.f56196b)).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    public final void t(@N String str, @N InterfaceC23622c interfaceC23622c) {
        Y y12 = this.f56089b;
        try {
            y12.getClass();
            new c(y12.f55560e.f56028a, interfaceC23622c, C23593c.d(y12, str).a()).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @Override // androidx.work.multiprocess.InterfaceC23621b
    public final void w0(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
        Y y12 = this.f56089b;
        try {
            ParcelableUpdateRequest parcelableUpdateRequest = (ParcelableUpdateRequest) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableUpdateRequest.CREATOR);
            Context context = y12.f55557b;
            androidx.work.impl.utils.taskexecutor.c cVar = y12.f55560e;
            new f(cVar.f56028a, interfaceC23622c, new Q(y12.f55559d, cVar).a(context, UUID.fromString(parcelableUpdateRequest.f56185b), parcelableUpdateRequest.f56186c.f56176b)).a();
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }
}
