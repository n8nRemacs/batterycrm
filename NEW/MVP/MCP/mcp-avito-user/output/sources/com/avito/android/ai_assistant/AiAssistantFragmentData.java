package com.avito.android.ai_assistant;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bottom_navigation.ui.fragment.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/AiAssistantFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_ai-assistant_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AiAssistantFragmentData implements TabFragmentFactory.Data, h {

    @k
    public static final Parcelable.Creator<AiAssistantFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f88711b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationScreenAction f88712c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AssistantChatArguments f88713d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f88714e;

    /* compiled from: AiAssistantFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AiAssistantFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final AiAssistantFragmentData createFromParcel(Parcel parcel) {
            return new AiAssistantFragmentData((NavigationTabSetItem) parcel.readParcelable(AiAssistantFragmentData.class.getClassLoader()), (NavigationScreenAction) parcel.readParcelable(AiAssistantFragmentData.class.getClassLoader()), AssistantChatArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AiAssistantFragmentData[] newArray(int i12) {
            return new AiAssistantFragmentData[i12];
        }
    }

    public AiAssistantFragmentData(@k NavigationTabSetItem navigationTabSetItem, @k NavigationScreenAction navigationScreenAction, @k AssistantChatArguments assistantChatArguments) {
        this.f88711b = navigationTabSetItem;
        this.f88712c = navigationScreenAction;
        this.f88713d = assistantChatArguments;
        this.f88714e = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4, reason: from getter */
    public final NavigationScreenAction getF264134d() {
        return this.f88712c;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new AiAssistantFragmentData(navigationTabSetItem, this.f88712c, this.f88713d);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF107770d() {
        return this.f88714e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF227175d() {
        return false;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiAssistantFragmentData)) {
            return false;
        }
        AiAssistantFragmentData aiAssistantFragmentData = (AiAssistantFragmentData) obj;
        return L.f(this.f88711b, aiAssistantFragmentData.f88711b) && this.f88712c == aiAssistantFragmentData.f88712c && L.f(this.f88713d, aiAssistantFragmentData.f88713d);
    }

    public final int hashCode() {
        return this.f88713d.hashCode() + ((this.f88712c.hashCode() + (this.f88711b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        return "AiAssistantFragmentData(tab=" + this.f88711b + ", currentScreenAction=" + this.f88712c + ", arguments=" + this.f88713d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f88711b, i12);
        parcel.writeParcelable(this.f88712c, i12);
        this.f88713d.writeToParcel(parcel, i12);
    }

    public /* synthetic */ AiAssistantFragmentData(NavigationTabSetItem navigationTabSetItem, NavigationScreenAction navigationScreenAction, AssistantChatArguments assistantChatArguments, int i12, C42822w c42822w) {
        this(navigationTabSetItem, (i12 & 2) != 0 ? NavigationScreenAction.f107100b : navigationScreenAction, assistantChatArguments);
    }
}
