package com.avito.android.universal_transaction.mvi;

import CG0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TransactionActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LCG0/a;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "LCG0/c;", "a", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<CG0.a, TransactionInternalAction, CG0.c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C9413a f306379c = new C9413a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final long f306380d = kotlin.time.g.g(2, DurationUnit.f410634f);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_transaction.mvi.domain.a f306381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f306382b;

    /* compiled from: TransactionActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/a$a;", "", "<init>", "()V", "", "RETRY_ATTEMPTS_COUNT", "I", "", "TAG", "Ljava/lang/String;", "TRX_CHANGE_SUFFIX", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_transaction.mvi.a$a, reason: collision with other inner class name */
    public static final class C9413a {
        public /* synthetic */ C9413a(C42822w c42822w) {
            this();
        }

        public C9413a() {
        }
    }

    /* compiled from: TransactionActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f306383a;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f306383a = iArr;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.universal_transaction.mvi.domain.a aVar, @Y61.k com.avito.android.clientEventBus.a aVar2) {
        this.f306381a = aVar;
        this.f306382b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new i(aVar, this, null), c43197r1), C43175k.Y(C43175k.r(new h(c43197r1, aVar)), new g(aVar, this, null)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TransactionInternalAction> b(@Y61.k CG0.a aVar, @Y61.k CG0.c cVar) {
        if (aVar instanceof a.e) {
            return new C43210w(new TransactionInternalAction.HandleBeduinState(((a.e) aVar).f2059a));
        }
        if (aVar instanceof a.C0098a) {
            return new C43210w(new TransactionInternalAction.HandleBeduinEvent(((a.C0098a) aVar).f2057a));
        }
        if (aVar instanceof a.f) {
            return new C43210w(new TransactionInternalAction.UpdateTransactionParams(((a.f) aVar).f2060a));
        }
        if (aVar instanceof a.d) {
            return this.f306381a.a(cVar.f2067d);
        }
        throw new NoWhenBranchMatchedException();
    }
}
