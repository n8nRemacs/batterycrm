package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageApplicationInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/A;", "Lcom/avito/android/mortgage/root/mvi/domain/z;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f202961a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f202962b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.util.d f202963c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f202964d;

    /* compiled from: MortgageApplicationInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.MortgageApplicationInteractorImpl$applicationProcess$1", f = "MortgageApplicationInteractor.kt", i = {0, 1, 2, 3, 4, 4, 4, 5, 6}, l = {70, 73, 74, 79, 118, 82, 129, 85, 86}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "this_$iv", "applicationId$iv", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public A f202965q;

        /* renamed from: r, reason: collision with root package name */
        public String f202966r;

        /* renamed from: s, reason: collision with root package name */
        public ApplicationProcessType f202967s;

        /* renamed from: t, reason: collision with root package name */
        public int f202968t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f202969u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ApplicationProcessType f202970v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f202971w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ A f202972x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f202973y;

        /* compiled from: MortgageApplicationInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.root.mvi.domain.A$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6043a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f202974a;

            static {
                int[] iArr = new int[ApplicationProcessType.values().length];
                try {
                    iArr[ApplicationProcessType.NEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApplicationProcessType.PREVIOUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApplicationProcessType.SAVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApplicationProcessType.CONFIRM_REALTY_OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f202974a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ApplicationProcessType applicationProcessType, boolean z12, A a12, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f202970v = applicationProcessType;
            this.f202971w = z12;
            this.f202972x = a12;
            this.f202973y = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f202970v, this.f202971w, this.f202972x, this.f202973y, continuation);
            aVar.f202969u = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 614
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.A.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public A(@Y61.k h31.e<IZ.a> eVar, @Y61.k h31.e<InterfaceC41203a> eVar2, @Y61.k com.avito.android.mortgage.util.d dVar, @Y61.k R0 r02) {
        this.f202961a = eVar;
        this.f202962b = eVar2;
        this.f202963c = dVar;
        this.f202964d = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.mortgage.root.mvi.domain.z
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r9, @Y61.k Y41.l r10, @Y61.k Y41.p r11, @Y61.k Y41.p r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.domain.A.a(java.lang.String, Y41.l, Y41.p, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.z
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> b(@Y61.k String str, @Y61.k ApplicationProcessType applicationProcessType, boolean z12) {
        return C43175k.I(this.f202964d.a(), C43175k.G(new a(applicationProcessType, z12, this, str, null)));
    }

    public final IZ.a c() {
        return this.f202961a.get();
    }
}
