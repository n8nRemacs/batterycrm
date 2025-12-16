package com.avito.android.str_seller_orders_important_to_note;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantToNoteOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/ImportantToNoteOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_str-seller-orders-important-to-note_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImportantToNoteOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<ImportantToNoteOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f291214b;

    /* compiled from: ImportantToNoteOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantToNoteOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final ImportantToNoteOpenParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new ImportantToNoteOpenParams(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantToNoteOpenParams[] newArray(int i12) {
            return new ImportantToNoteOpenParams[i12];
        }
    }

    public ImportantToNoteOpenParams(@Y61.k Map<String, String> map) {
        this.f291214b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImportantToNoteOpenParams) && L.f(this.f291214b, ((ImportantToNoteOpenParams) obj).f291214b);
    }

    public final int hashCode() {
        return this.f291214b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("ImportantToNoteOpenParams(params="), this.f291214b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f291214b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
