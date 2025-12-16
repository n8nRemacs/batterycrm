package com.avito.android.authorization.auto_recovery.phone_confirm;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements InterfaceC43160i<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f93246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmptyDeepLink f93247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f93248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f93249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f93250f;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f93251b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EmptyDeepLink f93252c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f93253d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f93254e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f93255f;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.phone_confirm.AutoRecoveryDialogBuilderImpl$createPhoneIsBoundDialog$2$invoke$$inlined$map$1$2", f = "AutoRecoveryDialogBuilder.kt", i = {}, l = {221, 219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.auto_recovery.phone_confirm.m$a$a, reason: collision with other inner class name */
        public static final class C2758a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f93256q;

            /* renamed from: r, reason: collision with root package name */
            public int f93257r;

            /* renamed from: s, reason: collision with root package name */
            public InterfaceC43172j f93258s;

            public C2758a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f93256q = obj;
                this.f93257r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, EmptyDeepLink emptyDeepLink, l lVar, String str, long j12) {
            this.f93251b = interfaceC43172j;
            this.f93252c = emptyDeepLink;
            this.f93253d = lVar;
            this.f93254e = str;
            this.f93255f = j12;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.avito.android.authorization.auto_recovery.phone_confirm.m.a.C2758a
                if (r0 == 0) goto L13
                r0 = r15
                com.avito.android.authorization.auto_recovery.phone_confirm.m$a$a r0 = (com.avito.android.authorization.auto_recovery.phone_confirm.m.a.C2758a) r0
                int r1 = r0.f93257r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f93257r = r1
                goto L18
            L13:
                com.avito.android.authorization.auto_recovery.phone_confirm.m$a$a r0 = new com.avito.android.authorization.auto_recovery.phone_confirm.m$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f93256q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f93257r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r15)
                goto L79
            L2c:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L34:
                kotlinx.coroutines.flow.j r14 = r0.f93258s
                kotlin.C42729a0.b(r15)
                goto L6c
            L3a:
                kotlin.C42729a0.b(r15)
                com.avito.android.deep_linking.links.DeepLink r14 = (com.avito.android.deep_linking.links.DeepLink) r14
                com.avito.android.deep_linking.links.EmptyDeepLink r15 = r13.f93252c
                boolean r14 = kotlin.jvm.internal.L.f(r14, r15)
                kotlinx.coroutines.flow.j r15 = r13.f93251b
                if (r14 == 0) goto L6d
                com.avito.android.authorization.auto_recovery.phone_confirm.l r14 = r13.f93253d
                kotlinx.coroutines.flow.Y1<To.d> r14 = r14.f93240d
                To.d$a r2 = new To.d$a
                r5 = 5
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                long r7 = r13.f93255f
                r10 = 0
                java.lang.String r6 = r13.f93254e
                r11 = 8
                r12 = 0
                r5 = r2
                r5.<init>(r6, r7, r9, r10, r11, r12)
                r0.f93258s = r15
                r0.f93257r = r4
                java.lang.Object r14 = r14.emit(r2, r0)
                if (r14 != r1) goto L6b
                return r1
            L6b:
                r14 = r15
            L6c:
                r15 = r14
            L6d:
                r14 = 0
                r0.f93258s = r14
                r0.f93257r = r3
                java.lang.Object r14 = r15.emit(r14, r0)
                if (r14 != r1) goto L79
                return r1
            L79:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.auto_recovery.phone_confirm.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public m(InterfaceC43160i interfaceC43160i, EmptyDeepLink emptyDeepLink, l lVar, String str, long j12) {
        this.f93246b = interfaceC43160i;
        this.f93247c = emptyDeepLink;
        this.f93248d = lVar;
        this.f93249e = str;
        this.f93250f = j12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Void> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f93246b.collect(new a(interfaceC43172j, this.f93247c, this.f93248d, this.f93249e, this.f93250f), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
