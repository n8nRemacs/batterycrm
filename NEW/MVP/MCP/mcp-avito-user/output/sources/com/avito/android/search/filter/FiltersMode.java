package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FiltersMode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/search/filter/FiltersMode;", "Landroid/os/Parcelable;", "()V", "Default", "ExtendedProfile", "Lcom/avito/android/search/filter/FiltersMode$Default;", "Lcom/avito/android/search/filter/FiltersMode$ExtendedProfile;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FiltersMode implements Parcelable {

    /* compiled from: FiltersMode.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/FiltersMode$Default;", "Lcom/avito/android/search/filter/FiltersMode;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends FiltersMode {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Default f261858b = new Default();

        @Y61.k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: FiltersMode.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f261858b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        public Default() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FiltersMode.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/FiltersMode$ExtendedProfile;", "Lcom/avito/android/search/filter/FiltersMode;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExtendedProfile extends FiltersMode {

        @Y61.k
        public static final Parcelable.Creator<ExtendedProfile> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f261859b;

        /* compiled from: FiltersMode.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExtendedProfile> {
            @Override // android.os.Parcelable.Creator
            public final ExtendedProfile createFromParcel(Parcel parcel) {
                return new ExtendedProfile(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ExtendedProfile[] newArray(int i12) {
                return new ExtendedProfile[i12];
            }
        }

        public ExtendedProfile(@Y61.l String str) {
            super(null);
            this.f261859b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f261859b);
        }
    }

    public /* synthetic */ FiltersMode(C42822w c42822w) {
        this();
    }

    public FiltersMode() {
    }
}
