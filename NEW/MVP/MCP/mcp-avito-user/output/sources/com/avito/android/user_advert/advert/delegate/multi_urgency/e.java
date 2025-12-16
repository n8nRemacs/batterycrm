package com.avito.android.user_advert.advert.delegate.multi_urgency;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.error.ApiError;
import fH0.InterfaceC40292b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiUrgencyPresenterDelegateAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e;", "LfH0/b;", "a", "b", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e$a;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e extends InterfaceC40292b {

    /* compiled from: MultiUrgencyPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e$a;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.user_advert.advert.items.multi_urgency.c f308685a;

        public a(@k com.avito.android.user_advert.advert.items.multi_urgency.c cVar) {
            this.f308685a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f308685a, ((a) obj).f308685a);
        }

        public final int hashCode() {
            return this.f308685a.hashCode();
        }

        @k
        public final String toString() {
            return "MultiUrgencyBlockItemChanged(item=" + this.f308685a + ')';
        }
    }

    /* compiled from: MultiUrgencyPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e$b;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f308686a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f308687b;

        public b(@k ApiError apiError, @k String str) {
            this.f308686a = apiError;
            this.f308687b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f308686a, bVar.f308686a) && L.f(this.f308687b, bVar.f308687b);
        }

        public final int hashCode() {
            return this.f308687b.hashCode() + (this.f308686a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiUrgencyError(apiError=");
            sb2.append(this.f308686a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f308687b, ')');
        }
    }
}
