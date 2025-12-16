package iq;

import Xp.InterfaceC17035a;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.submitting.ComfortableDealSubmittingActivity;
import com.avito.android.deep_linking.links.DeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoDealIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq/b;", "LXp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42089b implements InterfaceC17035a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f405248a;

    @Inject
    public C42089b(@k Context context) {
        this.f405248a = context;
    }

    @Override // Xp.InterfaceC17035a
    @k
    public final Intent a(@k DeepLink deepLink) {
        ComfortableDealSubmittingActivity.f122992n.getClass();
        Intent intent = new Intent(this.f405248a, (Class<?>) ComfortableDealSubmittingActivity.class);
        intent.putExtra("linkBody", deepLink);
        return intent;
    }
}
