package com.avito.android.select_field.di;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.select_field.SelectFieldFragment;
import com.avito.android.select_field.model.SelectFieldArguments;
import h31.d;
import h31.h;
import kotlin.Metadata;

/* compiled from: SelectFieldComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_field/di/b;", "", "a", "b", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SelectFieldComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/di/b$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @h
    public interface a {
    }

    /* compiled from: SelectFieldComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/di/b$b;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select_field.di.b$b, reason: collision with other inner class name */
    public interface InterfaceC7968b {
        @k
        b a(@h31.b @k SelectFieldArguments selectFieldArguments, @h31.b @k C28478k c28478k, @k InterfaceC29970g interfaceC29970g);
    }

    void a(@k SelectFieldFragment selectFieldFragment);
}
