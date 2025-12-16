package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SystemManager {

    /* renamed from: a, reason: collision with root package name */
    public static SystemManager f363237a = new SystemManager();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f363238b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static SystemNotifier f363239c = new a();

    public static SystemManager getInstance() {
        return f363237a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f363239c;
    }

    public void notifyNoticeResult(int i12) {
        f363239c.notifyNoticeObservers(i12);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f363239c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i12) {
        f363239c.notifyObservers(i12);
    }

    public static class a implements SystemNotifier {

        /* renamed from: a, reason: collision with root package name */
        public final List<SystemObserver> f363240a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i12) {
            synchronized (SystemManager.f363238b) {
                try {
                    Iterator<SystemObserver> it = this.f363240a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i12)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f363238b) {
                try {
                    Iterator<SystemObserver> it = this.f363240a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f363240a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f363238b) {
                this.f363240a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f363238b) {
                this.f363240a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i12) {
            synchronized (SystemManager.f363238b) {
                try {
                    Iterator<SystemObserver> it = this.f363240a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i12)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
