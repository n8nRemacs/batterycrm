package com.avito.android.notifications_settings.screen.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NotificationsSettingsState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationsSettingsState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f208126b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f208127c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f208128d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<TV0.a> f208129e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final NotificationsSettings f208130f;

    /* compiled from: NotificationsSettingsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationsSettingsState> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            PrintableText printableText = (PrintableText) parcel.readParcelable(NotificationsSettingsState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readValue(NotificationsSettingsState.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new NotificationsSettingsState(z12, z13, printableText, arrayList, (NotificationsSettings) parcel.readParcelable(NotificationsSettingsState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsSettingsState[] newArray(int i12) {
            return new NotificationsSettingsState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsSettingsState(boolean z12, boolean z13, @l PrintableText printableText, @l List<? extends TV0.a> list, @l NotificationsSettings notificationsSettings) {
        this.f208126b = z12;
        this.f208127c = z13;
        this.f208128d = printableText;
        this.f208129e = list;
        this.f208130f = notificationsSettings;
    }

    public static NotificationsSettingsState a(NotificationsSettingsState notificationsSettingsState, boolean z12, boolean z13, PrintableText printableText, List list, NotificationsSettings notificationsSettings, int i12) {
        if ((i12 & 1) != 0) {
            z12 = notificationsSettingsState.f208126b;
        }
        boolean z14 = z12;
        if ((i12 & 2) != 0) {
            z13 = notificationsSettingsState.f208127c;
        }
        boolean z15 = z13;
        if ((i12 & 4) != 0) {
            printableText = notificationsSettingsState.f208128d;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 8) != 0) {
            list = notificationsSettingsState.f208129e;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            notificationsSettings = notificationsSettingsState.f208130f;
        }
        notificationsSettingsState.getClass();
        return new NotificationsSettingsState(z14, z15, printableText2, list2, notificationsSettings);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsState)) {
            return false;
        }
        NotificationsSettingsState notificationsSettingsState = (NotificationsSettingsState) obj;
        return this.f208126b == notificationsSettingsState.f208126b && this.f208127c == notificationsSettingsState.f208127c && L.f(this.f208128d, notificationsSettingsState.f208128d) && L.f(this.f208129e, notificationsSettingsState.f208129e) && L.f(this.f208130f, notificationsSettingsState.f208130f);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f208126b) * 31, 31, this.f208127c);
        PrintableText printableText = this.f208128d;
        int iHashCode = (i12 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        List<TV0.a> list = this.f208129e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        NotificationsSettings notificationsSettings = this.f208130f;
        return iHashCode2 + (notificationsSettings != null ? notificationsSettings.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "NotificationsSettingsState(isNotificationsEnabled=" + this.f208126b + ", isLoading=" + this.f208127c + ", error=" + this.f208128d + ", dataSource=" + this.f208129e + ", dataSettings=" + this.f208130f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f208126b ? 1 : 0);
        parcel.writeInt(this.f208127c ? 1 : 0);
        parcel.writeParcelable(this.f208128d, i12);
        List<TV0.a> list = this.f208129e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeValue(itA.next());
            }
        }
        parcel.writeParcelable(this.f208130f, i12);
    }
}
