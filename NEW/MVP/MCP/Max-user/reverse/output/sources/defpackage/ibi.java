package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ibi extends mg7 {
    public final /* synthetic */ int d = 1;
    public Object e;

    public ibi() {
        this.c = null;
        this.a = false;
        this.b = 0;
    }

    @Override // defpackage.mg7
    public final void f(fl flVar, n2g n2gVar) {
        switch (this.d) {
            case 0:
                ((ikd) ((rs0) this.e).d).accept(flVar, n2gVar);
                return;
            default:
                this.e = n2gVar;
                vli vliVar = (vli) ((uri) flVar).o();
                gyi gyiVar = new gyi(this);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i = vgi.a;
                parcelObtain.writeStrongBinder(gyiVar);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    vliVar.c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    public ibi(rs0 rs0Var, qt5[] qt5VarArr, boolean z, int i) {
        this.e = rs0Var;
        this.c = qt5VarArr;
        boolean z2 = false;
        if (qt5VarArr != null && z) {
            z2 = true;
        }
        this.a = z2;
        this.b = i;
    }
}
