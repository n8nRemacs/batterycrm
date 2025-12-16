package com.avito.android.user_adverts_filters.main.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UserAdvertsFilters;
import com.avito.android.remote.model.UserAdvertsFiltersResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinNavBar;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import h31.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import sI0.InterfaceC48055a;

/* compiled from: UserAdvertsFiltersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/domain/b;", "Lcom/avito/android/user_adverts_filters/main/domain/a;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.user_adverts_filters.main.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC48055a> f316047a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f316048b;

    /* compiled from: UserAdvertsFiltersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.domain.UserAdvertsFiltersInteractorImpl$userAdvertsFilter$2", f = "UserAdvertsFiltersInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<UserAdvertsFiltersBeduinResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316049q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f316051s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f316051s = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f316051s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<UserAdvertsFiltersBeduinResult>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object objD;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f316049q;
            b bVar = b.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48055a interfaceC48055a = bVar.f316047a.get();
                Map<String, String> mapJ = A4.j(A4.f318516a, this.f316051s);
                this.f316049q = 1;
                objD = interfaceC48055a.d(mapJ, this);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objD = obj;
            }
            TypedResult typedResult = (TypedResult) objD;
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return typedResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            UserAdvertsFiltersResult userAdvertsFiltersResult = (UserAdvertsFiltersResult) ((TypedResult.Success) typedResult).getResult();
            bVar.getClass();
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen = new UserAdvertsFiltersBeduinScreen(userAdvertsFiltersResult.getInitialScreenId());
            Set<Map.Entry<String, UserAdvertsFilters>> setEntrySet = userAdvertsFiltersResult.getScreens().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen2 = new UserAdvertsFiltersBeduinScreen((String) entry.getKey());
                UserAdvertsFilters userAdvertsFilters = (UserAdvertsFilters) entry.getValue();
                String navButton = userAdvertsFilters.getNavigationBar().getNavButton();
                String title = userAdvertsFilters.getNavigationBar().getTitle();
                String resetAction = userAdvertsFilters.getNavigationBar().getResetAction();
                ArrayList arrayList = null;
                if (resetAction == null || (!userAdvertsFilters.mainDefaultFormIsPresent() && !userAdvertsFilters.topDefaultFormIsPresent())) {
                    resetAction = null;
                }
                boolean z12 = userAdvertsFilters.mainFormChanged() || userAdvertsFilters.topFormChanged();
                UserAdvertsFiltersBeduinNavBar.f316067f.getClass();
                UserAdvertsFiltersBeduinNavBar.Type type = UserAdvertsFiltersBeduinNavBar.Type.f316073c;
                if (!L.f(navButton, "back")) {
                    type = UserAdvertsFiltersBeduinNavBar.Type.f316072b;
                    L.f(navButton, "close");
                }
                UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar = new UserAdvertsFiltersBeduinNavBar(type, title, resetAction, z12);
                UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen3 = new UserAdvertsFiltersBeduinScreen(((UserAdvertsFilters) entry.getValue()).getScreenName());
                List<String> innerScreenNames = ((UserAdvertsFilters) entry.getValue()).getInnerScreenNames();
                if (innerScreenNames != null) {
                    List<String> list = innerScreenNames;
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new UserAdvertsFiltersBeduinScreen((String) it2.next()));
                    }
                }
                linkedHashMap.put(userAdvertsFiltersBeduinScreen2, new UserAdvertsFiltersBeduinModel(userAdvertsFiltersBeduinNavBar, userAdvertsFiltersBeduinScreen3, arrayList == null ? C42784z0.f406748b : arrayList, ((UserAdvertsFilters) entry.getValue()).getTopFormId(), ((UserAdvertsFilters) entry.getValue()).getDefaultTopFormId(), ((UserAdvertsFilters) entry.getValue()).getMainFormId(), ((UserAdvertsFilters) entry.getValue()).getDefaultMainFormId(), ((UserAdvertsFilters) entry.getValue()).getBottomFormId(), ((UserAdvertsFilters) entry.getValue()).getTopComponents(), ((UserAdvertsFilters) entry.getValue()).getDefaultTopComponents(), ((UserAdvertsFilters) entry.getValue()).getMainComponents(), ((UserAdvertsFilters) entry.getValue()).getDefaultMainComponents(), ((UserAdvertsFilters) entry.getValue()).getBottomComponents()));
            }
            return new TypedResult.Success(new UserAdvertsFiltersBeduinResult(userAdvertsFiltersBeduinScreen, linkedHashMap));
        }
    }

    @Inject
    public b(@k R0 r02, @k e eVar) {
        this.f316047a = eVar;
        this.f316048b = r02;
    }

    @Override // com.avito.android.user_adverts_filters.main.domain.a
    @l
    public final Object a(@k Map<String, ? extends Object> map, @k Continuation<? super TypedResult<UserAdvertsFiltersBeduinResult>> continuation) {
        return C43259k.g(this.f316048b.a(), new a(map, null), continuation);
    }
}
