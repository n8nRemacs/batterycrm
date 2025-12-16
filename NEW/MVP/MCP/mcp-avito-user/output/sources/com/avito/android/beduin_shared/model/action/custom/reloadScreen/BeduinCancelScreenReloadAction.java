package com.avito.android.beduin_shared.model.action.custom.reloadScreen;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin_models.BeduinAction;
import kotlin.Metadata;

/* compiled from: BeduinCancelScreenReloadAction.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/reloadScreen/BeduinCancelScreenReloadAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Landroid/os/Parcelable;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCancelScreenReloadAction implements BeduinAction, Parcelable, InterfaceC15524c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final BeduinCancelScreenReloadAction f105297b = new BeduinCancelScreenReloadAction();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Class<BeduinCancelScreenReloadAction> f105298c = BeduinCancelScreenReloadAction.class;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f105299d = "cancelScreenReload";

    @k
    public static final Parcelable.Creator<BeduinCancelScreenReloadAction> CREATOR = new a();

    /* compiled from: BeduinCancelScreenReloadAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCancelScreenReloadAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCancelScreenReloadAction createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BeduinCancelScreenReloadAction.f105297b;
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCancelScreenReloadAction[] newArray(int i12) {
            return new BeduinCancelScreenReloadAction[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeduinCancelScreenReloadAction) {
            return BeduinCancelScreenReloadAction.class.equals(obj.getClass());
        }
        return false;
    }

    @Override // Ui.InterfaceC15524c
    @k
    public final Class<BeduinCancelScreenReloadAction> getAction() {
        return f105298c;
    }

    @Override // Ui.InterfaceC15524c
    @k
    public final String getType() {
        return f105299d;
    }

    public final int hashCode() {
        return -1524913842;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
