package com.yandex.div.core.downloader;

import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div.core.n0;
import com.yandex.div.core.view2.C38029k;
import kotlin.Metadata;

/* compiled from: DivDownloadActionHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/downloader/e;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f367428a = new e();

    @X41.n
    public static final boolean a(@Y61.l Uri uri, @Y61.k n0 n0Var) {
        String authority = uri == null ? null : uri.getAuthority();
        return authority != null && "download".equals(authority) && uri.getQueryParameter(ContextActionHandler.Link.URL) != null && (n0Var instanceof C38029k);
    }
}
