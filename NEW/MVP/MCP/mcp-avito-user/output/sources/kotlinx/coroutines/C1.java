package kotlinx.coroutines;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Timeout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes8.dex */
final class C1<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.p f410676q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f410677r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f410678s;

    /* renamed from: t, reason: collision with root package name */
    public int f410679t;

    public C1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410678s = obj;
        this.f410679t |= BeduinInputModel.MIN_TEXT_VERSION;
        return D1.c(0L, null, this);
    }
}
