package com.avito.android.messenger.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: ChannelActivityFragmentData.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChannelActivityFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<ChannelActivityFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ChannelActivityArguments f188929b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f188930c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f188931d;

    /* compiled from: ChannelActivityFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelActivityFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ChannelActivityFragmentData createFromParcel(Parcel parcel) {
            return new ChannelActivityFragmentData((ChannelActivityArguments) parcel.readParcelable(ChannelActivityFragmentData.class.getClassLoader()), (NavigationTabSetItem) parcel.readParcelable(ChannelActivityFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelActivityFragmentData[] newArray(int i12) {
            return new ChannelActivityFragmentData[i12];
        }
    }

    public ChannelActivityFragmentData(@Y61.k ChannelActivityArguments channelActivityArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f188929b = channelActivityArguments;
        this.f188930c = navigationTabSetItem;
        this.f188931d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF188931d() {
        return this.f188931d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF227175d() {
        return true;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f188929b, i12);
        parcel.writeParcelable(this.f188930c, i12);
    }
}
