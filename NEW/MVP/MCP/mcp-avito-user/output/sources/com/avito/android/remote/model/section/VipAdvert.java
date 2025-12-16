package com.avito.android.remote.model.section;

import X41.f;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: VipAdvert.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/section/VipAdvert;", "Lcom/avito/android/remote/model/section/SectionElement;", "Lcom/avito/android/remote/model/SerpAdvert;", "item", "<init>", "(Lcom/avito/android/remote/model/SerpAdvert;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/avito/android/remote/model/SerpAdvert;", "getItem", "()Lcom/avito/android/remote/model/SerpAdvert;", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public final class VipAdvert implements SectionElement {

    @f
    @k
    public static final Parcelable.Creator<VipAdvert> CREATOR;

    @k
    private final SerpAdvert item;

    static {
        VipAdvert$Companion$CREATOR$1 vipAdvert$Companion$CREATOR$1 = VipAdvert$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(vipAdvert$Companion$CREATOR$1);
    }

    public VipAdvert(@k SerpAdvert serpAdvert) {
        this.item = serpAdvert;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final SerpAdvert getItem() {
        return this.item;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeParcelable(this.item, flags);
    }
}
