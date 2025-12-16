package com.avito.android.mortgage.root.list.payloads;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootIssuePayload.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/p;", "", "a", "b", "Lcom/avito/android/mortgage/root/list/payloads/p$a;", "Lcom/avito/android/mortgage/root/list/payloads/p$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface p {

    /* compiled from: MortgageRootIssuePayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/p$a;", "Lcom/avito/android/mortgage/root/list/payloads/p;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements p {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ActionButton f202917a;

        public a(@Y61.l ActionButton actionButton) {
            this.f202917a = actionButton;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f202917a, ((a) obj).f202917a);
        }

        public final int hashCode() {
            ActionButton actionButton = this.f202917a;
            if (actionButton == null) {
                return 0;
            }
            return actionButton.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionPayload(action=" + this.f202917a + ')';
        }
    }

    /* compiled from: MortgageRootIssuePayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/p$b;", "Lcom/avito/android/mortgage/root/list/payloads/p;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements p {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f202918a;

        public b(@Y61.l String str) {
            this.f202918a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f202918a, ((b) obj).f202918a);
        }

        public final int hashCode() {
            String str = this.f202918a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DescriptionPayload(description="), this.f202918a, ')');
        }
    }
}
