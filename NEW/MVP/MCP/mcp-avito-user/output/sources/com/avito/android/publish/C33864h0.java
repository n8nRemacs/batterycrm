package com.avito.android.publish;

import com.avito.android.deeplink_handler.view.a;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: PublishDetailsDeeplinkViewLoadingRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/h0;", "Lcom/avito/android/deeplink_handler/view/a$g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.h0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33864h0 implements a.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, a.g> f236026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a.g f236027c;

    @Inject
    public C33864h0(@Y61.k Map<String, a.g> map, @Y61.k @Named("publish_default_renderer") a.g gVar) {
        this.f236026b = map;
        this.f236027c = gVar;
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        a.g gVar = this.f236026b.get(aVar != null ? aVar.f134521b : null);
        if (gVar != null) {
            gVar.g(aVar, z12);
        } else {
            this.f236027c.g(aVar, z12);
        }
    }
}
