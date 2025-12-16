package xS;

import Y61.k;
import android.content.Context;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.progress_bar.state.i;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;
import yV.C50177a;

/* compiled from: ProgressBarStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"LxS/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/i;", "LyV/a;", "_design-modules_beduin-v2_renderer_component_progress-bar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49882b extends AbstractC42628a<i, C50177a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C50177a f442508c;

    public C49882b(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        C50177a.C12902a c12902a = C50177a.f443122g;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c12902a.getClass();
        this.f442508c = C50177a.C12902a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f442508c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        C50177a c50177a = (C50177a) obj;
        i iVar = (i) mVar;
        if (c50177a == null) {
            return null;
        }
        C35763c0 c35763c0A = C35771d0.a(c50177a.f443123a, AbstractC36331a.C10471a.a(c11616a, iVar.f334833c), null, null, null, 14);
        C35763c0 c35763c0A2 = C35771d0.a(c50177a.f443124b, F.a(iVar.f334834d, c11616a.f337938b, c11616a.f337939c), null, null, null, 14);
        Integer numC = AbstractC42628a.C11616a.c(iVar.f334835e);
        int iIntValue = numC != null ? numC.intValue() : c50177a.f443125c;
        Integer numC2 = AbstractC42628a.C11616a.c(iVar.f334836f);
        int iIntValue2 = numC2 != null ? numC2.intValue() : c50177a.f443126d;
        Integer numC3 = AbstractC42628a.C11616a.c(iVar.f334837g);
        int iIntValue3 = numC3 != null ? numC3.intValue() : c50177a.f443127e;
        Integer numC4 = AbstractC42628a.C11616a.c(iVar.f334838h);
        return new C50177a(c35763c0A, c35763c0A2, iIntValue, iIntValue2, iIntValue3, numC4 != null ? numC4.intValue() : c50177a.f443128f);
    }
}
