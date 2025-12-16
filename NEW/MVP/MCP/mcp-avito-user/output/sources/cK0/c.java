package cK0;

import AK0.l;
import Y61.k;
import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SmbStatsTooltipSessionStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcK0/c;", "LcK0/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f57817a;

    @Inject
    public c(@NJ0.a @k l lVar) {
        this.f57817a = lVar;
    }

    @Override // cK0.b
    public final boolean a() {
        C27059a.f57813a.getClass();
        return this.f57817a.getBoolean(C27059a.f57816d, false);
    }

    @Override // cK0.b
    public final void b(long j12) {
        SharedPreferences.Editor editorEdit = this.f57817a.getF316a().edit();
        C27059a.f57813a.getClass();
        editorEdit.putLong(C27059a.f57814b, j12).putInt(C27059a.f57815c, c() + 1).apply();
    }

    @Override // cK0.b
    public final int c() {
        C27059a.f57813a.getClass();
        return this.f57817a.getInt(C27059a.f57815c, 0);
    }

    @Override // cK0.b
    public final long d() {
        C27059a.f57813a.getClass();
        return this.f57817a.getLong(C27059a.f57814b, 0L);
    }
}
