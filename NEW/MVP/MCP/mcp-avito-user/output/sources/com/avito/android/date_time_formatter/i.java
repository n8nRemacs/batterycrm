package com.avito.android.date_time_formatter;

import com.avito.android.date_time_formatter.g;

/* compiled from: DateTimeFormatterResourceProviderImpl_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class i implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f132573a;

    public i(h hVar) {
        this.f132573a = hVar;
    }

    public static dagger.internal.l b(h hVar) {
        return dagger.internal.l.a(new i(hVar));
    }

    @Override // com.avito.android.date_time_formatter.g.a
    public final g a(int i12) {
        return new g(this.f132573a.f132572a.get(), i12);
    }
}
