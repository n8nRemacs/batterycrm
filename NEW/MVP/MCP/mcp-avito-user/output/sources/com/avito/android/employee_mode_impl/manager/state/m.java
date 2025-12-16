package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmployeeModeStateHolder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateHolder", f = "EmployeeModeStateHolder.kt", i = {0, 0, 0, 1}, l = {120, 41}, m = "queueUpdateAndGet", n = {"this", "update", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes13.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f147517q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.p f147518r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f147519s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f147520t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f147521u;

    /* renamed from: v, reason: collision with root package name */
    public int f147522v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147521u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147520t = obj;
        this.f147522v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f147521u.c(null, this);
    }
}
