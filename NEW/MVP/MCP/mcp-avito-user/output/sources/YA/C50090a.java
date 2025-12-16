package yA;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import android.util.Base64;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.extended_profile_map.map.ExtendedProfileMapLink;
import com.avito.android.remote.model.ExtendedProfileGeo;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: ExtendedProfileMapLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LyA/a;", "LKu/a;", "Lcom/avito/android/extended_profile_map/map/ExtendedProfileMapLink;", "<init>", "()V", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50090a extends AbstractC14350a<ExtendedProfileMapLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new ExtendedProfileMapLink((ExtendedProfileGeo) gson.d(ExtendedProfileGeo.class, new String(Base64.decode(i.p(uri, "jsonData"), 8), C43047d.f410589b)), i.p(uri, "userKey"), i.p(uri, "fromPage"));
    }
}
