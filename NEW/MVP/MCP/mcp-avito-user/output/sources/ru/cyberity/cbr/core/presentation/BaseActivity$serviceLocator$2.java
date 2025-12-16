package ru.cyberity.cbr.core.presentation;

import Y41.a;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.b;

/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Lru/cyberity/cbr/core/b;", "invoke", "()Lru/cyberity/cbr/core/b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class BaseActivity$serviceLocator$2 extends N implements a<b> {
    final /* synthetic */ BaseActivity<S, VM> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivity$serviceLocator$2(BaseActivity<S, VM> baseActivity) {
        super(0);
        this.this$0 = baseActivity;
    }

    @Override // Y41.a
    @k
    public final b invoke() {
        return b.INSTANCE.a(this.this$0.getApplicationContext(), this.this$0.getSession());
    }
}
