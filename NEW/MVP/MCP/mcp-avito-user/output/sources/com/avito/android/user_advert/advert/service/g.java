package com.avito.android.user_advert.advert.service;

import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.user_advert.advert.service.UserAdvertServiceAction;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertServiceIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/service/g;", "Lcom/avito/android/user_advert/advert/service/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f310627a;

    @Inject
    public g(@Y61.k Context context) {
        this.f310627a = context.getApplicationContext();
    }

    @Override // com.avito.android.user_advert.advert.service.f
    @Y61.k
    public final Intent a(@Y61.k String str, boolean z12, int i12, @l String str2, @Y61.k String str3, @Y61.k Map<String, String> map) {
        return j.a(this.f310627a, new UserAdvertServiceAction.AutoPublish(z12), str, null, i12, str2, str3, map);
    }

    @Override // com.avito.android.user_advert.advert.service.f
    @Y61.k
    public final Intent b(int i12, @Y61.k String str, @l String str2, @l String str3, @Y61.k String str4, @Y61.k Map map) {
        return j.a(this.f310627a, UserAdvertServiceAction.Activate.f310619b, str, str2, i12, str3, str4, map);
    }

    @Override // com.avito.android.user_advert.advert.service.f
    @Y61.k
    public final Intent c(int i12, @Y61.k String str, @Y61.k String str2, @l String str3, @Y61.k String str4, @Y61.k Map map) {
        return j.a(this.f310627a, new UserAdvertServiceAction.Close(str2), str, null, i12, str3, str4, map);
    }
}
