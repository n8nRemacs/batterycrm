package Nm0;

import Jm0.AbstractC14219a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.reputation.links.GrayStateLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: GrayStateLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LNm0/c;", "LJm0/a;", "Lcom/avito/android/reputation/links/GrayStateLink;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nm0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14591c extends AbstractC14219a<GrayStateLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new GrayStateLink(uri.getQueryParameter(SearchParamsConverterKt.SOURCE));
    }
}
