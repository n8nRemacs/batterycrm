package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.loyalty.ui.badge_details_v3.f;
import com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BadgeDetailsV3Bootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.arch.mvi.b<BadgeDetailsV3InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.badge_details_v3.e f183322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f183323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f183324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f183325d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f183326e;

    /* compiled from: BadgeDetailsV3Bootstrap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/d$a;", "", "<init>", "()V", "", "BADGE_ID_KEY", "Ljava/lang/String;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BadgeDetailsV3Bootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.loyalty.ui.badge_details_v3.mvi.BadgeDetailsV3Bootstrap$produce$1", f = "BadgeDetailsV3Bootstrap.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super BadgeDetailsV3InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f183327q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f183328r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = d.this.new b(continuation);
            bVar.f183328r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BadgeDetailsV3InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f183327q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f183328r;
                d dVar = d.this;
                InterfaceC28373a interfaceC28373a = dVar.f183326e;
                com.avito.android.loyalty.ui.badge_details_v3.f.f183290b.getClass();
                String str = dVar.f183323b;
                String str2 = (String) f.a.a(str).get("badgeId");
                interfaceC28373a.c(new com.avito.android.loyalty.ui.badge_details_v3.i(dVar.f183324c, str2 != null ? C43066x.y0(str2) : null));
                this.f183328r = interfaceC43172j;
                this.f183327q = 1;
                obj = dVar.f183322a.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f183328r;
                C42729a0.b(obj);
            }
            this.f183328r = null;
            this.f183327q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k com.avito.android.loyalty.ui.badge_details_v3.e eVar, @com.avito.android.loyalty.di.badge_details_v3.f @Y61.k String str, @com.avito.android.loyalty.di.badge_details_v3.g @Y61.l String str2, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f183322a = eVar;
        this.f183323b = str;
        this.f183324c = str2;
        this.f183325d = r02;
        this.f183326e = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BadgeDetailsV3InternalAction> a() {
        return C43175k.I(this.f183325d.a(), C43175k.G(new b(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
