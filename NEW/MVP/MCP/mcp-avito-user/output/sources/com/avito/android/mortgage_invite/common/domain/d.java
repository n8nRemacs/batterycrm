package com.avito.android.mortgage_invite.common.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.ApiException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UpdateContactInfoUseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/d;", "", "a", "b", "c", "Lcom/avito/android/mortgage_invite/common/domain/d$a;", "Lcom/avito/android/mortgage_invite/common/domain/d$b;", "Lcom/avito/android/mortgage_invite/common/domain/d$c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: UpdateContactInfoUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/d$a;", "Lcom/avito/android/mortgage_invite/common/domain/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f205511a;

        public a(@k ApiException apiException) {
            this.f205511a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f205511a.equals(((a) obj).f205511a);
        }

        public final int hashCode() {
            return this.f205511a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("Failure(error="), this.f205511a, ')');
        }
    }

    /* compiled from: UpdateContactInfoUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/d$b;", "Lcom/avito/android/mortgage_invite/common/domain/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<ContactInfoFieldId, PrintableText> f205512a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k Map<ContactInfoFieldId, ? extends PrintableText> map) {
            this.f205512a = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f205512a, ((b) obj).f205512a);
        }

        public final int hashCode() {
            return this.f205512a.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("InvalidAgentData(payload="), this.f205512a, ')');
        }
    }

    /* compiled from: UpdateContactInfoUseCase.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/d$c;", "Lcom/avito/android/mortgage_invite/common/domain/d;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f205513a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1538034179;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
