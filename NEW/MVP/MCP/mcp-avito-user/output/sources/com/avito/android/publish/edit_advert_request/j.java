package com.avito.android.publish.edit_advert_request;

import Cd0.F0;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import ce0.C27182a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.ConditionChainLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.publish.C0;
import com.avito.android.publish.edit_advert_request.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.publish.EditAdvertResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import de0.InterfaceC39719d;
import eH0.c;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import yc.C50213a;

/* compiled from: EditAdvertRequestViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j;", "Landroidx/lifecycle/M0;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39719d f235505E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235506J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f235507K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C50213a f235508L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C0 f235509M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f235510N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.edit_advert_request.a f235511O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final eH0.c f235512P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f235513Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f235514R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public String f235515S = "";

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f235516T = new C23038g0<>();

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f235517U = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: EditAdvertRequestViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/publish/edit_advert_request/j$a$a;", "Lcom/avito/android/publish/edit_advert_request/j$a$b;", "Lcom/avito/android/publish/edit_advert_request/j$a$c;", "Lcom/avito/android/publish/edit_advert_request/j$a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: EditAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j$a$a;", "Lcom/avito/android/publish/edit_advert_request/j$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.edit_advert_request.j$a$a, reason: collision with other inner class name */
        public static final class C7102a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ApiError f235518a;

            public C7102a(@Y61.k ApiError apiError) {
                super(null);
                this.f235518a = apiError;
            }
        }

        /* compiled from: EditAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j$a$b;", "Lcom/avito/android/publish/edit_advert_request/j$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f235519a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f235520b;

            public b(@Y61.l String str, @Y61.k String str2) {
                super(null);
                this.f235519a = str;
                this.f235520b = str2;
            }
        }

        /* compiled from: EditAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j$a$c;", "Lcom/avito/android/publish/edit_advert_request/j$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f235521a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: EditAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j$a$d;", "Lcom/avito/android/publish/edit_advert_request/j$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Action.Confirmation f235522a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Y41.a<G0> f235523b;

            public d(@Y61.k Action.Confirmation confirmation, @Y61.k Y41.a<G0> aVar) {
                super(null);
                this.f235522a = confirmation;
                this.f235523b = aVar;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/publish/EditAdvertResult;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/edit_advert_request/a$a;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ItemBrief f235525c;

        public b(ItemBrief itemBrief) {
            this.f235525c = itemBrief;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            com.avito.android.publish.edit_advert_request.a aVar = j.this.f235511O;
            ItemBrief itemBrief = this.f235525c;
            return aVar.a((TypedResult) obj, itemBrief.getCategoryId(), itemBrief.getId());
        }
    }

    /* compiled from: EditAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/a$a;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/edit_advert_request/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ItemBrief f235527c;

        public c(ItemBrief itemBrief) {
            this.f235527c = itemBrief;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Map<String, PretendErrorValue> errors;
            String singleMessage;
            a.InterfaceC7097a interfaceC7097a = (a.InterfaceC7097a) obj;
            boolean z12 = interfaceC7097a instanceof a.InterfaceC7097a.C7098a;
            j jVar = j.this;
            if (z12) {
                a.InterfaceC7097a.C7098a c7098a = (a.InterfaceC7097a.C7098a) interfaceC7097a;
                jVar.getClass();
                b.a.a(jVar.f235510N, c7098a.f235455a, null, c7098a.f235456b, 2);
                return;
            }
            if (interfaceC7097a instanceof a.InterfaceC7097a.b) {
                String id2 = this.f235527c.getId();
                jVar.getClass();
                TypedResult<EditAdvertResult> typedResult = ((a.InterfaceC7097a.b) interfaceC7097a).f235457a;
                boolean z13 = typedResult instanceof TypedResult.Success;
                C23038g0<a> c23038g0 = jVar.f235516T;
                if (!z13) {
                    if (typedResult instanceof TypedResult.Error) {
                        c23038g0.setValue(new a.C7102a(((TypedResult.Error) typedResult).getError()));
                        return;
                    }
                    return;
                }
                EditAdvertResult editAdvertResult = (EditAdvertResult) ((TypedResult.Success) typedResult).getResult();
                if (editAdvertResult instanceof EditAdvertResult.Ok) {
                    jVar.ne((EditAdvertResult.Ok) editAdvertResult, id2);
                    return;
                }
                if (editAdvertResult instanceof EditAdvertResult.InputErrors) {
                    PretendResult messages = ((EditAdvertResult.InputErrors) editAdvertResult).getMessages();
                    if (messages == null || (errors = messages.getErrors()) == null || jVar.f235509M.ze(errors)) {
                        return;
                    }
                    PretendErrorValue pretendErrorValue = (PretendErrorValue) C42745f0.F(errors.values());
                    if (pretendErrorValue == null || (singleMessage = pretendErrorValue.getSingleMessage()) == null) {
                        singleMessage = "";
                    }
                    c23038g0.setValue(new a.C7102a(new ApiError.UnknownError(singleMessage, null, null, 6, null)));
                    return;
                }
                if (editAdvertResult instanceof EditAdvertResult.NeedSupport) {
                    Action action = ((EditAdvertResult.NeedSupport) editAdvertResult).getAction();
                    if (action.getConfirmation() == null) {
                        V2.f318762a.e("EditAdvertRequestViewModel: action has no confirmation data for dialog", null);
                        c23038g0.setValue(new a.C7102a(new ApiError.UnknownError("", null, null, 6, null)));
                    } else {
                        a.d dVar = new a.d(action.getConfirmation(), new l(action, jVar));
                        jVar.f235507K.c(new C27182a(jVar.me()));
                        c23038g0.setValue(dVar);
                    }
                }
            }
        }
    }

    public j(@Y61.k InterfaceC39719d interfaceC39719d, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k C0 c02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.publish.edit_advert_request.a aVar2, @Y61.k eH0.c cVar, @Y61.k InterfaceC44261b interfaceC44261b) {
        this.f235505E = interfaceC39719d;
        this.f235506J = interfaceC35745a5;
        this.f235507K = interfaceC28373a;
        this.f235508L = c50213a;
        this.f235509M = c02;
        this.f235510N = aVar;
        this.f235511O = aVar2;
        this.f235512P = cVar;
        this.f235513Q = interfaceC44261b;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void ke() {
        C0 c02;
        CategoryParameters categoryParameters;
        List<ImageUploadResult> onlyUploaded;
        io.reactivex.rxjava3.internal.observers.m mVar = this.f235514R;
        if ((mVar == null || mVar.getF318621e()) && (categoryParameters = (c02 = this.f235509M).f231873k0) != null) {
            ItemBrief itemBrief = c02.f231867e0;
            if (itemBrief == null) {
                C0.Ge(c02, "Cannot edit advert as item is null", null, 6);
                return;
            }
            this.f235516T.setValue(a.c.f235521a);
            PhotoParameter photoParameter = (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class);
            if (photoParameter != null) {
                PhotoParameter.ImageUploadListWrapper value = photoParameter.getValue();
                int size = (value == null || (onlyUploaded = value.getOnlyUploaded()) == null) ? 0 : onlyUploaded.size();
                Integer num = c02.f231876n0;
                if ((num != null ? num.intValue() : 0) != 0 && size == 0) {
                    this.f235507K.c(new F0(this.f235508L));
                }
            }
            String id2 = itemBrief.getId();
            String categoryId = itemBrief.getCategoryId();
            if (categoryId == null) {
                categoryId = "";
            }
            I<TypedResult<EditAdvertResult>> iA2 = this.f235505E.a(id2, categoryId, c02.f231861Y.getNavigation(), itemBrief.getVersion(), categoryParameters, c02.f231868f0);
            InterfaceC35745a5 interfaceC35745a5 = this.f235506J;
            this.f235514R = (io.reactivex.rxjava3.internal.observers.m) iA2.z(interfaceC35745a5.a()).n(new b(itemBrief)).s(interfaceC35745a5.e()).x(new c(itemBrief), io.reactivex.rxjava3.internal.functions.a.f401996f);
        }
    }

    public final void le() {
        this.f235516T.setValue(new a.b(this.f235515S, me()));
        this.f235515S = "";
    }

    public final String me() {
        return this.f235509M.f231867e0.getId();
    }

    public final void ne(EditAdvertResult.Ok ok2, String str) {
        DeepLink deepLink = ok2.getDeepLink();
        this.f235515S = ok2.getMessage();
        DeepLink deepLink2 = this.f235509M.f231869g0;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f235510N;
        if (deepLink != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("up_intent", c.a.a(this.f235512P, str, null, false, false, 30).putExtra("up_intent", InterfaceC44261b.a.a(this.f235513Q, null, null, null, null, 31)).setFlags(603979776));
            aVar.r6(bundle, deepLink, "req_fees");
            return;
        }
        boolean z12 = false;
        if (deepLink2 != null) {
            if (deepLink2 instanceof MyAdvertLink.ActivateV2) {
                z12 = true;
            } else if (deepLink2 instanceof ConditionChainLink) {
                z12 = ((ConditionChainLink) deepLink2).f133112b instanceof MyAdvertLink.ActivateV2;
            }
        }
        if (z12) {
            b.a.a(aVar, deepLink2, null, null, 6);
            return;
        }
        if (deepLink2 != null) {
            b.a.a(aVar, deepLink2, null, null, 6);
        }
        this.f235516T.setValue(new a.b(this.f235515S, str));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f235514R;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f235517U.e();
        super.onCleared();
    }
}
