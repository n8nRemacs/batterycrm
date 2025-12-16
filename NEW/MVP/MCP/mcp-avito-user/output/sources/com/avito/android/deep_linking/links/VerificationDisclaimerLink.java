package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: VerificationDisclaimerLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/VerificationDisclaimerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class VerificationDisclaimerLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<VerificationDisclaimerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f133839b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133840c;

    /* compiled from: VerificationDisclaimerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationDisclaimerLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationDisclaimerLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationDisclaimerLink(linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationDisclaimerLink[] newArray(int i12) {
            return new VerificationDisclaimerLink[i12];
        }
    }

    public VerificationDisclaimerLink(@Y61.k Map<String, String> map, @Y61.l String str) {
        this.f133839b = map;
        this.f133840c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f133839b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f133840c);
    }

    public /* synthetic */ VerificationDisclaimerLink(Map map, String str, int i12, C42822w c42822w) {
        this(map, (i12 & 2) != 0 ? null : str);
    }
}
