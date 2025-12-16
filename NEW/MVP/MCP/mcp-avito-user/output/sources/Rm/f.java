package rM;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_util_deeplinks.public_module.control_flow.RunExecutableArgsLink;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: RunExecutableArgsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LrM/f;", "LKu/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/RunExecutableArgsLink;", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends AbstractC14350a<RunExecutableArgsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("keys");
        if (queryParameter == null) {
            queryParameter = "";
        }
        List listF0 = C43066x.f0(queryParameter, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(C43066x.A0((String) it.next()).toString());
        }
        C43059p c43059p = new C43059p("[a-zA-Z0-9]+");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.length() == 0 || C43066x.K(str)) {
                throw new UnsupportedOperationException("Empty key. All keys: " + arrayList);
            }
            if (!c43059p.e(str)) {
                throw new UnsupportedOperationException(C22491k0.a('\'', "Key has incorrect symbols: '", str));
            }
        }
        return new RunExecutableArgsLink(arrayList);
    }
}
