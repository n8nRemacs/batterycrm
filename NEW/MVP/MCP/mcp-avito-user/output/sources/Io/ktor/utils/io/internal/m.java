package io.ktor.utils.io.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.utils.io.AbstractC41660h0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SequentialCopyTo.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {AvailableCode.ERROR_NO_ACTIVITY, 31, 39}, m = "copyToSequentialImpl", n = {"$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "transferred"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$2"})
/* loaded from: classes8.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401059q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC41660h0 f401060r;

    /* renamed from: s, reason: collision with root package name */
    public long f401061s;

    /* renamed from: t, reason: collision with root package name */
    public long f401062t;

    /* renamed from: u, reason: collision with root package name */
    public long f401063u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f401064v;

    /* renamed from: w, reason: collision with root package name */
    public int f401065w;

    public m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401064v = obj;
        this.f401065w |= BeduinInputModel.MIN_TEXT_VERSION;
        return p.a(null, null, 0L, this);
    }
}
