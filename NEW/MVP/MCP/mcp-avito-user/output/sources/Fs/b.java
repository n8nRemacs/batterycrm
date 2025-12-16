package FS;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.spinner.state.h;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: SpinnerStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LFS/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/spinner/state/h;", "Lcom/avito/android/lib/design/spinner/a;", "_design-modules_beduin-v2_renderer_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<h, com.avito.android.lib.design.spinner.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.spinner.a f4716c;

    public b(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c5301a.getClass();
        this.f4716c = a.C5301a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f4716c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        com.avito.android.lib.design.spinner.a aVar = (com.avito.android.lib.design.spinner.a) obj;
        h hVar = (h) mVar;
        C35763c0 c35763c0A = C35771d0.a(aVar.f180561a, AbstractC36331a.C10471a.a((AbstractC42628a.C11616a) c10471a, hVar.f335148e), null, null, null, 14);
        f<Integer> fVar = hVar.f335146c;
        Integer numC = AbstractC42628a.C11616a.c(fVar);
        int iIntValue = aVar.f180563c;
        int iIntValue2 = numC != null ? numC.intValue() : iIntValue;
        Integer numC2 = AbstractC42628a.C11616a.c(fVar);
        if (numC2 != null) {
            iIntValue = numC2.intValue();
        }
        return new com.avito.android.lib.design.spinner.a(c35763c0A, iIntValue, iIntValue2);
    }
}
