package com.avito.android.remote.parse;

import Y61.k;
import com.avito.android.remote.model.extended.TextWidget;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileAboutWidgetPopupTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/ExtendedProfileAboutWidgetPopupTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileAboutWidgetPopupTypeAdapter implements h<TextWidget.Config.AboutTabContent> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f254139a = P0.g(new Q("list", TextWidget.Config.AboutTabContent.ListTab.class), new Q("stories", TextWidget.Config.AboutTabContent.StoriesTab.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final TextWidget.Config.AboutTabContent deserialize(i iVar, Type type, g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f254139a.get(strS);
        if (cls == null) {
            return null;
        }
        return (TextWidget.Config.AboutTabContent) gVar.b(kVarI, cls);
    }
}
