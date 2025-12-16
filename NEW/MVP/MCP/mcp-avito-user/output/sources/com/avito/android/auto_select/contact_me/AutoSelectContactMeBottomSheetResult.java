package com.avito.android.auto_select.contact_me;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectContactMeBottomSheetResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult;", "Landroid/os/Parcelable;", "Cancel", "a", "NextLink", "Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult$Cancel;", "Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult$NextLink;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutoSelectContactMeBottomSheetResult extends Parcelable {

    /* renamed from: N1, reason: collision with root package name */
    @Y61.k
    public static final a f95951N1 = a.f95954a;

    /* compiled from: AutoSelectContactMeBottomSheetResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult$Cancel;", "Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Cancel implements AutoSelectContactMeBottomSheetResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Cancel f95952b = new Cancel();

        @Y61.k
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* compiled from: AutoSelectContactMeBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancel.f95952b;
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i12) {
                return new Cancel[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -425898886;
        }

        @Y61.k
        public final String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AutoSelectContactMeBottomSheetResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult$NextLink;", "Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class NextLink implements AutoSelectContactMeBottomSheetResult {

        @Y61.k
        public static final Parcelable.Creator<NextLink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f95953b;

        /* compiled from: AutoSelectContactMeBottomSheetResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NextLink> {
            @Override // android.os.Parcelable.Creator
            public final NextLink createFromParcel(Parcel parcel) {
                return new NextLink((DeepLink) parcel.readParcelable(NextLink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NextLink[] newArray(int i12) {
                return new NextLink[i12];
            }
        }

        public NextLink(@Y61.k DeepLink deepLink) {
            this.f95953b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextLink) && L.f(this.f95953b, ((NextLink) obj).f95953b);
        }

        public final int hashCode() {
            return this.f95953b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NextLink(nextLink="), this.f95953b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f95953b, i12);
        }
    }

    /* compiled from: AutoSelectContactMeBottomSheetResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/contact_me/AutoSelectContactMeBottomSheetResult$a;", "", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f95954a = new a();
    }

    /* compiled from: AutoSelectContactMeBottomSheetResult.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }
}
