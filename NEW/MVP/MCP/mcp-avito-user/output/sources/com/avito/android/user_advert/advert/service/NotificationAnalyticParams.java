package com.avito.android.user_advert.advert.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UserAdvertService.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/service/NotificationAnalyticParams;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationAnalyticParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<NotificationAnalyticParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f310611b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f310612c;

    /* compiled from: UserAdvertService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationAnalyticParams> {
        @Override // android.os.Parcelable.Creator
        public final NotificationAnalyticParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new NotificationAnalyticParams(linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationAnalyticParams[] newArray(int i12) {
            return new NotificationAnalyticParams[i12];
        }
    }

    public NotificationAnalyticParams(@Y61.k Map<String, String> map, @Y61.k String str) {
        this.f310611b = map;
        this.f310612c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f310611b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f310612c);
    }
}
