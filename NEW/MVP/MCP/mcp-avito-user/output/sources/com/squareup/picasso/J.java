package com.squareup.picasso;

import android.os.Handler;
import android.os.Message;

/* compiled from: Utils.java */
/* loaded from: classes7.dex */
final class J extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
