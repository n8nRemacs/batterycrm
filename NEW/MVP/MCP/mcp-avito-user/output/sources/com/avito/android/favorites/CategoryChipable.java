package com.avito.android.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.CategoriesWidget;
import j.InterfaceC42156l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryChipable.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/CategoryChipable;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryChipable implements com.avito.android.lib.design.chips.h, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryChipable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f156200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f156201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f156202d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f156203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f156204f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final CategoriesWidget.CategoryOnboarding f156205g;

    /* compiled from: CategoryChipable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryChipable> {
        @Override // android.os.Parcelable.Creator
        public final CategoryChipable createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = com.akita.compose.theme.re23.style.C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new CategoryChipable(i12, string, i13, linkedHashMap, parcel.readInt() != 0, (CategoriesWidget.CategoryOnboarding) parcel.readParcelable(CategoryChipable.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryChipable[] newArray(int i12) {
            return new CategoryChipable[i12];
        }
    }

    public CategoryChipable(int i12, @Y61.k String str, int i13, @Y61.l Map<String, String> map, boolean z12, @Y61.l CategoriesWidget.CategoryOnboarding categoryOnboarding) {
        this.f156200b = i12;
        this.f156201c = str;
        this.f156202d = i13;
        this.f156203e = map;
        this.f156204f = z12;
        this.f156205g = categoryOnboarding;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, kotlin.G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        if (obj instanceof CategoryChipable) {
            return this.f156200b == ((CategoryChipable) obj).f156200b;
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF178768h() {
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        return String.format("%s %d", Arrays.copyOf(new Object[]{this.f156201c, Integer.valueOf(this.f156202d)}, 2));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryChipable)) {
            return false;
        }
        CategoryChipable categoryChipable = (CategoryChipable) obj;
        return this.f156200b == categoryChipable.f156200b && kotlin.jvm.internal.L.f(this.f156201c, categoryChipable.f156201c) && this.f156202d == categoryChipable.f156202d && kotlin.jvm.internal.L.f(this.f156203e, categoryChipable.f156203e) && this.f156204f == categoryChipable.f156204f && kotlin.jvm.internal.L.f(this.f156205g, categoryChipable.f156205g);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF178766f() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f156202d, androidx.compose.foundation.H.d(Integer.hashCode(this.f156200b) * 31, 31, this.f156201c), 31);
        Map<String, String> map = this.f156203e;
        int i12 = androidx.appcompat.app.r.i((iE2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f156204f);
        CategoriesWidget.CategoryOnboarding categoryOnboarding = this.f156205g;
        return i12 + (categoryOnboarding != null ? categoryOnboarding.hashCode() : 0);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF178769i() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        return "CategoryChipable(id=" + this.f156200b + ", title=" + this.f156201c + ", count=" + this.f156202d + ", analyticsParams=" + this.f156203e + ", isSortDisabled=" + this.f156204f + ", onboarding=" + this.f156205g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f156200b);
        parcel.writeString(this.f156201c);
        parcel.writeInt(this.f156202d);
        Map<String, String> map = this.f156203e;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = com.akita.compose.theme.re23.style.C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeInt(this.f156204f ? 1 : 0);
        parcel.writeParcelable(this.f156205g, i12);
    }

    public /* synthetic */ CategoryChipable(int i12, String str, int i13, Map map, boolean z12, CategoriesWidget.CategoryOnboarding categoryOnboarding, int i14, C42822w c42822w) {
        this(i12, str, i13, map, (i14 & 16) != 0 ? false : z12, (i14 & 32) != 0 ? null : categoryOnboarding);
    }
}
