package com.huawei.hms.support.api.push.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class HmsMsgService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f363643b = 0;

    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public HmsMsgService f363644a;

        /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r13) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.support.api.push.service.HmsMsgService.a.handleMessage(android.os.Message):void");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        HMSLog.i("HmsMsgService", "onBind");
        a aVar = new a();
        aVar.f363644a = this;
        return new Messenger(aVar).getBinder();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i12, int i13) {
        HMSLog.i("HmsMsgService", "Enter onStartCommand.");
        return 2;
    }
}
