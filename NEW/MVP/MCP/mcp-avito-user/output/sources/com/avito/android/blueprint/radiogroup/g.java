package com.avito.android.blueprint.radiogroup;

import Hj.C13996a;
import JO.m;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35855n4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishRadioGroupSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/radiogroup/g;", "Lcom/avito/android/blueprint/radiogroup/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105642b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f105643c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105644d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105645e;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105642b = cVar;
        this.f105643c = cVar;
        com.jakewharton.rxrelay3.c<Ij.b> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105644d = cVar2;
        this.f105645e = new C41981q0(cVar2);
    }

    public static C13996a V(ParameterElement.C.b bVar) {
        AttributedText attributedText;
        String str = bVar.f117208d;
        ItemWithState.State warning = bVar.f117219o;
        if (!(warning instanceof ItemWithState.State.Error) && !(warning instanceof ItemWithState.State.Warning) && (attributedText = bVar.f117239H) != null) {
            warning = new ItemWithState.State.Warning(attributedText.getText());
        }
        return new C13996a(str, warning, bVar.f117220p, bVar.f117227w, null, bVar.f117209e, null, bVar.f117211g, null, 336, null);
    }

    public static final void k(g gVar, boolean z12, ParameterElement.C.b bVar, String str) {
        Object next;
        gVar.getClass();
        if (z12) {
            Iterator<T> it = bVar.f117236E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((m) next).f8961b, str)) {
                        break;
                    }
                }
            }
            m mVar = (m) next;
            if (mVar != null) {
                gVar.f105644d.accept(new Ij.b(bVar.f117181b, m.a(mVar, true), null, 4, null));
            }
        }
    }

    @Override // com.avito.android.blueprint.radiogroup.c
    @k
    public final z<DeepLink> E() {
        return this.f105643c;
    }

    public final void O(@k i iVar, @k ParameterElement.C.b bVar) {
        iVar.a60(V(bVar));
        SelectParameter.Displaying displaying = bVar.f117223s;
        iVar.k0(displaying != null ? displaying.getCustomPaddings() : null);
        iVar.s(bVar.f117208d);
        iVar.no(bVar.f117236E, bVar.f117212h, new d(this), new e(this, bVar));
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((i) eVar, (ParameterElement.C.b) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35855n4) {
                obj = obj2;
            }
        }
        C35855n4 c35855n4 = (C35855n4) (obj instanceof C35855n4 ? obj : null);
        if (c35855n4 == null) {
            O(iVar, bVar);
            return;
        }
        iVar.a60(V(bVar));
        iVar.Ya();
        m mVar = c35855n4.f318931a;
        if (mVar != null) {
            iVar.S4(bVar.f117236E.indexOf(mVar));
        }
        iVar.s8(new f(this, bVar));
    }

    @Override // com.avito.android.blueprint.radiogroup.c
    @k
    public final z<Ij.b> h() {
        return this.f105645e;
    }
}
