package com.avito.android.remote.parse.adapter;

import com.avito.android.C36135w2;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.vertical_main.DisplayConfig;
import com.avito.android.remote.model.vertical_main.FeaturedAction;
import com.avito.android.remote.model.vertical_main.FeaturedWidget;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: FeaturedWidgetDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/FeaturedWidgetDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/vertical_main/FeaturedWidget;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeaturedWidgetDeserializer implements com.google.gson.h<FeaturedWidget> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f254180a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedTextAdapter f254181b;

    public FeaturedWidgetDeserializer(@Y61.k C36135w2 c36135w2, @Y61.k AttributedTextAdapter attributedTextAdapter) {
        this.f254180a = c36135w2;
        this.f254181b = attributedTextAdapter;
    }

    public final FeaturedWidget a(com.google.gson.k kVar, com.google.gson.g gVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Boolean boolA;
        com.google.gson.i iVarD = kVar.D("title");
        String strE = iVarD != null ? C34328m0.e(iVarD) : null;
        com.google.gson.i iVarD2 = kVar.D("subtitle");
        String strE2 = iVarD2 != null ? C34328m0.e(iVarD2) : null;
        com.google.gson.i iVarD3 = kVar.D("displayType");
        String strE3 = iVarD3 != null ? C34328m0.e(iVarD3) : null;
        if (kotlin.jvm.internal.L.f(strE3 != null ? strE3.toLowerCase(Locale.ROOT) : null, "gridscrollable")) {
            C36135w2 c36135w2 = this.f254180a;
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[3];
            if (!((Boolean) c36135w2.f327484e.a().invoke()).booleanValue()) {
                strE3 = "grid";
            }
        }
        String str = strE3;
        com.google.gson.i iVarD4 = kVar.D("displayConfig");
        DisplayConfig displayConfig = (DisplayConfig) (iVarD4 == null ? null : gVar.b(iVarD4, DisplayConfig.class));
        com.google.gson.i iVarD5 = kVar.D("items");
        com.google.gson.f fVarH = iVarD5 != null ? iVarD5.h() : null;
        if (fVarH == null) {
            arrayList = null;
        } else {
            int size = fVarH.f362000b.size();
            arrayList = new ArrayList(size);
            int iC2 = 0;
            while (iC2 < size) {
                com.google.gson.i iVarW = fVarH.w(iC2);
                iC2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.c(gVar, iVarW != null ? iVarW.i() : null, SerpElement.class, arrayList, iC2, 1);
                arrayList = arrayList;
            }
        }
        List list = arrayList == null ? C42784z0.f406748b : arrayList;
        com.google.gson.i iVarD6 = kVar.D("action");
        FeaturedAction featuredAction = (FeaturedAction) (iVarD6 == null ? null : gVar.b(iVarD6, FeaturedAction.class));
        com.google.gson.i iVarD7 = kVar.D("type");
        String strE4 = iVarD7 != null ? C34328m0.e(iVarD7) : null;
        com.google.gson.i iVarD8 = kVar.D("isRichSmallGallerySize");
        boolean zBooleanValue = (iVarD8 == null || (boolA = C34328m0.a(iVarD8)) == null) ? false : boolA.booleanValue();
        com.google.gson.i iVarD9 = kVar.D("additionalTabs");
        com.google.gson.f fVarH2 = iVarD9 != null ? iVarD9.h() : null;
        if (fVarH2 != null) {
            arrayList2 = new ArrayList(C42745f0.q(fVarH2, 10));
            Iterator it = fVarH2.f362000b.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(((com.google.gson.i) it.next()).i(), gVar));
            }
        } else {
            arrayList2 = null;
        }
        List list2 = arrayList2 == null ? C42784z0.f406748b : arrayList2;
        com.google.gson.i iVarD10 = kVar.D("attributedSubtitle");
        return new FeaturedWidget(strE, strE2, iVarD10 != null ? this.f254181b.b(gVar, iVarD10) : null, str, list, featuredAction, strE4, zBooleanValue, list2, displayConfig, null, null, 3072, null);
    }

    @Override // com.google.gson.h
    public final FeaturedWidget deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return a(iVar.i(), gVar);
    }
}
