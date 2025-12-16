package com.avito.android.remote.model;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import com.avito.android.remote.model.SellerConnection;
import com.avito.android.util.J3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SellerConnection.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/SellerConnection;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SellerConnection$Companion$CREATOR$1 extends N implements l<Parcel, SellerConnection> {
    public static final SellerConnection$Companion$CREATOR$1 INSTANCE = new SellerConnection$Companion$CREATOR$1();

    public SellerConnection$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final SellerConnection invoke(@k Parcel parcel) {
        String string = parcel.readString();
        List listA = J3.a(parcel, SellerConnection.Type.class.getClassLoader());
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        return new SellerConnection(string, listA);
    }
}
