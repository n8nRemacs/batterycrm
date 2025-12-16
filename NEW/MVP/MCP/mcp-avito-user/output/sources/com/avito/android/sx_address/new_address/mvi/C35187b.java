package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddAddressSource;
import com.avito.android.sx_address.SxAddressControl;
import com.avito.android.sx_address.new_address.mvi.B;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxNewAddressBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/b;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.new_address.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35187b implements com.avito.android.arch.mvi.b<B> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.domain.a f293755a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SxAddressControl f293756b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.new_address.analytics.c f293757c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.features.a f293758d;

    /* compiled from: SxNewAddressBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressBootstrap$produce$1", f = "SxNewAddressBootstrap.kt", i = {0, 2, 4, 5, 5, 7, 7}, l = {31, 35, 37, 43, 53, 56, 58, 60, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "initialAddress", "$this$flow", "initialAddress"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.avito.android.sx_address.new_address.mvi.b$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super B>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f293759q;

        /* renamed from: r, reason: collision with root package name */
        public int f293760r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f293761s;

        /* compiled from: SxNewAddressBootstrap.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.sx_address.new_address.mvi.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C8924a {
            static {
                int[] iArr = new int[SxAddAddressSource.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    SxAddAddressSource sxAddAddressSource = SxAddAddressSource.f67543b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C35187b.this.new a(continuation);
            aVar.f293761s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x020f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.new_address.mvi.C35187b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SxNewAddressBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressBootstrap$produce$2", f = "SxNewAddressBootstrap.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.sx_address.new_address.mvi.b$b, reason: collision with other inner class name */
    public static final class C8925b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super B>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f293763q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f293764r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f293765s;

        public C8925b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C8925b c8925b = new C8925b(3, continuation);
            c8925b.f293764r = interfaceC43172j;
            c8925b.f293765s = th2;
            return c8925b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f293763q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f293764r;
                B.l lVar = new B.l(this.f293765s);
                this.f293764r = null;
                this.f293763q = 1;
                if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C35187b(@Y61.k com.avito.android.sx_address.new_address.domain.a aVar, @Y61.k SxAddressControl sxAddressControl, @Y61.k com.avito.android.sx_address.new_address.analytics.c cVar, @Y61.k com.avito.android.sx_address.features.a aVar2) {
        this.f293755a = aVar;
        this.f293756b = sxAddressControl;
        this.f293757c = cVar;
        this.f293758d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<B> a() {
        return new C43152f0(C43175k.n(C43175k.G(new a(null)), 300L), new C8925b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
