package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import java.util.List;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: IacWatcherObserver.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00062\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0001 \u0004*\r\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0002\b\u00030\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "LBL/a$b;", "", "Lj41/e;", "kotlin.jvm.PlatformType", "bufferedState", "Lkotlin/Q;", "apply", "(Ljava/util/List;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final f<T, R> f168166b = new f<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        return new Q(list.get(0), list.get(1));
    }
}
