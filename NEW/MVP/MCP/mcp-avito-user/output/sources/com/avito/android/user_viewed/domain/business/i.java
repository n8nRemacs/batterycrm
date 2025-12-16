package com.avito.android.user_viewed.domain.business;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserViewedLocalInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/domain/business/i;", "Lcom/avito/android/user_viewed/domain/business/h;", "a", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.persistance.b f318349a;

    /* compiled from: UserViewedLocalInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_viewed/domain/business/i$a;", "", "<init>", "()V", "", "VIEWED_ITEMS_LIMIT", "I", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k com.avito.android.advert.viewed.persistance.b bVar) {
        this.f318349a = bVar;
    }

    @Override // com.avito.android.user_viewed.domain.business.h
    @Y61.k
    public final InterfaceC43160i<List<com.avito.android.advert.viewed.persistance.a>> a() {
        return this.f318349a.d();
    }
}
