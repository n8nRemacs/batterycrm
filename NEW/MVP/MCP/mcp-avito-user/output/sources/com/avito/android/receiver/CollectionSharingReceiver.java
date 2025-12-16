package com.avito.android.receiver;

import M7.a;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.AbstractApplicationC27634a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollectionSharingReceiver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/receiver/CollectionSharingReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CollectionSharingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        String packageName;
        ComponentName componentName = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        AbstractApplicationC27634a abstractApplicationC27634a = applicationContext instanceof AbstractApplicationC27634a ? (AbstractApplicationC27634a) applicationContext : null;
        a aVarZ5 = abstractApplicationC27634a != null ? abstractApplicationC27634a.r0().z5() : null;
        if (intent != null) {
            componentName = (ComponentName) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT"));
        }
        if (componentName == null || (packageName = componentName.getPackageName()) == null || aVarZ5 == null) {
            return;
        }
        aVarZ5.a(packageName);
    }
}
