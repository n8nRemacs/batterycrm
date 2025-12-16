package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ek, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38785ek implements Ok {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final Bundle f380504a;

    public C38785ek(@j.N Context context) {
        this(context, new C38987mn());
    }

    @Override // com.yandex.metrica.impl.ob.Ok
    @j.P
    public Bundle a(@j.N Activity activity) {
        return this.f380504a;
    }

    @j.k0
    public C38785ek(@j.N Context context, @j.N C38987mn c38987mn) {
        ApplicationInfo applicationInfoA = c38987mn.a(context, context.getPackageName(), 128);
        if (applicationInfoA != null) {
            this.f380504a = applicationInfoA.metaData;
        } else {
            this.f380504a = null;
        }
    }
}
