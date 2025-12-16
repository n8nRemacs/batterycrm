package com.avito.android.help_center;

import android.net.Uri;
import com.avito.android.help_center.E;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterUrlInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/F;", "Lcom/avito/android/help_center/E;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f161604a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public E.a f161605b;

    @Inject
    public F(@Y61.k H h12) {
        this.f161604a = h12;
    }

    @Override // com.avito.android.help_center.E
    public final void a(@Y61.k E.a aVar) {
        this.f161605b = aVar;
    }

    @Override // com.yatatsu.powerwebview.d
    public final boolean b(boolean z12, @Y61.k Uri uri) {
        String host = uri.getHost();
        Uri url = this.f161604a.getUrl();
        if (kotlin.jvm.internal.L.f(host, url != null ? url.getHost() : null)) {
            return false;
        }
        E.a aVar = this.f161605b;
        if (aVar != null) {
            aVar.d(uri);
        }
        return true;
    }
}
