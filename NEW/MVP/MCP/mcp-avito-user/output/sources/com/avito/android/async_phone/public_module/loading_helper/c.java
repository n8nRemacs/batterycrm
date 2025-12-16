package com.avito.android.async_phone.public_module.loading_helper;

import Ba1.B;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;
import l41.o;

/* compiled from: AsyncPhoneRequestLoadingHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f92241b;

    public c(a aVar) {
        this.f92241b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C(new B(23, this.f92241b, (Throwable) obj));
    }
}
