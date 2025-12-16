package com.avito.android.section;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.remote.model.section.SectionViewType;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionItemConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/SectionItemConverter;", "", "a", "Params", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SectionItemConverter {

    /* compiled from: SectionItemConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/SectionItemConverter$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: SectionItemConverter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.section.SectionItemConverter$a$a, reason: collision with other inner class name */
        public static final class C7900a {
        }

        int c();

        @Y61.l
        /* renamed from: d */
        Boolean getF264609k();

        /* renamed from: e */
        boolean getF264603e();

        boolean f();

        @Y61.l
        /* renamed from: g */
        SectionViewType getF264607i();

        /* renamed from: h */
        boolean getF264604f();

        /* renamed from: i */
        boolean getF264602d();

        /* renamed from: j */
        boolean getF264610l();

        /* renamed from: k */
        boolean getF264605g();

        /* renamed from: l */
        boolean getF264601c();

        boolean m();

        /* renamed from: n */
        int getF264600b();
    }

    /* compiled from: SectionItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @Y61.l
    Object a(@Y61.k Iterable iterable, @Y61.k Params params, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    List<PersistableSpannedItem> b(@Y61.k SectionTypeItem sectionTypeItem, boolean z12);

    @Y61.k
    W c(@Y61.k SectionTypeItem sectionTypeItem, @Y61.k Params params);

    @Y61.k
    ArrayList d(@Y61.k ArrayList arrayList, @Y61.k SectionTypeElement sectionTypeElement);

    @Y61.l
    Object e(@Y61.k SectionTypeElement sectionTypeElement, @Y61.k Params params, @Y61.l SectionTypeElement sectionTypeElement2, @Y61.k ContinuationImpl continuationImpl);

    /* compiled from: SectionItemConverter.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/SectionItemConverter$Params;", "Lcom/avito/android/section/SectionItemConverter$a;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Params implements a, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Params> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f264600b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f264601c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f264602d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f264603e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f264604f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f264605g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Integer f264606h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final SectionViewType f264607i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f264608j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Boolean f264609k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f264610l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f264611m;

        /* compiled from: SectionItemConverter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                int i12 = parcel.readInt();
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                SectionViewType sectionViewTypeValueOf = parcel.readInt() == 0 ? null : SectionViewType.valueOf(parcel.readString());
                boolean z17 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Params(i12, z12, z13, z14, z15, z16, numValueOf, sectionViewTypeValueOf, z17, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i12) {
                return new Params[i12];
            }
        }

        public Params(int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Y61.l Integer num, @Y61.l SectionViewType sectionViewType, boolean z17, @Y61.l Boolean bool, boolean z18, boolean z19) {
            this.f264600b = i12;
            this.f264601c = z12;
            this.f264602d = z13;
            this.f264603e = z14;
            this.f264604f = z15;
            this.f264605g = z16;
            this.f264606h = num;
            this.f264607i = sectionViewType;
            this.f264608j = z17;
            this.f264609k = bool;
            this.f264610l = z18;
            this.f264611m = z19;
        }

        public static Params a(Params params, int i12, boolean z12, boolean z13, boolean z14, Integer num, SectionViewType sectionViewType, Boolean bool, int i13) {
            int i14 = (i13 & 1) != 0 ? params.f264600b : i12;
            boolean z15 = params.f264601c;
            boolean z16 = params.f264602d;
            boolean z17 = (i13 & 8) != 0 ? params.f264603e : z12;
            boolean z18 = (i13 & 16) != 0 ? params.f264604f : z13;
            boolean z19 = (i13 & 32) != 0 ? params.f264605g : z14;
            Integer num2 = (i13 & 64) != 0 ? params.f264606h : num;
            SectionViewType sectionViewType2 = (i13 & 128) != 0 ? params.f264607i : sectionViewType;
            boolean z22 = params.f264608j;
            Boolean bool2 = (i13 & 512) != 0 ? params.f264609k : bool;
            boolean z23 = (i13 & 1024) != 0 ? params.f264610l : false;
            boolean z24 = (i13 & 2048) != 0 ? params.f264611m : true;
            params.getClass();
            return new Params(i14, z15, z16, z17, z18, z19, num2, sectionViewType2, z22, bool2, z23, z24);
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        public final int c() {
            Integer f264606h = getF264606h();
            if (f264606h != null) {
                return f264606h.intValue();
            }
            return 6;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Boolean getF264609k() {
            return this.f264609k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: e, reason: from getter */
        public final boolean getF264603e() {
            return this.f264603e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.f264600b == params.f264600b && this.f264601c == params.f264601c && this.f264602d == params.f264602d && this.f264603e == params.f264603e && this.f264604f == params.f264604f && this.f264605g == params.f264605g && L.f(this.f264606h, params.f264606h) && this.f264607i == params.f264607i && this.f264608j == params.f264608j && L.f(this.f264609k, params.f264609k) && this.f264610l == params.f264610l && this.f264611m == params.f264611m;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        public final boolean f() {
            return getF264609k() != null;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        @Y61.l
        /* renamed from: g, reason: from getter */
        public final SectionViewType getF264607i() {
            return this.f264607i;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: h, reason: from getter */
        public final boolean getF264604f() {
            return this.f264604f;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(Integer.hashCode(this.f264600b) * 31, 31, this.f264601c), 31, this.f264602d), 31, this.f264603e), 31, this.f264604f), 31, this.f264605g);
            Integer num = this.f264606h;
            int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
            SectionViewType sectionViewType = this.f264607i;
            int i13 = androidx.appcompat.app.r.i((iHashCode + (sectionViewType == null ? 0 : sectionViewType.hashCode())) * 31, 31, this.f264608j);
            Boolean bool = this.f264609k;
            return Boolean.hashCode(this.f264611m) + androidx.appcompat.app.r.i((i13 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f264610l);
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: i, reason: from getter */
        public final boolean getF264602d() {
            return this.f264602d;
        }

        public final boolean isRedesign() {
            return getF264607i() != null || m();
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: j, reason: from getter */
        public final boolean getF264610l() {
            return this.f264610l;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: k, reason: from getter */
        public final boolean getF264605g() {
            return this.f264605g;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: l, reason: from getter */
        public final boolean getF264601c() {
            return this.f264601c;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        public final boolean m() {
            return getF264606h() != null;
        }

        @Override // com.avito.android.section.SectionItemConverter.a
        /* renamed from: n, reason: from getter */
        public final int getF264600b() {
            return this.f264600b;
        }

        @Y61.l
        /* renamed from: o, reason: from getter */
        public final Integer getF264606h() {
            return this.f264606h;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(columns=");
            sb2.append(this.f264600b);
            sb2.append(", isShop=");
            sb2.append(this.f264601c);
            sb2.append(", skipFilter=");
            sb2.append(this.f264602d);
            sb2.append(", renderByBeduin=");
            sb2.append(this.f264603e);
            sb2.append(", isRestyle=");
            sb2.append(this.f264604f);
            sb2.append(", isAutoCategory=");
            sb2.append(this.f264605g);
            sb2.append(", redesignItemCount=");
            sb2.append(this.f264606h);
            sb2.append(", shopSimilarRedesignViewType=");
            sb2.append(this.f264607i);
            sb2.append(", withExpand=");
            sb2.append(this.f264608j);
            sb2.append(", isNotFoundError=");
            sb2.append(this.f264609k);
            sb2.append(", forceLoadingOnEmptySection=");
            sb2.append(this.f264610l);
            sb2.append(", convertSync=");
            return androidx.appcompat.app.r.x(sb2, this.f264611m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f264600b);
            parcel.writeInt(this.f264601c ? 1 : 0);
            parcel.writeInt(this.f264602d ? 1 : 0);
            parcel.writeInt(this.f264603e ? 1 : 0);
            parcel.writeInt(this.f264604f ? 1 : 0);
            parcel.writeInt(this.f264605g ? 1 : 0);
            Integer num = this.f264606h;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            SectionViewType sectionViewType = this.f264607i;
            if (sectionViewType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sectionViewType.name());
            }
            parcel.writeInt(this.f264608j ? 1 : 0);
            Boolean bool = this.f264609k;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeInt(this.f264610l ? 1 : 0);
            parcel.writeInt(this.f264611m ? 1 : 0);
        }

        public /* synthetic */ Params(int i12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Integer num, SectionViewType sectionViewType, boolean z17, Boolean bool, boolean z18, boolean z19, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? false : z12, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? false : z15, (i13 & 32) != 0 ? false : z16, (i13 & 64) != 0 ? null : num, (i13 & 128) != 0 ? null : sectionViewType, (i13 & 256) != 0 ? true : z17, (i13 & 512) == 0 ? bool : null, (i13 & 1024) == 0 ? z18 : true, (i13 & 2048) == 0 ? z19 : false);
        }
    }
}
