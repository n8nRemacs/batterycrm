package com.avito.android.saved_searches.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubscriptionUnreadCount.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/saved_searches/model/SubscriptionUnreadCount;", "Landroid/os/Parcelable;", "", "count", "<init>", "(I)V", "I", "getCount", "()I", "a", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionUnreadCount implements Parcelable {

    @c("count")
    private final int count;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f258383b = new a(null);

    @k
    public static final Parcelable.Creator<SubscriptionUnreadCount> CREATOR = new b();

    /* compiled from: SubscriptionUnreadCount.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/model/SubscriptionUnreadCount$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SubscriptionUnreadCount.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SubscriptionUnreadCount> {
        @Override // android.os.Parcelable.Creator
        public final SubscriptionUnreadCount createFromParcel(Parcel parcel) {
            return new SubscriptionUnreadCount(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SubscriptionUnreadCount[] newArray(int i12) {
            return new SubscriptionUnreadCount[i12];
        }
    }

    public SubscriptionUnreadCount(int i12) {
        this.count = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getCount() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.count);
    }
}
