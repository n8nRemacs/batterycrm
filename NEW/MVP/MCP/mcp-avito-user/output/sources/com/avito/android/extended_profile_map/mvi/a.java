package com.avito.android.extended_profile_map.mvi;

import AA.b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements InterfaceC43160i<b.d> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f151263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f151264c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_map.mvi.a$a, reason: collision with other inner class name */
    public static final class C4421a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f151265b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f151266c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.extended_profile_map.mvi.ExtendedProfileMapActor$deeplinkHandlerFlow$$inlined$mapNotNull$1$2", f = "ExtendedProfileMapActor.kt", i = {}, l = {234}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_map.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C4422a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f151267q;

            /* renamed from: r, reason: collision with root package name */
            public int f151268r;

            public C4422a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f151267q = obj;
                this.f151268r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C4421a.this.emit(null, this);
            }
        }

        public C4421a(InterfaceC43172j interfaceC43172j, d dVar) {
            this.f151265b = interfaceC43172j;
            this.f151266c = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v3, types: [AA.b$d] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, @Y61.k kotlin.coroutines.Continuation r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.avito.android.extended_profile_map.mvi.a.C4421a.C4422a
                if (r0 == 0) goto L13
                r0 = r11
                com.avito.android.extended_profile_map.mvi.a$a$a r0 = (com.avito.android.extended_profile_map.mvi.a.C4421a.C4422a) r0
                int r1 = r0.f151268r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f151268r = r1
                goto L18
            L13:
                com.avito.android.extended_profile_map.mvi.a$a$a r0 = new com.avito.android.extended_profile_map.mvi.a$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f151267q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f151268r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r11)
                goto L6f
            L29:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L31:
                kotlin.C42729a0.b(r11)
                kv.a r10 = (kv.C43501a) r10
                Ju.c r10 = r10.f413261b
                boolean r11 = r10 instanceof com.avito.android.extended_profile_phone_dialog.deep_linking.d.b.C4431d
                r2 = 0
                if (r11 == 0) goto L62
                AA.b$d r11 = new AA.b$d
                com.avito.android.extended_profile_phone_dialog.deep_linking.d$b$d r10 = (com.avito.android.extended_profile_phone_dialog.deep_linking.d.b.C4431d) r10
                com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink r4 = r10.f151578b
                com.avito.android.extended_profile_phone_dialog.f r10 = r10.f151579c
                java.lang.String r5 = r4.f133319b
                com.avito.android.extended_profile_map.mvi.d r6 = r9.f151266c
                java.lang.String r7 = r6.f151285i
                com.avito.android.account.E r6 = r6.f151279c
                java.lang.String r6 = r6.a()
                com.avito.android.remote.model.ExtendedProfilePhoneDisclaimer r8 = r10.f151600b
                if (r8 == 0) goto L59
                java.lang.Boolean r2 = r8.getIsAnonymous()
            L59:
                FA.a r8 = new FA.a
                r8.<init>(r5, r6, r7, r2)
                r11.<init>(r4, r10, r8)
                r2 = r11
            L62:
                if (r2 == 0) goto L6f
                r0.f151268r = r3
                kotlinx.coroutines.flow.j r10 = r9.f151265b
                java.lang.Object r10 = r10.emit(r2, r0)
                if (r10 != r1) goto L6f
                return r1
            L6f:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_map.mvi.a.C4421a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public a(InterfaceC43160i interfaceC43160i, d dVar) {
        this.f151263b = interfaceC43160i;
        this.f151264c = dVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super b.d> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f151263b).collect(new C4421a(interfaceC43172j, this.f151264c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
