package Bm;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.car_navigator.link.CarNavigatorLink;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: CarNavigatorLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LBm/c;", "LKu/a;", "Lcom/avito/android/car_navigator/link/CarNavigatorLink;", "<init>", "()V", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends AbstractC14350a<CarNavigatorLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new CarNavigatorLink(i.n(uri, ContextActionHandler.Link.URL), new CarNavigatorSettings(Boolean.parseBoolean(uri.getQueryParameter("fullscreen")), Boolean.parseBoolean(uri.getQueryParameter("mavAuth")), Boolean.parseBoolean(uri.getQueryParameter("keep")), Boolean.parseBoolean(uri.getQueryParameter("needAuth"))));
    }
}
