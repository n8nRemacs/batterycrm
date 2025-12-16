package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class zzc extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37028k f358651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, C37028k c37028k) {
        super(handler);
        this.f358651b = c37028k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i12, Bundle bundle) {
        this.f358651b.d(null);
    }
}
