package com.avito.android.grid;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GridElementType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/grid/GridElementType;", "Landroid/os/Parcelable;", "()V", "FullWidth", "SingleSpan", "Lcom/avito/android/grid/GridElementType$FullWidth;", "Lcom/avito/android/grid/GridElementType$SingleSpan;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GridElementType implements Parcelable {

    /* compiled from: GridElementType.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/grid/GridElementType$FullWidth;", "Lcom/avito/android/grid/GridElementType;", "<init>", "()V", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FullWidth extends GridElementType {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FullWidth f161209b = new FullWidth();

        @k
        public static final Parcelable.Creator<FullWidth> CREATOR = new a();

        /* compiled from: GridElementType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FullWidth> {
            @Override // android.os.Parcelable.Creator
            public final FullWidth createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FullWidth.f161209b;
            }

            @Override // android.os.Parcelable.Creator
            public final FullWidth[] newArray(int i12) {
                return new FullWidth[i12];
            }
        }

        public FullWidth() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: GridElementType.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/grid/GridElementType$SingleSpan;", "Lcom/avito/android/grid/GridElementType;", "<init>", "()V", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SingleSpan extends GridElementType {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SingleSpan f161210b = new SingleSpan();

        @k
        public static final Parcelable.Creator<SingleSpan> CREATOR = new a();

        /* compiled from: GridElementType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SingleSpan> {
            @Override // android.os.Parcelable.Creator
            public final SingleSpan createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SingleSpan.f161210b;
            }

            @Override // android.os.Parcelable.Creator
            public final SingleSpan[] newArray(int i12) {
                return new SingleSpan[i12];
            }
        }

        public SingleSpan() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ GridElementType(C42822w c42822w) {
        this();
    }

    public GridElementType() {
    }
}
