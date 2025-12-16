package com.avito.android.publish.params_suggest;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.publish.C0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ParamsSuggestionsViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/params_suggest/u;", "Lcom/avito/android/publish/params_suggest/t;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f238247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f238248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f238249c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f238250d;

    @Inject
    public u(@Y61.k h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C0 c02, @Y61.k a aVar) {
        this.f238247a = hVar;
        this.f238248b = interfaceC35745a5;
        this.f238249c = c02;
        this.f238250d = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(s.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        C0 c02 = this.f238249c;
        return cls.cast(new s(this.f238247a, this.f238248b, c02, this.f238250d));
    }
}
