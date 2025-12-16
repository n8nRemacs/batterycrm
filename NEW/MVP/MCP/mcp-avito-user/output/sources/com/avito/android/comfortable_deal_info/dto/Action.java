package com.avito.android.comfortable_deal_info.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Model.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_info/dto/Action;", "Landroid/os/Parcelable;", "_avito_comfortable-deal-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Action implements Parcelable {

    @k
    public static final Parcelable.Creator<Action> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f123483b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f123484c;

    /* compiled from: Model.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Action> {
        @Override // android.os.Parcelable.Creator
        public final Action createFromParcel(Parcel parcel) {
            return new Action(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Action[] newArray(int i12) {
            return new Action[i12];
        }
    }

    public Action(@k String str, @k String str2) {
        this.f123483b = str;
        this.f123484c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return L.f(this.f123483b, action.f123483b) && L.f(this.f123484c, action.f123484c);
    }

    public final int hashCode() {
        return this.f123484c.hashCode() + (this.f123483b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Action(text=");
        sb2.append(this.f123483b);
        sb2.append(", style=");
        return C22026a.c(sb2, this.f123484c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f123483b);
        parcel.writeString(this.f123484c);
    }
}
