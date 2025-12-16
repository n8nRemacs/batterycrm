package com.avito.android.mortgage.root.list.items.realty_object_details;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42156l;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyObjectDetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/b;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f202766a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<a> f202767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f202768c;

    /* compiled from: RealtyObjectDetailsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/b$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f202769b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f202770c;

        public a(@Y61.k String str, boolean z12) {
            this.f202769b = str;
            this.f202770c = z12;
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
        public final CharSequence getF178768h() {
            return this.f202769b;
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
            return L.f(this.f202769b, aVar.f202769b) && this.f202770c == aVar.f202770c;
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
            return Boolean.hashCode(this.f202770c) + (this.f202769b.hashCode() * 31);
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
            StringBuilder sb2 = new StringBuilder("IsAvitoItemOption(chipTitle=");
            sb2.append((Object) this.f202769b);
            sb2.append(", value=");
            return androidx.appcompat.app.r.x(sb2, this.f202770c, ')');
        }
    }

    public b(int i12, @Y61.k AttributedText attributedText, @Y61.k List list) {
        this.f202766a = attributedText;
        this.f202767b = list;
        this.f202768c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f202766a, bVar.f202766a) && L.f(this.f202767b, bVar.f202767b) && this.f202768c == bVar.f202768c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202768c) + H.e(this.f202766a.hashCode() * 31, 31, this.f202767b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IsAvitoItemBlock(title=");
        sb2.append(this.f202766a);
        sb2.append(", options=");
        sb2.append(this.f202767b);
        sb2.append(", selectedOptionIdx=");
        return androidx.appcompat.app.r.t(sb2, this.f202768c, ')');
    }
}
