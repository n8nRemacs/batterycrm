package com.avito.android.notification_center.list.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.o1;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: NotificationCenterListItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/notification_center/list/item/NotificationCenterListItem;", "LTV0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "ErrorSnippet", "Notification", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$ErrorSnippet;", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$Notification;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class NotificationCenterListItem implements TV0.a, Parcelable {

    /* compiled from: NotificationCenterListItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$ErrorSnippet;", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorSnippet extends NotificationCenterListItem {

        @Y61.k
        public static final Parcelable.Creator<ErrorSnippet> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f207598b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PrintableText f207599c;

        /* compiled from: NotificationCenterListItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorSnippet> {
            @Override // android.os.Parcelable.Creator
            public final ErrorSnippet createFromParcel(Parcel parcel) {
                return new ErrorSnippet(parcel.readLong(), (PrintableText) parcel.readParcelable(ErrorSnippet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorSnippet[] newArray(int i12) {
                return new ErrorSnippet[i12];
            }
        }

        public ErrorSnippet(long j12, @Y61.k PrintableText printableText) {
            super(null);
            this.f207598b = j12;
            this.f207599c = printableText;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF182878b() {
            return this.f207598b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f207598b);
            parcel.writeParcelable(this.f207599c, i12);
        }
    }

    /* compiled from: NotificationCenterListItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$Notification;", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem;", "b", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Notification extends NotificationCenterListItem {

        @X41.f
        @Y61.k
        public static final Parcelable.Creator<Notification> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public final long f207600b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f207601c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f207602d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f207603e;

        /* renamed from: f, reason: collision with root package name */
        public final long f207604f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f207605g;

        /* compiled from: NotificationCenterListItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$Notification;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.l<Parcel, Notification> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f207606l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Notification invoke(Parcel parcel) {
                Parcel parcel2 = parcel;
                return new Notification(parcel2.readLong(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readLong(), J3.c(parcel2));
            }
        }

        /* compiled from: NotificationCenterListItem.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$Notification$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$Notification;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new b(null);
            a aVar = a.f207606l;
            int i12 = I3.f318630a;
            CREATOR = new H3(aVar);
        }

        public Notification(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j13, boolean z12) {
            super(null);
            this.f207600b = j12;
            this.f207601c = str;
            this.f207602d = str2;
            this.f207603e = str3;
            this.f207604f = j13;
            this.f207605g = z12;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF182878b() {
            return this.f207600b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f207600b);
            parcel.writeString(this.f207601c);
            parcel.writeString(this.f207602d);
            parcel.writeString(this.f207603e);
            parcel.writeLong(this.f207604f);
            o1<ClassLoader, o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
            parcel.writeInt(this.f207605g ? 1 : 0);
        }
    }

    public /* synthetic */ NotificationCenterListItem(C42822w c42822w) {
        this();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NotificationCenterListItem() {
    }
}
