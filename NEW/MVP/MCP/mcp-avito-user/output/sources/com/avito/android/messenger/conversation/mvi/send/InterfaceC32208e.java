package com.avito.android.messenger.conversation.mvi.send;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnboardingsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/e;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/send/e$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32208e extends S20.a<a> {

    /* compiled from: OnboardingsInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/e$a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.e$a */
    public static final /* data */ class a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C5752a f194494b = new C5752a(null);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f194495c = new a(kotlin.collections.P0.c());

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<Onboarding, OnboardingState> f194496a;

        /* compiled from: OnboardingsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/e$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.send.e$a$a, reason: collision with other inner class name */
        public static final class C5752a {
            public /* synthetic */ C5752a(C42822w c42822w) {
                this();
            }

            public C5752a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Map<Onboarding, ? extends OnboardingState> map) {
            this.f194496a = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f194496a, ((a) obj).f194496a);
        }

        public final int hashCode() {
            return this.f194496a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.w(new StringBuilder("State(onboardingStates="), this.f194496a, ')');
        }
    }

    void D4(@Y61.k Onboarding onboarding);
}
