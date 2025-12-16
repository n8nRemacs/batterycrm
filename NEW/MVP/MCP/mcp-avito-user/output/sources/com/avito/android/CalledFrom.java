package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.notification.Payload;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CalledFrom.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/CalledFrom;", "Lcom/avito/android/I0;", "Landroid/os/Parcelable;", "AndroidShortcuts", "AppLinking", "NotificationCenter", "Push", "Lcom/avito/android/CalledFrom$AndroidShortcuts;", "Lcom/avito/android/CalledFrom$AppLinking;", "Lcom/avito/android/CalledFrom$NotificationCenter;", "Lcom/avito/android/CalledFrom$Push;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CalledFrom implements I0, Parcelable {

    /* compiled from: CalledFrom.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/CalledFrom$AndroidShortcuts;", "Lcom/avito/android/CalledFrom;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AndroidShortcuts extends CalledFrom {

        @Y61.k
        public static final Parcelable.Creator<AndroidShortcuts> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f67241b;

        /* compiled from: CalledFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AndroidShortcuts> {
            @Override // android.os.Parcelable.Creator
            public final AndroidShortcuts createFromParcel(Parcel parcel) {
                return new AndroidShortcuts(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AndroidShortcuts[] newArray(int i12) {
                return new AndroidShortcuts[i12];
            }
        }

        public AndroidShortcuts(@Y61.k String str) {
            super("android_shortcuts", null);
            this.f67241b = str;
        }

        @Override // com.avito.android.I0
        public final boolean c() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AndroidShortcuts) && kotlin.jvm.internal.L.f(this.f67241b, ((AndroidShortcuts) obj).f67241b);
        }

        public final int hashCode() {
            return this.f67241b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AndroidShortcuts(path="), this.f67241b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f67241b);
        }
    }

    /* compiled from: CalledFrom.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/CalledFrom$AppLinking;", "Lcom/avito/android/CalledFrom;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AppLinking extends CalledFrom {

        @Y61.k
        public static final Parcelable.Creator<AppLinking> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f67242b;

        /* compiled from: CalledFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AppLinking> {
            @Override // android.os.Parcelable.Creator
            public final AppLinking createFromParcel(Parcel parcel) {
                return new AppLinking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppLinking[] newArray(int i12) {
                return new AppLinking[i12];
            }
        }

        public AppLinking(@Y61.k String str) {
            super("appindexing", null);
            this.f67242b = str;
        }

        @Override // com.avito.android.I0
        public final boolean c() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppLinking) && kotlin.jvm.internal.L.f(this.f67242b, ((AppLinking) obj).f67242b);
        }

        public final int hashCode() {
            return this.f67242b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AppLinking(path="), this.f67242b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f67242b);
        }
    }

    /* compiled from: CalledFrom.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/CalledFrom$NotificationCenter;", "Lcom/avito/android/CalledFrom;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotificationCenter extends CalledFrom {

        @Y61.k
        public static final Parcelable.Creator<NotificationCenter> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, String> f67243b;

        /* compiled from: CalledFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotificationCenter> {
            @Override // android.os.Parcelable.Creator
            public final NotificationCenter createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = com.akita.compose.theme.re23.style.C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                return new NotificationCenter(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationCenter[] newArray(int i12) {
                return new NotificationCenter[i12];
            }
        }

        public NotificationCenter(@Y61.k Map<String, String> map) {
            super("notification_center", null);
            this.f67243b = map;
        }

        @Override // com.avito.android.I0
        public final boolean c() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationCenter) && kotlin.jvm.internal.L.f(this.f67243b, ((NotificationCenter) obj).f67243b);
        }

        public final int hashCode() {
            return this.f67243b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.w(new StringBuilder("NotificationCenter(analyticParams="), this.f67243b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itI = com.akita.compose.theme.re23.style.C0.i(parcel, this.f67243b);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    /* compiled from: CalledFrom.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/CalledFrom$Push;", "Lcom/avito/android/CalledFrom;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Push extends CalledFrom {

        @Y61.k
        public static final Parcelable.Creator<Push> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f67244b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Payload f67245c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Map<String, String> f67246d;

        /* compiled from: CalledFrom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Push> {
            @Override // android.os.Parcelable.Creator
            public final Push createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                Payload payload = (Payload) parcel.readParcelable(Push.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = com.akita.compose.theme.re23.style.C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Push(string, payload, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Push[] newArray(int i12) {
                return new Push[i12];
            }
        }

        public Push(@Y61.k String str, @Y61.l Payload payload, @Y61.l Map<String, String> map) {
            super("push", null);
            this.f67244b = str;
            this.f67245c = payload;
            this.f67246d = map;
        }

        @Override // com.avito.android.I0
        public final boolean c() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Push)) {
                return false;
            }
            Push push = (Push) obj;
            return kotlin.jvm.internal.L.f(this.f67244b, push.f67244b) && kotlin.jvm.internal.L.f(this.f67245c, push.f67245c) && kotlin.jvm.internal.L.f(this.f67246d, push.f67246d);
        }

        public final int hashCode() {
            int iHashCode = this.f67244b.hashCode() * 31;
            Payload payload = this.f67245c;
            int iHashCode2 = (iHashCode + (payload == null ? 0 : payload.hashCode())) * 31;
            Map<String, String> map = this.f67246d;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Push(path=");
            sb2.append(this.f67244b);
            sb2.append(", payload=");
            sb2.append(this.f67245c);
            sb2.append(", analyticParams=");
            return androidx.appcompat.app.r.w(sb2, this.f67246d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f67244b);
            parcel.writeParcelable(this.f67245c, i12);
            Map<String, String> map = this.f67246d;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = com.akita.compose.theme.re23.style.C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    public CalledFrom(String str, C42822w c42822w) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
