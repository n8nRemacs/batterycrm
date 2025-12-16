package com.avito.android.vacancy_call_action.domain;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VacancyCallActionInteractorResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vacancy_call_action/domain/c;", "", "a", "b", "c", "Lcom/avito/android/vacancy_call_action/domain/c$a;", "Lcom/avito/android/vacancy_call_action/domain/c$b;", "Lcom/avito/android/vacancy_call_action/domain/c$c;", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: VacancyCallActionInteractorResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vacancy_call_action/domain/c$a;", "Lcom/avito/android/vacancy_call_action/domain/c;", "<init>", "()V", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f319224a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -69460715;
        }

        @k
        public final String toString() {
            return "Bypass";
        }
    }

    /* compiled from: VacancyCallActionInteractorResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vacancy_call_action/domain/c$b;", "Lcom/avito/android/vacancy_call_action/domain/c;", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Throwable f319225a;

        public b(@l Throwable th2) {
            this.f319225a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f319225a, ((b) obj).f319225a);
        }

        public final int hashCode() {
            Throwable th2 = this.f319225a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(cause="), this.f319225a, ')');
        }
    }

    /* compiled from: VacancyCallActionInteractorResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vacancy_call_action/domain/c$c;", "Lcom/avito/android/vacancy_call_action/domain/c;", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.vacancy_call_action.domain.c$c, reason: collision with other inner class name */
    public static final /* data */ class C9895c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f319226a;

        public C9895c(@k DeepLink deepLink) {
            this.f319226a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9895c) && L.f(this.f319226a, ((C9895c) obj).f319226a);
        }

        public final int hashCode() {
            return this.f319226a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f319226a, ')');
        }
    }
}
