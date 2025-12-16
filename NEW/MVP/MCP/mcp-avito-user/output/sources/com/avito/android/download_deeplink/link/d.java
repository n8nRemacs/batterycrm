package com.avito.android.download_deeplink.link;

import Y61.k;
import Y61.l;
import android.app.DownloadManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DownloadFileLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/d;", "", "a", "b", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f144920c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DownloadManager f144921a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.cookie_provider.e f144922b;

    /* compiled from: DownloadFileLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/download_deeplink/link/d$a;", "", "<init>", "()V", "", "COOKIE_HEADER", "Ljava/lang/String;", "", "DOWNLOAD_CHECK_STATUS_SECONDS", "J", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DownloadFileLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/download_deeplink/link/d$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/download_deeplink/link/d$b$a;", "Lcom/avito/android/download_deeplink/link/d$b$b;", "Lcom/avito/android/download_deeplink/link/d$b$c;", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: DownloadFileLinkInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/download_deeplink/link/d$b$a;", "Lcom/avito/android/download_deeplink/link/d$b;", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f144923a;

            public a(int i12) {
                super(null);
                this.f144923a = i12;
            }
        }

        /* compiled from: DownloadFileLinkInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/d$b$b;", "Lcom/avito/android/download_deeplink/link/d$b;", "<init>", "()V", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.download_deeplink.link.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4218b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C4218b f144924a = new C4218b();

            public C4218b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4218b);
            }

            public final int hashCode() {
                return -244398873;
            }

            @k
            public final String toString() {
                return "InProgress";
            }
        }

        /* compiled from: DownloadFileLinkInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/d$b$c;", "Lcom/avito/android/download_deeplink/link/d$b;", "<init>", "()V", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f144925a = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2100712878;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k DownloadManager downloadManager, @Ix.d @k com.avito.android.cookie_provider.e eVar) {
        this.f144921a = downloadManager;
        this.f144922b = eVar;
    }
}
