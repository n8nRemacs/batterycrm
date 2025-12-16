package com.avito.android.str_booking.deeplink.create_messenger;

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

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC43160i<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f285408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f285409c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f285410b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f285411c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplinkHandler$doHandleSuspend$$inlined$map$2$2", f = "StrCreateMessengerDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.str_booking.deeplink.create_messenger.b$a$a, reason: collision with other inner class name */
        public static final class C8543a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f285412q;

            /* renamed from: r, reason: collision with root package name */
            public int f285413r;

            public C8543a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f285412q = obj;
                this.f285413r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, f fVar) {
            this.f285410b = interfaceC43172j;
            this.f285411c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r20, @Y61.k kotlin.coroutines.Continuation r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r21
                boolean r2 = r1 instanceof com.avito.android.str_booking.deeplink.create_messenger.b.a.C8543a
                if (r2 == 0) goto L17
                r2 = r1
                com.avito.android.str_booking.deeplink.create_messenger.b$a$a r2 = (com.avito.android.str_booking.deeplink.create_messenger.b.a.C8543a) r2
                int r3 = r2.f285413r
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f285413r = r3
                goto L1c
            L17:
                com.avito.android.str_booking.deeplink.create_messenger.b$a$a r2 = new com.avito.android.str_booking.deeplink.create_messenger.b$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f285412q
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r2.f285413r
                r5 = 1
                if (r4 == 0) goto L36
                if (r4 != r5) goto L2e
                kotlin.C42729a0.b(r1)
                goto Laa
            L2e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L36:
                kotlin.C42729a0.b(r1)
                r1 = r20
                com.avito.android.util.P2 r1 = (com.avito.android.util.P2) r1
                boolean r4 = r1 instanceof com.avito.android.util.P2.c
                r6 = 0
                com.avito.android.str_booking.deeplink.create_messenger.f r7 = r0.f285411c
                if (r4 == 0) goto L4a
                com.avito.android.deeplink_handler.view.a$g r1 = r7.f285425h
                r1.g(r6, r5)
                goto L9d
            L4a:
                boolean r4 = r1 instanceof com.avito.android.util.P2.b
                r8 = 0
                if (r4 == 0) goto L6a
                com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplink$b$b r4 = com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplink.b.C8540b.f285402b
                com.avito.android.deeplink_handler.handler.composite.a r9 = r7.f285428k
                com.avito.android.util.P2$b r1 = (com.avito.android.util.P2.b) r1
                T r1 = r1.f318720a
                Qx0.a r1 = (Qx0.C14948a) r1
                com.avito.android.deep_linking.links.DeepLink r1 = r1.getRedirect()
                com.avito.android.deep_linking.links.DeepLink[] r1 = new com.avito.android.deep_linking.links.DeepLink[]{r1}
                r7.i(r4, r9, r1)
                com.avito.android.deeplink_handler.view.a$g r1 = r7.f285425h
                r1.g(r6, r8)
                goto L9d
            L6a:
                boolean r4 = r1 instanceof com.avito.android.util.P2.a
                if (r4 == 0) goto L9d
                com.avito.android.deeplink_handler.view.a$i r9 = r7.f285426i
                com.avito.android.util.P2$a r1 = (com.avito.android.util.P2.a) r1
                com.avito.android.remote.error.ApiError r1 = r1.f318719a
                java.lang.String r1 = r1.getF244063c()
                com.avito.android.printable_text.PrintableText r10 = com.avito.android.printable_text.b.f(r1)
                com.avito.android.component.toast.f$c$a r1 = com.avito.android.component.toast.f.c.f125255c
                r1.getClass()
                com.avito.android.component.toast.f$c r13 = com.avito.android.component.toast.f.c.a.b()
                com.avito.android.lib.design.toast_bar.ToastBarPosition r15 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181046d
                r16 = 0
                r17 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r18 = 1966(0x7ae, float:2.755E-42)
                com.avito.android.deeplink_handler.view.a.i.C4057a.d(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplink$b$a r1 = com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplink.b.a.f285401b
                r7.j(r1)
                com.avito.android.deeplink_handler.view.a$g r1 = r7.f285425h
                r1.g(r6, r8)
            L9d:
                kotlin.G0 r1 = kotlin.G0.f406611a
                r2.f285413r = r5
                kotlinx.coroutines.flow.j r4 = r0.f285410b
                java.lang.Object r1 = r4.emit(r1, r2)
                if (r1 != r3) goto Laa
                return r3
            Laa:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.deeplink.create_messenger.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(InterfaceC43160i interfaceC43160i, f fVar) {
        this.f285408b = interfaceC43160i;
        this.f285409c = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super G0> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f285408b.collect(new a(interfaceC43172j, this.f285409c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
