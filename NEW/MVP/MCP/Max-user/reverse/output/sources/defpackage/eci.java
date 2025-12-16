package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class eci extends uai implements obi {
    public final /* synthetic */ int d;
    public final /* synthetic */ n2g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eci(n2g n2gVar, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.d = i;
        this.e = n2gVar;
    }

    @Override // defpackage.uai
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) cbi.a(parcel, Status.CREATOR);
            z1a z1aVar = (z1a) cbi.a(parcel, z1a.CREATOR);
            cbi.b(parcel);
            o(status, z1aVar);
            return true;
        }
        if (i == 2) {
            Status status2 = (Status) cbi.a(parcel, Status.CREATOR);
            b2a b2aVar = (b2a) cbi.a(parcel, b2a.CREATOR);
            cbi.b(parcel);
            q(status2, b2aVar);
            return true;
        }
        if (i == 3) {
            cbi.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 4) {
            return false;
        }
        cbi.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.obi
    public void o(Status status, z1a z1aVar) {
        switch (this.d) {
            case 0:
                jqd.b(status, z1aVar, this.e);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.obi
    public void q(Status status, b2a b2aVar) {
        switch (this.d) {
            case 1:
                jqd.b(status, b2aVar, this.e);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
