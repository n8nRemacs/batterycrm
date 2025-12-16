package com.avito.android.mortgage.pre_approval.form.list.items.input;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/c;", "LT00/a;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f201767b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f201768c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PrintableText f201769d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FormatterType f201770e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f201771f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final O00.a f201772g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ArrayList f201773h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final PrintableText f201774i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Double f201775j;

    /* compiled from: InputItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/c$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f201776b;

        /* renamed from: c, reason: collision with root package name */
        public final int f201777c;

        public a(@Y61.k String str, int i12) {
            this.f201776b = str;
            this.f201777c = i12;
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
            if (obj instanceof a) {
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF264620e() {
            return this.f201776b;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f201776b, aVar.f201776b) && this.f201777c == aVar.f201777c;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF202756d() {
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
            return Integer.hashCode(this.f201777c) + (this.f201776b.hashCode() * 31);
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
            StringBuilder sb2 = new StringBuilder("Chip(chipTitle=");
            sb2.append((Object) this.f201776b);
            sb2.append(", value=");
            return r.t(sb2, this.f201777c, ')');
        }
    }

    public c(@Y61.k String str, @Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.k FormatterType formatterType, @Y61.l Integer num, @Y61.l O00.a aVar, @Y61.l ArrayList arrayList, @Y61.l PrintableText printableText3, @Y61.l Double d12) {
        this.f201767b = str;
        this.f201768c = printableText;
        this.f201769d = printableText2;
        this.f201770e = formatterType;
        this.f201771f = num;
        this.f201772g = aVar;
        this.f201773h = arrayList;
        this.f201774i = printableText3;
        this.f201775j = d12;
    }

    @Y61.l
    public final Integer a() {
        ArrayList arrayList = this.f201773h;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            int i13 = ((a) it.next()).f201777c;
            Double d12 = this.f201775j;
            Integer numValueOf = d12 != null ? Integer.valueOf(kotlin.math.b.a(d12.doubleValue())) : this.f201771f;
            if (numValueOf != null && i13 == numValueOf.intValue()) {
                break;
            }
            i12++;
        }
        Integer numValueOf2 = Integer.valueOf(i12);
        if (i12 >= 0) {
            return numValueOf2;
        }
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f201767b.equals(cVar.f201767b) && this.f201768c.equals(cVar.f201768c) && L.f(this.f201769d, cVar.f201769d) && L.f(this.f201770e, cVar.f201770e) && L.f(this.f201771f, cVar.f201771f) && L.f(this.f201772g, cVar.f201772g) && L.f(this.f201773h, cVar.f201773h) && L.f(this.f201774i, cVar.f201774i) && L.f(this.f201775j, cVar.f201775j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299239b() {
        return this.f201767b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f201768c, this.f201767b.hashCode() * 31, 31);
        PrintableText printableText = this.f201769d;
        int iHashCode = (this.f201770e.hashCode() + ((iF2 + (printableText == null ? 0 : printableText.hashCode())) * 31)) * 31;
        Integer num = this.f201771f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        O00.a aVar = this.f201772g;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ArrayList arrayList = this.f201773h;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        PrintableText printableText2 = this.f201774i;
        int iHashCode5 = (iHashCode4 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
        Double d12 = this.f201775j;
        return iHashCode5 + (d12 != null ? d12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputItem(stringId=");
        sb2.append(this.f201767b);
        sb2.append(", title=");
        sb2.append(this.f201768c);
        sb2.append(", placeholder=");
        sb2.append(this.f201769d);
        sb2.append(", formatter=");
        sb2.append(this.f201770e);
        sb2.append(", value=");
        sb2.append(this.f201771f);
        sb2.append(", slider=");
        sb2.append(this.f201772g);
        sb2.append(", predefinedValues=");
        sb2.append(this.f201773h);
        sb2.append(", error=");
        sb2.append(this.f201774i);
        sb2.append(", inputPercent=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f201775j, ')');
    }
}
