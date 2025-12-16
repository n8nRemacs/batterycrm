package androidx.compose.foundation.layout;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {301, 327, 352}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
/* loaded from: classes.dex */
final class K2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f28357q;

    /* renamed from: r, reason: collision with root package name */
    public l0.e f28358r;

    /* renamed from: s, reason: collision with root package name */
    public long f28359s;

    /* renamed from: t, reason: collision with root package name */
    public float f28360t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f28361u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ I2 f28362v;

    /* renamed from: w, reason: collision with root package name */
    public int f28363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(I2 i22, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28362v = i22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28361u = obj;
        this.f28363w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f28362v.b(0L, 0.0f, false, this);
    }
}
