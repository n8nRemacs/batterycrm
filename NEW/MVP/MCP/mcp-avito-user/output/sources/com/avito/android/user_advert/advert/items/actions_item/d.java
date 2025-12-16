package com.avito.android.user_advert.advert.items.actions_item;

import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/d;", "Lcom/avito/android/user_advert/advert/items/actions_item/c;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309032b;

    /* compiled from: ActionsItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionsItem.Action.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionsItem.Action.Style style = ActionsItem.Action.Style.f309007b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ActionsItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ActionsItem.Action f309034m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ActionsItem f309035n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ActionsItem.Action action, ActionsItem actionsItem) {
            super(0);
            this.f309034m = action;
            this.f309035n = actionsItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            MyAdvertDetailsActivity myAdvertDetailsActivity = d.this.f309032b;
            if (myAdvertDetailsActivity != null) {
                InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
                if (interfaceC35426j0 == null) {
                    interfaceC35426j0 = null;
                }
                interfaceC35426j0.u6(this.f309034m, this.f309035n);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.android.user_advert.advert.items.actions_item.ActionsItem$Action[], java.lang.Object[]] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ?? E02;
        l lVar = (l) eVar;
        ActionsItem actionsItem = (ActionsItem) aVar;
        lVar.Qm();
        List<ActionsItem.Action> list = actionsItem.f309006c;
        if (list instanceof Collection ? !list.isEmpty() : list.iterator().hasNext()) {
            List<ActionsItem.Action> listW = C42745f0.w(list, 1);
            E02 = C42745f0.e0(C42745f0.e0(new ActionsItem.Action[]{C42745f0.D(list)}));
            for (ActionsItem.Action action : listW) {
                i iVar = new i(E02);
                int iOrdinal = action.getF309026c().ordinal();
                if (iOrdinal == 0) {
                    iVar.invoke(action);
                } else if (iOrdinal == 1) {
                    List list2 = (List) C42745f0.S(E02);
                    if (list2 == null) {
                        iVar.invoke(action);
                    } else if (list2.size() == 2) {
                        iVar.invoke(action);
                    } else if (action instanceof ActionsItem.b) {
                        iVar.invoke(action);
                    } else if (C42745f0.Q(list2) instanceof ActionsItem.b) {
                        iVar.invoke(action);
                    } else if (((ActionsItem.Action) C42745f0.Q(list2)).getF309026c() == ActionsItem.Action.Style.f309008c) {
                        list2.add(action);
                    } else {
                        iVar.invoke(action);
                    }
                }
            }
        } else {
            E02 = C42784z0.f406748b;
        }
        for (List list3 : (Iterable) E02) {
            int size = list3.size();
            if (size == 1) {
                ActionsItem.Action action2 = (ActionsItem.Action) C42745f0.E(list3);
                if (action2 instanceof ActionsItem.b) {
                    ActionsItem.b bVar = (ActionsItem.b) action2;
                    lVar.jn(bVar.f309014a, bVar.f309016c, ((ActionsItem.b) action2).f309017d, new g(this, bVar));
                } else {
                    lVar.hB(action2.getF309024a(), action2.getF309026c(), new h(this, action2));
                }
                k(lVar, action2, actionsItem);
            } else {
                if (size != 2) {
                    throw new IllegalStateException("Wrong actions list size " + list3.size());
                }
                ActionsItem.Action action3 = (ActionsItem.Action) C42745f0.E(list3);
                ActionsItem.Action action4 = (ActionsItem.Action) list3.get(1);
                lVar.N00(action3.getF309024a(), action3.getF309026c(), new e(this, action3), action4.getF309024a(), action4.getF309026c(), new f(this, action4));
                k(lVar, action3, actionsItem);
                k(lVar, action4, actionsItem);
            }
        }
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.c
    public final void c0() {
        this.f309032b = null;
    }

    public final void k(l lVar, ActionsItem.Action action, ActionsItem actionsItem) {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309032b;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.sd(action);
        }
        if (action instanceof ActionsItem.c) {
            ActionsItem.c cVar = (ActionsItem.c) action;
            if (cVar.f309021d) {
                return;
            }
            lVar.QX(new b(action, actionsItem), cVar.f309022e);
            return;
        }
        if ((action instanceof ActionsItem.a) || (action instanceof ActionsItem.d)) {
            return;
        }
        boolean z12 = action instanceof ActionsItem.b;
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.c
    public final void v2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309032b = myAdvertDetailsActivity;
    }
}
