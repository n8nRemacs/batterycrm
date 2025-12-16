package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import java.util.List;
import shark.AndroidResourceIdNames;

/* compiled from: BundleListRetriever.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC23095i extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final int f47664b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37401r1<Bundle> f47665a;

    static {
        f47664b = androidx.media3.common.util.M.f47887a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
    }

    public BinderC23095i(List<Bundle> list) {
        this.f47665a = AbstractC37401r1.v(list);
    }

    public static AbstractC37401r1<Bundle> a(IBinder iBinder) {
        int i12;
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        int i13 = 1;
        int i14 = 0;
        while (i13 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i14);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i12 = parcelObtain2.readInt();
                        if (i12 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            aVar.g(bundle);
                            i14++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i13 = i12;
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVar.i();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i12, Parcel parcel, @j.P Parcel parcel2, int i13) {
        if (i12 != 1) {
            return super.onTransact(i12, parcel, parcel2, i13);
        }
        if (parcel2 == null) {
            return false;
        }
        AbstractC37401r1<Bundle> abstractC37401r1 = this.f47665a;
        int size = abstractC37401r1.size();
        int i14 = parcel.readInt();
        while (i14 < size && parcel2.dataSize() < f47664b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(abstractC37401r1.get(i14));
            i14++;
        }
        parcel2.writeInt(i14 < size ? 2 : 0);
        return true;
    }
}
