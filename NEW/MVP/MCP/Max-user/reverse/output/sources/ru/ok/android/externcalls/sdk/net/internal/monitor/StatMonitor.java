package ru.ok.android.externcalls.sdk.net.internal.monitor;

import defpackage.a7d;
import defpackage.fl1;
import defpackage.vqa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Lfl1;", "Lvqa;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "observeStat", "()Lvqa;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface StatMonitor extends fl1 {
    vqa observeStat();

    @Override // defpackage.fl1
    /* synthetic */ void onRtcStats(a7d a7dVar);
}
