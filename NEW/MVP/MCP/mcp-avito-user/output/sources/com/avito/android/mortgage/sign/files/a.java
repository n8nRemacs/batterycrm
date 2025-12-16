package com.avito.android.mortgage.sign.files;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.sign.mvi.entity.SignInternalAction;
import com.avito.android.util.R0;
import java.io.File;
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
import o10.C44503a;

/* compiled from: SignInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/files/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f203635a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<IZ.a> f203636b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.util.d f203637c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f203638d;

    /* compiled from: SignInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.sign.files.SignInteractor$saveSvgAndSend$1", f = "SignInteractor.kt", i = {1, 3, 3, 4, 5}, l = {42, 46, 54, 59, 60, 61}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "svgFile", "svgFile", "svgFile"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.sign.files.a$a, reason: collision with other inner class name */
    public static final class C6072a extends SuspendLambda implements p<InterfaceC43172j<? super SignInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public File f203639q;

        /* renamed from: r, reason: collision with root package name */
        public int f203640r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f203641s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C44503a f203642t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Float f203643u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Float f203644v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ a f203645w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f203646x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f203647y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f203648z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6072a(C44503a c44503a, Float f12, Float f13, a aVar, String str, String str2, String str3, Continuation<? super C6072a> continuation) {
            super(2, continuation);
            this.f203642t = c44503a;
            this.f203643u = f12;
            this.f203644v = f13;
            this.f203645w = aVar;
            this.f203646x = str;
            this.f203647y = str2;
            this.f203648z = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6072a c6072a = new C6072a(this.f203642t, this.f203643u, this.f203644v, this.f203645w, this.f203646x, this.f203647y, this.f203648z, continuation);
            c6072a.f203641s = obj;
            return c6072a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SignInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6072a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.sign.files.a.C6072a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k c cVar, @k h31.e<IZ.a> eVar, @k com.avito.android.mortgage.util.d dVar, @k R0 r02) {
        this.f203635a = cVar;
        this.f203636b = eVar;
        this.f203637c = dVar;
        this.f203638d = r02;
    }

    @k
    public final InterfaceC43160i<SignInternalAction> a(@k C44503a c44503a, @l Float f12, @l Float f13, @k String str, @k String str2, @k String str3) {
        return C43175k.I(this.f203638d.a(), C43175k.G(new C6072a(c44503a, f12, f13, this, str, str2, str3, null)));
    }
}
