package PR;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.circular_counter.b;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.circularCounter.state.e;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: CircularCounterStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LPR/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/e;", "Lcom/avito/android/lib/design/circular_counter/b;", "_design-modules_beduin-v2_renderer_component_circular-counter"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<e, com.avito.android.lib.design.circular_counter.b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.circular_counter.b f13068c;

    public b(@k Context context, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(context);
        b.a aVar = com.avito.android.lib.design.circular_counter.b.f178833g;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178978l);
        com.avito.android.lib.design.circular_counter.b bVarB = b.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        this.f13068c = bVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f13068c;
    }
}
