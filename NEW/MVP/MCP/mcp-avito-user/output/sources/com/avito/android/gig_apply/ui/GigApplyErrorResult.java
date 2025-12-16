package com.avito.android.gig_apply.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigApplyErrorResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyErrorResult;", "Landroid/os/Parcelable;", "()V", "Closed", "OpenDeeplink", "Lcom/avito/android/gig_apply/ui/GigApplyErrorResult$Closed;", "Lcom/avito/android/gig_apply/ui/GigApplyErrorResult$OpenDeeplink;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GigApplyErrorResult implements Parcelable {

    /* compiled from: GigApplyErrorResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyErrorResult$Closed;", "Lcom/avito/android/gig_apply/ui/GigApplyErrorResult;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Closed extends GigApplyErrorResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Closed f159855b = new Closed();

        @Y61.k
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* compiled from: GigApplyErrorResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Closed> {
            @Override // android.os.Parcelable.Creator
            public final Closed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Closed.f159855b;
            }

            @Override // android.os.Parcelable.Creator
            public final Closed[] newArray(int i12) {
                return new Closed[i12];
            }
        }

        public Closed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return -1968843053;
        }

        @Y61.k
        public final String toString() {
            return "Closed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: GigApplyErrorResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyErrorResult$OpenDeeplink;", "Lcom/avito/android/gig_apply/ui/GigApplyErrorResult;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink extends GigApplyErrorResult {

        @Y61.k
        public static final Parcelable.Creator<OpenDeeplink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f159856b;

        /* compiled from: GigApplyErrorResult.kt */
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

        public OpenDeeplink(@Y61.k DeepLink deepLink) {
            super(null);
            this.f159856b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f159856b, ((OpenDeeplink) obj).f159856b);
        }

        public final int hashCode() {
            return this.f159856b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f159856b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f159856b, i12);
        }
    }

    public /* synthetic */ GigApplyErrorResult(C42822w c42822w) {
        this();
    }

    public GigApplyErrorResult() {
    }
}
