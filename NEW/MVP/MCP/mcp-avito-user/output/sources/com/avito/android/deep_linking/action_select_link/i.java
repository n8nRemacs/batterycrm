package com.avito.android.deep_linking.action_select_link;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionSelectLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/action_select_link/i;", "LKu/a;", "Lcom/avito/android/deep_linking/action_select_link/ActionSelectLink;", "<init>", "()V", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends AbstractC14350a<ActionSelectLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        g gVar = new g(uri);
        try {
            Type type = new h().getType();
            String queryParameter = uri.getQueryParameter("content");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new ActionSelectLink((ActionSelectMenu) objE);
            }
            gVar.invoke(new IllegalArgumentException("Parameter content is null!"));
            throw null;
        } catch (JsonParseException e12) {
            gVar.invoke(e12);
            throw null;
        }
    }
}
