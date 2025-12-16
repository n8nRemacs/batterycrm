package com.google.firebase.messaging;

import android.content.Intent;
import j.l0;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public class FirebaseMessagingService extends AbstractServiceC37614h {

    /* renamed from: h, reason: collision with root package name */
    public static final ArrayDeque f361769h = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.AbstractServiceC37614h
    public final Intent b(Intent intent) {
        return (Intent) D.a().f361740d.poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    @Override // com.google.firebase.messaging.AbstractServiceC37614h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Intent r12) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    @l0
    public void e() {
    }

    @l0
    public void d(@j.N RemoteMessage remoteMessage) {
    }
}
