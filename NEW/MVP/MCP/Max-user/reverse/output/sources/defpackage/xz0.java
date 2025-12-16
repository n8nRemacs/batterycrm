package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Pair;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DumpSource;
import org.webrtc.NativeDumpCallback;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class xz0 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ xz0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.o = obj3;
        this.X = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                k01 k01Var = (k01) this.c;
                String str = (String) this.d;
                int i = this.b;
                Set<DumpSource> set = (Set) this.o;
                NativeDumpCallback nativeDumpCallback = (NativeDumpCallback) this.X;
                k01Var.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = k01Var.f0.d;
                    if (peerConnectionFactory == null) {
                        return;
                    }
                    peerConnectionFactory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis(i), set, nativeDumpCallback);
                    return;
                } catch (Throwable th) {
                    k01Var.P.logException("OKRTCCall", "Error starting local audio dump", th);
                    return;
                }
            case 1:
                ia1 ia1Var = (ia1) this.c;
                ViewPager2 viewPager2 = (ViewPager2) this.d;
                int i2 = this.b;
                da1 da1Var = (da1) this.o;
                i6 i6Var = (i6) this.X;
                int i3 = i2 + 1;
                if (!viewPager2.isInLayout()) {
                    da1Var.invoke();
                    return;
                } else if (i3 == 5) {
                    i6Var.invoke();
                    return;
                } else {
                    viewPager2.post(new xz0(ia1Var, viewPager2, i3, da1Var, i6Var, 1));
                    return;
                }
            case 2:
                ry8 ry8Var = (ry8) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.d;
                List list = (List) this.o;
                ArrayList arrayList = (ArrayList) this.X;
                int i4 = this.b;
                if (atomicInteger.incrementAndGet() == list.size()) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        ha8 ha8Var = (ha8) arrayList.get(i5);
                        if (ha8Var != null) {
                            try {
                                bitmap = (Bitmap) a6a.a(ha8Var);
                            } catch (CancellationException | ExecutionException e) {
                                a8i.f("MCImplLegacy", "Failed to get bitmap", e);
                            }
                        } else {
                            bitmap = null;
                        }
                        i5i i5iVar = ry8Var.i;
                        wy8 wy8VarG = i28.g((k09) list.get(i5), bitmap);
                        int i6 = i4 + i5;
                        tx8 tx8Var = (tx8) i5iVar.a;
                        if ((tx8Var.a.getFlags() & 4) == 0) {
                            throw new UnsupportedOperationException("This session doesn't support queue management operations");
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, n28.a(wy8VarG, MediaDescriptionCompat.CREATOR));
                        bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i6);
                        tx8Var.a.sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
                    }
                    return;
                }
                return;
            case 3:
                z79 z79Var = (z79) this.c;
                aie aieVar = (aie) this.d;
                int i7 = this.b;
                b89 b89Var = (b89) this.o;
                y79 y79Var = (y79) this.X;
                fde fdeVar = z79Var.f;
                if (z79Var.g.j()) {
                    return;
                }
                if (!((b79) z79Var.k.b).a.isActive()) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(aieVar == null ? Integer.valueOf(i7) : aieVar.b);
                    sb.append(", pid=");
                    sb.append(b89Var.a.b);
                    a8i.l("MediaSessionLegacyStub", sb.toString());
                    return;
                }
                u69 u69VarK = z79Var.K(b89Var);
                if (aieVar != null) {
                    if (!fdeVar.B(u69VarK, aieVar)) {
                        return;
                    }
                } else if (!fdeVar.A(u69VarK, i7)) {
                    return;
                }
                try {
                    y79Var.b(u69VarK);
                    return;
                } catch (RemoteException e2) {
                    a8i.m("MediaSessionLegacyStub", "Exception in " + u69VarK, e2);
                    return;
                }
            default:
                v99 v99Var = (v99) this.c;
                Pair pair = (Pair) this.d;
                ((nj4) v99Var.b.k).b(((Integer) pair.first).intValue(), (d99) pair.second, (ub8) this.o, (g19) this.X, this.b);
                return;
        }
    }

    public /* synthetic */ xz0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.o = obj3;
        this.X = obj4;
        this.b = i;
    }
}
