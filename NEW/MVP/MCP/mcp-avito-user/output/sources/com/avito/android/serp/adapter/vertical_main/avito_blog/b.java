package com.avito.android.serp.adapter.vertical_main.avito_blog;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvitoBlogAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/b;", "Lcom/avito/android/serp/adapter/vertical_main/avito_blog/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f272591a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f272591a = interfaceC28373a;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.avito_blog.a
    public final void a(@Y61.k String str) {
        this.f272591a.c(new d(str));
    }
}
