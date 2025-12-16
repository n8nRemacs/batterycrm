package com.avito.android.libs.saved_searches.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SavedSearchLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/deeplinks/SavedSearchLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class SavedSearchLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SavedSearchLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f181437b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Map<String, String> f181438c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f181439d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f181440e;

    /* compiled from: SavedSearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchLink> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SavedSearchLink(string, parcel.readString(), parcel.readString(), linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchLink[] newArray(int i12) {
            return new SavedSearchLink[i12];
        }
    }

    public SavedSearchLink() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f181437b);
        Map<String, String> map = this.f181438c;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.f181439d);
        parcel.writeString(this.f181440e);
    }

    public /* synthetic */ SavedSearchLink(String str, Map map, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 2) != 0 ? null : map);
    }

    public SavedSearchLink(@l String str, @l String str2, @l String str3, @l Map map) {
        this.f181437b = str;
        this.f181438c = map;
        this.f181439d = str2;
        this.f181440e = str3;
    }
}
