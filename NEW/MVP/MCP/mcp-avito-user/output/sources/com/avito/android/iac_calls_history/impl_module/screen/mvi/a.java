package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import androidx.compose.runtime.internal.P;
import cK.InterfaceC27058a;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CallsHistoryScreenActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a, CallsHistoryScreenInternalAction, CallsHistoryScreenState> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final AtomicLong f164787d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_calls_history.impl_module.interactor.a f164788a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27058a f164789b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_calls_history.impl_module.screen.l f164790c;

    /* compiled from: CallsHistoryScreenActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/a$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicLong;", "itemsLoadingIdCounter", "Ljava/util/concurrent/atomic/AtomicLong;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_calls_history.impl_module.screen.mvi.a$a, reason: collision with other inner class name */
    public static final class C4822a {
        public /* synthetic */ C4822a(C42822w c42822w) {
            this();
        }

        public C4822a() {
        }
    }

    static {
        new C4822a(null);
        f164787d = new AtomicLong();
    }

    @Inject
    public a(@Y61.k com.avito.android.iac_calls_history.impl_module.interactor.a aVar, @Y61.k InterfaceC27058a interfaceC27058a, @Y61.k com.avito.android.iac_calls_history.impl_module.screen.l lVar) {
        this.f164788a = aVar;
        this.f164789b = interfaceC27058a;
        this.f164790c = lVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.B(new c(this, aVar, null), c43197r1);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CallsHistoryScreenInternalAction> b(com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a aVar, CallsHistoryScreenState callsHistoryScreenState) {
        return C43175k.G(new d(aVar, this, callsHistoryScreenState, null));
    }
}
