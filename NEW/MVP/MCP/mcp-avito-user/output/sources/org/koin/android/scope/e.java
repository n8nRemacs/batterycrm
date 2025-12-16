package org.koin.android.scope;

import Y61.k;
import android.app.Service;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ScopeService.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/koin/android/scope/e;", "Landroid/app/Service;", "Lorg/koin/android/scope/a;", "<init>", "()V", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e extends Service implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f421400b = C42727D.c(new f(this));

    @Override // org.koin.android.scope.a
    @k
    public final org.koin.core.scope.a C0() {
        return (org.koin.core.scope.a) this.f421400b.getValue();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (C0() == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C0().a();
    }
}
