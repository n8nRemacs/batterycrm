package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class a79 extends Binder implements db7 {
    public static final /* synthetic */ int d = 0;
    public final WeakReference c;

    public a79(b79 b79Var) {
        attachInterface(this, IMediaSession.DESCRIPTOR);
        this.c = new WeakReference(b79Var);
    }

    @Override // defpackage.db7
    public final void C(ab7 ab7Var) {
        b79 b79Var = (b79) this.c.get();
        if (b79Var == null || ab7Var == null) {
            return;
        }
        b79Var.f.unregister(ab7Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (b79Var.d) {
        }
    }

    @Override // defpackage.db7
    public final void I(ab7 ab7Var) {
        b79 b79Var = (b79) this.c.get();
        if (b79Var == null || ab7Var == null) {
            return;
        }
        b79Var.f.register(ab7Var, new b89("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (b79Var.d) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.db7
    public final f3c getPlaybackState() {
        b79 b79Var = (b79) this.c.get();
        if (b79Var == null) {
            return null;
        }
        f3c f3cVar = b79Var.g;
        x19 x19Var = b79Var.i;
        if (f3cVar != null) {
            float f = f3cVar.d;
            long j = f3cVar.Z;
            int i = f3cVar.a;
            long j2 = f3cVar.b;
            long jA = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = ((long) (f * (jElapsedRealtime - j))) + j2;
                if (x19Var != null && x19Var.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                    jA = x19Var.a(MediaMetadataCompat.METADATA_KEY_DURATION);
                }
                long j4 = (jA < 0 || j3 <= jA) ? j3 < 0 ? 0L : j3 : jA;
                ArrayList arrayList = new ArrayList();
                long j5 = f3cVar.c;
                long j6 = f3cVar.o;
                int i2 = f3cVar.X;
                CharSequence charSequence = f3cVar.Y;
                AbstractCollection abstractCollection = f3cVar.s0;
                if (abstractCollection != null) {
                    arrayList.addAll(abstractCollection);
                }
                return new f3c(f3cVar.a, j4, j5, f3cVar.d, j6, i2, charSequence, jElapsedRealtime, arrayList, f3cVar.t0, f3cVar.u0);
            }
        }
        return f3cVar;
    }

    @Override // defpackage.db7
    public final int getRepeatMode() {
        b79 b79Var = (b79) this.c.get();
        if (b79Var != null) {
            return b79Var.j;
        }
        return -1;
    }

    @Override // defpackage.db7
    public final int getShuffleMode() {
        b79 b79Var = (b79) this.c.get();
        if (b79Var != null) {
            return b79Var.k;
        }
        return -1;
    }

    @Override // defpackage.db7
    public final boolean isCaptioningEnabled() {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString(IMediaSession.DESCRIPTOR);
            return true;
        }
        WeakReference weakReference = this.c;
        ab7 ab7Var = null;
        bundle = null;
        Bundle bundle2 = null;
        ab7 ab7Var2 = null;
        switch (i) {
            case 1:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                    f79.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 2:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 3:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ab7)) {
                        za7 za7Var = new za7();
                        za7Var.c = strongBinder;
                        ab7Var = za7Var;
                    } else {
                        ab7Var = (ab7) iInterfaceQueryLocalInterface;
                    }
                }
                I(ab7Var);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMediaControllerCallback.DESCRIPTOR);
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof ab7)) {
                        za7 za7Var2 = new za7();
                        za7Var2.c = strongBinder2;
                        ab7Var2 = za7Var2;
                    } else {
                        ab7Var2 = (ab7) iInterfaceQueryLocalInterface2;
                    }
                }
                C(ab7Var2);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 6:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 7:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 8:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 9:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 10:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 11:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 16:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case LangUtils.HASH_SEED /* 17 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readLong();
                throw new AssertionError();
            case 18:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 19:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 20:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 21:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 22:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 23:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readLong();
                throw new AssertionError();
            case 25:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    j8d.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 26:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 27:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 28:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                f3c playbackState = getPlaybackState();
                parcel2.getClass();
                parcel2.writeNoException();
                if (playbackState == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                playbackState.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 30:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 31:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 32:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                throw new AssertionError();
            case 34:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 35:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 36:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case LangUtils.HASH_OFFSET /* 37 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                int repeatMode = getRepeatMode();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            case 38:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                throw new AssertionError();
            case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    wy8.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 42:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    wy8.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                throw new AssertionError();
            case 43:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    wy8.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 44:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                throw new AssertionError();
            case 45:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                isCaptioningEnabled();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                throw new AssertionError();
            case 47:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                int shuffleMode = getShuffleMode();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(shuffleMode);
                return true;
            case 48:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readInt();
                throw new AssertionError();
            case 49:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                parcel.readFloat();
                throw new AssertionError();
            case 50:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                b79 b79Var = (b79) weakReference.get();
                if (b79Var != null && (bundle = b79Var.e) != null) {
                    bundle2 = new Bundle(bundle);
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (bundle2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle2.writeToParcel(parcel2, 1);
                return true;
            case 51:
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    j8d.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
