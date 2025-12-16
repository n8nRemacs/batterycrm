package Ic;

import Y61.k;
import android.app.Application;
import android.net.Uri;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustDeeplink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdjustReattributionInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIc/b;", "LIc/a;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC14058a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f8213a;

    @Inject
    public b(@k Application application) {
        this.f8213a = application;
    }

    @Override // Ic.InterfaceC14058a
    public final void a(@k Uri uri) {
        Adjust.processDeeplink(new AdjustDeeplink(uri), this.f8213a);
    }
}
