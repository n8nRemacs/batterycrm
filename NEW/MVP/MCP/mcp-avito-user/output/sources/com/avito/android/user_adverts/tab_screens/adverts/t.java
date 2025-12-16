package com.avito.android.user_adverts.tab_screens.adverts;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.CampaignsSaleLink;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsResult;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.iac_problems.public_module.deeplink.IacShowProblemBottomSheetLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.position_in_search.stats.deeplink.SearchPositionDetailsDeepLink;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import com.avito.android.user_adverts.tab_screens.adverts.n;
import fJ0.InterfaceC40301a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kv.C43501a;
import l70.InterfaceC43570a;

/* compiled from: UserAdvertsListMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectDeeplinkResult$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {557}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315540q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315541r;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deepLinkResult", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315542b;

        public a(UserAdvertsListMviFragment userAdvertsListMviFragment) {
            this.f315542b = userAdvertsListMviFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Fragment parentFragment;
            C43501a c43501a = (C43501a) obj;
            InterfaceC14249c interfaceC14249c = c43501a.f413261b;
            boolean z12 = interfaceC14249c instanceof MyAdvertDetailsResult;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315542b;
            if (z12) {
                n nVar = userAdvertsListMviFragment.f314852u0;
                (nVar != null ? nVar : null).a(new n.a.C9775a((MyAdvertDetailsResult) interfaceC14249c));
            } else if (interfaceC14249c instanceof MyAdvertLink.Edit.Result.Success) {
                n nVar2 = userAdvertsListMviFragment.f314852u0;
                (nVar2 != null ? nVar2 : null).a(new n.a.b(((MyAdvertLink.Edit.Result.Success) interfaceC14249c).f133497d));
            } else if (interfaceC14249c instanceof WebViewLink.a) {
                UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
                userAdvertsListMviFragment.u5().accept(InterfaceC40301a.b.e.f395818a);
            } else if (interfaceC14249c instanceof IacShowProblemBottomSheetLink.b) {
                if (((IacShowProblemBottomSheetLink.b) interfaceC14249c).f169088b) {
                    UserAdvertsListMviFragment.C35649a c35649a2 = UserAdvertsListMviFragment.f314828R0;
                    userAdvertsListMviFragment.u5().accept(InterfaceC40301a.b.e.f395818a);
                }
            } else if (interfaceC14249c instanceof DraftPublicationLink.b.C3997b) {
                n nVar3 = userAdvertsListMviFragment.f314852u0;
                if (nVar3 == null) {
                    nVar3 = null;
                }
                nVar3.a(new n.a.b(null));
            } else if (interfaceC14249c instanceof m.c) {
                String str = ((BeduinV2PageDeepLink) c43501a.f413260a.f134520a).f104783c;
                if (L.f(str, "changePrice")) {
                    Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                    String string = bundle != null ? bundle.getString("message") : null;
                    if (string != null && (parentFragment = userAdvertsListMviFragment.getParentFragment()) != null) {
                        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, parentFragment, com.avito.android.printable_text.b.f(string), null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, 942);
                    }
                    UserAdvertsListMviFragment.C35649a c35649a3 = UserAdvertsListMviFragment.f314828R0;
                    userAdvertsListMviFragment.u5().accept(InterfaceC40301a.b.e.f395818a);
                } else if (L.f(str, "personalSelections")) {
                    Bundle bundle2 = ((m.c) interfaceC14249c).f105170b;
                    if (L.f(bundle2 != null ? bundle2.getString("personalSelectionsActionKey") : null, "need_reload")) {
                        UserAdvertsListMviFragment.C35649a c35649a4 = UserAdvertsListMviFragment.f314828R0;
                        userAdvertsListMviFragment.v5().accept(InterfaceC43570a.c.f413537a);
                    }
                }
            } else if (interfaceC14249c instanceof CampaignsSaleLink.b.C3989b) {
                if (((CampaignsSaleLink.b.C3989b) interfaceC14249c).f133087b) {
                    UserAdvertsListMviFragment.C35649a c35649a5 = UserAdvertsListMviFragment.f314828R0;
                    userAdvertsListMviFragment.u5().accept(InterfaceC40301a.b.e.f395818a);
                }
            } else if (interfaceC14249c instanceof SearchPositionDetailsDeepLink.b.a) {
                UserAdvertsListMviFragment.C35649a c35649a6 = UserAdvertsListMviFragment.f314828R0;
                userAdvertsListMviFragment.u5().accept(InterfaceC40301a.AbstractC11137a.C11138a.f395812a);
            } else if (!(interfaceC14249c instanceof InterfaceC14249c.a)) {
                boolean z13 = interfaceC14249c instanceof InterfaceC14249c.b;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f315541r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t(this.f315541r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315540q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315541r;
            com.avito.android.deeplink_handler.handler.composite.a aVar = userAdvertsListMviFragment.f314853v0;
            if (aVar == null) {
                aVar = null;
            }
            InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(aVar.d9());
            a aVar2 = new a(userAdvertsListMviFragment);
            this.f315540q = 1;
            if (((AbstractC43168f) interfaceC43160iA).collect(aVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
