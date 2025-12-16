package com.avito.android.remote.model.section;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import com.avito.android.remote.model.SerpAdvert;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VipAdvert.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/section/VipAdvert;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VipAdvert$Companion$CREATOR$1 extends N implements l<Parcel, VipAdvert> {
    public static final VipAdvert$Companion$CREATOR$1 INSTANCE = new VipAdvert$Companion$CREATOR$1();

    public VipAdvert$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final VipAdvert invoke(@k Parcel parcel) {
        return new VipAdvert((SerpAdvert) parcel.readParcelable(SerpAdvert.class.getClassLoader()));
    }
}
