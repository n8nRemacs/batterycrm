package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.my.tracker.obfuscated.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37837k {

    /* renamed from: a, reason: collision with root package name */
    int f365683a = 1;

    /* renamed from: b, reason: collision with root package name */
    int f365684b = -1;

    public void a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.f365683a = 1;
            this.f365684b = -1;
            return;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        this.f365683a = intentRegisterReceiver.getIntExtra("status", 1);
        if (intExtra < 0 || intExtra2 <= 0) {
            this.f365684b = -1;
        } else {
            this.f365684b = (intExtra * 100) / intExtra2;
        }
    }

    public void a(a1 a1Var, Context context) {
        a1Var.f(this.f365683a);
        int i12 = this.f365684b;
        if (i12 >= 0) {
            a1Var.e(i12);
        }
    }

    public void b(Context context) {
    }
}
