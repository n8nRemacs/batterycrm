package com.avito.android.remote.parse.adapter.inline_filters;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.JsonParseException;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.m;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: InlineFilterShortcutValueDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterShortcutValueDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterShortcutValue;", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InlineFilterShortcutValueDeserializer implements h<InlineFilterValue.InlineFilterShortcutValue> {
    @Override // com.google.gson.h
    public final InlineFilterValue.InlineFilterShortcutValue deserialize(i iVar, Type type, g gVar) {
        if ((iVar instanceof m) && (iVar.j().f362195b instanceof String)) {
            return new InlineFilterValue.InlineFilterShortcutValue((DeepLink) gVar.b(iVar, DeepLink.class), null);
        }
        if (!(iVar instanceof k)) {
            throw new JsonParseException("Expected STRING or OBJECT for InlineFilterShortcutValue");
        }
        k kVarI = iVar.i();
        i iVarD = kVarI.D(Constants.DEEPLINK);
        DeepLink deepLink = iVarD != null ? (DeepLink) gVar.b(iVarD, DeepLink.class) : null;
        i iVarD2 = kVarI.D("image");
        return new InlineFilterValue.InlineFilterShortcutValue(deepLink, iVarD2 != null ? (UniversalImage) gVar.b(iVarD2, UniversalImage.class) : null);
    }
}
