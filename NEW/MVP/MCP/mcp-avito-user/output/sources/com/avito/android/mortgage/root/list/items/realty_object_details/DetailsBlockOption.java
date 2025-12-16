package com.avito.android.mortgage.root.list.items.realty_object_details;

import KZ.S;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyObjectDetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/DetailsBlockOption;", "Lcom/avito/android/lib/design/chips/h;", "Type", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DetailsBlockOption implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f202754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final S f202755c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f202756d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Type f202757e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RealtyObjectDetailsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/DetailsBlockOption$Type;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f202758b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f202759c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f202760d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f202761e;

        static {
            Type type = new Type("URL", 0);
            f202758b = type;
            Type type2 = new Type("ADDRESS", 1);
            f202759c = type2;
            Type[] typeArr = {type, type2};
            f202760d = typeArr;
            f202761e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f202760d.clone();
        }
    }

    public DetailsBlockOption(@Y61.k String str, @Y61.k S s5, boolean z12, @Y61.k Type type) {
        this.f202754b = str;
        this.f202755c = s5;
        this.f202756d = z12;
        this.f202757e = type;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, G0> L() {
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
        if (obj instanceof DetailsBlockOption) {
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.k
    /* renamed from: W */
    public final CharSequence getF264620e() {
        return this.f202754b;
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
        if (!(obj instanceof DetailsBlockOption)) {
            return false;
        }
        DetailsBlockOption detailsBlockOption = (DetailsBlockOption) obj;
        return L.f(this.f202754b, detailsBlockOption.f202754b) && L.f(this.f202755c, detailsBlockOption.f202755c) && this.f202756d == detailsBlockOption.f202756d && this.f202757e == detailsBlockOption.f202757e;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF264619d() {
        return this.f202756d;
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
        return this.f202757e.hashCode() + androidx.appcompat.app.r.i((this.f202755c.hashCode() + (this.f202754b.hashCode() * 31)) * 31, 31, this.f202756d);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF264621f() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        return "DetailsBlockOption(chipTitle=" + ((Object) this.f202754b) + ", field=" + this.f202755c + ", isSelectedChip=" + this.f202756d + ", type=" + this.f202757e + ')';
    }
}
