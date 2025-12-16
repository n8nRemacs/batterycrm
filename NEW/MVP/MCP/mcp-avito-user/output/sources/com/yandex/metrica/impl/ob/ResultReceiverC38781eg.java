package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.adjust.sdk.Constants;

/* renamed from: com.yandex.metrica.impl.ob.eg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ResultReceiverC38781eg extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f380489b = 0;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38731cg f380490a;

    public ResultReceiverC38781eg(@j.N Handler handler, @j.N InterfaceC38731cg interfaceC38731cg) {
        super(handler);
        this.f380490a = interfaceC38731cg;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i12, Bundle bundle) {
        C38756dg c38756dgA;
        if (i12 == 1) {
            try {
                c38756dgA = C38756dg.a(bundle.getByteArray(Constants.REFERRER));
            } catch (Throwable unused) {
                c38756dgA = null;
            }
            this.f380490a.a(c38756dgA);
        }
    }
}
