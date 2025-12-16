package com.avito.android.verification.links.download;

import kotlin.Metadata;
import l41.r;

/* compiled from: VerificationDownloadLinkInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "test", "(Ljava/lang/Long;)Z"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class h<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f324215b;

    public h(long j12) {
        this.f324215b = j12;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        Long l12 = (Long) obj;
        return l12 != null && l12.longValue() == this.f324215b;
    }
}
