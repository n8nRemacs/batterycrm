package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ck, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38735ck implements Ok {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38987mn f380349a;

    public C38735ck() {
        this(new C38987mn());
    }

    @Override // com.yandex.metrica.impl.ob.Ok
    @j.P
    public Bundle a(@j.N Activity activity) {
        ActivityInfo activityInfo;
        C38987mn c38987mn = this.f380349a;
        ComponentName componentName = activity.getComponentName();
        c38987mn.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    @j.k0
    public C38735ck(@j.N C38987mn c38987mn) {
        this.f380349a = c38987mn;
    }
}
