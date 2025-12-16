package com.avito.android.navigation;

import Y61.k;
import Y61.l;
import android.app.Activity;
import com.avito.android.app.task.ActivityListenerTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.app.task.InterfaceC28580o;
import com.avito.android.bottom_navigation.A;
import com.avito.android.bottom_navigation.C;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import id.C41383a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavigationTabProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/navigation/b;", "Lcom/avito/android/navigation/a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C41383a f207187a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28580o f207188b;

    @Inject
    public b(@k C41383a c41383a, @k InterfaceC28580o interfaceC28580o) {
        this.f207187a = c41383a;
        this.f207188b = interfaceC28580o;
    }

    @Override // com.avito.android.navigation.a
    @l
    public final NavigationTabSetItem a() {
        A a12;
        this.f207188b.c(ActivityListenerTask.class, InterfaceC28559h.b.a.class);
        Activity activity = this.f207187a.get();
        if (activity == null || (a12 = C.a(activity)) == null) {
            return null;
        }
        return ((BottomNavigationFragment) a12).r5();
    }
}
