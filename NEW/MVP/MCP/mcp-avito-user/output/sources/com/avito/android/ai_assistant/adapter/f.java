package com.avito.android.ai_assistant.adapter;

import Tb.f;
import com.avito.android.ai_assistant.adapter.segment_buttons.a;
import com.avito.android.ai_assistant.adapter.simple_snippet.c;
import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItemMessageSegmentsItem;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.ai_assistant.model.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AssistantItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/f;", "Lcom/avito/android/ai_assistant/adapter/e;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* compiled from: AssistantItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88806a;

        static {
            int[] iArr = new int[OkRespDataSuccessElementsItemMessageSegmentsItem.BadgeStyle.EdgeType.values().length];
            try {
                iArr[OkRespDataSuccessElementsItemMessageSegmentsItem.BadgeStyle.EdgeType.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkRespDataSuccessElementsItemMessageSegmentsItem.BadgeStyle.EdgeType.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OkRespDataSuccessElementsItemMessageSegmentsItem.BadgeStyle.EdgeType.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OkRespDataSuccessElementsItemMessageSegmentsItem.BadgeStyle.EdgeType.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f88806a = iArr;
        }
    }

    @Inject
    public f() {
    }

    public static DockingBadgeEdgeType b(OkRespDataSuccessElementsItemMessageSegmentsItem.BadgeStyle.EdgeType edgeType) {
        int i12 = a.f88806a[edgeType.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? DockingBadgeEdgeType.Square : DockingBadgeEdgeType.AntiPyramid : DockingBadgeEdgeType.Pyramid : DockingBadgeEdgeType.Pipka : DockingBadgeEdgeType.Flag;
    }

    @Override // com.avito.android.ai_assistant.adapter.e
    @Y61.l
    public final com.avito.android.ai_assistant.adapter.a a(@Y61.k OkRespDataSuccessElementsItemMessageSegmentsItem okRespDataSuccessElementsItemMessageSegmentsItem, @Y61.k String str) {
        a.b c2620a;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        if (okRespDataSuccessElementsItemMessageSegmentsItem instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.i) {
            return new com.avito.android.ai_assistant.adapter.assistant_text_message.b("assistant_text_message_".concat(str), str, ((OkRespDataSuccessElementsItemMessageSegmentsItem.i) okRespDataSuccessElementsItemMessageSegmentsItem).getAttributedText());
        }
        if (okRespDataSuccessElementsItemMessageSegmentsItem instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.a) {
            OkRespDataSuccessElementsItemMessageSegmentsItem.a aVar = (OkRespDataSuccessElementsItemMessageSegmentsItem.a) okRespDataSuccessElementsItemMessageSegmentsItem;
            Iterator<T> it = aVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((OkRespDataSuccessElementsItemMessageSegmentsItem.e) next) instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.d) {
                    break;
                }
            }
            OkRespDataSuccessElementsItemMessageSegmentsItem.e.d dVar = next instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.d ? (OkRespDataSuccessElementsItemMessageSegmentsItem.e.d) next : null;
            Iterator<T> it2 = aVar.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((OkRespDataSuccessElementsItemMessageSegmentsItem.e) next2) instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.c) {
                    break;
                }
            }
            OkRespDataSuccessElementsItemMessageSegmentsItem.e.c cVar = next2 instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.c ? (OkRespDataSuccessElementsItemMessageSegmentsItem.e.c) next2 : null;
            Iterator<T> it3 = aVar.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (next3 instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.b) {
                    break;
                }
            }
            if (!(next3 instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.b)) {
                next3 = null;
            }
            OkRespDataSuccessElementsItemMessageSegmentsItem.e.b bVar = (OkRespDataSuccessElementsItemMessageSegmentsItem.e.b) next3;
            Iterator<T> it4 = aVar.a().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
                if (next4 instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.a) {
                    break;
                }
            }
            if (!(next4 instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.e.a)) {
                next4 = null;
            }
            OkRespDataSuccessElementsItemMessageSegmentsItem.e.a aVar2 = (OkRespDataSuccessElementsItemMessageSegmentsItem.e.a) next4;
            ReactionState reactionState = (dVar == null || !dVar.getIsSelected()) ? (cVar == null || !cVar.getIsSelected()) ? ReactionState.f89129b : ReactionState.f89131d : ReactionState.f89130c;
            ArrayList arrayList = new ArrayList();
            if (dVar != null) {
                arrayList.add(f.c.b.f15746a);
            }
            if (cVar != null) {
                arrayList.add(f.c.a.f15745a);
            }
            if (bVar != null) {
                arrayList.add(new f.b(bVar.f89127a));
            }
            if (aVar2 != null) {
                arrayList.add(new f.a(aVar2.f89126a));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            return new com.avito.android.ai_assistant.adapter.message_actions.a("assistant_message_actions_".concat(str), str, arrayList, reactionState);
        }
        if (okRespDataSuccessElementsItemMessageSegmentsItem instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.f) {
            OkRespDataSuccessElementsItemMessageSegmentsItem.f fVar = (OkRespDataSuccessElementsItemMessageSegmentsItem.f) okRespDataSuccessElementsItemMessageSegmentsItem;
            String strConcat = "assistant_segment_buttons_".concat(str);
            String style = fVar.getStyle();
            DeepLink onShowClickstreamDeeplink = fVar.getOnShowClickstreamDeeplink();
            List<Tb.h> listA = fVar.a();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
            for (Tb.h hVar : listA) {
                String str2 = hVar.f15749c;
                ArrayList<com.avito.android.ai_assistant.model.b> arrayList3 = hVar.f15747a;
                ArrayList arrayList4 = new ArrayList();
                for (com.avito.android.ai_assistant.model.b bVar2 : arrayList3) {
                    if (bVar2 instanceof b.a) {
                        c2620a = new a.b.C2621b(((b.a) bVar2).getMessage());
                    } else if (bVar2 instanceof b.c) {
                        c2620a = new a.b.C2620a(((b.c) bVar2).getDeeplink());
                    } else {
                        if (!(bVar2 instanceof b.C2643b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2620a = null;
                    }
                    if (c2620a != null) {
                        arrayList4.add(c2620a);
                    }
                }
                arrayList2.add(new a.C2619a(str2, hVar.f15748b, arrayList4));
            }
            return new com.avito.android.ai_assistant.adapter.segment_buttons.a(onShowClickstreamDeeplink, strConcat, str, style, arrayList2);
        }
        if (!(okRespDataSuccessElementsItemMessageSegmentsItem instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.j)) {
            if (!(okRespDataSuccessElementsItemMessageSegmentsItem instanceof OkRespDataSuccessElementsItemMessageSegmentsItem.d)) {
                return null;
            }
            return new com.avito.android.ai_assistant.adapter.beduin.a("assistant_beduin_" + str + '_' + UUID.randomUUID(), ((OkRespDataSuccessElementsItemMessageSegmentsItem.d) okRespDataSuccessElementsItemMessageSegmentsItem).f89125a.getJson());
        }
        StringBuilder sb2 = new StringBuilder("assistant_segment_snippet_");
        OkRespDataSuccessElementsItemMessageSegmentsItem.j jVar = (OkRespDataSuccessElementsItemMessageSegmentsItem.j) okRespDataSuccessElementsItemMessageSegmentsItem;
        sb2.append(jVar.getId());
        String string = sb2.toString();
        Image imageBySizes = jVar.getImageBySizes();
        UniversalImage universalImage = imageBySizes != null ? new UniversalImage(imageBySizes, null) : null;
        OkRespDataSuccessElementsItemMessageSegmentsItem.c badgeBar = jVar.getBadgeBar();
        List<OkRespDataSuccessElementsItemMessageSegmentsItem.b> listA2 = badgeBar != null ? badgeBar.a() : null;
        if (listA2 == null) {
            listA2 = C42784z0.f406748b;
        }
        List<OkRespDataSuccessElementsItemMessageSegmentsItem.b> list = listA2;
        ArrayList arrayList5 = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it5 = list.iterator();
        while (true) {
            String str3 = "";
            if (!it5.hasNext()) {
                break;
            }
            OkRespDataSuccessElementsItemMessageSegmentsItem.b bVar3 = (OkRespDataSuccessElementsItemMessageSegmentsItem.b) it5.next();
            String title = bVar3.getTitle();
            String valueName = bVar3.getStyle().getBackgroundColor().getValueName();
            if (valueName == null) {
                valueName = "";
            }
            Integer numA = com.avito.android.lib.util.e.a(valueName);
            String valueName2 = bVar3.getStyle().getFontColor().getValueName();
            if (valueName2 != null) {
                str3 = valueName2;
            }
            arrayList5.add(new c.a(title, numA, com.avito.android.lib.util.e.a(str3), b(bVar3.getStyle().getLeftEdgeStyle()), b(bVar3.getStyle().getRightEdgeStyle())));
        }
        String title2 = jVar.getTitle();
        AttributedText priceAttributed = jVar.getPriceAttributed();
        String oldPriceString = jVar.getOldPriceString();
        String str4 = oldPriceString == null ? "" : oldPriceString;
        DeepLink uriPath = jVar.getUriPath();
        Boolean isFavorite = jVar.getIsFavorite();
        boolean zBooleanValue = isFavorite != null ? isFavorite.booleanValue() : false;
        String discountString = jVar.getDiscountString();
        String str5 = discountString == null ? "" : discountString;
        AttributedText additionalInfo = jVar.getAdditionalInfo();
        if (additionalInfo == null) {
            additionalInfo = new AttributedText("", C42784z0.f406748b, 0, 4, null);
        }
        return new com.avito.android.ai_assistant.adapter.simple_snippet.c(string, universalImage, arrayList5, priceAttributed, str4, str5, title2, additionalInfo, zBooleanValue, uriPath, String.valueOf(jVar.getId()));
    }
}
