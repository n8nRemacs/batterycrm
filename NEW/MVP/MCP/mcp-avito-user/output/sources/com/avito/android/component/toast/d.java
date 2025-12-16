package com.avito.android.component.toast;

import Y41.l;
import arrow.core.AbstractC23662a;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "throwable", "Larrow/core/a;", "Lcom/avito/android/remote/error/ApiError;", "invoke", "(Ljava/lang/Throwable;)Larrow/core/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements l<Throwable, AbstractC23662a<? extends Throwable, ? extends ApiError>> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f125251l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final AbstractC23662a<? extends Throwable, ? extends ApiError> invoke(Throwable th2) {
        return new AbstractC23662a.b(th2);
    }
}
