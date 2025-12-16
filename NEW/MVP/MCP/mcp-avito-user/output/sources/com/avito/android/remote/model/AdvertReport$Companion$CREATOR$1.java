package com.avito.android.remote.model;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import com.avito.android.remote.model.AdvertReport;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.J3;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertReport.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/AdvertReport;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertReport$Companion$CREATOR$1 extends N implements l<Parcel, AdvertReport> {
    public static final AdvertReport$Companion$CREATOR$1 INSTANCE = new AdvertReport$Companion$CREATOR$1();

    public AdvertReport$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final AdvertReport invoke(@k Parcel parcel) {
        return new AdvertReport(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AttributedText.class.getClassLoader()), J3.a(parcel, AdvertReport.Result.class.getClassLoader()));
    }
}
