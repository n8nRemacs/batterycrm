package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBankPayload.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d;", "", "a", "b", "c", "d", "e", "f", "g", "Lcom/avito/android/mortgage/root/list/payloads/d$a;", "Lcom/avito/android/mortgage/root/list/payloads/d$b;", "Lcom/avito/android/mortgage/root/list/payloads/d$c;", "Lcom/avito/android/mortgage/root/list/payloads/d$d;", "Lcom/avito/android/mortgage/root/list/payloads/d$e;", "Lcom/avito/android/mortgage/root/list/payloads/d$f;", "Lcom/avito/android/mortgage/root/list/payloads/d$g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$a;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.mortgage.root.list.items.bank.d f202895a;

        public a(@Y61.l com.avito.android.mortgage.root.list.items.bank.d dVar) {
            this.f202895a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f202895a, ((a) obj).f202895a);
        }

        public final int hashCode() {
            com.avito.android.mortgage.root.list.items.bank.d dVar = this.f202895a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChatManagerActionPayload(action=" + this.f202895a + ')';
        }
    }

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$b;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ApplicationAppealComment f202896a;

        public b(@Y61.l ApplicationAppealComment applicationAppealComment) {
            this.f202896a = applicationAppealComment;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f202896a, ((b) obj).f202896a);
        }

        public final int hashCode() {
            ApplicationAppealComment applicationAppealComment = this.f202896a;
            if (applicationAppealComment == null) {
                return 0;
            }
            return applicationAppealComment.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CommentPayload(comment=" + this.f202896a + ')';
        }
    }

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$c;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.android.mortgage.root.list.items.bank.e> f202897a;

        public c(@Y61.k List<com.avito.android.mortgage.root.list.items.bank.e> list) {
            this.f202897a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f202897a, ((c) obj).f202897a);
        }

        public final int hashCode() {
            return this.f202897a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("CreditInfoPayload(creditInfo="), this.f202897a, ')');
        }
    }

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$d;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.list.payloads.d$d, reason: collision with other inner class name */
    public static final /* data */ class C6041d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f202898a;

        public C6041d(boolean z12) {
            this.f202898a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6041d) && this.f202898a == ((C6041d) obj).f202898a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f202898a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("IsClickablePayload(isClickable="), this.f202898a, ')');
        }
    }

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$e;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.mortgage.root.list.items.bank.d f202899a;

        public e(@Y61.l com.avito.android.mortgage.root.list.items.bank.d dVar) {
            this.f202899a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f202899a, ((e) obj).f202899a);
        }

        public final int hashCode() {
            com.avito.android.mortgage.root.list.items.bank.d dVar = this.f202899a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenApplicationPayload(action=" + this.f202899a + ')';
        }
    }

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$f;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.mortgage.root.list.items.bank.f f202900a;

        public f(@Y61.l com.avito.android.mortgage.root.list.items.bank.f fVar) {
            this.f202900a = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f202900a, ((f) obj).f202900a);
        }

        public final int hashCode() {
            com.avito.android.mortgage.root.list.items.bank.f fVar = this.f202900a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectBankActionPayload(action=" + this.f202900a + ')';
        }
    }

    /* compiled from: MortgageRootBankPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/d$g;", "Lcom/avito/android/mortgage/root/list/payloads/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f202901a;

        public g(@Y61.l AttributedText attributedText) {
            this.f202901a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f202901a, ((g) obj).f202901a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f202901a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("SubtitlePayload(text="), this.f202901a, ')');
        }
    }
}
