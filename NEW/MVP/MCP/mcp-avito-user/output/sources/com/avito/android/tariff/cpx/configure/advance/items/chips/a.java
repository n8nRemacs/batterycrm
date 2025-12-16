package com.avito.android.tariff.cpx.configure.advance.items.chips;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceChipsItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a;", "Lcom/avito/android/lib/design/chips/h;", "a", "b", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a$a;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a extends com.avito.android.lib.design.chips.h {

    /* compiled from: CpxConfigureAdvanceChipsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a$a;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff.cpx.configure.advance.items.chips.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8995a implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f295695b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f295696c;

        public C8995a(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f295695b = str;
            this.f295696c = deepLink;
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
        public final boolean V1(@Y61.k Object obj) {
            return (obj instanceof C8995a) && L.f(this.f295695b, ((C8995a) obj).f295695b);
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f295695b;
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
            if (!(obj instanceof C8995a)) {
                return false;
            }
            C8995a c8995a = (C8995a) obj;
            return L.f(this.f295695b, c8995a.f295695b) && L.f(this.f295696c, c8995a.f295696c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF293893c() {
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
            return this.f295696c.hashCode() + (this.f295695b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvanceChipsClickItem(chipTitle=");
            sb2.append((Object) this.f295695b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f295696c, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceChipsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a$b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f295697b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f295698c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f295699d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f295700e;

        public b(@Y61.k String str, boolean z12, @Y61.k String str2, @l AttributedText attributedText) {
            this.f295697b = str;
            this.f295698c = z12;
            this.f295699d = str2;
            this.f295700e = attributedText;
        }

        public static b a(b bVar, boolean z12) {
            String str = bVar.f295697b;
            String str2 = bVar.f295699d;
            AttributedText attributedText = bVar.f295700e;
            bVar.getClass();
            return new b(str, z12, str2, attributedText);
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
        public final boolean V1(@Y61.k Object obj) {
            return (obj instanceof b) && L.f(this.f295697b, ((b) obj).f295697b);
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f295697b;
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f295697b, bVar.f295697b) && this.f295698c == bVar.f295698c && L.f(this.f295699d, bVar.f295699d) && L.f(this.f295700e, bVar.f295700e);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF293893c() {
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
            int iD2 = H.d(r.i(this.f295697b.hashCode() * 31, 31, this.f295698c), 31, this.f295699d);
            AttributedText attributedText = this.f295700e;
            return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvanceChipsSelectItem(chipTitle=");
            sb2.append((Object) this.f295697b);
            sb2.append(", isSelected=");
            sb2.append(this.f295698c);
            sb2.append(", advance=");
            sb2.append(this.f295699d);
            sb2.append(", extraInfo=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f295700e, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }
}
