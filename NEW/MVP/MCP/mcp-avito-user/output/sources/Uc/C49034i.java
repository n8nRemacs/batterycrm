package uc;

import Y61.k;
import android.content.Intent;
import android.net.Uri;
import com.my.tracker.MyTracker;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MyTrackerReattributionInteractorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luc/i;", "Luc/h;", "<init>", "()V", "_common_analytics-mytracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uc.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49034i implements InterfaceC49033h {
    @Override // uc.InterfaceC49033h
    public final void a(@k Uri uri) {
        String fragment = uri.getFragment();
        if (fragment == null || !C43066x.q(fragment, "mt_deeplink", false)) {
            return;
        }
        MyTracker.handleDeeplink(new Intent("android.intent.action.VIEW", uri));
    }
}
