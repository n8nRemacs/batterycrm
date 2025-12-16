package cJ0;

import AK0.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertsToastStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcJ0/e;", "LcJ0/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cJ0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27051e implements InterfaceC27050d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f57810a;

    @Inject
    public C27051e(@Y61.k l lVar) {
        this.f57810a = lVar;
    }

    @Override // cJ0.InterfaceC27050d
    public final void a() {
        this.f57810a.getF316a().edit().putBoolean("is_fill_parameters_toast_was_shown", true).apply();
    }

    @Override // cJ0.InterfaceC27050d
    public final boolean b() {
        return this.f57810a.getBoolean("is_fill_parameters_toast_was_shown", false);
    }
}
