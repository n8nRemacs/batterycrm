package com.avito.android.blueprints.select;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.blueprints.select.k;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/select/i;", "Lcom/avito/android/blueprints/select/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106597b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f106598c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f106599d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C> f106600e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106601f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106602g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106603h;

    public i(@Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12) {
        this.f106597b = aVar;
        this.f106598c = interfaceC35807h4;
        this.f106599d = q12;
        com.jakewharton.rxrelay3.c<ParameterElement.C> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106600e = cVar;
        this.f106601f = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106602g = cVar2;
        this.f106603h = new C41981q0(cVar2);
    }

    @Override // com.avito.android.blueprints.select.c
    @Y61.k
    /* renamed from: J, reason: from getter */
    public final C41981q0 getF106603h() {
        return this.f106603h;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CharSequence charSequenceA;
        k kVar = (k) eVar;
        ParameterElement.C c12 = (ParameterElement.C) aVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zBooleanValue = this.f106599d.w().invoke().booleanValue();
        boolean z12 = c12.f117220p;
        String str = c12.f117208d;
        if (zBooleanValue) {
            charSequenceA = this.f106598c.a(str, z12, c12.f117227w);
        } else {
            if (z12) {
                str = "";
            }
            charSequenceA = str;
        }
        spannableStringBuilder.append(charSequenceA);
        if (c12.f117228x) {
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-54485), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        kVar.setTitle(spannableStringBuilder);
        AddressParameter.InputStyle inputStyle = c12.f117206C;
        if (inputStyle != null) {
            kVar.NL(inputStyle);
        }
        kVar.o(c12.f117218n);
        kVar.m(c12.f117210f);
        if (c12.f117222r != null) {
            kVar.i4(new d(this, c12));
        } else {
            kVar.i4(null);
        }
        SelectParameter.Displaying displaying = c12.f117223s;
        kVar.k0(displaying != null ? displaying.getCustomPaddings() : null);
        kVar.k(c12.f117209e);
        kVar.b3(displaying != null ? displaying.getTitleStyle() : null);
        ItemWithState.State state = c12.f117219o;
        boolean z13 = state instanceof ItemWithState.State.Normal;
        AttributedText attributedText = c12.f117211g;
        com.avito.android.util.text.a aVar2 = this.f106597b;
        AttributedText attributedText2 = c12.f117204A;
        DeepLink deepLink = c12.f117230z;
        if (z13) {
            if (deepLink == null) {
                CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
                if (charSequence != null) {
                    charSequenceB = charSequence;
                } else if (attributedText != null) {
                    charSequenceB = aVar2.b(attributedText);
                }
                kVar.u(charSequenceB);
            } else {
                kVar.k0(new CustomPaddings(0, null, 2, null));
                kVar.Fv(new CustomPaddings(8, null, 2, null));
                kVar.tW(attributedText2, new e(this, c12));
            }
        } else if (state instanceof ItemWithState.State.Warning) {
            if (deepLink == null) {
                k.a.a(kVar, ((ItemWithState.State.Warning) state).f173900b, null, 2);
            } else {
                kVar.cH(attributedText2, new f(this, c12));
            }
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            if (deepLink == null) {
                kVar.K1(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, attributedText != null ? aVar2.b(attributedText) : null);
            } else {
                kVar.k0(new CustomPaddings(0, null, 2, null));
                kVar.Fv(new CustomPaddings(8, null, 2, null));
                kVar.cH(attributedText2, new g(this, c12));
            }
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            k.a.a(kVar, null, attributedText != null ? aVar2.b(attributedText) : null, 1);
        }
        kVar.a(new h(this, c12));
        kVar.setEnabled(c12.f117216l);
        kVar.pb(c12.f117229y);
        kVar.Rg(c12.f117205B);
    }

    @Override // com.avito.android.blueprints.select.c
    @Y61.k
    public final z<ParameterElement.C> c() {
        return this.f106601f;
    }
}
