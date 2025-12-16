package tL0;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.vas_performance.deeplink.AppliedServicesLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: AppliedServicesDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LtL0/a;", "LKu/a;", "Lcom/avito/android/vas_performance/deeplink/AppliedServicesLink;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48570a extends AbstractC14350a<AppliedServicesLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new AppliedServicesLink(i.o(uri, "itemId"));
    }
}
