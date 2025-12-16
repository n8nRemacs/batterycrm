package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootNavigationPayload.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/s;", "", "a", "b", "c", "d", "Lcom/avito/android/mortgage/root/list/payloads/s$a;", "Lcom/avito/android/mortgage/root/list/payloads/s$b;", "Lcom/avito/android/mortgage/root/list/payloads/s$c;", "Lcom/avito/android/mortgage/root/list/payloads/s$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface s {

    /* compiled from: MortgageRootNavigationPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/s$a;", "Lcom/avito/android/mortgage/root/list/payloads/s;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final KZ.A f202920a;

        public a(@Y61.l KZ.A a12) {
            this.f202920a = a12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f202920a, ((a) obj).f202920a);
        }

        public final int hashCode() {
            KZ.A a12 = this.f202920a;
            if (a12 == null) {
                return 0;
            }
            return a12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionNextPayload(action=" + this.f202920a + ')';
        }
    }

    /* compiled from: MortgageRootNavigationPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/s$b;", "Lcom/avito/android/mortgage/root/list/payloads/s;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final KZ.A f202921a;

        public b(@Y61.l KZ.A a12) {
            this.f202921a = a12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f202921a, ((b) obj).f202921a);
        }

        public final int hashCode() {
            KZ.A a12 = this.f202921a;
            if (a12 == null) {
                return 0;
            }
            return a12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionPreviousPayload(action=" + this.f202921a + ')';
        }
    }

    /* compiled from: MortgageRootNavigationPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/s$c;", "Lcom/avito/android/mortgage/root/list/payloads/s;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f202922a;

        public c(@Y61.l AttributedText attributedText) {
            this.f202922a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f202922a, ((c) obj).f202922a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f202922a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("LegalTextPayload(text="), this.f202922a, ')');
        }
    }

    /* compiled from: MortgageRootNavigationPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/s$d;", "Lcom/avito/android/mortgage/root/list/payloads/s;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ApplicationProcessType f202923a;

        public d(@Y61.l ApplicationProcessType applicationProcessType) {
            this.f202923a = applicationProcessType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f202923a == ((d) obj).f202923a;
        }

        public final int hashCode() {
            ApplicationProcessType applicationProcessType = this.f202923a;
            if (applicationProcessType == null) {
                return 0;
            }
            return applicationProcessType.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LoadingPayload(loadingButtonType=" + this.f202923a + ')';
        }
    }
}
