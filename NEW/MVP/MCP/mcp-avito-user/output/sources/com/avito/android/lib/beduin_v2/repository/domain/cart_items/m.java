package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CartStorageTask.kt */
@C11.a
@InterfaceC42189a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/m;", "Lcom/avito/android/service/short_task/ShortTask;", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_auth-plugin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements ShortTask {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f176564a;

    /* compiled from: CartStorageTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Lkotlin/G0;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f176565b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274030b;
        }
    }

    @Inject
    public m(@Y61.k h hVar) {
        this.f176564a = hVar;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        return new G(new VH0.c(this, 19)).r(a.f176565b);
    }
}
