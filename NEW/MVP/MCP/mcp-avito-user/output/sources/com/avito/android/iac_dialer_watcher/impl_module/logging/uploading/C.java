package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.io.File;
import kotlin.Metadata;

/* compiled from: IacLogFileWriter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f167952b;

    public C(D d12) {
        this.f167952b = d12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        this.f167952b.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.G(new VH0.c((File) obj, 18));
    }
}
