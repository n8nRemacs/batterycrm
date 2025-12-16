package com.avito.android.passport.passport_toast;

import Y41.l;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: PassportToastHandlerImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b extends N implements l<Map.Entry<String, List<WeakReference<Activity>>>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f211146l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Map.Entry<String, List<WeakReference<Activity>>> entry) {
        List<WeakReference<Activity>> value = entry.getValue();
        C42745f0.l0(a.f211145l, value);
        return Boolean.valueOf(value.isEmpty());
    }
}
