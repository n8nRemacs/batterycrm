package com.avito.android.notification.parameters_factory;

import Qf0.C14891a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.notification.PushParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PushParametersFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e;", "", "a", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e {

    /* compiled from: PushParametersFactory.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e$a;", "", "a", "b", "Lcom/avito/android/notification/parameters_factory/e$a$a;", "Lcom/avito/android/notification/parameters_factory/e$a$b;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: PushParametersFactory.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e$a$a;", "Lcom/avito/android/notification/parameters_factory/e$a;", "a", "b", "c", "Lcom/avito/android/notification/parameters_factory/e$a$a$a;", "Lcom/avito/android/notification/parameters_factory/e$a$a$b;", "Lcom/avito/android/notification/parameters_factory/e$a$a$c;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.notification.parameters_factory.e$a$a, reason: collision with other inner class name */
        public interface InterfaceC6185a extends a {

            /* compiled from: PushParametersFactory.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e$a$a$a;", "Lcom/avito/android/notification/parameters_factory/e$a$a;", "<init>", "()V", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.notification.parameters_factory.e$a$a$a, reason: collision with other inner class name */
            public static final class C6186a implements InterfaceC6185a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final C6186a f207464a = new C6186a();
            }

            /* compiled from: PushParametersFactory.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e$a$a$b;", "Lcom/avito/android/notification/parameters_factory/e$a$a;", "<init>", "()V", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.notification.parameters_factory.e$a$a$b */
            public static final class b implements InterfaceC6185a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final b f207465a = new b();
            }

            /* compiled from: PushParametersFactory.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e$a$a$c;", "Lcom/avito/android/notification/parameters_factory/e$a$a;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.notification.parameters_factory.e$a$a$c */
            public static final /* data */ class c implements InterfaceC6185a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f207466a;

                public c(@k String str) {
                    this.f207466a = str;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && L.f(this.f207466a, ((c) obj).f207466a);
                }

                public final int hashCode() {
                    return this.f207466a.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("ParsingError(json="), this.f207466a, ')');
                }
            }
        }

        /* compiled from: PushParametersFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/parameters_factory/e$a$b;", "Lcom/avito/android/notification/parameters_factory/e$a;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PushParameters f207467a;

            public b(@k PushParameters pushParameters) {
                this.f207467a = pushParameters;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f207467a, ((b) obj).f207467a);
            }

            public final int hashCode() {
                return this.f207467a.hashCode();
            }

            @k
            public final String toString() {
                return "Ok(value=" + this.f207467a + ')';
            }
        }
    }

    @k
    a a(@k C14891a c14891a);
}
