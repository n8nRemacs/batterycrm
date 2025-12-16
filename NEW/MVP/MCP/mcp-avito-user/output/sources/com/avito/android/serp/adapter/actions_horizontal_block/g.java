package com.avito.android.serp.adapter.actions_horizontal_block;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import com.avito.android.serp.adapter.actions_horizontal_block.Action;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: ActionsHorizontalBlockItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/g;", "Lcom/avito/android/serp/adapter/actions_horizontal_block/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f268673b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f268674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f268675d;

    /* compiled from: ActionsHorizontalBlockItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Action.Predefined.State.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Action.Predefined.State state = Action.Predefined.State.f268647b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Action.Predefined.State state2 = Action.Predefined.State.f268647b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Action.Predefined.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Action.Predefined.Type type = Action.Predefined.Type.f268652b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public g(@Y61.k u uVar, @Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f268673b = uVar;
        this.f268674c = eVar;
        this.f268675d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        r rVar = (r) eVar;
        ActionsHorizontalBlockItem actionsHorizontalBlockItem = (ActionsHorizontalBlockItem) aVar;
        Action action = actionsHorizontalBlockItem.f268656c;
        if (action instanceof Action.InlineFilter) {
            Action.InlineFilter inlineFilter = (Action.InlineFilter) action;
            rVar.gT(inlineFilter.f268636b);
            rVar.YM(inlineFilter.f268637c);
            rVar.ES(new h(action, this));
            rVar.z60();
        } else if (action instanceof Action.Predefined) {
            Action.Predefined predefined = (Action.Predefined) action;
            int iOrdinal = predefined.f268646i.ordinal();
            if (iOrdinal == 0) {
                rVar.IN();
                rVar.gT(predefined.f268640c);
                rVar.YM(predefined.f268642e);
            } else if (iOrdinal == 1) {
                rVar.IN();
                rVar.gT(predefined.f268639b);
                rVar.YM(predefined.f268641d);
            } else if (iOrdinal == 2) {
                rVar.br();
                rVar.YM(predefined.f268643f);
            }
            int iOrdinal2 = predefined.f268645h.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    rVar.ES(new k(action, this));
                }
            } else if (predefined.f268644g != null) {
                rVar.ES(new i(action, this));
            } else {
                rVar.ES(new j(this));
            }
            rVar.z60();
        } else {
            rVar.MB();
        }
        List<Tab> list = actionsHorizontalBlockItem.f268658e;
        Tab tab = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!((Tab) next).isSelected()) {
                    tab = next;
                    break;
                }
            }
            tab = tab;
        }
        if (tab != null) {
            rVar.WQ();
            rVar.X40(tab.getTitle());
            rVar.e00(tab.getTitle());
            rVar.gW(new l(this, tab));
        } else {
            Action action2 = actionsHorizontalBlockItem.f268657d;
            if (action2 instanceof Action.InlineFilter) {
                Action.InlineFilter inlineFilter2 = (Action.InlineFilter) action2;
                rVar.X40(inlineFilter2.f268636b);
                rVar.e00(inlineFilter2.f268637c);
                rVar.gW(new m(action2, this));
                rVar.WQ();
            } else if (action2 instanceof Action.Predefined) {
                Action.Predefined predefined2 = (Action.Predefined) action2;
                int iOrdinal3 = predefined2.f268646i.ordinal();
                if (iOrdinal3 == 0) {
                    rVar.QY();
                    rVar.X40(predefined2.f268640c);
                    rVar.e00(predefined2.f268642e);
                } else if (iOrdinal3 == 1) {
                    rVar.QY();
                    rVar.X40(predefined2.f268639b);
                    rVar.e00(predefined2.f268641d);
                } else if (iOrdinal3 == 2) {
                    rVar.w00();
                    rVar.e00(predefined2.f268643f);
                }
                int iOrdinal4 = predefined2.f268645h.ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 == 1) {
                        rVar.gW(new p(action2, this));
                    }
                } else if (predefined2.f268644g != null) {
                    rVar.gW(new n(action2, this));
                } else {
                    rVar.gW(new o(this));
                }
                rVar.WQ();
            } else {
                rVar.Lr();
            }
        }
        rVar.setVisible(actionsHorizontalBlockItem.f268659f);
    }
}
