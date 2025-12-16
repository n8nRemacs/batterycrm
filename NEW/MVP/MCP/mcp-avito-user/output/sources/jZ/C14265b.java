package Jz;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.esia_sdk.ui.EsiaSdkActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EsiaSdkIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJz/b;", "LJz/a;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14265b implements InterfaceC14264a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f9202a;

    @Inject
    public C14265b(@k Context context) {
        this.f9202a = context;
    }

    @Override // Jz.InterfaceC14264a
    @k
    public final Intent a(@k String str, @l String str2, @l String str3) {
        return new Intent(this.f9202a, (Class<?>) EsiaSdkActivity.class).putExtra("EXTRA_AUTH_URL", str).putExtra("EXTRA_RESULT_DEEPLINK", str2).putExtra("RETRY_DEEPLINK_PARAM_NAME", str3);
    }
}
