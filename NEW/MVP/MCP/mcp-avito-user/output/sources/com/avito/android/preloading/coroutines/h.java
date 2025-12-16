package com.avito.android.preloading.coroutines;

import com.avito.android.preloading.coroutines.AbstractC33302a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.N0;

/* compiled from: CoroutinesPreloadingPromise.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Params", "Response", "Lcom/avito/android/preloading/coroutines/a$b;", "invoke", "()Lcom/avito/android/preloading/coroutines/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.a<AbstractC33302a.b<Object, Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC33302a.b.C6712b<Object, Object> f221819l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N0 f221820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC33302a.b.C6712b<Object, Object> c6712b, N0 n02) {
        super(0);
        this.f221819l = c6712b;
        this.f221820m = n02;
    }

    @Override // Y41.a
    public final AbstractC33302a.b<Object, Object> invoke() {
        AbstractC33302a.b.C6712b<Object, Object> c6712b = this.f221819l;
        return new AbstractC33302a.b.C6712b(c6712b.f221806a, c6712b.f221807b, this.f221820m, true);
    }
}
