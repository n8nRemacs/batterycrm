package com.avito.android.profile_settings_basic;

import Qb0.InterfaceC14879b;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.A1;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
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

/* compiled from: BasicProfileSettingsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/t;", "Lcom/avito/android/profile_settings_basic/s;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f228919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A1 f228920b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f228921c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f228922d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f228923e;

    /* compiled from: BasicProfileSettingsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsInteractorImpl$loadBasicSettingsWithVerificationData$1", f = "BasicProfileSettingsInteractor.kt", i = {0, 1, 2, 2}, l = {46, 47, 57, 59}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14879b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC14879b f228924q;

        /* renamed from: r, reason: collision with root package name */
        public int f228925r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f228926s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f228927t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ t f228928u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, t tVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f228927t = z12;
            this.f228928u = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f228927t, this.f228928u, continuation);
            aVar.f228926s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_basic.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BasicProfileSettingsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.BasicProfileSettingsInteractorImpl$loadVerificationData$1", f = "BasicProfileSettingsInteractor.kt", i = {0}, l = {64, 66, 65}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14879b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228929q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f228930r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = t.this.new b(continuation);
            bVar.f228930r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_basic.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public t(@Y61.k h31.e<D0> eVar, @Y61.k A1 a12, @Y61.k H h12, @Y61.k R0 r02, @Y61.l @com.avito.android.profile_settings_basic.di.g String str) {
        this.f228919a = eVar;
        this.f228920b = a12;
        this.f228921c = h12;
        this.f228922d = r02;
        this.f228923e = str;
    }

    @Override // com.avito.android.profile_settings_basic.s
    @Y61.k
    public final InterfaceC43160i<InterfaceC14879b> a() {
        return C43175k.I(this.f228922d.a(), C43175k.G(new b(null)));
    }

    @Override // com.avito.android.profile_settings_basic.s
    @Y61.k
    public final InterfaceC43160i<InterfaceC14879b> b(boolean z12) {
        return C43175k.I(this.f228922d.a(), C43175k.G(new a(z12, this, null)));
    }
}
