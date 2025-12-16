package com.huawei.hms.api;

import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class FailedBinderCallBack {
    public static final String CALLER_ID = "callId";

    /* renamed from: a, reason: collision with root package name */
    private static FailedBinderCallBack f363264a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Long, BinderCallBack> f363265b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f363266c = new Object();

    public interface BinderCallBack {
        void binderCallBack(int i12);
    }

    private FailedBinderCallBack() {
    }

    private void a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10000;
        for (Long l12 : f363265b.keySet()) {
            if (time >= l12.longValue()) {
                f363265b.remove(l12);
            }
        }
    }

    public static FailedBinderCallBack getInstance() {
        synchronized (f363266c) {
            try {
                if (f363264a == null) {
                    f363264a = new FailedBinderCallBack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f363264a;
    }

    public BinderCallBack getCallBack(Long l12) {
        Map<Long, BinderCallBack> map = f363265b;
        if (map != null) {
            return map.remove(l12);
        }
        HMSLog.e("FailedBinderCallBack", "binderCallBackMap is null");
        return null;
    }

    public void setCallBack(Long l12, BinderCallBack binderCallBack) {
        a(l12, binderCallBack);
    }

    private void a(Long l12, BinderCallBack binderCallBack) {
        if (f363265b == null) {
            HMSLog.e("FailedBinderCallBack", "binderCallBackMap is null");
        } else {
            a();
            f363265b.put(l12, binderCallBack);
        }
    }
}
