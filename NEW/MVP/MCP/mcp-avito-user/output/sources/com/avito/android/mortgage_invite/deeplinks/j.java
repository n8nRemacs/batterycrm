package com.avito.android.mortgage_invite.deeplinks;

import Ju.InterfaceC14249c;
import Y41.p;
import Y41.q;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationLeadLink;
import com.avito.android.mortgage_invite.model.ApplicationCreateResult;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.virtual_deal_room.base.VDRClientAddFromPage;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
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
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import l20.InterfaceC43530a;
import q20.InterfaceC47187a;
import zN0.f;

/* compiled from: MortgageApplicationLeadDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/deeplinks/j;", "Lev/a;", "Lcom/avito/android/mortgage_invite/deeplink/MortgageApplicationLeadLink;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends AbstractC40161a<MortgageApplicationLeadLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f205826f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43530a f205827g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47187a f205828h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f205829i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f205830j;

    /* compiled from: MortgageApplicationLeadDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<ApplicationCreateResult, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(ApplicationCreateResult applicationCreateResult, Continuation<? super G0> continuation) {
            InterfaceC14249c.b bVar;
            ApplicationCreateResult applicationCreateResult2 = applicationCreateResult;
            j jVar = (j) this.receiver;
            jVar.getClass();
            if (applicationCreateResult2 instanceof ApplicationCreateResult.Dismissed) {
                bVar = f.a.f444034b;
            } else {
                if (!(applicationCreateResult2 instanceof ApplicationCreateResult.ApplicationCreated)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((ApplicationCreateResult.ApplicationCreated) applicationCreateResult2).f205963b;
                Parcelable.Creator<Category> creator = Category.CREATOR;
                bVar = new f.b(str, "mortgage", VDRClientAddFromPage.f326100c);
            }
            jVar.j(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageApplicationLeadDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/model/ApplicationCreateResult;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.deeplinks.MortgageApplicationLeadDeeplinkHandler$onCreate$2", f = "MortgageApplicationLeadDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super ApplicationCreateResult>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f205831q;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ApplicationCreateResult> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f205831q = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f205831q);
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC43530a interfaceC43530a, @Y61.k InterfaceC47187a interfaceC47187a, @Y61.k C25719a c25719a, @Y61.k R0 r02) {
        this.f205826f = interfaceC4053a;
        this.f205827g = interfaceC43530a;
        this.f205828h = interfaceC47187a;
        this.f205829i = c25719a;
        this.f205830j = U.a(r02.d().plus(t1.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MortgageApplicationLeadLink mortgageApplicationLeadLink = (MortgageApplicationLeadLink) deepLink;
        this.f205829i.b(mortgageApplicationLeadLink, this, null, new i(this, mortgageApplicationLeadLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43152f0(new C43197r1(new a(2, this, j.class, "handleResult", "handleResult(Lcom/avito/android/mortgage_invite/model/ApplicationCreateResult;)V", 4), this.f205828h.getF206252a()), new b(3, null)), this.f205830j);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f205830j, null);
    }
}
