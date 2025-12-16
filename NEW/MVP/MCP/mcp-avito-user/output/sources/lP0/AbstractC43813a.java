package lp0;

import Ku.AbstractC14350a;
import Ku.i;
import Y61.k;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ScreenFlowLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp0/a;", "Lcom/avito/android/screen_flow/link/ScreenFlowLinkDeclaration;", "T", "LKu/a;", "<init>", "()V", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC43813a<T extends ScreenFlowLinkDeclaration> extends AbstractC14350a<T> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String str = (String) C42745f0.G(uri.getPathSegments());
        if (str != null) {
            C43066x.y0(str);
        }
        return s(xVar.b(i.p(uri, "screenToOpen")), xVar.b(i.p(uri, "innerLink")));
    }

    @k
    public abstract T s(@k DeepLink deepLink, @k DeepLink deepLink2);
}
