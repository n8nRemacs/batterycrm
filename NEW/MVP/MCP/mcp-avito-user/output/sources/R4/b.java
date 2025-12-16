package R4;

import com.avito.android.date_time_formatter.r;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ChatHistoryModule_ProvideTimeFormatterFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<InterfaceC35945t1<Long>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f14100a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Locale> f14101b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f14102c;

    public b(a aVar, Provider<Locale> provider, Provider<com.avito.android.server_time.a> provider2) {
        this.f14100a = aVar;
        this.f14101b = provider;
        this.f14102c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = this.f14101b.get();
        com.avito.android.server_time.a aVar = this.f14102c.get();
        this.f14100a.getClass();
        return new r("HH:mm", locale, aVar);
    }
}
