package com.avito.android.verification.inn.list.input;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.links.w;
import com.avito.android.di.B;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputItemPresenter.kt */
@B
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/input/e;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/input/g;", "Lcom/avito/android/verification/inn/list/input/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f324050b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f324051c;

    @Inject
    public e(@k w wVar, @k com.avito.android.util.text.a aVar) {
        this.f324050b = wVar;
        this.f324051c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f324039i;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f324050b);
        }
        ComponentContainer componentContainer = gVar.f324055c;
        componentContainer.setTitle(aVar2.f324036f);
        componentContainer.setEnabled(aVar2.f324041k);
        FormatterType formatterType = aVar2.f324042l;
        Input input = gVar.f324054b;
        input.setFormatterType(formatterType);
        Input.t(input, "", false, 6);
        Input.t(input, aVar2.f324037g, false, 6);
        input.setHint(aVar2.f324038h);
        if (aVar2.f324035e) {
            Input.p(input, 0, 0, 3);
        } else {
            input.r();
        }
        AttributedText attributedText2 = aVar2.f324039i;
        if (attributedText2 != null) {
            ComponentContainer.l(gVar.f324055c, new int[]{input.getId()}, this.f324051c.c(gVar.itemView.getContext(), attributedText2), 4);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            componentContainer.k();
        }
        ((RecyclerView.n) gVar.itemView.getLayoutParams()).setMargins(0, y6.b(aVar2.f324043m), 0, y6.b(aVar2.f324044n));
        gVar.f324056d = new d(this, aVar2);
    }
}
