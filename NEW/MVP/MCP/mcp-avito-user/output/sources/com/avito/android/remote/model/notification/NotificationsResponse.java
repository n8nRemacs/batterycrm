package com.avito.android.remote.model.notification;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsResponse.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationsResponse;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "nextPage", "", "Lcom/avito/android/remote/model/notification/Notification;", "notifications", "<init>", "(Landroid/net/Uri;Ljava/util/List;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/util/List;", "copy", "(Landroid/net/Uri;Ljava/util/List;)Lcom/avito/android/remote/model/notification/NotificationsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getNextPage", "Ljava/util/List;", "getNotifications", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NotificationsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationsResponse> CREATOR = new Creator();

    @c("nextPage")
    @l
    private final Uri nextPage;

    @c("notifications")
    @k
    private final List<Notification> notifications;

    /* compiled from: NotificationsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationsResponse createFromParcel(@k Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(NotificationsResponse.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Notification.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new NotificationsResponse(uri, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationsResponse[] newArray(int i12) {
            return new NotificationsResponse[i12];
        }
    }

    public NotificationsResponse(@l Uri uri, @k List<Notification> list) {
        this.nextPage = uri;
        this.notifications = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsResponse copy$default(NotificationsResponse notificationsResponse, Uri uri, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = notificationsResponse.nextPage;
        }
        if ((i12 & 2) != 0) {
            list = notificationsResponse.notifications;
        }
        return notificationsResponse.copy(uri, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @k
    public final List<Notification> component2() {
        return this.notifications;
    }

    @k
    public final NotificationsResponse copy(@l Uri nextPage, @k List<Notification> notifications) {
        return new NotificationsResponse(nextPage, notifications);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsResponse)) {
            return false;
        }
        NotificationsResponse notificationsResponse = (NotificationsResponse) other;
        return L.f(this.nextPage, notificationsResponse.nextPage) && L.f(this.notifications, notificationsResponse.notifications);
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @k
    public final List<Notification> getNotifications() {
        return this.notifications;
    }

    public int hashCode() {
        Uri uri = this.nextPage;
        return this.notifications.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsResponse(nextPage=");
        sb2.append(this.nextPage);
        sb2.append(", notifications=");
        return H.p(sb2, this.notifications, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.nextPage, flags);
        Iterator itJ = C0.j(this.notifications, parcel);
        while (itJ.hasNext()) {
            ((Notification) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
