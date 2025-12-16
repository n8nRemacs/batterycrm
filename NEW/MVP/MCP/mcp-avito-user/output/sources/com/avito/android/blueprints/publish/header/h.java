package com.avito.android.blueprints.publish.header;

import Jj.C14202a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/header/h;", "Lcom/avito/android/blueprints/publish/header/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C14202a f106213b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106214c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f106215d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106216e;

    @Inject
    public h(@Y61.k C14202a c14202a, @Y61.k com.avito.android.util.text.a aVar) {
        this.f106213b = c14202a;
        this.f106214c = aVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106215d = cVar;
        this.f106216e = new C41981q0(cVar);
    }

    @Override // com.avito.android.blueprints.publish.header.e
    @Y61.k
    public final z<DeepLink> B() {
        return this.f106216e;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        z<DeepLink> zVarLinkClicksV3;
        j jVar = (j) eVar;
        HeaderItem headerItem = (HeaderItem) aVar;
        AttributedText attributedText = headerItem.f106195c;
        jVar.vi(attributedText, headerItem.f106197e);
        AttributedText attributedText2 = headerItem.f106196d;
        jVar.k(attributedText2);
        jVar.qK(headerItem.f106198f);
        jVar.P8(headerItem.f106199g, headerItem.f106200h);
        jVar.V30(attributedText, this.f106214c);
        if (attributedText2 != null && (zVarLinkClicksV3 = attributedText2.linkClicksV3()) != null) {
            zVarLinkClicksV3.t0(new com.avito.android.api.a(13, new f(1, this.f106215d, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0)));
        }
        jVar.eF(headerItem);
        SectionSeparatorSlotConfig.Tooltip tooltip = headerItem.f106201i;
        if (tooltip != null) {
            String tag = tooltip.getTag();
            if (!this.f106213b.f9125a.c("header_tooltip_was_shown:" + tag)) {
                jVar.T6(tooltip.getBody(), new g(this, tooltip));
            }
        }
        if (headerItem.f106204l) {
            jVar.zD();
        }
    }
}
