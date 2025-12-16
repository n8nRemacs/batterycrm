package com.avito.android.blueprints.radiogroup;

import JO.m;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.C35855n4;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RadioGroupSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/radiogroup/g;", "Lcom/avito/android/blueprints/radiogroup/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106568b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f106569c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106570d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106571e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f106572f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C41981q0 f106573g;

    @Inject
    public g(@k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106568b = interfaceC35807h4;
        this.f106569c = q12;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106570d = cVar;
        this.f106571e = cVar;
        com.jakewharton.rxrelay3.c<Ij.b> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106572f = cVar2;
        this.f106573g = new C41981q0(cVar2);
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
                gVar.f106572f.accept(new Ij.b(bVar.f117181b, m.a(mVar, true), null, 4, null));
            }
        }
    }

    @Override // com.avito.android.blueprints.radiogroup.c
    @k
    public final z<DeepLink> E() {
        return this.f106571e;
    }

    public final void O(@k i iVar, @k ParameterElement.C.b bVar) {
        boolean zIsAvitoRe23 = Theme.INSTANCE.isAvitoRe23(bVar.f117226v);
        boolean zBooleanValue = this.f106569c.w().invoke().booleanValue();
        boolean z12 = bVar.f117220p;
        String str = bVar.f117208d;
        if (zBooleanValue) {
            iVar.setTitle(this.f106568b.a(str, z12, bVar.f117227w));
        } else {
            iVar.setTitle(z12 ? "" : str);
        }
        iVar.k(bVar.f117209e);
        SelectParameter.Displaying displaying = bVar.f117223s;
        iVar.b3(displaying != null ? displaying.getTitleStyle() : null);
        iVar.k0(displaying != null ? displaying.getCustomPaddings() : null);
        iVar.s(str);
        ItemWithState.State state = bVar.f117219o;
        if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            iVar.setError(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b.toString());
        } else {
            iVar.setError(null);
        }
        iVar.gn(bVar.f117236E, bVar.f117212h, zIsAvitoRe23, new e(this), new d(this, bVar));
        iVar.um(bVar.f117239H);
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
        if (!(obj instanceof C35855n4)) {
            obj = null;
        }
        C35855n4 c35855n4 = (C35855n4) obj;
        if (c35855n4 == null) {
            O(iVar, bVar);
            return;
        }
        ItemWithState.State state = c35855n4.f318932b;
        if (state != null) {
            if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
                iVar.setError(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b.toString());
            } else {
                iVar.setError(null);
            }
        }
        iVar.Ya();
        m mVar = c35855n4.f318931a;
        if (mVar != null) {
            iVar.S4(bVar.f117236E.indexOf(mVar));
        }
        iVar.s8(new f(this, bVar));
        iVar.um(bVar.f117239H);
    }

    @Override // com.avito.android.blueprints.radiogroup.c
    @k
    public final z<Ij.b> h() {
        return this.f106573g;
    }
}
