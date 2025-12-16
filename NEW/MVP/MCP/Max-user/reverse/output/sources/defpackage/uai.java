package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class uai extends Binder implements IInterface {
    public final /* synthetic */ int c;

    public /* synthetic */ uai(int i) {
        this.c = i;
    }

    public abstract boolean S(int i, Parcel parcel, Parcel parcel2);

    public boolean T(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean U(Parcel parcel, int i);

    public abstract boolean V(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.c;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact = false;
        Object[] objArr = 0;
        switch (this.c) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return S(i, parcel, parcel2);
            case 1:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 2:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                q5j q5jVar = (q5j) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = qgi.a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(ho7.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    jcj jcjVar = q5jVar.f.a;
                    n2g n2gVar = q5jVar.e;
                    jcjVar.c(n2gVar);
                    q5jVar.d.v("onRequestInfo", new Object[0]);
                    if (bundle.getInt("error.code", -2) != 0) {
                        n2gVar.c(new InstallException(bundle.getInt("error.code", -2)));
                    } else {
                        p6j p6jVar = q5jVar.g;
                        bundle.getInt("version.code", -1);
                        int i4 = bundle.getInt("update.availability");
                        bundle.getInt("install.status", 0);
                        if (bundle.getInt("client.version.staleness", -1) != -1) {
                            bundle.getInt("client.version.staleness");
                        }
                        bundle.getInt("in.app.update.priority", 0);
                        bundle.getLong("bytes.downloaded");
                        bundle.getLong("total.bytes.to.download");
                        bundle.getLong("additional.size.required");
                        x8j x8jVar = p6jVar.d;
                        x8jVar.getClass();
                        x8j.a(new File(x8jVar.a.getFilesDir(), "assetpacks"));
                        HashMap map = new HashMap();
                        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                        HashSet hashSet = new HashSet();
                        if (integerArrayList != null) {
                            hashSet.addAll(integerArrayList);
                        }
                        map.put("blocking.destructive.intent", hashSet);
                        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                        HashSet hashSet2 = new HashSet();
                        if (integerArrayList2 != null) {
                            hashSet2.addAll(integerArrayList2);
                        }
                        map.put("nonblocking.destructive.intent", hashSet2);
                        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                        HashSet hashSet3 = new HashSet();
                        if (integerArrayList3 != null) {
                            hashSet3.addAll(integerArrayList3);
                        }
                        map.put("blocking.intent", hashSet3);
                        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                        HashSet hashSet4 = new HashSet();
                        if (integerArrayList4 != null) {
                            hashSet4.addAll(integerArrayList4);
                        }
                        map.put("nonblocking.intent", hashSet4);
                        n2gVar.d(new rq(i4));
                    }
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i5 = qgi.a;
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(ho7.f(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    q5jVar.f.a.c(q5jVar.e);
                    q5jVar.d.v("onCompleteUpdate", new Object[0]);
                }
                return true;
            case 3:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                rpi rpiVar = (rpi) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i6 = rgi.a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(ho7.f(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                z8j z8jVar = rpiVar.f.a;
                if (z8jVar != null) {
                    n2g n2gVar2 = rpiVar.e;
                    synchronized (z8jVar.f) {
                        z8jVar.e.remove(n2gVar2);
                    }
                    z8jVar.a().post(new a2j(objArr == true ? 1 : 0, z8jVar));
                }
                rpiVar.d.a("onGetLaunchReviewFlowInfo", new Object[0]);
                rpiVar.e.d(new kci((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                return true;
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return T(i, parcel, parcel2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return U(parcel, i);
            case 6:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return T(i, parcel, parcel2);
            case 7:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return V(i, parcel, parcel2);
        }
    }

    public uai(String str, int i) {
        this.c = i;
        switch (i) {
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 7:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
