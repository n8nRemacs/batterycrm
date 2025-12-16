package com.avito.android.sx_address.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.SelectAddressListLink;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import fv.C40483b;
import javax.inject.Inject;
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
import rv.C47918a;
import sv.C48421d;
import yA0.InterfaceC50095c;

/* compiled from: SelectAddressListDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/j;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/SelectAddressListLink;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.deeplink.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35170j extends com.avito.android.deeplink_handler.handler.base.coroutines.a<SelectAddressListLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f292827g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f292828h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f292829i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50095c f292830j;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.deeplink.j$a */
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f292831b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C35170j f292832c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.sx_address.deeplink.j$a$a, reason: collision with other inner class name */
        public static final class C8885a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f292833b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C35170j f292834c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SelectAddressListDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "SelectAddressListDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.deeplink.j$a$a$a, reason: collision with other inner class name */
            public static final class C8886a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f292835q;

                /* renamed from: r, reason: collision with root package name */
                public int f292836r;

                public C8886a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f292835q = obj;
                    this.f292836r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8885a.this.emit(null, this);
                }
            }

            public C8885a(InterfaceC43172j interfaceC43172j, C35170j c35170j) {
                this.f292833b = interfaceC43172j;
                this.f292834c = c35170j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.sx_address.deeplink.C35170j.a.C8885a.C8886a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.sx_address.deeplink.j$a$a$a r0 = (com.avito.android.sx_address.deeplink.C35170j.a.C8885a.C8886a) r0
                    int r1 = r0.f292836r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f292836r = r1
                    goto L18
                L13:
                    com.avito.android.sx_address.deeplink.j$a$a$a r0 = new com.avito.android.sx_address.deeplink.j$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f292835q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f292836r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.sx_address.deeplink.j r2 = r4.f292834c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f292836r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f292833b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.deeplink.C35170j.a.C8885a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, C35170j c35170j) {
            this.f292831b = interfaceC43160i;
            this.f292832c = c35170j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f292831b).collect(new C8885a(interfaceC43172j, this.f292832c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SelectAddressListDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.sx_address.deeplink.j$b */
    public static final class b<T> implements InterfaceC43172j {
        public b() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437156b == -1) {
                InterfaceC50095c.f442964a.getClass();
                Intent intent = c47918a.f437157c;
                SelectAddressListLink.SelectAddressListResult selectAddressListResult = intent != null ? (SelectAddressListLink.SelectAddressListResult) intent.getParcelableExtra("result.select_address_list") : null;
                if (selectAddressListResult != null) {
                    C35170j.this.j(selectAddressListResult);
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C35170j(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k R0 r02, @Y61.k InterfaceC50095c interfaceC50095c) {
        super(r02);
        this.f292827g = context;
        this.f292828h = bVar;
        this.f292829i = interfaceC4053a;
        this.f292830j = interfaceC50095c;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f292829i.J(this.f292830j.d(this.f292827g, ((SelectAddressListLink) deepLink).f67539b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    public final Object n(@Y61.k Continuation<? super G0> continuation) {
        Object objCollect = new a(C40483b.a(this.f292828h), this).collect(new b(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
