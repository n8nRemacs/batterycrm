package ru.cyberity.cbr.core.presentation.base;

import Ba1.F;
import Y61.k;
import Y61.l;
import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import j.K;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: ActionLiveData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/ActionLiveData;", "T", "Landroidx/lifecycle/g0;", "<init>", "()V", "Landroidx/lifecycle/P;", SearchParamsConverterKt.OWNER, "Landroidx/lifecycle/h0;", "observer", "Lkotlin/G0;", "observe", "(Landroidx/lifecycle/P;Landroidx/lifecycle/h0;)V", "t", "setValue", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionLiveData<T> extends C23038g0<T> {

    @k
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observe$lambda-0, reason: not valid java name */
    public static final void m277observe$lambda0(ActionLiveData actionLiveData, InterfaceC23040h0 interfaceC23040h0, Object obj) {
        if (actionLiveData.mPending.compareAndSet(true, false)) {
            interfaceC23040h0.onChanged(obj);
        }
    }

    @Override // androidx.view.AbstractC22991Y
    public void observe(@k InterfaceC22983P owner, @k InterfaceC23040h0<? super T> observer) {
        super.observe(owner, new F(4, this, observer));
    }

    @Override // androidx.view.C23038g0, androidx.view.AbstractC22991Y
    @K
    public void setValue(@l T t12) {
        this.mPending.set(true);
        super.setValue(t12);
    }
}
