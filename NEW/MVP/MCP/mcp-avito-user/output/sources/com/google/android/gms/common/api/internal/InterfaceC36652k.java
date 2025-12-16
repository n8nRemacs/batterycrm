package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36652k extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    public static abstract class a extends zab implements InterfaceC36652k {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @j.N
        public static InterfaceC36652k asInterface(@j.N IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof InterfaceC36652k ? (InterfaceC36652k) iInterfaceQueryLocalInterface : new E0(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean e4(int i12, @j.N Parcel parcel, @j.N Parcel parcel2) {
            if (i12 != 1) {
                return false;
            }
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(@j.N Status status);
}
