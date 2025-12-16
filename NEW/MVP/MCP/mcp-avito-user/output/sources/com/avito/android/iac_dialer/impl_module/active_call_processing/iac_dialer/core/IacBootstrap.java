package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.d2;

/* compiled from: IacBootstrap.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0003\u0010\u0011\u0012J5\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/b;", "LdL/d;", "Lkotlinx/coroutines/flow/d2;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "eventsFlow", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "initialState", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "actionCollector", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "waiter", "Lkotlin/G0;", "process", "(Lkotlinx/coroutines/flow/d2;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;)V", "Companion", "a", "b", "d", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacBootstrap extends b, dL.d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = Companion.f164973a;

    /* compiled from: IacBootstrap.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f164971a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p<IacAction, String, G0> f164972b;

        public a(@k p pVar, @k String str) {
            this.f164971a = str;
            this.f164972b = pVar;
        }

        public final void a(@k IacAction iacAction) {
            this.f164972b.invoke(iacAction, this.f164971a);
        }
    }

    /* compiled from: IacBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$b;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f164973a = new Companion();
    }

    /* compiled from: IacBootstrap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: IacBootstrap.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacBootstrap$d;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l<String, G0> f164974a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AtomicBoolean f164975b = new AtomicBoolean(false);

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k l<? super String, G0> lVar) {
            this.f164974a = lVar;
        }

        public final void a(@k String str) throws InterruptedException {
            AtomicBoolean atomicBoolean;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j12 = 2;
            while (true) {
                atomicBoolean = this.f164975b;
                if (atomicBoolean.get() || j12 <= 0) {
                    break;
                }
                Thread.sleep(j12);
                j12 *= 2;
            }
            this.f164974a.invoke("subscribed to " + str + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " millis");
            atomicBoolean.set(false);
        }
    }

    @k
    /* synthetic */ String getName();

    void process(@k d2<? extends IacEvent> eventsFlow, @k IacState initialState, @k a actionCollector, @k d waiter);
}
