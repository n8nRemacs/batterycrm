package com.avito.android.ai_assistant;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AiAssistantOpenLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/AiAssistantOpenLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "_avito_ai-assistant_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class AiAssistantOpenLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<AiAssistantOpenLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88715b;

    /* compiled from: AiAssistantOpenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AiAssistantOpenLink> {
        @Override // android.os.Parcelable.Creator
        public final AiAssistantOpenLink createFromParcel(Parcel parcel) {
            return new AiAssistantOpenLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AiAssistantOpenLink[] newArray(int i12) {
            return new AiAssistantOpenLink[i12];
        }
    }

    public AiAssistantOpenLink(@k String str) {
        this.f88715b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f88715b);
    }
}
