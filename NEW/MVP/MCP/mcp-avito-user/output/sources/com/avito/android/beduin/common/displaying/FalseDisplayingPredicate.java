package com.avito.android.beduin.common.displaying;

import K51.d;
import Y61.k;
import Y61.l;
import ai.InterfaceC19892b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FalseDisplayingPredicate.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/beduin/common/displaying/FalseDisplayingPredicate;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/network/parse/b;", "<init>", "()V", "", "", "", "store", "", "getVisibility", "(Ljava/util/Map;)Z", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FalseDisplayingPredicate implements DisplayingPredicate, com.avito.android.beduin.network.parse.b {

    @k
    public static final FalseDisplayingPredicate INSTANCE = new FalseDisplayingPredicate();

    @k
    public static final Parcelable.Creator<FalseDisplayingPredicate> CREATOR = new a();

    /* compiled from: FalseDisplayingPredicate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FalseDisplayingPredicate> {
        @Override // android.os.Parcelable.Creator
        public final FalseDisplayingPredicate createFromParcel(Parcel parcel) {
            parcel.readInt();
            return FalseDisplayingPredicate.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final FalseDisplayingPredicate[] newArray(int i12) {
            return new FalseDisplayingPredicate[i12];
        }
    }

    /* compiled from: FalseDisplayingPredicate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/displaying/FalseDisplayingPredicate$b;", "Lai/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC19892b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Class<? extends DisplayingPredicate> f103299a = FalseDisplayingPredicate.class;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f103300b = "false";

        @Override // ai.InterfaceC19892b
        @k
        public final Class<? extends DisplayingPredicate> a() {
            return this.f103299a;
        }

        @Override // ai.InterfaceC19892b
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF103304b() {
            return this.f103300b;
        }
    }

    private FalseDisplayingPredicate() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return FalseDisplayingPredicate.class.equals(other != null ? other.getClass() : null);
    }

    @Override // com.avito.android.beduin_models.DisplayingPredicate
    public boolean getVisibility(@k Map<String, ? extends Object> store) {
        return false;
    }

    public int hashCode() {
        return FalseDisplayingPredicate.class.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(1);
    }
}
