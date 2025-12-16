package com.avito.android.util;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.pm.ShortcutManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;

/* compiled from: ShortcutManagerFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/s5;", "Lcom/avito/android/util/r5;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.s5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35942s5 implements InterfaceC35884r5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f319052a;

    public C35942s5(@Y61.k Application application) {
        this.f319052a = application;
    }

    @Override // com.avito.android.util.InterfaceC35884r5
    @Y61.k
    @TargetApi(AvailableCode.ERROR_ON_ACTIVITY_RESULT)
    public final ShortcutManager a() {
        return (ShortcutManager) this.f319052a.getSystemService("shortcut");
    }
}
