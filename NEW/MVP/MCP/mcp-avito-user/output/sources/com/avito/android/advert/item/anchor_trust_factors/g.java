package com.avito.android.advert.item.anchor_trust_factors;

import VU.b;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.anchor_trust_factors.f;
import com.avito.android.advert.item.anchor_trust_factors.layout.AnchorsExpandContainer;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import p4.C46889a;
import q4.C47196a;

/* compiled from: AdvertDetailsAnchorTrustFactorsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/anchor_trust_factors/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AnchorsExpandContainer f72824b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f72825c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public AnchorTrustFactors f72826d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public N f72827e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public f.b f72828f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public f.c f72829g;

    /* compiled from: AdvertDetailsAnchorTrustFactorsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<AnchorTrustFactors.Item, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f72830l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(AnchorTrustFactors.Item item) {
            return G0.f406611a;
        }
    }

    public g(@Y61.k AnchorsExpandContainer anchorsExpandContainer, @Y61.k com.avito.android.util.text.a aVar) {
        super(anchorsExpandContainer);
        this.f72824b = anchorsExpandContainer;
        this.f72825c = aVar;
        this.f72827e = a.f72830l;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.f
    public final void G30(@Y61.l f.c cVar) {
        this.f72829g = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.advert.item.anchor_trust_factors.f
    public final void hI(@Y61.k AnchorTrustFactors anchorTrustFactors, @Y61.l Integer num) {
        AnchorsExpandContainer anchorsExpandContainer;
        com.avito.android.util.text.a aVar;
        UU.a aVar2;
        AnchorTrustFactors.Item expandItem;
        if (anchorTrustFactors.equals(this.f72826d) && L.f(num, null)) {
            return;
        }
        this.f72826d = anchorTrustFactors;
        ?? r32 = this.f72827e;
        f.b bVar = this.f72828f;
        f.c cVar = this.f72829g;
        List<AnchorTrustFactors.Item> items = anchorTrustFactors.getItems();
        if (items == null) {
            items = C42784z0.f406748b;
        }
        List<AnchorTrustFactors.Item> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            anchorsExpandContainer = this.f72824b;
            aVar = this.f72825c;
            CharSequence charSequence = "";
            if (!zHasNext) {
                break;
            }
            AnchorTrustFactors.Item item = (AnchorTrustFactors.Item) it.next();
            CharSequence charSequenceC = aVar.c(anchorsExpandContainer.getContext(), item.getTitle());
            if (charSequenceC != null) {
                charSequence = charSequenceC;
            }
            arrayList.add(new UU.a(charSequence, null, false, false, false, new h(r32, item), null, null, null, false, 990, null));
        }
        AnchorTrustFactors.ExpandConfig expandConfig = anchorTrustFactors.getExpandConfig();
        if (expandConfig == null || (expandItem = expandConfig.getExpandItem()) == null) {
            aVar2 = null;
        } else {
            Context context = anchorsExpandContainer.getContext();
            AttributedText title = expandItem.getTitle();
            String string = (num == null || num.intValue() <= 0) ? "" : num.toString();
            List<Attribute> attributes = title.getAttributes();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(attributes, 10));
            for (Attribute attributeCopy$default : attributes) {
                if (attributeCopy$default instanceof FontAttribute) {
                    attributeCopy$default = FontAttribute.copy$default((FontAttribute) attributeCopy$default, null, C43066x.A0(C43066x.a0(attributeCopy$default.getTitle(), "{{count}}", string, false)).toString(), null, 5, null);
                }
                arrayList2.add(attributeCopy$default);
            }
            CharSequence charSequenceC2 = aVar.c(context, AttributedText.copy$default(title, null, arrayList2, 0, 5, null));
            aVar2 = new UU.a(charSequenceC2 == null ? "" : charSequenceC2, null, false, false, false, new i(bVar, expandItem), null, null, null, false, 990, null);
        }
        j jVar = cVar != null ? new j(cVar) : null;
        AnchorTrustFactors.ExpandConfig expandConfig2 = anchorTrustFactors.getExpandConfig();
        anchorsExpandContainer.setState(new C46889a(arrayList, aVar2, expandConfig2 != null ? expandConfig2.getMaxLines() : Integer.MAX_VALUE, jVar));
        AnchorTrustFactors.Style style = anchorTrustFactors.getStyle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(anchorsExpandContainer.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, style.getTheme()));
        b.a aVar3 = VU.b.f17147t;
        String normalButtonStyle = style.getNormalButtonStyle();
        aVar3.getClass();
        VU.b bVarB = b.a.b(contextThemeWrapper, normalButtonStyle);
        AnchorTrustFactors.Style style2 = anchorTrustFactors.getStyle();
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(anchorsExpandContainer.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, style2.getTheme()));
        String normalButtonStyle2 = style2.getNormalButtonStyle();
        aVar3.getClass();
        anchorsExpandContainer.setStyle(new C47196a(bVarB, b.a.b(contextThemeWrapper2, normalButtonStyle2), y6.b(6), y6.b(6)));
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.f
    public final void mj(@Y61.l f.b bVar) {
        this.f72828f = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.anchor_trust_factors.f
    public final void q6(@Y61.k Y41.l<? super AnchorTrustFactors.Item, G0> lVar) {
        this.f72827e = (N) lVar;
    }
}
