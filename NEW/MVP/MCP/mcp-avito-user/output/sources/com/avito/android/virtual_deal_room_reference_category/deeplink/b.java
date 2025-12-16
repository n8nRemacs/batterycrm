package com.avito.android.virtual_deal_room_reference_category.deeplink;

import Ju.InterfaceC14249c;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.virtual_deal_room.base.VDRClientAddFromPage;
import com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddSaveResult;
import ev.AbstractC40161a;
import fv.C40483b;
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
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import rv.C47919b;
import zN0.f;

/* compiled from: ClientAddDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/deeplink/b;", "Lev/a;", "Lcom/avito/android/virtual_deal_room_reference_category/deeplink/ClientAddDeeplink;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<ClientAddDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f327208f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f327209g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f327210h;

    /* compiled from: ClientAddDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            InterfaceC14249c.b bVar;
            b bVar2 = (b) this.receiver;
            bVar2.getClass();
            ClientAddDialogFragment.a aVar = ClientAddDialogFragment.f327120n0;
            Bundle bundle = c47919b.f437159b;
            aVar.getClass();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("client_add_result", ClientAddSaveResult.class) : bundle.getParcelable("client_add_result");
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ClientAddSaveResult clientAddSaveResult = (ClientAddSaveResult) parcelable;
            if (clientAddSaveResult.equals(ClientAddSaveResult.Dismissed.f327184b)) {
                bVar = f.a.f444034b;
            } else {
                if (!(clientAddSaveResult instanceof ClientAddSaveResult.Saved)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClientAddSaveResult.Saved saved = (ClientAddSaveResult.Saved) clientAddSaveResult;
                bVar = new f.b(saved.f327185b, saved.f327186c, VDRClientAddFromPage.f326101d);
            }
            bVar2.j(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lrv/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.deeplink.ClientAddDeeplinkHandler$onCreate$2", f = "ClientAddDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room_reference_category.deeplink.b$b, reason: collision with other inner class name */
    public static final class C10143b extends SuspendLambda implements q<InterfaceC43172j<? super C47919b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f327211q;

        public C10143b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super C47919b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C10143b c10143b = new C10143b(3, continuation);
            c10143b.f327211q = th2;
            return c10143b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f327211q);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f327208f = fVar;
        this.f327209g = dVar;
        this.f327210h = U.a(r02.d().plus(t1.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f327209g.D0("add_client_dialog", new com.avito.android.virtual_deal_room_reference_category.deeplink.a((ClientAddDeeplink) deepLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43152f0(new C43197r1(new a(2, this, b.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), C40483b.b(this.f327208f, "add_client_dialog")), new C10143b(3, null)), this.f327210h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f327210h, null);
    }
}
