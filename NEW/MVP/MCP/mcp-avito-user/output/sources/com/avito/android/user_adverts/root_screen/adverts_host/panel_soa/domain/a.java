package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrefSoaPopupSessionStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/f;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f313456a;

    /* compiled from: PrefSoaPopupSessionStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/domain/a$a;", "", "<init>", "()V", "", "KEY_WAS_SHOWN", "Ljava/lang/String;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.a$a, reason: collision with other inner class name */
    public static final class C9631a {
        public /* synthetic */ C9631a(C42822w c42822w) {
            this();
        }

        public C9631a() {
        }
    }

    static {
        new C9631a(null);
    }

    @Inject
    public a(@Y61.k AK0.l lVar) {
        this.f313456a = lVar;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.f
    public final boolean a() {
        return this.f313456a.getF316a().getBoolean("soa_statistics_popup_was_shown", false);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.f
    public final void b() {
        this.f313456a.getF316a().edit().putBoolean("soa_statistics_popup_was_shown", true).apply();
    }
}
