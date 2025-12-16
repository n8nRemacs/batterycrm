package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmployeeModeStateHolder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateHolder", f = "EmployeeModeStateHolder.kt", i = {0, 0}, l = {120}, m = "awaitUpdateAndGet", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes13.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f147512q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f147513r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f147514s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f147515t;

    /* renamed from: u, reason: collision with root package name */
    public int f147516u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147515t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147514s = obj;
        this.f147516u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f147515t.b(this);
    }
}
