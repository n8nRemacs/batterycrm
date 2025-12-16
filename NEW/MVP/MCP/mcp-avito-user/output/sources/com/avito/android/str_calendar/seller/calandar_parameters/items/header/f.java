package com.avito.android.str_calendar.seller.calandar_parameters.items.header;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/header/f;", "LTV0/d;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/header/h;", "Lcom/avito/android/category_parameters/ParameterElement$n$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<h, ParameterElement.n.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287190b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287190b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        z<DeepLink> zVarLinkClicksV3;
        h hVar = (h) eVar;
        ParameterElement.n.b bVar = (ParameterElement.n.b) aVar;
        if (L.f(bVar.f117472f, Boolean.TRUE)) {
            hVar.Vi();
        } else {
            hVar.g20();
        }
        hVar.setText(bVar.f117470d);
        AttributedText attributedText = bVar.f117471e;
        if (attributedText != null && (zVarLinkClicksV3 = attributedText.linkClicksV3()) != null) {
            zVarLinkClicksV3.t0(new e(this));
        }
        hVar.g(attributedText);
    }
}
