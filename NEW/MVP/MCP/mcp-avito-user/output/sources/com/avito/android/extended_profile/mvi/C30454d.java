package com.avito.android.extended_profile.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30454d implements InterfaceC43160i<ExtendedProfileInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f150143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30451a f150144c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f150145d;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile.mvi.d$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f150146b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C30451a f150147c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.a f150148d;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$favoritesFlow$$inlined$map$1$2", f = "ExtendedProfileActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C4396a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f150149q;

            /* renamed from: r, reason: collision with root package name */
            public int f150150r;

            public C4396a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f150149q = obj;
                this.f150150r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C30451a c30451a, Y41.a aVar) {
            this.f150146b = interfaceC43172j;
            this.f150147c = c30451a;
            this.f150148d = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.extended_profile.mvi.C30454d.a.C4396a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.extended_profile.mvi.d$a$a r0 = (com.avito.android.extended_profile.mvi.C30454d.a.C4396a) r0
                int r1 = r0.f150150r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f150150r = r1
                goto L18
            L13:
                com.avito.android.extended_profile.mvi.d$a$a r0 = new com.avito.android.extended_profile.mvi.d$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f150149q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f150150r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L6f
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                com.avito.android.favorite.c r6 = (com.avito.android.favorite.AbstractC30569c) r6
                boolean r7 = r6 instanceof com.avito.android.favorite.AbstractC30569c.a
                Y41.a r2 = r5.f150148d
                com.avito.android.extended_profile.mvi.a r4 = r5.f150147c
                if (r7 == 0) goto L51
                java.lang.Object r7 = r2.invoke()
                com.avito.android.extended_profile.mvi.entity.a r7 = (com.avito.android.extended_profile.mvi.entity.a) r7
                com.avito.android.favorite.c$a r6 = (com.avito.android.favorite.AbstractC30569c.a) r6
                java.lang.String r6 = r6.f155167a
                java.util.List r6 = java.util.Collections.singletonList(r6)
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$NotifyItemsChanged r6 = com.avito.android.extended_profile.mvi.C30451a.c(r4, r7, r6, r3)
                goto L64
            L51:
                boolean r7 = r6 instanceof com.avito.android.favorite.AbstractC30569c.b
                if (r7 == 0) goto L72
                java.lang.Object r7 = r2.invoke()
                com.avito.android.extended_profile.mvi.entity.a r7 = (com.avito.android.extended_profile.mvi.entity.a) r7
                com.avito.android.favorite.c$b r6 = (com.avito.android.favorite.AbstractC30569c.b) r6
                java.util.List<java.lang.String> r6 = r6.f155177a
                r2 = 0
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$NotifyItemsChanged r6 = com.avito.android.extended_profile.mvi.C30451a.c(r4, r7, r6, r2)
            L64:
                r0.f150150r = r3
                kotlinx.coroutines.flow.j r7 = r5.f150146b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L72:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30454d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C30454d(InterfaceC43160i interfaceC43160i, C30451a c30451a, Y41.a aVar) {
        this.f150143b = interfaceC43160i;
        this.f150144c = c30451a;
        this.f150145d = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f150143b.collect(new a(interfaceC43172j, this.f150144c, this.f150145d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
