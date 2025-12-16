package com.avito.android.lib.design.page_indicator;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DotParamsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/page_indicator/DotParamsProvider;", "", "<init>", "()V", "a", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DotParamsProvider {

    /* renamed from: a, reason: collision with root package name */
    public int f179856a;

    /* renamed from: b, reason: collision with root package name */
    public int f179857b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public a f179858c = new a(0, this.f179857b - 1);

    /* compiled from: DotParamsProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/page_indicator/DotParamsProvider$State;", "Landroid/os/Parcelable;", "CREATOR", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        public final int f179859b;

        /* renamed from: c, reason: collision with root package name */
        public final int f179860c;

        /* renamed from: d, reason: collision with root package name */
        public final int f179861d;

        /* renamed from: e, reason: collision with root package name */
        public final int f179862e;

        /* compiled from: DotParamsProvider.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/page_indicator/DotParamsProvider$State$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/lib/design/page_indicator/DotParamsProvider$State;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.page_indicator.DotParamsProvider$State$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<State> {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }

            public Companion() {
            }
        }

        public State(int i12, int i13, int i14, int i15) {
            this.f179859b = i12;
            this.f179860c = i13;
            this.f179861d = i14;
            this.f179862e = i15;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f179859b);
            parcel.writeInt(this.f179860c);
            parcel.writeInt(this.f179861d);
            parcel.writeInt(this.f179862e);
        }
    }

    /* compiled from: DotParamsProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator/DotParamsProvider$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f179863a;

        /* renamed from: b, reason: collision with root package name */
        public int f179864b;

        public a(int i12, int i13) {
            this.f179863a = i12;
            this.f179864b = i13;
        }

        @k
        public final String toString() {
            return this.f179863a + ".." + this.f179864b;
        }
    }

    public static a a(a aVar, int i12, int i13) {
        int i14 = i12 - 1;
        int iMax = Math.max(aVar.f179863a - (i14 - aVar.f179864b), 0);
        int i15 = (iMax + i13) - 1;
        if (i15 > i14) {
            iMax = (i14 - i13) + 1;
        } else {
            i14 = i15;
        }
        return new a(iMax, i14);
    }

    public final void b(int i12, int i13) {
        if (i12 == 0 || i12 == this.f179856a - 1) {
            a aVar = this.f179858c;
            int i14 = aVar.f179863a;
            if (i12 <= aVar.f179864b && i14 <= i12) {
                return;
            }
            if (i12 == 0) {
                aVar.f179863a = 0;
                aVar.f179864b = this.f179857b - 1;
            }
            int i15 = this.f179856a;
            if (i12 == i15 - 1) {
                int i16 = i15 - 1;
                aVar.f179864b = i16;
                aVar.f179863a = (i16 - this.f179857b) + 1;
            }
        }
        int i17 = i13 == 1 ? this.f179858c.f179863a + 1 : this.f179858c.f179863a;
        int i18 = i13 == -1 ? this.f179858c.f179864b - 1 : this.f179858c.f179864b;
        if (i17 > i12 || i12 > i18) {
            a aVar2 = this.f179858c;
            int i19 = -i13;
            aVar2.f179863a += i19;
            aVar2.f179864b += i19;
        }
    }
}
