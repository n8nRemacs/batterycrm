package com.avito.android.blueprints.publish.select.inline;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/select/inline/f;", "Lcom/avito/android/blueprints/publish/select/inline/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106474b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f106475c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f106476d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Ij.b> f106477e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106478f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106479g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106480h;

    @Inject
    public f(@Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12) {
        this.f106474b = aVar;
        this.f106475c = interfaceC35807h4;
        this.f106476d = q12;
        com.jakewharton.rxrelay3.c<Ij.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106477e = cVar;
        this.f106478f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106479g = cVar2;
        this.f106480h = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String checkboxTitle;
        h hVar = (h) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        boolean zBooleanValue = this.f106476d.w().invoke().booleanValue();
        SelectParameter.Displaying displaying = bVar.f117223s;
        CharSequence charSequenceC = null;
        if (zBooleanValue) {
            hVar.Bi(this.f106475c.a(displaying != null ? displaying.getContainerTitle() : null, bVar.f117220p, bVar.f117227w));
        } else {
            hVar.Bi(displaying != null ? displaying.getContainerTitle() : null);
        }
        if (displaying == null || (checkboxTitle = displaying.getCheckboxTitle()) == null) {
            checkboxTitle = bVar.f117208d;
        }
        hVar.setTitle(checkboxTitle);
        hVar.b3(displaying != null ? displaying.getTitleStyle() : null);
        hVar.Z1(L.f(C42745f0.G(bVar.f117236E), bVar.f117212h));
        TipIconParameters tipIconParameters = bVar.f117222r;
        if (tipIconParameters != null) {
            hVar.qa(new d(this, bVar), tipIconParameters.getPosition());
        } else {
            hVar.qa(null, TipIconParameters.Position.TITLE);
        }
        hVar.t00(displaying != null ? displaying.getTopPadding() : null, displaying != null ? displaying.getBottomPadding() : null);
        hVar.NZ(new e(bVar, hVar, this));
        ItemWithState.State state = bVar.f117219o;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence == null) {
                AttributedText attributedText = bVar.f117211g;
                if (attributedText != null) {
                    charSequenceC = this.f106474b.c(hVar.getContext(), attributedText);
                }
            } else {
                charSequenceC = charSequence;
            }
            hVar.u(charSequenceC);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            hVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            hVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            hVar.H(null);
        }
    }

    @Override // com.avito.android.blueprints.publish.select.inline.c
    @Y61.k
    public final z<Ij.b> g() {
        return this.f106478f;
    }

    @Override // com.avito.android.blueprints.publish.select.inline.c
    @Y61.k
    /* renamed from: v, reason: from getter */
    public final C41981q0 getF106480h() {
        return this.f106480h;
    }
}
