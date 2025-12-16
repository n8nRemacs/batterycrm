package com.avito.android.update.di;

import C11.b;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.update.mvi_screen.UpdateApplicationMviActivity;
import kotlin.Metadata;

/* compiled from: UpdateApplicationMviComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update/di/e;", "", "a", "b", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: UpdateApplicationMviComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/update/di/e$a;", "", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        e a(@h31.b @k C28478k c28478k);
    }

    /* compiled from: UpdateApplicationMviComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/update/di/e$b;", "Lcom/avito/android/di/h;", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        a Td();
    }

    void a(@k UpdateApplicationMviActivity updateApplicationMviActivity);
}
