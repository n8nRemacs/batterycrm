package com.avito.android.messenger.channels;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsFragmentArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/ChannelsFragmentArguments;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChannelsFragmentArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ChannelsFragmentArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f186710b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f186711c;

    /* compiled from: ChannelsFragmentArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelsFragmentArguments> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsFragmentArguments createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChannelsFragmentArguments(string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsFragmentArguments[] newArray(int i12) {
            return new ChannelsFragmentArguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsFragmentArguments() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsFragmentArguments)) {
            return false;
        }
        ChannelsFragmentArguments channelsFragmentArguments = (ChannelsFragmentArguments) obj;
        return L.f(this.f186710b, channelsFragmentArguments.f186710b) && L.f(this.f186711c, channelsFragmentArguments.f186711c);
    }

    public final int hashCode() {
        String str = this.f186710b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f186711c;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelsFragmentArguments(fromPage=");
        sb2.append(this.f186710b);
        sb2.append(", enableChannelsUnreadFilter=");
        return C0.g(sb2, this.f186711c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f186710b);
        Boolean bool = this.f186711c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public ChannelsFragmentArguments(@l String str, @l Boolean bool) {
        this.f186710b = str;
        this.f186711c = bool;
    }

    public /* synthetic */ ChannelsFragmentArguments(String str, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : bool);
    }
}
