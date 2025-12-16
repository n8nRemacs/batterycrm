package com.avito.android.user_adverts.tab_actions.host.domain;

import XI0.b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.user_adverts_actions.generated.api.api_profile_item_available_actions.PostAvailableActionsSuccessActionsItem;
import com.avito.android.user_adverts.tab_actions.host.domain.i;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import dm0.InterfaceC39755a;
import em0.C40129a;
import em0.C40130b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: UserAdvertsAvailableActionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/domain/g;", "Lcom/avito/android/user_adverts/tab_actions/host/domain/f;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC39755a> f314253a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f314254b;

    /* compiled from: UserAdvertsAvailableActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LXI0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LXI0/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.domain.UserAdvertsAvailableActionsInteractorImpl$itemAvailableActions$2", f = "UserAdvertsAvailableActionsInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super XI0.b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314255q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ XI0.a f314257s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XI0.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f314257s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return g.this.new a(this.f314257s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super XI0.b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            AvailableActionsDomain.ActionType actionType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314255q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39755a interfaceC39755a = g.this.f314253a.get();
                C40130b c40130b = new C40130b(Long.valueOf(this.f314257s.f18822a));
                this.f314255q = 1;
                obj = interfaceC39755a.b(c40130b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                return new b.C1327b(error.getError(), error.getCause());
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List<PostAvailableActionsSuccessActionsItem> listA = ((C40129a) ((TypedResult.Success) typedResult).getResult()).a();
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            List<PostAvailableActionsSuccessActionsItem> list = listA;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (PostAvailableActionsSuccessActionsItem postAvailableActionsSuccessActionsItem : list) {
                String icon = postAvailableActionsSuccessActionsItem.getIcon();
                String id2 = postAvailableActionsSuccessActionsItem.getId();
                String title = postAvailableActionsSuccessActionsItem.getTitle();
                int i13 = i.a.f314258a[postAvailableActionsSuccessActionsItem.getType().ordinal()];
                if (i13 == 1) {
                    actionType = AvailableActionsDomain.ActionType.f314265b;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    actionType = AvailableActionsDomain.ActionType.f314266c;
                }
                arrayList.add(new AvailableActionsDomain.ActionItem(icon, id2, title, actionType, postAvailableActionsSuccessActionsItem.getUri()));
            }
            return new b.a(new AvailableActionsDomain(arrayList));
        }
    }

    @Inject
    public g(@k R0 r02, @k h31.e eVar) {
        this.f314253a = eVar;
        this.f314254b = r02;
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.f
    @l
    public final Object a(@k XI0.a aVar, @k Continuation<? super XI0.b> continuation) {
        return C43259k.g(this.f314254b.a(), new a(aVar, null), continuation);
    }
}
