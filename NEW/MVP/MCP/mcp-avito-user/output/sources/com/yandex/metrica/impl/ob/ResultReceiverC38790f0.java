package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

@SuppressLint({"ParcelCreator"})
/* renamed from: com.yandex.metrica.impl.ob.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ResultReceiverC38790f0 extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f380512b = 0;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a f380513a;

    /* renamed from: com.yandex.metrica.impl.ob.f0$a */
    public interface a {
        void a(int i12, @j.N Bundle bundle);
    }

    public ResultReceiverC38790f0(Handler handler, @j.N a aVar) {
        super(handler);
        this.f380513a = aVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i12, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(C38811fl.class.getClassLoader());
        this.f380513a.a(i12, bundle);
    }
}
