package Mz;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.esia_webview.ui.EsiaWebViewActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EsiaWebViewIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMz/b;", "LMz/a;", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14546b implements InterfaceC14545a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f11151a;

    @Inject
    public C14546b(@k Context context) {
        this.f11151a = context;
    }

    @Override // Mz.InterfaceC14545a
    @k
    public final Intent a(@k String str, @l String str2, @l String str3, @l String str4) {
        return new Intent(this.f11151a, (Class<?>) EsiaWebViewActivity.class).putExtra("EXTRA_AUTH_URL", str).putExtra("EXTRA_TRIGGER", str2).putExtra("EXTRA_RESULT_DEEPLINK", str3).putExtra("RETRY_DEEPLINK_PARAM_NAME", str4);
    }
}
