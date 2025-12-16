package com.avito.android.tariff.cpr.common;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.AbstractC35956u5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: StringExtensions.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/common/f;", "Lcom/avito/android/util/u5;", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f295143b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f295144c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f295145d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public String f295146e;

    /* compiled from: StringExtensions.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpr/common/f$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff/cpr/common/f$a$a;", "Lcom/avito/android/tariff/cpr/common/f$a$b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: StringExtensions.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/common/f$a$a;", "Lcom/avito/android/tariff/cpr/common/f$a;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff.cpr.common.f$a$a, reason: collision with other inner class name */
        public static final class C8969a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C8969a f295147a = new C8969a();

            public C8969a() {
                super(null);
            }
        }

        /* compiled from: StringExtensions.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/common/f$a$b;", "Lcom/avito/android/tariff/cpr/common/f$a;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f295148a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StringExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpr.common.TextWatcherWithDebounce$onTextChanged$1", f = "StringExtensions.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f295149q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f295150r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f295151s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, f fVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f295150r = str;
            this.f295151s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new b(this.f295150r, this.f295151s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f295149q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f295149q = 1;
                if (C43131e0.b(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            f fVar = this.f295151s;
            String str = fVar.f295146e;
            String str2 = this.f295150r;
            if (L.f(str2, str)) {
                fVar.f295145d.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ f(T t12, a aVar, l lVar, int i12, C42822w c42822w) {
        this(t12, (i12 & 2) != 0 ? a.b.f295148a : aVar, lVar);
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        String string;
        a aVar = this.f295144c;
        if (aVar instanceof a.b) {
            string = charSequence.toString();
        } else {
            if (!(aVar instanceof a.C8969a)) {
                throw new NoWhenBranchMatchedException();
            }
            string = C43066x.A0(new C43059p("[^0-9]").f(charSequence, "")).toString();
        }
        if (L.f(string, this.f295146e)) {
            return;
        }
        this.f295146e = string;
        C43259k.d(this.f295143b, null, null, new b(string, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k T t12, @k a aVar, @k l<? super String, G0> lVar) {
        this.f295143b = t12;
        this.f295144c = aVar;
        this.f295145d = lVar;
        this.f295146e = "";
    }
}
