package com.avito.android.passport.passport_toast;

import Y41.l;
import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PassportToastHandlerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "ref", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class a extends N implements l<WeakReference<Activity>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final a f211145l = new a();

    public a() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(WeakReference<Activity> weakReference) {
        Activity activity = weakReference.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            activity = null;
        }
        return Boolean.valueOf(activity == null);
    }
}
