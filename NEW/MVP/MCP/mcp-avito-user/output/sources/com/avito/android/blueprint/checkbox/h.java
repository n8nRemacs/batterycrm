package com.avito.android.blueprint.checkbox;

import Hj.C13996a;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.util.M;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishCheckboxPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/checkbox/h;", "Lcom/avito/android/blueprint/checkbox/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f105392b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f105393c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105394d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f105395e;

    /* compiled from: PublishCheckboxPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f105397m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink) {
            super(0);
            this.f105397m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.this.f105394d.accept(this.f105397m);
            return G0.f406611a;
        }
    }

    @Inject
    public h() {
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105392b = cVar;
        this.f105393c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105394d = cVar2;
        this.f105395e = new C41981q0(cVar2);
    }

    public final C13996a O(ParameterElement.C.b bVar) {
        DeepLink deepLink;
        SelectParameter.Displaying displaying = bVar.f117223s;
        a aVar = null;
        String containerTitle = displaying != null ? displaying.getContainerTitle() : null;
        if (containerTitle == null) {
            containerTitle = "";
        }
        String str = containerTitle;
        TipIconParameters tipIconParameters = bVar.f117222r;
        if (tipIconParameters != null && (deepLink = tipIconParameters.getDeepLink()) != null) {
            aVar = new a(deepLink);
        }
        return new C13996a(str, bVar.f117219o, bVar.f117220p, bVar.f117227w, null, bVar.f117209e, aVar, bVar.f117211g, null, 272, null);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (ParameterElement.C.b) aVar);
    }

    @Override // com.avito.android.blueprint.checkbox.c
    @Y61.k
    public final z<Ij.b> g() {
        return this.f105393c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        String checkboxTitle;
        j jVar = (j) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof M) {
                obj = obj2;
            }
        }
        if (!(obj instanceof M)) {
            obj = null;
        }
        M m12 = (M) obj;
        if (m12 == null) {
            k(jVar, bVar);
            return;
        }
        jVar.a60(O(bVar));
        jVar.setEnabled(bVar.f117216l);
        SelectParameter.Displaying displaying = bVar.f117223s;
        jVar.k0(displaying != null ? displaying.getCustomPaddings() : null);
        if (displaying == null || (checkboxTitle = displaying.getCheckboxTitle()) == null) {
            checkboxTitle = bVar.f117208d;
        }
        jVar.setTitle(checkboxTitle);
        jVar.b3(displaying != null ? displaying.getTitleStyle() : null);
        TipIconParameters tipIconParameters = bVar.f117222r;
        if ((tipIconParameters != null ? tipIconParameters.getPosition() : null) == TipIconParameters.Position.INLINE) {
            jVar.qa(new f(this, bVar), tipIconParameters.getPosition());
        } else {
            jVar.qa(null, TipIconParameters.Position.TITLE);
        }
        Boolean bool = m12.f318654a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            ItemWithState.State state = bVar.f117219o;
            boolean z12 = (state instanceof ItemWithState.State.Error) || (state instanceof ItemWithState.State.Warning);
            ToggleState.ToggleValue toggleValue = zBooleanValue ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b;
            g gVar = new g(bVar, jVar, this);
            boolean z13 = bVar.f117216l;
            jVar.kt(new ToggleState(gVar, z13, z12, z13, toggleValue));
        }
    }

    public final void k(@Y61.k j jVar, @Y61.k ParameterElement.C.b bVar) {
        String checkboxTitle;
        jVar.a60(O(bVar));
        jVar.setEnabled(bVar.f117216l);
        SelectParameter.Displaying displaying = bVar.f117223s;
        jVar.k0(displaying != null ? displaying.getCustomPaddings() : null);
        if (displaying == null || (checkboxTitle = displaying.getCheckboxTitle()) == null) {
            checkboxTitle = bVar.f117208d;
        }
        jVar.setTitle(checkboxTitle);
        jVar.b3(displaying != null ? displaying.getTitleStyle() : null);
        TipIconParameters tipIconParameters = bVar.f117222r;
        if ((tipIconParameters != null ? tipIconParameters.getPosition() : null) == TipIconParameters.Position.INLINE) {
            jVar.qa(new d(this, bVar), tipIconParameters.getPosition());
        } else {
            jVar.qa(null, TipIconParameters.Position.TITLE);
        }
        ItemWithState.State state = bVar.f117219o;
        boolean z12 = (state instanceof ItemWithState.State.Error) || (state instanceof ItemWithState.State.Warning);
        ToggleState.ToggleValue toggleValue = L.f(C42745f0.G(bVar.f117236E), bVar.f117212h) ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b;
        e eVar = new e(bVar, jVar, this);
        boolean z13 = bVar.f117216l;
        jVar.kt(new ToggleState(eVar, z13, z12, z13, toggleValue));
    }

    @Override // com.avito.android.blueprint.checkbox.c
    @Y61.k
    /* renamed from: v, reason: from getter */
    public final C41981q0 getF105395e() {
        return this.f105395e;
    }
}
