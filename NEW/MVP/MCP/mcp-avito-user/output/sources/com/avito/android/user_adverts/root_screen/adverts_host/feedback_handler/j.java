package com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedbackResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "", "a", "b", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface j {

    /* compiled from: FeedbackResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f312676a;

        public a(@k String str) {
            this.f312676a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f312676a, ((a) obj).f312676a);
        }

        public final int hashCode() {
            return this.f312676a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnFailed(eventName="), this.f312676a, ')');
        }
    }

    /* compiled from: FeedbackResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f312677a;

        public b(@k String str) {
            this.f312677a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f312677a, ((b) obj).f312677a);
        }

        public final int hashCode() {
            return this.f312677a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnStart(eventName="), this.f312677a, ')');
        }
    }
}
