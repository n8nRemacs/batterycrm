package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class aui extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aui(yai yaiVar, int i) {
        super(yaiVar);
        this.k = i;
        s5j.h(yaiVar, "GoogleApiClient must not be null");
        s5j.h(f70.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ mpd c(Status status) {
        int i = this.k;
        return status;
    }

    public final void g(fl flVar) {
        switch (this.k) {
            case 0:
                wli wliVar = (wli) flVar;
                zbj zbjVar = (zbj) wliVar.o();
                n0j n0jVar = new n0j(this, 0);
                GoogleSignInOptions googleSignInOptions = wliVar.I0;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zbjVar.e);
                int i = uli.a;
                parcelObtain.writeStrongBinder(n0jVar);
                if (googleSignInOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    googleSignInOptions.writeToParcel(parcelObtain, 0);
                }
                zbjVar.V(parcelObtain, HttpStatus.SC_PROCESSING);
                break;
            default:
                wli wliVar2 = (wli) flVar;
                zbj zbjVar2 = (zbj) wliVar2.o();
                n0j n0jVar2 = new n0j(this, 1);
                GoogleSignInOptions googleSignInOptions2 = wliVar2.I0;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(zbjVar2.e);
                int i2 = uli.a;
                parcelObtain2.writeStrongBinder(n0jVar2);
                if (googleSignInOptions2 == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(parcelObtain2, 0);
                }
                zbjVar2.V(parcelObtain2, 103);
                break;
        }
    }

    public final void h(Status status) {
        s5j.a("Failed result must not be success", !status.b());
        f(c(status));
    }
}
