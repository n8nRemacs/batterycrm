package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class n0j extends uai implements s6j {
    public final /* synthetic */ int d;
    public final /* synthetic */ aui e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0j(aui auiVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 7);
        this.d = i;
        this.e = auiVar;
    }

    @Override // defpackage.uai
    public final boolean V(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                throw new UnsupportedOperationException();
            case HttpStatus.SC_PROCESSING /* 102 */:
                g((Status) uli.a(parcel, Status.CREATOR));
                break;
            case 103:
                k((Status) uli.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.s6j
    public void g(Status status) {
        switch (this.d) {
            case 0:
                this.e.f(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.s6j
    public void k(Status status) {
        switch (this.d) {
            case 1:
                this.e.f(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
