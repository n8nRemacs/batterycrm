package com.avito.android.comfortable_deal.select_agent.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectAgentArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/model/SelectAgentArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SelectAgentArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectAgentArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f122733b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f122734c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f122735d;

    /* compiled from: SelectAgentArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectAgentArguments> {
        @Override // android.os.Parcelable.Creator
        public final SelectAgentArguments createFromParcel(Parcel parcel) {
            return new SelectAgentArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectAgentArguments[] newArray(int i12) {
            return new SelectAgentArguments[i12];
        }
    }

    public SelectAgentArguments(@k String str, @k String str2, @l String str3) {
        this.f122733b = str;
        this.f122734c = str2;
        this.f122735d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectAgentArguments)) {
            return false;
        }
        SelectAgentArguments selectAgentArguments = (SelectAgentArguments) obj;
        return L.f(this.f122733b, selectAgentArguments.f122733b) && L.f(this.f122734c, selectAgentArguments.f122734c) && L.f(this.f122735d, selectAgentArguments.f122735d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f122733b.hashCode() * 31, 31, this.f122734c);
        String str = this.f122735d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectAgentArguments(requestKey=");
        sb2.append(this.f122733b);
        sb2.append(", dealId=");
        sb2.append(this.f122734c);
        sb2.append(", selectedAgentId=");
        return C22026a.c(sb2, this.f122735d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f122733b);
        parcel.writeString(this.f122734c);
        parcel.writeString(this.f122735d);
    }

    public /* synthetic */ SelectAgentArguments(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
