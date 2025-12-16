package com.avito.android.silent_update.download;

import AK0.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UpdateDownloaderStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/download/i;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f283664a;

    @Inject
    public i(@Y61.k l lVar) {
        this.f283664a = lVar;
    }

    public static String a(long j12) {
        return j12 + "silent_update.download_config_id";
    }

    public static String b(long j12) {
        return j12 + "silent_update.download_source_screen";
    }
}
