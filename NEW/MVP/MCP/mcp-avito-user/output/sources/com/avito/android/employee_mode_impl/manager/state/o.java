package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmployeeModeStateHolder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateHolder", f = "EmployeeModeStateHolder.kt", i = {0}, l = {59}, m = "storedData", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class o extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f147528q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f147530s;

    /* renamed from: t, reason: collision with root package name */
    public int f147531t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147530s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147529r = obj;
        this.f147531t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f147530s.d(this);
    }
}
