package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemsConfigNpsStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/b;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ItemsConfigNpsStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/b$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.a f313259a;

        public a(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.a aVar) {
            this.f313259a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f313259a, ((a) obj).f313259a);
        }

        public final int hashCode() {
            return this.f313259a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ServicesSx(campaign=" + this.f313259a + ')';
        }
    }
}
