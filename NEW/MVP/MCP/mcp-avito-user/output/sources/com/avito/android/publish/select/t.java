package com.avito.android.publish.select;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/select/t;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f242712a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f242713b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33878l f242714c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f242715d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f242716e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h f242717f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C0 f242718g;

    @Inject
    public t(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33878l interfaceC33878l, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.details.a aVar2, @Y61.k h hVar, @Y61.k C0 c02) {
        this.f242712a = interfaceC35745a5;
        this.f242713b = interfaceC33535v;
        this.f242714c = interfaceC33878l;
        this.f242715d = aVar;
        this.f242716e = aVar2;
        this.f242717f = hVar;
        this.f242718g = c02;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(SelectViewModel.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return cls.cast(new SelectViewModel(this.f242712a, this.f242713b, this.f242714c, this.f242715d, this.f242716e, this.f242717f, this.f242718g));
    }
}
