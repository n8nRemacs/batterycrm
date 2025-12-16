package com.avito.android.publish.pretend;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.publish.C0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PretendViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/pretend/i;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f238383a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f238384b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C0 f238385c;

    @Inject
    public i(@k InterfaceC35745a5 interfaceC35745a5, @k e eVar, @k C0 c02) {
        this.f238383a = interfaceC35745a5;
        this.f238384b = eVar;
        this.f238385c = c02;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(h.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return cls.cast(new h(this.f238383a, this.f238384b, this.f238385c));
    }
}
