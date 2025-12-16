package com.avito.android.str_seller_orders_important_to_note;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrSellerImportantToNoteDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/StrSellerImportantToNoteDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_str-seller-orders-important-to-note_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrSellerImportantToNoteDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StrSellerImportantToNoteDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f291215b;

    /* compiled from: StrSellerImportantToNoteDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrSellerImportantToNoteDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StrSellerImportantToNoteDeeplink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new StrSellerImportantToNoteDeeplink(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StrSellerImportantToNoteDeeplink[] newArray(int i12) {
            return new StrSellerImportantToNoteDeeplink[i12];
        }
    }

    public StrSellerImportantToNoteDeeplink(@Y61.k Map<String, String> map) {
        this.f291215b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f291215b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
