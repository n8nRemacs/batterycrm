package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.io.File;
import kotlin.Metadata;

/* compiled from: IacLogSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class M<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f167964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a f167965c;

    public M(T t12, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar) {
        this.f167964b = t12;
        this.f167965c = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f167964b.f167977e.a(this.f167965c, (File) obj);
    }
}
