package com.avito.android.blueprints.publish.multiselect;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.blueprints.select.k;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/multiselect/g;", "Lcom/avito/android/blueprints/publish/multiselect/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106352b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106353c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q1 f106354d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.v> f106355e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.v> f106356f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106357g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106358h;

    /* renamed from: i, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106359i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C41981q0 f106360j;

    @Inject
    public g(@k com.avito.android.util.text.a aVar, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106352b = aVar;
        this.f106353c = interfaceC35807h4;
        this.f106354d = q12;
        com.jakewharton.rxrelay3.c<ParameterElement.v> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106355e = cVar;
        com.jakewharton.rxrelay3.c<ParameterElement.v> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106356f = cVar2;
        this.f106357g = cVar;
        this.f106358h = cVar2;
        com.jakewharton.rxrelay3.c<DeepLink> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f106359i = cVar3;
        this.f106360j = new C41981q0(cVar3);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.c
    @k
    /* renamed from: I, reason: from getter */
    public final C41981q0 getF106360j() {
        return this.f106360j;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.blueprints.select.k kVar = (com.avito.android.blueprints.select.k) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        if (this.f106354d.w().invoke().booleanValue()) {
            kVar.setTitle(this.f106353c.a(vVar.f117543d, false, vVar.f117564y));
        } else {
            kVar.setTitle(vVar.f117543d);
        }
        kVar.o(vVar.f117554o);
        kVar.m(vVar.f117544e);
        String str = vVar.f117544e;
        kVar.p2(!(str == null || str.length() == 0));
        kVar.K(new d(this, vVar));
        if (vVar.f117560u != null) {
            kVar.i4(new e(this, vVar));
        } else {
            kVar.i4(null);
        }
        ItemWithState.State state = vVar.f117555p;
        boolean z12 = state instanceof ItemWithState.State.Normal;
        AttributedText attributedText = vVar.f117546g;
        com.avito.android.util.text.a aVar2 = this.f106352b;
        if (z12) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceB = charSequence;
            } else if (attributedText != null) {
                charSequenceB = aVar2.b(attributedText);
            }
            kVar.u(charSequenceB);
        } else if (state instanceof ItemWithState.State.Warning) {
            k.a.a(kVar, ((ItemWithState.State.Warning) state).f173900b, null, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            kVar.K1(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, attributedText != null ? aVar2.b(attributedText) : null);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            k.a.a(kVar, null, attributedText != null ? aVar2.b(attributedText) : null, 1);
        }
        kVar.a(new f(this, vVar));
        kVar.setEnabled(vVar.f117553n);
    }

    @Override // com.avito.android.blueprints.publish.multiselect.c
    @Y61.k
    public final z<ParameterElement.v> c() {
        return this.f106357g;
    }

    @Override // com.avito.android.blueprints.publish.multiselect.c
    @Y61.k
    public final z<ParameterElement.v> z() {
        return this.f106358h;
    }
}
