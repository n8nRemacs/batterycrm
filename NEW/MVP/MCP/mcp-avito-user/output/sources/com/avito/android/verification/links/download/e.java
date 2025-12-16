package com.avito.android.verification.links.download;

import Y61.k;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import yM0.K;

/* compiled from: VerificationDownloadLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/download/e;", "Landroid/content/BroadcastReceiver;", "a", "b", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f324207d = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.cookie_provider.e f324208a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DownloadManager f324209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<Long> f324210c = new com.jakewharton.rxrelay3.b<>();

    /* compiled from: VerificationDownloadLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/verification/links/download/e$a;", "", "<init>", "()V", "", "COOKIE_HEADER", "Ljava/lang/String;", "", "DOWNLOAD_CHECK_TIMEOUT_SECONDS", "J", "DOWNLOAD_TIMEOUT_SECONDS", "MIME_PDF", "PDF_EXT", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationDownloadLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/download/e$b;", "", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Throwable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f324211b = new b();

        public b() {
            super("DownloadManager.STATUS_FAILED");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k DownloadManager downloadManager, @K @k com.avito.android.cookie_provider.e eVar) {
        this.f324208a = eVar;
        this.f324209b = downloadManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@k Context context, @k Intent intent) {
        this.f324210c.accept(Long.valueOf(intent.getLongExtra("extra_download_id", -1L)));
    }
}
