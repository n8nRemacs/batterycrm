package com.avito.android.mortgage.root.list.payloads;

import KZ.L;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: MortgageRootBorrowerActionPayload.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/g;", "", "a", "b", "c", "d", "Lcom/avito/android/mortgage/root/list/payloads/g$a;", "Lcom/avito/android/mortgage/root/list/payloads/g$b;", "Lcom/avito/android/mortgage/root/list/payloads/g$c;", "Lcom/avito/android/mortgage/root/list/payloads/g$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g {

    /* compiled from: MortgageRootBorrowerActionPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/g$a;", "Lcom/avito/android/mortgage/root/list/payloads/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f202903a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f202904b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final L f202905c;

        public a(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l L l12) {
            this.f202903a = str;
            this.f202904b = deepLink;
            this.f202905c = l12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f202903a, aVar.f202903a) && kotlin.jvm.internal.L.f(this.f202904b, aVar.f202904b) && kotlin.jvm.internal.L.f(this.f202905c, aVar.f202905c);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f202904b, this.f202903a.hashCode() * 31, 31);
            L l12 = this.f202905c;
            return iE2 + (l12 == null ? 0 : l12.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ActionPayload(applicantId=" + this.f202903a + ", action=" + this.f202904b + ", context=" + this.f202905c + ')';
        }
    }

    /* compiled from: MortgageRootBorrowerActionPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/g$b;", "Lcom/avito/android/mortgage/root/list/payloads/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f202906a;

        public b(@Y61.l String str) {
            this.f202906a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f202906a, ((b) obj).f202906a);
        }

        public final int hashCode() {
            String str = this.f202906a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("IconBadgePayload(iconBadgeColor="), this.f202906a, ')');
        }
    }

    /* compiled from: MortgageRootBorrowerActionPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/g$c;", "Lcom/avito/android/mortgage/root/list/payloads/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f202907a;

        public c(@Y61.k String str) {
            this.f202907a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f202907a, ((c) obj).f202907a);
        }

        public final int hashCode() {
            return this.f202907a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("IconPayload(iconName="), this.f202907a, ')');
        }
    }

    /* compiled from: MortgageRootBorrowerActionPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/g$d;", "Lcom/avito/android/mortgage/root/list/payloads/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f202908a;

        public d(@Y61.l AttributedText attributedText) {
            this.f202908a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f202908a, ((d) obj).f202908a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f202908a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("SubtitlePayload(subtitle="), this.f202908a, ')');
        }
    }
}
