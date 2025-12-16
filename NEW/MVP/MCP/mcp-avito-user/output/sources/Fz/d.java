package fZ;

import com.avito.android.date_time_formatter.o;
import com.avito.android.messenger.channels.mvi.list_feature.q1;
import com.avito.android.messenger.channels.mvi.list_feature.s1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelsSearchResultConverterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<C40379c> {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f395944a;

    /* renamed from: b, reason: collision with root package name */
    public final u f395945b;

    public d(s1 s1Var, u uVar) {
        this.f395944a = s1Var;
        this.f395945b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40379c((q1) this.f395944a.get(), (o) this.f395945b.get());
    }
}
