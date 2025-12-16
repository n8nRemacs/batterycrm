package com.avito.android.code_confirmation.code_confirmation;

import androidx.compose.runtime.C22026a;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodePayload;
import kotlin.Metadata;

/* compiled from: CodeConfirmationActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/m0;", "", "a", "b", "c", "Lcom/avito/android/code_confirmation/code_confirmation/m0$a;", "Lcom/avito/android/code_confirmation/code_confirmation/m0$b;", "Lcom/avito/android/code_confirmation/code_confirmation/m0$c;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface m0 {

    /* compiled from: CodeConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/m0$a;", "Lcom/avito/android/code_confirmation/code_confirmation/m0;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ConfirmedCodePayload f119572a;

        public a(@Y61.k ConfirmedCodePayload confirmedCodePayload) {
            this.f119572a = confirmedCodePayload;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f119572a, ((a) obj).f119572a);
        }

        public final int hashCode() {
            return this.f119572a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Confirmed(confirmedCodePayload=" + this.f119572a + ')';
        }
    }

    /* compiled from: CodeConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/m0$b;", "Lcom/avito/android/code_confirmation/code_confirmation/m0;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements m0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f119573a = new b();
    }

    /* compiled from: CodeConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/m0$c;", "Lcom/avito/android/code_confirmation/code_confirmation/m0;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements m0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f119574a;

        public c(@Y61.k String str) {
            this.f119574a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f119574a, ((c) obj).f119574a);
        }

        public final int hashCode() {
            return this.f119574a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("RecallMePhoneConfirmed(phone="), this.f119574a, ')');
        }
    }
}
