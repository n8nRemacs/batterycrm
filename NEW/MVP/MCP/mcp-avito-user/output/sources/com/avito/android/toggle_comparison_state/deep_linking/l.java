package com.avito.android.toggle_comparison_state.deep_linking;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ToggleComparisonStateLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/l;", "LKu/a;", "Lcom/avito/android/toggle_comparison_state/deep_linking/ToggleComparisonStateLink;", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends AbstractC14350a<ToggleComparisonStateLink> {
    @Inject
    public l() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = Ku.i.n(uri, "categoryId");
        String strN2 = Ku.i.n(uri, "itemId");
        String strN3 = Ku.i.n(uri, "fromPage");
        String queryParameter = uri.getQueryParameter("context");
        String queryParameter2 = uri.getQueryParameter("isAdded");
        return new ToggleComparisonStateLink(strN, strN2, strN3, queryParameter, queryParameter2 != null ? C43066x.v0(queryParameter2) : null);
    }
}
