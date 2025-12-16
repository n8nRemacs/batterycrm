package com.avito.android.lib.design.chips.state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.util.q;
import j.InterfaceC42156l;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ItemChipable.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/state/ItemChipable;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "Alignment", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemChipable implements h, Parcelable {

    @k
    public static final Parcelable.Creator<ItemChipable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f178762b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f178763c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Alignment f178764d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f178765e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f178766f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f178767g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CharSequence f178768h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f178769i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f178770j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public N f178771k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ItemChipable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/state/ItemChipable$Alignment;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        /* renamed from: b, reason: collision with root package name */
        public static final Alignment f178772b;

        /* renamed from: c, reason: collision with root package name */
        public static final Alignment f178773c;

        /* renamed from: d, reason: collision with root package name */
        public static final Alignment f178774d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f178775e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178776f;

        static {
            Alignment alignment = new Alignment("Start", 0);
            f178772b = alignment;
            Alignment alignment2 = new Alignment("CenterHorizontally", 1);
            f178773c = alignment2;
            Alignment alignment3 = new Alignment("End", 2);
            f178774d = alignment3;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3};
            f178775e = alignmentArr;
            f178776f = c.a(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f178775e.clone();
        }
    }

    /* compiled from: ItemChipable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemChipable> {
        @Override // android.os.Parcelable.Creator
        public final ItemChipable createFromParcel(Parcel parcel) {
            return new ItemChipable(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), (Y41.l) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemChipable[] newArray(int i12) {
            return new ItemChipable[i12];
        }
    }

    /* compiled from: ItemChipable.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "iconName", "Lcom/avito/android/lib/design/chips/e$b;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/lib/design/chips/e$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, e.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f178777l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final e.b invoke(String str) {
            Integer numA = q.a(str);
            if (numA != null) {
                return new e.b(numA.intValue());
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemChipable(int i12, @l String str, @l Alignment alignment, @l Y41.l<? super Boolean, G0> lVar, boolean z12, @l @InterfaceC42156l Integer num, @k CharSequence charSequence, boolean z13, boolean z14) {
        this.f178762b = i12;
        this.f178763c = str;
        this.f178764d = alignment;
        this.f178765e = lVar;
        this.f178766f = z12;
        this.f178767g = num;
        this.f178768h = charSequence;
        this.f178769i = z13;
        this.f178770j = z14;
        this.f178771k = b.f178777l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.CharSequence] */
    public static ItemChipable a(ItemChipable itemChipable, boolean z12, String str, int i12) {
        if ((i12 & 16) != 0) {
            z12 = itemChipable.f178766f;
        }
        boolean z13 = z12;
        String str2 = str;
        if ((i12 & 64) != 0) {
            str2 = itemChipable.f178768h;
        }
        return new ItemChipable(itemChipable.f178762b, itemChipable.f178763c, itemChipable.f178764d, itemChipable.f178765e, z13, itemChipable.f178767g, str2, itemChipable.f178769i, itemChipable.f178770j);
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return this.f178765e;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (!(obj instanceof ItemChipable)) {
            return false;
        }
        ItemChipable itemChipable = (ItemChipable) obj;
        return this.f178762b == itemChipable.f178762b && L.f(this.f178768h, itemChipable.f178768h);
    }

    @Override // com.avito.android.lib.design.chips.h
    @k
    /* renamed from: W, reason: from getter */
    public final CharSequence getF199673b() {
        return this.f178768h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e e2() {
        String str;
        if (this.f178764d != Alignment.f178772b || (str = this.f178763c) == null) {
            return null;
        }
        return (e) this.f178771k.invoke(str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemChipable)) {
            return false;
        }
        ItemChipable itemChipable = (ItemChipable) obj;
        return this.f178762b == itemChipable.f178762b && L.f(this.f178763c, itemChipable.f178763c) && this.f178764d == itemChipable.f178764d && L.f(this.f178765e, itemChipable.f178765e) && this.f178766f == itemChipable.f178766f && L.f(this.f178767g, itemChipable.f178767g) && L.f(this.f178768h, itemChipable.f178768h) && this.f178769i == itemChipable.f178769i && this.f178770j == itemChipable.f178770j;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF202756d() {
        return this.f178766f;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor, reason: from getter */
    public final Integer getF178767g() {
        return this.f178767g;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e getImage() {
        String str;
        if (this.f178764d != Alignment.f178773c || (str = this.f178763c) == null) {
            return null;
        }
        return (e) this.f178771k.invoke(str);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f178762b) * 31;
        String str = this.f178763c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Alignment alignment = this.f178764d;
        int iHashCode3 = (iHashCode2 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        Y41.l<Boolean, G0> lVar = this.f178765e;
        int i12 = r.i((iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f178766f);
        Integer num = this.f178767g;
        return Boolean.hashCode(this.f178770j) + r.i(com.avito.android.advert.item.delivery_suggests.l.c((i12 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f178768h), 31, this.f178769i);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive, reason: from getter */
    public final boolean getF178770j() {
        return this.f178770j;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF171727d() {
        return this.f178769i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e q1() {
        String str;
        if (this.f178764d != Alignment.f178774d || (str = this.f178763c) == null) {
            return null;
        }
        return (e) this.f178771k.invoke(str);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemChipable(id=");
        sb2.append(this.f178762b);
        sb2.append(", icon=");
        sb2.append(this.f178763c);
        sb2.append(", iconAlignment=");
        sb2.append(this.f178764d);
        sb2.append(", onChange=");
        sb2.append(this.f178765e);
        sb2.append(", isSelectedChip=");
        sb2.append(this.f178766f);
        sb2.append(", centreIconColor=");
        sb2.append(this.f178767g);
        sb2.append(", chipTitle=");
        sb2.append((Object) this.f178768h);
        sb2.append(", isEnabled=");
        sb2.append(this.f178769i);
        sb2.append(", isActive=");
        return r.x(sb2, this.f178770j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f178762b);
        parcel.writeString(this.f178763c);
        Alignment alignment = this.f178764d;
        if (alignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alignment.name());
        }
        parcel.writeSerializable((Serializable) this.f178765e);
        parcel.writeInt(this.f178766f ? 1 : 0);
        Integer num = this.f178767g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        TextUtils.writeToParcel(this.f178768h, parcel, i12);
        parcel.writeInt(this.f178769i ? 1 : 0);
        parcel.writeInt(this.f178770j ? 1 : 0);
    }

    public /* synthetic */ ItemChipable(int i12, String str, Alignment alignment, Y41.l lVar, boolean z12, Integer num, CharSequence charSequence, boolean z13, boolean z14, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : alignment, (i13 & 8) != 0 ? null : lVar, (i13 & 16) != 0 ? false : z12, (i13 & 32) == 0 ? num : null, (i13 & 64) != 0 ? "" : charSequence, (i13 & 128) != 0 ? true : z13, (i13 & 256) == 0 ? z14 : true);
    }
}
