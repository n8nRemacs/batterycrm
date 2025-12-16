package cJ0;

import AK0.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertsTooltipsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcJ0/i;", "LcJ0/h;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cJ0.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27055i implements InterfaceC27054h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f57812a;

    @Inject
    public C27055i(@Y61.k l lVar) {
        this.f57812a = lVar;
    }

    @Override // cJ0.InterfaceC27054h
    public final void a() {
        this.f57812a.e().edit().putBoolean("is_multi_item_group_tooltip_was_shown", true).apply();
    }

    @Override // cJ0.InterfaceC27054h
    public final void b() {
        this.f57812a.e().edit().putBoolean("is_multi_actions_user_advert_tooltip_was_shown", true).apply();
    }

    @Override // cJ0.InterfaceC27054h
    public final boolean c() {
        return this.f57812a.getBoolean("is_multi_item_group_tooltip_was_shown", false);
    }

    @Override // cJ0.InterfaceC27054h
    public final boolean d() {
        return this.f57812a.getBoolean("is_multi_actions_user_advert_tooltip_was_shown", false);
    }
}
