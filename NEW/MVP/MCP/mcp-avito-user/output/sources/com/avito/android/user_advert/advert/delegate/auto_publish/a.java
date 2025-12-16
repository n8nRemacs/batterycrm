package com.avito.android.user_advert.advert.delegate.auto_publish;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoPublishBlockResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_publish/a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f308521a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f308522b;

    @Inject
    public a(@k Resources resources) {
        this.f308521a = resources.getString(R.string.autopublish_switcher_enable_error);
        this.f308522b = resources.getString(R.string.autopublish_switcher_disable_error);
    }
}
