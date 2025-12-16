package Qa1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.ValidationComponent", f = "ValidationComponent.kt", i = {0, 0, 0, 2, 2, 2, 3, 3}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 30, 37, 44, 49, 54}, m = "validate", n = {"this", "context", "onValidationSuccess", "this", "onValidationSuccess", "errors", "onValidationSuccess", "errors"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f13801q;

    /* renamed from: r, reason: collision with root package name */
    public Object f13802r;

    /* renamed from: s, reason: collision with root package name */
    public Object f13803s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f13804t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f13805u;

    /* renamed from: v, reason: collision with root package name */
    public int f13806v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13805u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f13804t = obj;
        this.f13806v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f13805u.a(null, null, this);
    }
}
