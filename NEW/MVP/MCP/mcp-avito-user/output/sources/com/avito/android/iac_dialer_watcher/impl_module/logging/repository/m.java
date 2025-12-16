package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import com.avito.android.iac_dialer_watcher.impl_module.db.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/iac_dialer_watcher/impl_module/db/C;", "dbSessions", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final m<T, R> f167924b = new m<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List<C> list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C c12 : list) {
            arrayList.add(new w(c12.f167802a, c12.f167803b, c12.f167804c));
        }
        return arrayList;
    }
}
