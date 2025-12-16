package com.avito.android.mortgage_category.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: LoadScreenUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/domain/a;", "", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<K10.a> f204927a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_category.mvi.domain.mapper.a f204928b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f204929c;

    /* compiled from: LoadScreenUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_category.mvi.domain.LoadScreenUseCase$invoke$1", f = "LoadScreenUseCase.kt", i = {0, 1}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31, 34}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage_category.mvi.domain.a$a, reason: collision with other inner class name */
    public static final class C6109a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f204930q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f204931r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f204933t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f204934u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6109a(String str, String str2, Continuation<? super C6109a> continuation) {
            super(2, continuation);
            this.f204933t = str;
            this.f204934u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6109a c6109a = a.this.new C6109a(this.f204933t, this.f204934u, continuation);
            c6109a.f204931r = obj;
            return c6109a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6109a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_category.mvi.domain.a.C6109a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k h31.e<K10.a> eVar, @k com.avito.android.mortgage_category.mvi.domain.mapper.a aVar, @k R0 r02) {
        this.f204927a = eVar;
        this.f204928b = aVar;
        this.f204929c = r02;
    }

    @k
    public final InterfaceC43160i<MortgageCategoryInternalAction> a(@k String str, @k String str2) {
        return C43175k.I(this.f204929c.a(), C43175k.G(new C6109a(str, str2, null)));
    }
}
