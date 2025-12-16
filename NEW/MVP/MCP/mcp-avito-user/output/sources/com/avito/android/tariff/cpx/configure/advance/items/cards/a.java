package com.avito.android.tariff.cpx.configure.advance.items.cards;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceCardsItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a;", "", "a", "b", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a$a;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: CpxConfigureAdvanceCardsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a$a;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff.cpx.configure.advance.items.cards.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8994a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f295648a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f295649b;

        public C8994a(@Y61.k AttributedText attributedText, @Y61.k DeepLink deepLink) {
            this.f295648a = attributedText;
            this.f295649b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8994a)) {
                return false;
            }
            C8994a c8994a = (C8994a) obj;
            return L.f(this.f295648a, c8994a.f295648a) && L.f(this.f295649b, c8994a.f295649b);
        }

        @Override // com.avito.android.tariff.cpx.configure.advance.items.cards.a
        @Y61.k
        /* renamed from: getText, reason: from getter */
        public final AttributedText getF295650a() {
            return this.f295648a;
        }

        public final int hashCode() {
            return this.f295649b.hashCode() + (this.f295648a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvanceCardClickItem(text=");
            sb2.append(this.f295648a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f295649b, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceCardsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a$b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f295650a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f295651b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f295652c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f295653d;

        public b(boolean z12, @Y61.k AttributedText attributedText, @Y61.k String str, @Y61.l AttributedText attributedText2) {
            this.f295650a = attributedText;
            this.f295651b = z12;
            this.f295652c = str;
            this.f295653d = attributedText2;
        }

        public static b a(b bVar, boolean z12) {
            AttributedText attributedText = bVar.f295650a;
            String str = bVar.f295652c;
            AttributedText attributedText2 = bVar.f295653d;
            bVar.getClass();
            return new b(z12, attributedText, str, attributedText2);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f295650a, bVar.f295650a) && this.f295651b == bVar.f295651b && L.f(this.f295652c, bVar.f295652c) && L.f(this.f295653d, bVar.f295653d);
        }

        @Override // com.avito.android.tariff.cpx.configure.advance.items.cards.a
        @Y61.k
        /* renamed from: getText, reason: from getter */
        public final AttributedText getF295650a() {
            return this.f295650a;
        }

        public final int hashCode() {
            int iD2 = H.d(androidx.appcompat.app.r.i(this.f295650a.hashCode() * 31, 31, this.f295651b), 31, this.f295652c);
            AttributedText attributedText = this.f295653d;
            return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvanceCardSelectItem(text=");
            sb2.append(this.f295650a);
            sb2.append(", isSelected=");
            sb2.append(this.f295651b);
            sb2.append(", advance=");
            sb2.append(this.f295652c);
            sb2.append(", extraInfo=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f295653d, ')');
        }
    }

    @Y61.k
    /* renamed from: getText */
    AttributedText getF295650a();
}
