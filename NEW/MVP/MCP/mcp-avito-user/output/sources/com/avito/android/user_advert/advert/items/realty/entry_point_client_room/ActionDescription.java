package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EntryPointToAccountOwnerItem.kt */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription;", "Landroid/os/Parcelable;", "()V", "CloseBanner", "OpenDeepLink", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription$CloseBanner;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription$OpenDeepLink;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ActionDescription implements Parcelable {

    /* compiled from: EntryPointToAccountOwnerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription$CloseBanner;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseBanner extends ActionDescription {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CloseBanner f309889b = new CloseBanner();

        @Y61.k
        public static final Parcelable.Creator<CloseBanner> CREATOR = new a();

        /* compiled from: EntryPointToAccountOwnerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CloseBanner> {
            @Override // android.os.Parcelable.Creator
            public final CloseBanner createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CloseBanner.f309889b;
            }

            @Override // android.os.Parcelable.Creator
            public final CloseBanner[] newArray(int i12) {
                return new CloseBanner[i12];
            }
        }

        public CloseBanner() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CloseBanner);
        }

        public final int hashCode() {
            return -806504979;
        }

        @Y61.k
        public final String toString() {
            return "CloseBanner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: EntryPointToAccountOwnerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription$OpenDeepLink;", "Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/ActionDescription;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenDeepLink extends ActionDescription {

        @Y61.k
        public static final Parcelable.Creator<OpenDeepLink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f309890b;

        /* compiled from: EntryPointToAccountOwnerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenDeepLink> {
            @Override // android.os.Parcelable.Creator
            public final OpenDeepLink createFromParcel(Parcel parcel) {
                return new OpenDeepLink((DeepLink) parcel.readParcelable(OpenDeepLink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenDeepLink[] newArray(int i12) {
                return new OpenDeepLink[i12];
            }
        }

        public OpenDeepLink(@Y61.k DeepLink deepLink) {
            super(null);
            this.f309890b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f309890b, i12);
        }
    }

    public /* synthetic */ ActionDescription(C42822w c42822w) {
        this();
    }

    private ActionDescription() {
    }
}
