package com.avito.android.silent_update.download;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadWorkerMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/download/DownloadWorkerMode;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadWorkerMode {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DownloadWorkerMode[] f283627b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f283628c;

    static {
        DownloadWorkerMode[] downloadWorkerModeArr = {new DownloadWorkerMode("ONE_TIME", 0), new DownloadWorkerMode("PERIODIC", 1)};
        f283627b = downloadWorkerModeArr;
        f283628c = kotlin.enums.c.a(downloadWorkerModeArr);
    }

    public DownloadWorkerMode() {
        throw null;
    }

    public static DownloadWorkerMode valueOf(String str) {
        return (DownloadWorkerMode) Enum.valueOf(DownloadWorkerMode.class, str);
    }

    public static DownloadWorkerMode[] values() {
        return (DownloadWorkerMode[]) f283627b.clone();
    }
}
