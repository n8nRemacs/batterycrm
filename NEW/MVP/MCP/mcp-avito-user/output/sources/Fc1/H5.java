package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class H5 {

    @DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.privacy.compose.components.FeedbackPrivacyCheckComponentKt$FeedbackPrivacyCheckComponent$1$1", f = "FeedbackPrivacyCheckComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ B f5000q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, kotlin.G0> f5001r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5002s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(B b12, Y41.l<? super Boolean, kotlin.G0> lVar, InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5000q = b12;
            this.f5001r = lVar;
            this.f5002s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f5000q, this.f5001r, this.f5002s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (this.f5000q.f4816c == xyz.n.a.c4.f442724b) {
                this.f5001r.invoke(this.f5002s.getF42167b());
            }
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f5003l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, kotlin.G0> f5004m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f5003l = interfaceC22204y1;
            this.f5004m = lVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f5003l;
            interfaceC22204y1.setValue(Boolean.valueOf(!interfaceC22204y1.getF42167b().booleanValue()));
            this.f5004m.invoke(interfaceC22204y1.getF42167b());
            return kotlin.G0.f406611a;
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, kotlin.G0> f5005l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5006m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Y41.l lVar) {
            super(2);
            this.f5005l = lVar;
            this.f5006m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5006m | 1);
            H5.a(this.f5005l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @kotlin.jvm.internal.s0
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l f5007l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(1);
            this.f5007l = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            this.f5007l.invoke(bool);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super java.lang.Boolean, kotlin.G0> r20, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.H5.a(Y41.l, androidx.compose.runtime.A, int):void");
    }
}
