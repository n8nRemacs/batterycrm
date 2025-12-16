package com.avito.android.async_phone;

import com.avito.android.bxcontent.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AsyncPhonePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/z;", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<Throwable, io.reactivex.rxjava3.core.z<?>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f92126l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(1);
        this.f92126l = jVar;
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.z<?> invoke(Throwable th2) {
        Throwable th3 = th2;
        Y0 y02 = this.f92126l.f92216j;
        if (y02 != null) {
            return y02.k(th3);
        }
        return null;
    }
}
