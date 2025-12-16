package com.avito.android.virtual_deal_room.deeplink;

import Ju.InterfaceC14249c;
import Y41.p;
import Y41.q;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment;
import com.avito.android.virtual_deal_room.client_edit.model.ClientSaveResult;
import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47919b;

/* compiled from: ClientEditDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/b;", "Lev/a;", "Lcom/avito/android/virtual_deal_room/deeplink/ClientEditDeeplink;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<ClientEditDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.f f326444f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f326445g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C43238h f326446h;

    /* compiled from: ClientEditDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            InterfaceC14249c.b c10089b;
            b bVar = (b) this.receiver;
            bVar.getClass();
            ClientEditDialogFragment.a aVar = ClientEditDialogFragment.f326105o0;
            Bundle bundle = c47919b.f437159b;
            aVar.getClass();
            Parcelable parcelable = bundle.getParcelable("client_edit_result");
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ClientSaveResult clientSaveResult = (ClientSaveResult) parcelable;
            if (clientSaveResult.equals(ClientSaveResult.Dismissed.f326196b)) {
                c10089b = ClientEditDeeplink.b.a.f326427b;
            } else {
                if (!(clientSaveResult instanceof ClientSaveResult.Saved)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClientSaveResult.Saved saved = (ClientSaveResult.Saved) clientSaveResult;
                c10089b = new ClientEditDeeplink.b.C10089b(saved.f326197b, saved.f326198c, saved.f326199d, saved.f326200e, saved.f326201f, saved.f326202g);
            }
            bVar.j(c10089b);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lrv/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplinkHandler$onCreate$2", f = "ClientEditDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room.deeplink.b$b, reason: collision with other inner class name */
    public static final class C10090b extends SuspendLambda implements q<InterfaceC43172j<? super C47919b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f326447q;

        public C10090b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super C47919b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C10090b c10090b = new C10090b(3, continuation);
            c10090b.f326447q = th2;
            return c10090b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f326447q);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k R0 r02) {
        this.f326444f = fVar;
        this.f326445g = dVar;
        this.f326446h = U.a(r02.d().plus(t1.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f326445g.D0("edit_client_dialog", new com.avito.android.virtual_deal_room.deeplink.a((ClientEditDeeplink) deepLink, this));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43152f0(new C43197r1(new a(2, this, b.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f326444f.l1("edit_client_dialog"))), new C10090b(3, null)), this.f326446h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f326446h, null);
    }
}
