package ru.ok.tamtam.android.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.me9;
import defpackage.o3;
import defpackage.y4e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/services/BootCompletedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BootCompletedReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            y4e y4eVarB = me9.b(context);
            y4eVarB.g().a().execute(new o3(21, y4eVarB));
        }
    }
}
