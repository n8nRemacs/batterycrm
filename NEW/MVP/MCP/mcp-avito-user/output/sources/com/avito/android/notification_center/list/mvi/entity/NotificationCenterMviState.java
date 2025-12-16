package com.avito.android.notification_center.list.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.notification.Notification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NotificationCenterMviState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationCenterMviState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Uri f207680b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<TV0.a> f207681c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Notification> f207682d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f207683e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Boolean f207684f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f207685g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f207678h = new a(null);

    @k
    public static final Parcelable.Creator<NotificationCenterMviState> CREATOR = new b();

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final NotificationCenterMviState f207679i = new NotificationCenterMviState(null, null, null, null, Boolean.TRUE, Boolean.FALSE);

    /* compiled from: NotificationCenterMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState$a;", "", "<init>", "()V", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NotificationCenterMviState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<NotificationCenterMviState> {
        @Override // android.os.Parcelable.Creator
        public final NotificationCenterMviState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Uri uri = (Uri) parcel.readParcelable(NotificationCenterMviState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readValue(NotificationCenterMviState.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(NotificationCenterMviState.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new NotificationCenterMviState(uri, arrayList, arrayList2, (PrintableText) parcel.readParcelable(NotificationCenterMviState.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationCenterMviState[] newArray(int i12) {
            return new NotificationCenterMviState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCenterMviState(@l Uri uri, @l List<? extends TV0.a> list, @l List<Notification> list2, @l PrintableText printableText, @l Boolean bool, @l Boolean bool2) {
        this.f207680b = uri;
        this.f207681c = list;
        this.f207682d = list2;
        this.f207683e = printableText;
        this.f207684f = bool;
        this.f207685g = bool2;
    }

    public static NotificationCenterMviState a(NotificationCenterMviState notificationCenterMviState, Uri uri, List list, List list2, PrintableText printableText, Boolean bool, Boolean bool2, int i12) {
        if ((i12 & 1) != 0) {
            uri = notificationCenterMviState.f207680b;
        }
        Uri uri2 = uri;
        if ((i12 & 2) != 0) {
            list = notificationCenterMviState.f207681c;
        }
        List list3 = list;
        if ((i12 & 4) != 0) {
            list2 = notificationCenterMviState.f207682d;
        }
        List list4 = list2;
        if ((i12 & 8) != 0) {
            printableText = notificationCenterMviState.f207683e;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 16) != 0) {
            bool = notificationCenterMviState.f207684f;
        }
        Boolean bool3 = bool;
        if ((i12 & 32) != 0) {
            bool2 = notificationCenterMviState.f207685g;
        }
        notificationCenterMviState.getClass();
        return new NotificationCenterMviState(uri2, list3, list4, printableText2, bool3, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationCenterMviState)) {
            return false;
        }
        NotificationCenterMviState notificationCenterMviState = (NotificationCenterMviState) obj;
        return L.f(this.f207680b, notificationCenterMviState.f207680b) && L.f(this.f207681c, notificationCenterMviState.f207681c) && L.f(this.f207682d, notificationCenterMviState.f207682d) && L.f(this.f207683e, notificationCenterMviState.f207683e) && L.f(this.f207684f, notificationCenterMviState.f207684f) && L.f(this.f207685g, notificationCenterMviState.f207685g);
    }

    public final int hashCode() {
        Uri uri = this.f207680b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        List<TV0.a> list = this.f207681c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Notification> list2 = this.f207682d;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PrintableText printableText = this.f207683e;
        int iHashCode4 = (iHashCode3 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Boolean bool = this.f207684f;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f207685g;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationCenterMviState(nextPage=");
        sb2.append(this.f207680b);
        sb2.append(", dataSource=");
        sb2.append(this.f207681c);
        sb2.append(", notifications=");
        sb2.append(this.f207682d);
        sb2.append(", errorMessage=");
        sb2.append(this.f207683e);
        sb2.append(", isLoading=");
        sb2.append(this.f207684f);
        sb2.append(", isRefreshLoading=");
        return C0.g(sb2, this.f207685g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f207680b, i12);
        List<TV0.a> list = this.f207681c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeValue(itA.next());
            }
        }
        List<Notification> list2 = this.f207682d;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f207683e, i12);
        Boolean bool = this.f207684f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f207685g;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
