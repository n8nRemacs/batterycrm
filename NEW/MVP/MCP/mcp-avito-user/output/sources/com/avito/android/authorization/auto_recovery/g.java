package com.avito.android.authorization.auto_recovery;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import kotlin.Metadata;

/* compiled from: AutoRecoveryAvailabilityInteractor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/g;", "", "a", "b", "c", "d", "Lcom/avito/android/authorization/auto_recovery/g$a;", "Lcom/avito/android/authorization/auto_recovery/g$b;", "Lcom/avito/android/authorization/auto_recovery/g$c;", "Lcom/avito/android/authorization/auto_recovery/g$d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g {

    /* compiled from: AutoRecoveryAvailabilityInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/g$a;", "Lcom/avito/android/authorization/auto_recovery/g;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f93192a = new a();
    }

    /* compiled from: AutoRecoveryAvailabilityInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/g$b;", "Lcom/avito/android/authorization/auto_recovery/g;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f93193a = new b();
    }

    /* compiled from: AutoRecoveryAvailabilityInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/g$c;", "Lcom/avito/android/authorization/auto_recovery/g;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinUniversalPageLink f93194a;

        public c(@k BeduinUniversalPageLink beduinUniversalPageLink) {
            this.f93194a = beduinUniversalPageLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f93194a.equals(((c) obj).f93194a);
        }

        public final int hashCode() {
            return this.f93194a.hashCode();
        }

        @k
        public final String toString() {
            return "Resolution(deepLink=" + this.f93194a + ')';
        }
    }

    /* compiled from: AutoRecoveryAvailabilityInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/g$d;", "Lcom/avito/android/authorization/auto_recovery/g;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f93195a = new d();
    }
}
