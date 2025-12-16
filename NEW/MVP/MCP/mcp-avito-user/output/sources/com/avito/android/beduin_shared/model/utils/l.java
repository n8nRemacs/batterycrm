package com.avito.android.beduin_shared.model.utils;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentsFormUpdates.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {

    /* compiled from: ComponentsFormUpdates.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "components", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC25658a<? extends RecyclerView.C> f105334b;

        public a(AbstractC25658a<? extends RecyclerView.C> abstractC25658a) {
            this.f105334b = abstractC25658a;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f105334b.m((List) obj);
        }
    }

    public static final void a(@Y61.k z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k io.reactivex.rxjava3.disposables.c cVar) {
        cVar.b(zVar.t0(new a(abstractC25658a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@Y61.k List<? extends Q<? extends z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>>, ? extends AbstractC25658a<? extends RecyclerView.C>>> list, @Y61.k io.reactivex.rxjava3.disposables.c cVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            a((z) q12.f406619b, (AbstractC25658a) q12.f406620c, cVar);
        }
    }
}
