package com.avito.android.deep_linking;

import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeepLinkingIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/A;", "Lcom/avito/android/deep_linking/z;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f132800a;

    @Inject
    public A(@Y61.k Context context) {
        this.f132800a = context;
    }

    @Override // com.avito.android.deep_linking.z
    @Y61.k
    public final Intent a(@Y61.k DeepLink deepLink) {
        return new Intent(this.f132800a, (Class<?>) AppShortcutsDeepLinkActivity.class).setAction("android.intent.action.VIEW").setData(deepLink.getUri());
    }
}
