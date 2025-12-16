package com.avito.android.str_seller_orders_calendar.utils;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicScrollGridLayoutManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/DynamicScrollGridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$m;", "<init>", "()V", "Companion", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DynamicScrollGridLayoutManager extends RecyclerView.m {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f291191B = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f291192A;

    /* renamed from: s, reason: collision with root package name */
    public int f291194s;

    /* renamed from: t, reason: collision with root package name */
    public int f291195t;

    /* renamed from: u, reason: collision with root package name */
    public int f291196u;

    /* renamed from: x, reason: collision with root package name */
    public int f291199x;

    /* renamed from: y, reason: collision with root package name */
    public int f291200y;

    /* renamed from: z, reason: collision with root package name */
    public int f291201z;

    /* renamed from: r, reason: collision with root package name */
    @k
    public Companion.Type f291193r = Companion.Type.f291205b;

    /* renamed from: v, reason: collision with root package name */
    public int f291197v = 1;

    /* renamed from: w, reason: collision with root package name */
    public int f291198w = 1;

    /* compiled from: DynamicScrollGridLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/DynamicScrollGridLayoutManager$Companion;", "", "<init>", "()V", "", "DEFAULT_COUNT", "I", "DIRECTION_DOWN", "DIRECTION_END", "DIRECTION_NONE", "DIRECTION_START", "DIRECTION_UP", "REMOVE_INVISIBLE", "REMOVE_VISIBLE", "a", "SaveState", "Type", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: DynamicScrollGridLayoutManager.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/DynamicScrollGridLayoutManager$Companion$SaveState;", "Landroid/os/Parcelable;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SaveState implements Parcelable {

            @k
            public static final Parcelable.Creator<SaveState> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Type f291202b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f291203c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Integer f291204d;

            /* compiled from: DynamicScrollGridLayoutManager.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SaveState> {
                @Override // android.os.Parcelable.Creator
                public final SaveState createFromParcel(Parcel parcel) {
                    return new SaveState(Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final SaveState[] newArray(int i12) {
                    return new SaveState[i12];
                }
            }

            public SaveState(@k Type type, @l Integer num, @l Integer num2) {
                this.f291202b = type;
                this.f291203c = num;
                this.f291204d = num2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SaveState)) {
                    return false;
                }
                SaveState saveState = (SaveState) obj;
                return this.f291202b == saveState.f291202b && L.f(this.f291203c, saveState.f291203c) && L.f(this.f291204d, saveState.f291204d);
            }

            public final int hashCode() {
                int iHashCode = this.f291202b.hashCode() * 31;
                Integer num = this.f291203c;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f291204d;
                return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SaveState(type=");
                sb2.append(this.f291202b);
                sb2.append(", totalRowCount=");
                sb2.append(this.f291203c);
                sb2.append(", totalColumnCount=");
                return s.j(sb2, this.f291204d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f291202b.name());
                Integer num = this.f291203c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Integer num2 = this.f291204d;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DynamicScrollGridLayoutManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/DynamicScrollGridLayoutManager$Companion$Type;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f291205b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f291206c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f291207d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f291208e;

            static {
                Type type = new Type("FIXED_COLUMN_COUNT", 0);
                f291205b = type;
                Type type2 = new Type("FIXED_ROW_COUNT", 1);
                f291206c = type2;
                Type[] typeArr = {type, type2};
                f291207d = typeArr;
                f291208e = c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f291207d.clone();
            }
        }

        /* compiled from: DynamicScrollGridLayoutManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/utils/DynamicScrollGridLayoutManager$Companion$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends RecyclerView.n {

            /* renamed from: f, reason: collision with root package name */
            public int f291209f;

            /* renamed from: g, reason: collision with root package name */
            public int f291210g;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: DynamicScrollGridLayoutManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Companion.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Companion.Type type = Companion.Type.f291205b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new Companion(null);
    }

    public final int A1(int i12) {
        int iOrdinal = this.f291193r.ordinal();
        if (iOrdinal == 0) {
            return i12 % this.f291197v;
        }
        if (iOrdinal == 1) {
            return i12 / this.f291198w;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int B1(int i12) {
        int iOrdinal = this.f291193r.ordinal();
        if (iOrdinal == 0) {
            return i12 / this.f291197v;
        }
        if (iOrdinal == 1) {
            return i12 % this.f291198w;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int C1() {
        return (this.f53850p - getPaddingRight()) - getPaddingLeft();
    }

    public final int D1() {
        int iOrdinal = this.f291193r.ordinal();
        if (iOrdinal == 0) {
            return this.f291197v;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (o0() == 0 || this.f291198w == 0) {
            return 0;
        }
        return o0() % this.f291198w == 0 ? o0() / this.f291198w : (o0() / this.f291198w) + 1;
    }

    public final int E1() {
        int iOrdinal = this.f291193r.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return this.f291198w;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (o0() == 0 || this.f291197v == 0) {
            return 0;
        }
        return o0() % this.f291197v == 0 ? o0() / this.f291197v : (o0() / this.f291197v) + 1;
    }

    public final int F1() {
        return (this.f53851q - getPaddingBottom()) - getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void G0() {
        b1();
    }

    public final void G1(View view, View view2, int i12, int i13) {
        int iN02 = (i12 * this.f291196u) + RecyclerView.m.n0(view2);
        int iJ02 = (i13 * this.f291195t) + RecyclerView.m.j0(view2);
        D0(view);
        RecyclerView.m.B0(view, iJ02, iN02, this.f291195t + iJ02, this.f291196u + iN02);
    }

    public final int H1(int i12) {
        int i13 = this.f291199x;
        int i14 = i12 / i13;
        return (D1() * i14) + this.f291194s + (i12 % i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@k RecyclerView.n nVar) {
        return nVar instanceof Companion.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R0(int i12, int i13) {
        this.f291201z = i12;
        this.f291192A = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(@Y61.k androidx.recyclerview.widget.RecyclerView.u r11, @Y61.k androidx.recyclerview.widget.RecyclerView.z r12) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager.U0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X0(@l Parcelable parcelable) {
        int iIntValue;
        if (parcelable instanceof Companion.SaveState) {
            Companion.SaveState saveState = (Companion.SaveState) parcelable;
            Companion.Type type = saveState.f291202b;
            this.f291193r = type;
            int iOrdinal = type.ordinal();
            if (iOrdinal == 0) {
                Integer num = saveState.f291204d;
                iIntValue = num != null ? num.intValue() : 1;
                this.f291193r = Companion.Type.f291205b;
                this.f291197v = iIntValue;
                i1();
                return;
            }
            if (iOrdinal != 1) {
                return;
            }
            Integer num2 = saveState.f291203c;
            iIntValue = num2 != null ? num2.intValue() : 1;
            this.f291193r = Companion.Type.f291206c;
            this.f291198w = iIntValue;
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final Parcelable Y0() {
        Integer numValueOf;
        Companion.Type type = this.f291193r;
        int iOrdinal = type.ordinal();
        Integer numValueOf2 = null;
        if (iOrdinal == 0) {
            numValueOf = null;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(E1());
        }
        int iOrdinal2 = this.f291193r.ordinal();
        if (iOrdinal2 == 0) {
            numValueOf2 = Integer.valueOf(D1());
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new Companion.SaveState(type, numValueOf, numValueOf2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @l
    public final View Z(int i12) {
        int iE02 = e0();
        for (int i13 = 0; i13 < iE02; i13++) {
            if (H1(i13) == i12) {
                return d0(i13);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n a0() {
        return new Companion.a(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n b0(@k Context context, @k AttributeSet attributeSet) {
        return new Companion.a(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n c0(@k ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new Companion.a((ViewGroup.MarginLayoutParams) layoutParams) : new Companion.a(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k1(int r9, @Y61.k androidx.recyclerview.widget.RecyclerView.u r10, @Y61.k androidx.recyclerview.widget.RecyclerView.z r11) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager.k1(int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l1(int i12) {
        if (i12 >= o0()) {
            return;
        }
        this.f291194s = i12;
        b1();
        i1();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1(int r10, @Y61.k androidx.recyclerview.widget.RecyclerView.u r11, @Y61.k androidx.recyclerview.widget.RecyclerView.z r12) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager.m1(int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void w1(int i12, @k RecyclerView recyclerView) {
        if (i12 >= o0()) {
            return;
        }
        b bVar = new b(this, recyclerView.getContext());
        bVar.f53878a = i12;
        x1(bVar);
    }

    public final void z1(int i12, RecyclerView.u uVar, RecyclerView.z zVar, int i13, int i14, SparseIntArray sparseIntArray) {
        int iJ02;
        int iN02;
        int i15;
        int i16;
        int size;
        RecyclerView.z zVar2 = zVar;
        int i17 = 0;
        if (this.f291194s < 0) {
            this.f291194s = 0;
        }
        int i18 = 1;
        if (this.f291194s >= o0()) {
            this.f291194s = o0() - 1;
        }
        SparseArray sparseArray = new SparseArray(e0());
        if (e0() != 0) {
            View viewD0 = d0(0);
            iJ02 = RecyclerView.m.j0(viewD0);
            iN02 = RecyclerView.m.n0(viewD0);
            if (i12 == 0) {
                iJ02 -= this.f291195t;
            } else if (i12 == 1) {
                iJ02 += this.f291195t;
            } else if (i12 == 2) {
                iN02 -= this.f291196u;
            } else if (i12 == 3) {
                iN02 += this.f291196u;
            }
            int iE02 = e0();
            for (int i19 = 0; i19 < iE02; i19++) {
                sparseArray.put(H1(i19), d0(i19));
            }
            int size2 = sparseArray.size();
            for (int i22 = 0; i22 < size2; i22++) {
                W((View) sparseArray.valueAt(i22));
            }
        } else {
            iJ02 = i13;
            iN02 = i14;
        }
        int i23 = -1;
        if (i12 == 0) {
            this.f291194s--;
        } else if (i12 == 1) {
            this.f291194s++;
        } else if (i12 == 2) {
            this.f291194s -= D1();
        } else if (i12 == 3) {
            this.f291194s = D1() + this.f291194s;
        }
        int i24 = this.f291199x * this.f291200y;
        int i25 = 0;
        int i26 = iJ02;
        while (i25 < i24) {
            int iH1 = H1(i25);
            if (!zVar2.f53897g || sparseIntArray == null) {
                i15 = 0;
            } else {
                int size3 = sparseIntArray.size();
                int i27 = iH1;
                for (int i28 = i17; i28 < size3; i28++) {
                    if (sparseIntArray.valueAt(i28) == i18 && sparseIntArray.keyAt(i28) < iH1) {
                        i27--;
                    }
                }
                i15 = iH1 - i27;
                iH1 = i27;
            }
            if (iH1 < 0 || iH1 >= zVar.b()) {
                i16 = i24;
            } else {
                View viewD = (View) sparseArray.get(iH1);
                if (viewD == null) {
                    viewD = uVar.d(iH1);
                    D(viewD);
                    if (!zVar2.f53897g) {
                        Companion.a aVar = (Companion.a) viewD.getLayoutParams();
                        aVar.f291209f = B1(iH1);
                        aVar.f291210g = A1(iH1);
                    }
                    D0(viewD);
                    RecyclerView.m.B0(viewD, i26, iN02, this.f291195t + i26, this.f291196u + iN02);
                } else {
                    G(viewD, i23);
                    sparseArray.remove(iH1);
                }
                int i29 = this.f291199x;
                if (i25 % i29 == i29 - 1) {
                    iN02 += this.f291196u;
                    if (zVar2.f53897g && sparseIntArray != null && (size = sparseIntArray.size()) >= 1 && 1 <= size) {
                        int i32 = 1;
                        while (true) {
                            int i33 = iH1 + i32;
                            if (i33 < 0 || i33 >= zVar.b()) {
                                i16 = i24;
                            } else {
                                View viewD2 = uVar.d(i33);
                                D(viewD2);
                                int i34 = i33 + i15;
                                i16 = i24;
                                int i35 = iH1 + i15;
                                G1(viewD2, viewD, B1(i34) - B1(i35), A1(i34) - A1(i35));
                            }
                            if (i32 == size) {
                                break;
                            }
                            i32++;
                            i24 = i16;
                        }
                    } else {
                        i16 = i24;
                    }
                    i26 = iJ02;
                } else {
                    i16 = i24;
                    i26 += this.f291195t;
                }
            }
            i25++;
            i24 = i16;
            zVar2 = zVar;
            i17 = 0;
            i18 = 1;
            i23 = -1;
        }
        int size4 = sparseArray.size();
        for (int i36 = 0; i36 < size4; i36++) {
            View view = (View) sparseArray.valueAt(i36);
            if (view != null) {
                uVar.g(view);
            }
        }
    }
}
