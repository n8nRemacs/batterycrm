package com.avito.android.serp.adapter.reformulations;

import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Reformulation;
import com.avito.android.remote.model.ReformulationsWidget;
import com.avito.android.serp.adapter.reformulations.ButtonStyle;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ReformulationsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/c;", "Lcom/avito/android/serp/adapter/reformulations/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f270629a;

    @Inject
    public c(@Y61.k J0 j02) {
        this.f270629a = j02;
    }

    @Override // com.avito.android.serp.adapter.reformulations.b
    @Y61.l
    public final ReformulationsItem a(@Y61.k ReformulationsWidget reformulationsWidget) {
        List<Reformulation> items;
        ButtonStyle buttonStyle;
        ButtonStyle buttonStyle2;
        DeepLink deeplink;
        String title = reformulationsWidget.getTitle();
        if (title == null || C43066x.K(title) || title.length() == 0 || (items = reformulationsWidget.getItems()) == null || items.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Reformulation> items2 = reformulationsWidget.getItems();
        if (items2 != null) {
            for (Reformulation reformulation : items2) {
                String title2 = reformulation.getTitle();
                ReformulationElement reformulationElement = (title2 == null || C43066x.K(title2) || title2.length() == 0 || (deeplink = reformulation.getDeeplink()) == null) ? null : new ReformulationElement(title2, deeplink);
                if (reformulationElement != null) {
                    arrayList.add(reformulationElement);
                }
            }
        }
        if (arrayList.size() < 3) {
            return null;
        }
        ButtonStyle.a aVar = ButtonStyle.f270617b;
        String style = reformulationsWidget.getStyle();
        aVar.getClass();
        if (L.f(style, AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
            buttonStyle2 = ButtonStyle.BLACK;
        } else {
            if (!L.f(style, "green")) {
                buttonStyle = null;
                return new ReformulationsItem(com.avito.android.bxcontent.mvi.entity.f.k(this.f270629a, new StringBuilder("reformulations")), title, arrayList, buttonStyle, false, 16, null);
            }
            buttonStyle2 = ButtonStyle.GREEN;
        }
        buttonStyle = buttonStyle2;
        return new ReformulationsItem(com.avito.android.bxcontent.mvi.entity.f.k(this.f270629a, new StringBuilder("reformulations")), title, arrayList, buttonStyle, false, 16, null);
    }
}
