package com.avito.android.vas_union.deeplink;

import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.vas_union.deeplink.VasUnionContextLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: VasUnionContextDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_union.deeplink.VasUnionContextDeeplinkHandler$doHandle$1", f = "VasUnionContextDeeplinkHandler.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f323130q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f323131r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.vas_union.deeplink.b f323132s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ VasUnionContextLink f323133t;

    /* compiled from: VasUnionContextDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.vas_union.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9987a extends H implements l<DeepLinkResponse, G0> {
        @Override // Y41.l
        public final G0 invoke(DeepLinkResponse deepLinkResponse) {
            com.avito.android.vas_union.deeplink.b bVar = (com.avito.android.vas_union.deeplink.b) this.receiver;
            bVar.f323135g.g(bVar.d(), false);
            bVar.i(VasUnionContextLink.b.C9986b.f323123b, bVar.f323137i, deepLinkResponse.getDeepLink());
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionContextDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.vas_union.deeplink.b bVar = (com.avito.android.vas_union.deeplink.b) this.receiver;
            bVar.f323135g.g(bVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(bVar.f323136h, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            bVar.j(VasUnionContextLink.b.a.f323122b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, com.avito.android.vas_union.deeplink.b bVar, VasUnionContextLink vasUnionContextLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f323131r = bundle;
        this.f323132s = bVar;
        this.f323133t = vasUnionContextLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f323131r, this.f323132s, this.f323133t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Integer numBoxInt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f323130q;
        com.avito.android.vas_union.deeplink.b bVar = this.f323132s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f323131r;
            String string = bundle != null ? bundle.getString("vas_union_key_bundle_id") : null;
            if (bundle != null) {
                numBoxInt = bundle.containsKey("vas_union_key_slug") ? Boxing.boxInt(bundle.getInt("vas_union_key_slug")) : null;
            } else {
                numBoxInt = null;
            }
            bVar.f323135g.g(bVar.d(), true);
            VasUnionContextLink vasUnionContextLink = this.f323133t;
            String str = vasUnionContextLink.f323120b;
            this.f323130q = 1;
            obj = bVar.f323134f.b(str, vasUnionContextLink.f323121c, string, numBoxInt, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new C9987a(1, bVar, com.avito.android.vas_union.deeplink.b.class, "onSuccess", "onSuccess(Lcom/avito/android/remote/model/DeepLinkResponse;)V", 0), new b(1, bVar, com.avito.android.vas_union.deeplink.b.class, "onError", "onError(Ljava/lang/String;)V", 0), null, 60);
        return G0.f406611a;
    }
}
