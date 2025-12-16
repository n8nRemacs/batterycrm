package com.avito.android.publish.details.tags;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: PublishTagsViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/tags/f;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f235031a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f235032b;

    public f(@k a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f235031a = aVar;
        this.f235032b = interfaceC35745a5;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (cls.isAssignableFrom(e.class)) {
            return cls.cast(new e(this.f235031a, this.f235032b));
        }
        throw new IllegalArgumentException(cls.toString());
    }
}
