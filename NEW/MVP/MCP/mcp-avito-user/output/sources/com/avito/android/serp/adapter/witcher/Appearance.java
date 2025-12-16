package com.avito.android.serp.adapter.witcher;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Appearance.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/Appearance;", "Landroid/os/Parcelable;", "<init>", "()V", "Margins", "Paddings", "Lcom/avito/android/serp/adapter/witcher/Appearance$Margins;", "Lcom/avito/android/serp/adapter/witcher/Appearance$Paddings;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Appearance implements Parcelable {

    /* compiled from: Appearance.kt */
    @androidx.compose.runtime.internal.P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/Appearance$Margins;", "Lcom/avito/android/serp/adapter/witcher/Appearance;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Margins extends Appearance {

        @Y61.k
        public static final Parcelable.Creator<Margins> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f273743b;

        /* renamed from: c, reason: collision with root package name */
        public final int f273744c;

        /* renamed from: d, reason: collision with root package name */
        public final int f273745d;

        /* renamed from: e, reason: collision with root package name */
        public final int f273746e;

        /* compiled from: Appearance.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Margins> {
            @Override // android.os.Parcelable.Creator
            public final Margins createFromParcel(Parcel parcel) {
                return new Margins(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Margins[] newArray(int i12) {
                return new Margins[i12];
            }
        }

        public Margins() {
            this(0, 0, 0, 0, 15, null);
        }

        @Override // com.avito.android.serp.adapter.witcher.Appearance
        public final void a(@Y61.k View view) {
            Integer numValueOf = Integer.valueOf(this.f273745d);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
            Integer numValueOf3 = Integer.valueOf(this.f273743b);
            if (numValueOf3.intValue() < 0) {
                numValueOf3 = null;
            }
            Integer numValueOf4 = Integer.valueOf(numValueOf3 != null ? numValueOf3.intValue() : 0);
            Integer numValueOf5 = Integer.valueOf(this.f273746e);
            if (numValueOf5.intValue() < 0) {
                numValueOf5 = null;
            }
            Integer numValueOf6 = Integer.valueOf(numValueOf5 != null ? numValueOf5.intValue() : 0);
            Integer numValueOf7 = Integer.valueOf(this.f273744c);
            Integer num = numValueOf7.intValue() >= 0 ? numValueOf7 : null;
            D6.b(view, numValueOf2, numValueOf4, numValueOf6, Integer.valueOf(num != null ? num.intValue() : 0));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Margins)) {
                return false;
            }
            Margins margins = (Margins) obj;
            return this.f273743b == margins.f273743b && this.f273744c == margins.f273744c && this.f273745d == margins.f273745d && this.f273746e == margins.f273746e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f273746e) + androidx.appcompat.app.r.e(this.f273745d, androidx.appcompat.app.r.e(this.f273744c, Integer.hashCode(this.f273743b) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Margins(top=");
            sb2.append(this.f273743b);
            sb2.append(", bottom=");
            sb2.append(this.f273744c);
            sb2.append(", start=");
            sb2.append(this.f273745d);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f273746e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f273743b);
            parcel.writeInt(this.f273744c);
            parcel.writeInt(this.f273745d);
            parcel.writeInt(this.f273746e);
        }

        public /* synthetic */ Margins(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
            this((i16 & 1) != 0 ? -1 : i12, (i16 & 2) != 0 ? -1 : i13, (i16 & 4) != 0 ? -1 : i14, (i16 & 8) != 0 ? -1 : i15);
        }

        public Margins(int i12, int i13, int i14, int i15) {
            super(null);
            this.f273743b = i12;
            this.f273744c = i13;
            this.f273745d = i14;
            this.f273746e = i15;
        }
    }

    /* compiled from: Appearance.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/Appearance$Paddings;", "Lcom/avito/android/serp/adapter/witcher/Appearance;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Paddings extends Appearance {

        @Y61.k
        public static final Parcelable.Creator<Paddings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f273747b;

        /* renamed from: c, reason: collision with root package name */
        public final int f273748c;

        /* renamed from: d, reason: collision with root package name */
        public final int f273749d;

        /* renamed from: e, reason: collision with root package name */
        public final int f273750e;

        /* compiled from: Appearance.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Paddings> {
            @Override // android.os.Parcelable.Creator
            public final Paddings createFromParcel(Parcel parcel) {
                return new Paddings(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Paddings[] newArray(int i12) {
                return new Paddings[i12];
            }
        }

        public Paddings() {
            this(0, 0, 0, 0, 15, null);
        }

        @Override // com.avito.android.serp.adapter.witcher.Appearance
        public final void a(@Y61.k View view) {
            int i12 = this.f273749d;
            if (i12 < 0) {
                i12 = 0;
            }
            int i13 = this.f273747b;
            if (i13 < 0) {
                i13 = 0;
            }
            int i14 = this.f273750e;
            if (i14 < 0) {
                i14 = 0;
            }
            int i15 = this.f273748c;
            view.setPadding(i12, i13, i14, i15 >= 0 ? i15 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) obj;
            return this.f273747b == paddings.f273747b && this.f273748c == paddings.f273748c && this.f273749d == paddings.f273749d && this.f273750e == paddings.f273750e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f273750e) + androidx.appcompat.app.r.e(this.f273749d, androidx.appcompat.app.r.e(this.f273748c, Integer.hashCode(this.f273747b) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Paddings(top=");
            sb2.append(this.f273747b);
            sb2.append(", bottom=");
            sb2.append(this.f273748c);
            sb2.append(", start=");
            sb2.append(this.f273749d);
            sb2.append(", end=");
            return androidx.appcompat.app.r.t(sb2, this.f273750e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f273747b);
            parcel.writeInt(this.f273748c);
            parcel.writeInt(this.f273749d);
            parcel.writeInt(this.f273750e);
        }

        public /* synthetic */ Paddings(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
            this((i16 & 1) != 0 ? -1 : i12, (i16 & 2) != 0 ? -1 : i13, (i16 & 4) != 0 ? -1 : i14, (i16 & 8) != 0 ? -1 : i15);
        }

        public Paddings(int i12, int i13, int i14, int i15) {
            super(null);
            this.f273747b = i12;
            this.f273748c = i13;
            this.f273749d = i14;
            this.f273750e = i15;
        }
    }

    public /* synthetic */ Appearance(C42822w c42822w) {
        this();
    }

    public abstract void a(@Y61.k View view);

    public Appearance() {
    }
}
