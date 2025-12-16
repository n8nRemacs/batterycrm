package bj;

import Y61.k;
import Y61.l;
import androidx.collection.C20199a;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import com.avito.android.beduin.common.component.adapter.e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;

/* compiled from: BeduinAdapter.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\b"}, d2 = {"Lbj/a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "ViewHolder", "Landroidx/recyclerview/widget/B;", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC25658a<ViewHolder extends RecyclerView.C> extends B<AbstractC40112a<BeduinModel, InterfaceC40116e>, ViewHolder> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C20199a<d<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Integer> f57398e;

    /* renamed from: f, reason: collision with root package name */
    public int f57399f;

    public AbstractC25658a(@k e eVar) {
        super(eVar);
        this.f57398e = new C20199a<>();
        this.f57399f = -1;
    }

    public final int n(@k AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a) {
        d<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> dVarB = m0.f406844a.b(abstractC40112a.getClass());
        C20199a<d<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Integer> c20199a = this.f57398e;
        Integer numValueOf = c20199a.get(dVarB);
        if (numValueOf == null) {
            int i12 = this.f57399f + 1;
            this.f57399f = i12;
            numValueOf = Integer.valueOf(i12);
            c20199a.put(dVarB, numValueOf);
        }
        return numValueOf.intValue();
    }

    public abstract void o(@k InterfaceC39736a interfaceC39736a);

    public abstract void p(@l BeduinHorizontalIndent beduinHorizontalIndent);
}
