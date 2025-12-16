package androidx.media3.session;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.session.C23229i0;
import androidx.media3.session.MediaControllerImplLegacy;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23232j0 implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52539c;

    public /* synthetic */ C23232j0(Object obj, int i12) {
        this.f52538b = i12;
        this.f52539c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f52538b) {
            case 0:
                C23229i0.b bVar = (C23229i0.b) this.f52539c;
                bVar.getClass();
                if (message.what == 1) {
                    try {
                        C23229i0 c23229i0 = C23229i0.this;
                        c23229i0.f52513v.D2(c23229i0.f52494c);
                        break;
                    } catch (RemoteException unused) {
                        androidx.media3.common.util.s.g();
                        break;
                    }
                }
                break;
            default:
                MediaControllerImplLegacy.b bVar2 = (MediaControllerImplLegacy.b) this.f52539c;
                bVar2.getClass();
                if (message.what == 1) {
                    MediaControllerImplLegacy mediaControllerImplLegacy = bVar2.f52162b;
                    mediaControllerImplLegacy.a0(false, mediaControllerImplLegacy.f52157l);
                    break;
                }
                break;
        }
        return true;
        return true;
    }
}
