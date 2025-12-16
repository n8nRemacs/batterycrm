package com.avito.android.avito_finance_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: AvitoFinanceBlockData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction;", "Landroid/os/Parcelable;", "()V", "OpenDeeplink", "SendEvent", "Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction$OpenDeeplink;", "Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction$SendEvent;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AvitoFinanceAction implements Parcelable {

    /* compiled from: AvitoFinanceBlockData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction$OpenDeeplink;", "Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink extends AvitoFinanceAction {

        @k
        public static final Parcelable.Creator<OpenDeeplink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f98014b;

        /* compiled from: AvitoFinanceBlockData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenDeeplink> {
            @Override // android.os.Parcelable.Creator
            public final OpenDeeplink createFromParcel(Parcel parcel) {
                return new OpenDeeplink((DeepLink) parcel.readParcelable(OpenDeeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenDeeplink[] newArray(int i12) {
                return new OpenDeeplink[i12];
            }
        }

        public OpenDeeplink(@k DeepLink deepLink) {
            super(null);
            this.f98014b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f98014b, ((OpenDeeplink) obj).f98014b);
        }

        public final int hashCode() {
            return this.f98014b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f98014b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f98014b, i12);
        }
    }

    /* compiled from: AvitoFinanceBlockData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction$SendEvent;", "Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceAction;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendEvent extends AvitoFinanceAction {

        @k
        public static final Parcelable.Creator<SendEvent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f98015b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Map<String, Object> f98016c;

        /* renamed from: d, reason: collision with root package name */
        public final long f98017d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Boolean f98018e;

        /* compiled from: AvitoFinanceBlockData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SendEvent> {
            @Override // android.os.Parcelable.Creator
            public final SendEvent createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Boolean boolValueOf;
                long j12 = parcel.readLong();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = h.c(SendEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                    }
                }
                long j13 = parcel.readLong();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SendEvent(j12, linkedHashMap, j13, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final SendEvent[] newArray(int i12) {
                return new SendEvent[i12];
            }
        }

        public SendEvent(long j12, @l Map<String, ? extends Object> map, long j13, @l Boolean bool) {
            super(null);
            this.f98015b = j12;
            this.f98016c = map;
            this.f98017d = j13;
            this.f98018e = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendEvent)) {
                return false;
            }
            SendEvent sendEvent = (SendEvent) obj;
            return this.f98015b == sendEvent.f98015b && L.f(this.f98016c, sendEvent.f98016c) && this.f98017d == sendEvent.f98017d && L.f(this.f98018e, sendEvent.f98018e);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f98015b) * 31;
            Map<String, Object> map = this.f98016c;
            int iG2 = r.g((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.f98017d);
            Boolean bool = this.f98018e;
            return iG2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendEvent(id=");
            sb2.append(this.f98015b);
            sb2.append(", params=");
            sb2.append(this.f98016c);
            sb2.append(", version=");
            sb2.append(this.f98017d);
            sb2.append(", hasSensitiveData=");
            return C0.g(sb2, this.f98018e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f98015b);
            Map<String, Object> map = this.f98016c;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            parcel.writeLong(this.f98017d);
            Boolean bool = this.f98018e;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    public /* synthetic */ AvitoFinanceAction(C42822w c42822w) {
        this();
    }

    public AvitoFinanceAction() {
    }
}
