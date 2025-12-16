package com.avito.android.messenger.channels;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsFragmentData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/ChannelsFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChannelsFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<ChannelsFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ChannelsFragmentArguments f186712b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTab f186713c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f186714d;

    /* compiled from: ChannelsFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsFragmentData createFromParcel(Parcel parcel) {
            return new ChannelsFragmentData(parcel.readInt() == 0 ? null : ChannelsFragmentArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsFragmentData[] newArray(int i12) {
            return new ChannelsFragmentData[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsFragmentData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF115238d() {
        return this.f186713c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF186714d() {
        return this.f186714d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsFragmentData) && L.f(this.f186712b, ((ChannelsFragmentData) obj).f186712b);
    }

    public final int hashCode() {
        ChannelsFragmentArguments channelsFragmentArguments = this.f186712b;
        if (channelsFragmentArguments == null) {
            return 0;
        }
        return channelsFragmentArguments.hashCode();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        return "ChannelsFragmentData(arguments=" + this.f186712b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ChannelsFragmentArguments channelsFragmentArguments = this.f186712b;
        if (channelsFragmentArguments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsFragmentArguments.writeToParcel(parcel, i12);
        }
    }

    public ChannelsFragmentData(@l ChannelsFragmentArguments channelsFragmentArguments) {
        this.f186712b = channelsFragmentArguments;
        this.f186713c = NavigationTab.f106973i;
        this.f186714d = true;
    }

    public /* synthetic */ ChannelsFragmentData(ChannelsFragmentArguments channelsFragmentArguments, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : channelsFragmentArguments);
    }
}
