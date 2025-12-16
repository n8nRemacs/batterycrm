package com.avito.android.passport.profile_add.merge.domain;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.PassportBlockingErrorLink;
import kotlin.Metadata;

/* compiled from: RequestCodeResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/k;", "", "a", "b", "c", "Lcom/avito/android/passport/profile_add/merge/domain/k$a;", "Lcom/avito/android/passport/profile_add/merge/domain/k$b;", "Lcom/avito/android/passport/profile_add/merge/domain/k$c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface k {

    /* compiled from: RequestCodeResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/k$a;", "Lcom/avito/android/passport/profile_add/merge/domain/k;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PassportBlockingErrorLink f213047a;

        public a(@Y61.k PassportBlockingErrorLink passportBlockingErrorLink) {
            this.f213047a = passportBlockingErrorLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f213047a.equals(((a) obj).f213047a);
        }

        public final int hashCode() {
            return this.f213047a.f133536b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Failure(deeplink=" + this.f213047a + ')';
        }
    }

    /* compiled from: RequestCodeResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/k$b;", "Lcom/avito/android/passport/profile_add/merge/domain/k;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f213048a = new b();
    }

    /* compiled from: RequestCodeResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/k$c;", "Lcom/avito/android/passport/profile_add/merge/domain/k;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements k {

        /* renamed from: a, reason: collision with root package name */
        public final long f213049a;

        public c(long j12) {
            this.f213049a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f213049a == ((c) obj).f213049a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f213049a);
        }

        @Y61.k
        public final String toString() {
            return r.u(new StringBuilder("Success(timeoutEndTimestampSeconds="), this.f213049a, ')');
        }
    }
}
