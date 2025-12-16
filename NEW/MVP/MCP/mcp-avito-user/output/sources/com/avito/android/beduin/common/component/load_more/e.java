package com.avito.android.beduin.common.component.load_more;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinToastAction;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.form.transforms.IsLoadingTransform;
import com.avito.android.beduin.common.g;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.beduin_shared.model.utils.j;
import com.avito.android.di.B;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.Collections;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: BeduinLoadMoreViewModel.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/e;", "Lji/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f101726a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.form.store.b f101727b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101728c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f101729d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final lj.c f101730e;

    /* renamed from: g, reason: collision with root package name */
    public BeduinLoadMoreModel f101732g;

    /* renamed from: f, reason: collision with root package name */
    @k
    public String f101731f = "";

    /* renamed from: h, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f101733h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: BeduinLoadMoreViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f101734b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: BeduinLoadMoreViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.b;
            e eVar = e.this;
            if (z12) {
                eVar.b();
                com.avito.android.beduin_shared.model.utils.a.a(eVar.f101728c, ((BeduinActionsResponse) ((P2.b) p22).f318720a).getActions());
                return;
            }
            if (p22 instanceof P2.a) {
                eVar.c(false);
                BeduinLoadMoreModel beduinLoadMoreModel = eVar.f101732g;
                if (beduinLoadMoreModel == null) {
                    beduinLoadMoreModel = null;
                }
                BeduinLoadMoreModel beduinLoadMoreModel2 = eVar.f101732g;
                eVar.f101728c.o(new BeduinToastAction(BeduinComponentTheme.AVITO_LOOK_AND_FEEL, beduinLoadMoreModel.getErrorToast().getStyle(), beduinLoadMoreModel.getErrorToast().getTitle(), new BeduinToastAction.Button(beduinLoadMoreModel.getErrorToast().getRetryButton().getTitle(), Collections.singletonList(new BeduinApplyTransformAction((beduinLoadMoreModel2 != null ? beduinLoadMoreModel2 : null).getId(), eVar.f101731f, Collections.singletonList(new IsLoadingTransform(true)))), null, null, 12, null), null, beduinLoadMoreModel.getErrorToast().getTimeout(), null, beduinLoadMoreModel.getErrorToast().getCloseOnAction(), null, null, 848, null));
                return;
            }
            if (p22 instanceof P2.c) {
                BeduinLoadMoreModel beduinLoadMoreModel3 = eVar.f101732g;
                if ((beduinLoadMoreModel3 != null ? beduinLoadMoreModel3 : null).isLoading()) {
                    return;
                }
                eVar.c(true);
            }
        }
    }

    @Inject
    public e(@k g gVar, @k com.avito.android.beduin.common.form.store.b bVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k InterfaceC35745a5 interfaceC35745a5, @k lj.c cVar) {
        this.f101726a = gVar;
        this.f101727b = bVar;
        this.f101728c = interfaceC15523b;
        this.f101729d = interfaceC35745a5;
        this.f101730e = cVar;
    }

    public final void a(@k NextPageRequest nextPageRequest) {
        io.reactivex.rxjava3.disposables.c cVar = this.f101733h;
        if (cVar.g() == 0) {
            c(true);
            O oR2 = this.f101726a.a(nextPageRequest.getPath(), nextPageRequest.getMethod(), nextPageRequest.extractParams(this.f101730e)).r(a.f101734b);
            InterfaceC35745a5 interfaceC35745a5 = this.f101729d;
            cVar.b(oR2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new b(), io.reactivex.rxjava3.internal.functions.a.f401996f));
        }
    }

    public final void b() {
        c(false);
        InterfaceC43779a interfaceC43779a = this.f101727b.get(this.f101731f);
        if (interfaceC43779a != null) {
            BeduinLoadMoreModel beduinLoadMoreModel = this.f101732g;
            if (beduinLoadMoreModel == null) {
                beduinLoadMoreModel = null;
            }
            interfaceC43779a.h(new d.g(Collections.singletonList(beduinLoadMoreModel.getId())));
        }
        this.f101733h.e();
    }

    public final void c(boolean z12) {
        InterfaceC43779a interfaceC43779a = this.f101727b.get(this.f101731f);
        if (interfaceC43779a != null) {
            BeduinLoadMoreModel beduinLoadMoreModel = this.f101732g;
            if (beduinLoadMoreModel == null) {
                beduinLoadMoreModel = null;
            }
            j.a(interfaceC43779a, beduinLoadMoreModel.getId(), new IsLoadingTransform(z12));
        }
        this.f101733h.e();
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
        this.f101733h.e();
    }
}
