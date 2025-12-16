package com.avito.android.remote.parse.adapter;

import com.avito.android.advert_details.model.images_with_links.ImagesWithLinksElement;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellersCarousel;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.remote.model.section.SectionTypeItem;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: RecommendationTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RecommendationTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecommendationTypeAdapter implements com.google.gson.h<SectionTypeElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254214a = P0.g(new kotlin.Q("section", SectionTypeItem.class), new kotlin.Q("recommended_sellers_carousel", RecommendedSellersCarousel.class), new kotlin.Q("images_with_links", ImagesWithLinksElement.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final SectionTypeElement deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        SectionTypeElement sectionTypeElement;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f254214a.get(strS);
        if (cls == null) {
            return null;
        }
        com.google.gson.i iVarD2 = kVarI.D("value");
        com.google.gson.k kVarI2 = iVarD2 != null ? iVarD2.i() : null;
        com.google.gson.i iVarD3 = kVarI.D("title");
        String strS2 = iVarD3 != null ? iVarD3.s() : null;
        if (kVarI2 != null) {
            sectionTypeElement = (SectionTypeElement) gVar.b(kVarI2, cls);
        } else {
            if (strS2 == null) {
                return null;
            }
            sectionTypeElement = (SectionTypeElement) gVar.b(kVarI, cls);
        }
        com.google.gson.i iVarD4 = kVarI.D("id");
        String strS3 = iVarD4 != null ? iVarD4.s() : null;
        com.google.gson.i iVarD5 = kVarI.D("iconUri");
        String strS4 = iVarD5 != null ? iVarD5.s() : null;
        if (strS3 == null) {
            return null;
        }
        if (sectionTypeElement != null) {
            sectionTypeElement.setId(strS3);
        }
        if (strS4 != null && sectionTypeElement != null) {
            sectionTypeElement.setIconUri(strS4);
        }
        return sectionTypeElement;
    }
}
