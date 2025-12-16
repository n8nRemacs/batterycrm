package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmployeeModeStateHolder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateHolder", f = "EmployeeModeStateHolder.kt", i = {0}, l = {54}, m = "updateAndGet", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f147532q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f147534s;

    /* renamed from: t, reason: collision with root package name */
    public int f147535t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147534s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147533r = obj;
        this.f147535t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f147534s.e(null, this);
    }
}
