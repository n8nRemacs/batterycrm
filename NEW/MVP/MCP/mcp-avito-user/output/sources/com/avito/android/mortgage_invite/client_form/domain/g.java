package com.avito.android.mortgage_invite.client_form.domain;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.printable_text.PrintableText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateParticipantUseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/g;", "", "a", "b", "c", "Lcom/avito/android/mortgage_invite/client_form/domain/g$a;", "Lcom/avito/android/mortgage_invite/client_form/domain/g$b;", "Lcom/avito/android/mortgage_invite/client_form/domain/g$c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g {

    /* compiled from: CreateParticipantUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/g$a;", "Lcom/avito/android/mortgage_invite/client_form/domain/g;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Exception f205162a;

        public a(@Y61.k Exception exc) {
            this.f205162a = exc;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f205162a.equals(((a) obj).f205162a);
        }

        public final int hashCode() {
            return this.f205162a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Failure(error=" + this.f205162a + ')';
        }
    }

    /* compiled from: CreateParticipantUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/g$b;", "Lcom/avito/android/mortgage_invite/client_form/domain/g;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<ContactInfoFieldId, PrintableText> f205163a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Map<ContactInfoFieldId, ? extends PrintableText> map) {
            this.f205163a = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f205163a, ((b) obj).f205163a);
        }

        public final int hashCode() {
            return this.f205163a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return r.w(new StringBuilder("InvalidClientData(payload="), this.f205163a, ')');
        }
    }

    /* compiled from: CreateParticipantUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/g$c;", "Lcom/avito/android/mortgage_invite/client_form/domain/g;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f205164a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f205165b;

        public c(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f205164a = deepLink;
            this.f205165b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f205164a, cVar.f205164a) && L.f(this.f205165b, cVar.f205165b);
        }

        public final int hashCode() {
            return this.f205165b.hashCode() + (this.f205164a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(redirectDeeplink=");
            sb2.append(this.f205164a);
            sb2.append(", applicantId=");
            return C22026a.c(sb2, this.f205165b, ')');
        }
    }
}
