package eH0;

import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.K;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.MyAdvertPostAction;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeH0/d;", "LeH0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f395084a;

    @Inject
    public d(@Y61.k Context context) {
        this.f395084a = context;
    }

    @Override // eH0.c
    @Y61.k
    public final Intent a(@Y61.k String str) {
        return K.a(this.f395084a, str, null, false, MyAdvertPostAction.Allow.f308367b, null, null, false, 384);
    }

    @Override // eH0.c
    @Y61.k
    public final Intent b(@Y61.k String str, @Y61.k String str2) {
        return K.a(this.f395084a, str, null, false, new MyAdvertPostAction.Reserve(str2), null, null, false, 384);
    }

    @Override // eH0.c
    @Y61.k
    public final Intent c(@Y61.k String str) {
        return K.a(this.f395084a, str, null, false, MyAdvertPostAction.Restore.f308370b, null, null, false, 384);
    }

    @Override // eH0.c
    @Y61.k
    public final Intent d(@Y61.k String str, @Y61.k String str2) {
        return K.a(this.f395084a, str, null, false, MyAdvertPostAction.None.f308368b, null, str2, false, 320);
    }

    @Override // eH0.c
    @Y61.k
    public final Intent e(@Y61.k String str, @l String str2) {
        return K.a(this.f395084a, str, str2, false, MyAdvertPostAction.Activate.f308366b, null, null, false, 384);
    }

    @Override // eH0.c
    @Y61.k
    public final Intent f(@l DeepLink deepLink, @Y61.k String str, boolean z12, boolean z13) {
        return K.a(this.f395084a, str, null, z12, MyAdvertPostAction.None.f308368b, deepLink, null, z13, 128);
    }

    @Override // eH0.c
    @Y61.k
    public final Intent g(@Y61.k String str) {
        return new Intent(this.f395084a, (Class<?>) MyAdvertDetailsActivity.class).putExtra("key_draft_id", str);
    }
}
