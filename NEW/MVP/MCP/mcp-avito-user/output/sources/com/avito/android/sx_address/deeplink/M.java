package com.avito.android.sx_address.deeplink;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.SxAddressVideoVerificationLink;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
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

/* compiled from: SxAddressVideoVerificationLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/deeplink/M;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/SxAddressVideoVerificationLink;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class M extends com.avito.android.deeplink_handler.handler.base.coroutines.a<SxAddressVideoVerificationLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f292799g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f292800h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50095c f292801i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f292802j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.i f292803k;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f292804b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M f292805c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.sx_address.deeplink.M$a$a, reason: collision with other inner class name */
        public static final class C8883a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f292806b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ M f292807c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressVideoVerificationLinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "SxAddressVideoVerificationLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.sx_address.deeplink.M$a$a$a, reason: collision with other inner class name */
            public static final class C8884a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f292808q;

                /* renamed from: r, reason: collision with root package name */
                public int f292809r;

                public C8884a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f292808q = obj;
                    this.f292809r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8883a.this.emit(null, this);
                }
            }

            public C8883a(InterfaceC43172j interfaceC43172j, M m12) {
                this.f292806b = interfaceC43172j;
                this.f292807c = m12;
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
                    boolean r0 = r6 instanceof com.avito.android.sx_address.deeplink.M.a.C8883a.C8884a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.sx_address.deeplink.M$a$a$a r0 = (com.avito.android.sx_address.deeplink.M.a.C8883a.C8884a) r0
                    int r1 = r0.f292809r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f292809r = r1
                    goto L18
                L13:
                    com.avito.android.sx_address.deeplink.M$a$a$a r0 = new com.avito.android.sx_address.deeplink.M$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f292808q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f292809r
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
                    com.avito.android.sx_address.deeplink.M r2 = r4.f292807c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f292809r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f292806b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.deeplink.M.a.C8883a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, M m12) {
            this.f292804b = interfaceC43160i;
            this.f292805c = m12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f292804b).collect(new C8883a(interfaceC43172j, this.f292805c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SxAddressVideoVerificationLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {
        public b() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            int i12 = ((C47918a) obj).f437156b;
            M m12 = M.this;
            if (i12 == -1) {
                m12.getClass();
                Context context = m12.f292799g;
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23);
                String string = context.getString(R.string.sx_address_video_verification_success_toast_title);
                SpannableString spannableString = new SpannableString(androidx.compose.foundation.H.i('\n', string, context.getString(R.string.sx_address_video_verification_success_toast_message)));
                spannableString.setSpan(new StyleSpan(com.avito.android.lib.util.f.r(dVar, "h40")), 0, string.length(), 33);
                spannableString.setSpan(new AbsoluteSizeSpan(y6.b(18)), 0, string.length(), 33);
                a.i.C4057a.d(m12.f292803k, com.avito.android.printable_text.b.e(spannableString), null, null, null, 0, null, null, null, 2046);
                m12.j(SxAddressVideoVerificationLink.c.b.f67569b);
            } else {
                m12.j(SxAddressVideoVerificationLink.c.a.f67568b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public M(@Y61.k Context context, @Y61.k a.b bVar, @Y61.k InterfaceC50095c interfaceC50095c, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.i iVar, @Y61.k R0 r02) {
        super(r02);
        this.f292799g = context;
        this.f292800h = bVar;
        this.f292801i = interfaceC50095c;
        this.f292802j = interfaceC4053a;
        this.f292803k = iVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        SxAddressVideoVerificationLink.Arguments arguments;
        SxAddressVideoVerificationLink sxAddressVideoVerificationLink = (SxAddressVideoVerificationLink) deepLink;
        if (bundle != null) {
            SxAddressVideoVerificationLink.f67564c.getClass();
            arguments = (SxAddressVideoVerificationLink.Arguments) bundle.getParcelable("sx_address_video_verification_arguments_key");
        } else {
            arguments = null;
        }
        this.f292802j.J(this.f292801i.a(this.f292799g, sxAddressVideoVerificationLink.f67565b, arguments != null ? arguments.f67566b : null, arguments != null ? arguments.f67567c : null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    public final Object n(@Y61.k Continuation<? super G0> continuation) {
        Object objCollect = new a(C40483b.a(this.f292800h), this).collect(new b(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
