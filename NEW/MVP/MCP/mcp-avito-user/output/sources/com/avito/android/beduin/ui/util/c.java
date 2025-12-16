package com.avito.android.beduin.ui.util;

import Y41.l;
import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import kotlin.Metadata;

/* compiled from: LambdaViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/util/c;", "Landroidx/lifecycle/P0$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Class<? extends M0>, M0> f104578a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super Class<? extends M0>, ? extends M0> lVar) {
        this.f104578a = lVar;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        return (T) this.f104578a.invoke(cls);
    }
}
