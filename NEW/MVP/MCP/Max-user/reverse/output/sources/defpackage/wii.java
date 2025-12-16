package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class wii extends uai {
    public final /* synthetic */ int d;
    public final /* synthetic */ n2g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wii(n2g n2gVar, int i) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
        this.d = i;
        switch (i) {
            case 1:
                this.e = n2gVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
                break;
            default:
                this.e = n2gVar;
                break;
        }
    }

    @Override // defpackage.uai
    public final boolean U(Parcel parcel, int i) {
        switch (this.d) {
            case 0:
                if (i == 1) {
                    sf8 sf8Var = (sf8) xgi.a(parcel, sf8.CREATOR);
                    xgi.b(parcel);
                    Status status = sf8Var.a;
                    q85 q85Var = new q85(23);
                    boolean zB = status.b();
                    n2g n2gVar = this.e;
                    if (!zB) {
                        n2gVar.a(yqi.c(status));
                        break;
                    } else {
                        n2gVar.b(q85Var);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    Status status2 = (Status) xgi.a(parcel, Status.CREATOR);
                    Location location = (Location) xgi.a(parcel, Location.CREATOR);
                    xgi.b(parcel);
                    boolean zB2 = status2.b();
                    n2g n2gVar2 = this.e;
                    if (!zB2) {
                        n2gVar2.a(yqi.c(status2));
                        break;
                    } else {
                        n2gVar2.b(location);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
