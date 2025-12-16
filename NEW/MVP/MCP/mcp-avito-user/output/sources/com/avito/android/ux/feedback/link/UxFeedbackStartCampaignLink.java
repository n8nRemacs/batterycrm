package com.avito.android.ux.feedback.link;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;
import q50.InterfaceC47204b;

/* compiled from: UxFeedbackStartCampaignLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ux/feedback/link/UxFeedbackStartCampaignLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_ux-feedback_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class UxFeedbackStartCampaignLink extends DeepLink {

    @k
    public static final Parcelable.Creator<UxFeedbackStartCampaignLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f319189c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, String> f319190d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Map<String, Object> f319191e;

    /* compiled from: UxFeedbackStartCampaignLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UxFeedbackStartCampaignLink> {
        @Override // android.os.Parcelable.Creator
        public final UxFeedbackStartCampaignLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = h.c(UxFeedbackStartCampaignLink.class, parcel, linkedHashMap3, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap3;
            }
            return new UxFeedbackStartCampaignLink(string, z12, linkedHashMap2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final UxFeedbackStartCampaignLink[] newArray(int i12) {
            return new UxFeedbackStartCampaignLink[i12];
        }
    }

    public UxFeedbackStartCampaignLink(@k String str, boolean z12, @k Map<String, String> map, @l Map<String, ? extends Object> map2) {
        this.f319188b = str;
        this.f319189c = z12;
        this.f319190d = map;
        this.f319191e = map2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxFeedbackStartCampaignLink)) {
            return false;
        }
        UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink = (UxFeedbackStartCampaignLink) obj;
        return L.f(this.f319188b, uxFeedbackStartCampaignLink.f319188b) && this.f319189c == uxFeedbackStartCampaignLink.f319189c && L.f(this.f319190d, uxFeedbackStartCampaignLink.f319190d) && L.f(this.f319191e, uxFeedbackStartCampaignLink.f319191e);
    }

    public final int hashCode() {
        int iC2 = c.c(r.i(this.f319188b.hashCode() * 31, 31, this.f319189c), 31, this.f319190d);
        Map<String, Object> map = this.f319191e;
        return iC2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFeedbackStartCampaignLink(eventName=");
        sb2.append(this.f319188b);
        sb2.append(", skipIfStartedBefore=");
        sb2.append(this.f319189c);
        sb2.append(", extraProperties=");
        sb2.append(this.f319190d);
        sb2.append(", attributes=");
        return r.w(sb2, this.f319191e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f319188b);
        parcel.writeInt(this.f319189c ? 1 : 0);
        Iterator itI = C0.i(parcel, this.f319190d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Map<String, Object> map = this.f319191e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH.next();
            h.h(parcel, (String) entry2.getKey(), entry2);
        }
    }
}
