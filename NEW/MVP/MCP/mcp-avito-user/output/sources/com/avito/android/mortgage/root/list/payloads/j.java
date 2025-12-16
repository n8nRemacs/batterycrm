package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBorrowerTitlePayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/j;", "", "a", "b", "c", "Lcom/avito/android/mortgage/root/list/payloads/j$a;", "Lcom/avito/android/mortgage/root/list/payloads/j$b;", "Lcom/avito/android/mortgage/root/list/payloads/j$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface j {

    /* compiled from: MortgageRootBorrowerTitlePayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/j$a;", "Lcom/avito/android/mortgage/root/list/payloads/j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f202910a;

        public a(boolean z12) {
            this.f202910a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f202910a == ((a) obj).f202910a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f202910a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("CanEditPayload(canEdit="), this.f202910a, ')');
        }
    }

    /* compiled from: MortgageRootBorrowerTitlePayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/j$b;", "Lcom/avito/android/mortgage/root/list/payloads/j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f202911a;

        public b(@Y61.l AttributedText attributedText) {
            this.f202911a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f202911a, ((b) obj).f202911a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f202911a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("SubtitlePayload(subtitle="), this.f202911a, ')');
        }
    }

    /* compiled from: MortgageRootBorrowerTitlePayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/j$c;", "Lcom/avito/android/mortgage/root/list/payloads/j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f202912a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f202913b;

        public c(@Y61.k String str, @Y61.l String str2) {
            this.f202912a = str;
            this.f202913b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f202912a, cVar.f202912a) && L.f(this.f202913b, cVar.f202913b);
        }

        public final int hashCode() {
            int iHashCode = this.f202912a.hashCode() * 31;
            String str = this.f202913b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TitlePayload(title=");
            sb2.append(this.f202912a);
            sb2.append(", titleStyle=");
            return C22026a.c(sb2, this.f202913b, ')');
        }
    }
}
