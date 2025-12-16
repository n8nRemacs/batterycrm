package com.avito.android.beduin_shared.common.component.adapter;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSyncWithDiffUtilAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/common/component/adapter/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f105268a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f105269b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2) {
        this.f105268a = list;
        this.f105269b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f105268a.get(i12).S(), this.f105269b.get(i13).S());
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list = this.f105268a;
        String id2 = list.get(i12).S().getId();
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list2 = this.f105269b;
        if (L.f(id2, list2.get(i13).S().getId())) {
            if (list.get(i12).S().getClass() == list2.get(i13).S().getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    @l
    public final Object getChangePayload(int i12, int i13) {
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list = this.f105268a;
        BeduinModel beduinModelS = list.get(i12).S();
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list2 = this.f105269b;
        if (beduinModelS.getClass() == list2.get(i13).S().getClass()) {
            return list.get(i12).l(list2.get(i13).S());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f105269b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f105268a.size();
    }
}
