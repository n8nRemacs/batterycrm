package com.avito.android.mortgage.pre_approval.form.list.items.chips;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/c;", "LT00/a;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f201743b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f201744c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f201745d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f201746e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PrintableText f201747f;

    /* compiled from: ChipsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/c$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201748b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f201749c;

        public a(@k String str, @k String str2) {
            this.f201748b = str;
            this.f201749c = str2;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            if (obj instanceof a) {
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF278901b() {
            return this.f201749c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f201748b, aVar.f201748b) && L.f(this.f201749c, aVar.f201749c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF249891e() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return this.f201749c.hashCode() + (this.f201748b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF249892f() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            return "Chip(value=" + this.f201748b + ", chipTitle=" + ((Object) this.f201749c) + ')';
        }
    }

    public c(@k String str, @k PrintableText printableText, @k ArrayList arrayList, @l a aVar, @l PrintableText printableText2) {
        this.f201743b = str;
        this.f201744c = printableText;
        this.f201745d = arrayList;
        this.f201746e = aVar;
        this.f201747f = printableText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f201743b.equals(cVar.f201743b) && this.f201744c.equals(cVar.f201744c) && this.f201745d.equals(cVar.f201745d) && L.f(this.f201746e, cVar.f201746e) && L.f(this.f201747f, cVar.f201747f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162559g() {
        return this.f201743b;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f201745d, com.avito.android.actions_sheet.a.f(this.f201744c, this.f201743b.hashCode() * 31, 31), 31);
        a aVar = this.f201746e;
        int iHashCode = (iG2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        PrintableText printableText = this.f201747f;
        return iHashCode + (printableText != null ? printableText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsItem(stringId=");
        sb2.append(this.f201743b);
        sb2.append(", title=");
        sb2.append(this.f201744c);
        sb2.append(", chips=");
        sb2.append(this.f201745d);
        sb2.append(", selectedChip=");
        sb2.append(this.f201746e);
        sb2.append(", error=");
        return AK.c.m(sb2, this.f201747f, ')');
    }
}
