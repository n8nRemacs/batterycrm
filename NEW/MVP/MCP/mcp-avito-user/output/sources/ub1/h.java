package ub1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;

/* loaded from: classes9.dex */
public abstract class h extends Binder implements IInterface {
    public h() {
        attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i12, Parcel parcel, Parcel parcel2, int i13) {
        RuStoreException ruStoreUserUnauthorizedException;
        if (i12 >= 1 && i12 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
        if (i12 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.LaunchReviewFlowCallback");
            return true;
        }
        if (i12 == 1) {
            ServiceConnectionC49025g serviceConnectionC49025g = ServiceConnectionC49025g.this;
            serviceConnectionC49025g.f440153e.invoke();
            ru.rustore.sdk.core.util.c.a(serviceConnectionC49025g.f440150b, serviceConnectionC49025g);
        } else {
            if (i12 != 2) {
                return super.onTransact(i12, parcel, parcel2, i13);
            }
            int i14 = parcel.readInt();
            String string = parcel.readString();
            ServiceConnectionC49025g serviceConnectionC49025g2 = ServiceConnectionC49025g.this;
            v vVar = serviceConnectionC49025g2.f440154f;
            if (i14 == 1001) {
                ruStoreUserUnauthorizedException = new RuStoreUserUnauthorizedException();
            } else if (i14 == 1004) {
                ruStoreUserUnauthorizedException = new RuStoreUserBannedException();
            } else if (i14 != 1005) {
                switch (i14) {
                    case 3001:
                        ruStoreUserUnauthorizedException = new RuStoreRequestLimitReached();
                        break;
                    case 3002:
                        ruStoreUserUnauthorizedException = new RuStoreReviewExists();
                        break;
                    case 3003:
                        ruStoreUserUnauthorizedException = new RuStoreInvalidReviewInfo();
                        break;
                    default:
                        if (string == null) {
                            string = "";
                        }
                        ruStoreUserUnauthorizedException = new RuStoreException(string);
                        break;
                }
            } else {
                ruStoreUserUnauthorizedException = new RuStoreApplicationBannedException();
            }
            vVar.invoke(ruStoreUserUnauthorizedException);
            ru.rustore.sdk.core.util.c.a(serviceConnectionC49025g2.f440150b, serviceConnectionC49025g2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
