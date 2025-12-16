package com.avito.android.util;

import android.app.Activity;
import com.avito.android.util.InterfaceC35874q1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForegroundStatusCallbacks.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/r1;", "Lid/i;", "Lcom/avito/android/util/q1;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.r1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35880r1 extends id.i implements InterfaceC35874q1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC35874q1.a f318984b;

    /* renamed from: c, reason: collision with root package name */
    public int f318985c;

    public C35880r1() {
        this(null, 1, null);
    }

    @Override // com.avito.android.util.InterfaceC35874q1
    public final void a(@Y61.l InterfaceC35874q1.a aVar) {
        this.f318984b = aVar;
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@Y61.k Activity activity) {
        InterfaceC35874q1.a aVar;
        if (this.f318985c == 0 && (aVar = this.f318984b) != null) {
            aVar.a();
        }
        this.f318985c++;
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@Y61.k Activity activity) {
        InterfaceC35874q1.a aVar;
        int i12 = this.f318985c - 1;
        this.f318985c = i12;
        if (i12 != 0 || (aVar = this.f318984b) == null) {
            return;
        }
        aVar.c();
    }

    public C35880r1(InterfaceC35874q1.a aVar, int i12, C42822w c42822w) {
        this.f318984b = (i12 & 1) != 0 ? null : aVar;
    }
}
