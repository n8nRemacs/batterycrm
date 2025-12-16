package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.C37028k;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC37613g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC37614h f361857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f361858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f361859d;

    public /* synthetic */ RunnableC37613g(AbstractServiceC37614h abstractServiceC37614h, Intent intent, C37028k c37028k) {
        this.f361857b = abstractServiceC37614h;
        this.f361858c = intent;
        this.f361859d = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = this.f361858c;
        C37028k c37028k = this.f361859d;
        int i12 = AbstractServiceC37614h.f361860g;
        AbstractServiceC37614h abstractServiceC37614h = this.f361857b;
        abstractServiceC37614h.getClass();
        try {
            abstractServiceC37614h.c(intent);
        } finally {
            c37028k.b(null);
        }
    }
}
