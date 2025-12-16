package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {470, 473}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: androidx.compose.material3.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21752ng extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C21729mg f36907q;

    /* renamed from: r, reason: collision with root package name */
    public Cg f36908r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f36909s;

    /* renamed from: t, reason: collision with root package name */
    public Object f36910t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f36911u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C21729mg f36912v;

    /* renamed from: w, reason: collision with root package name */
    public int f36913w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21752ng(C21729mg c21729mg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f36912v = c21729mg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f36911u = obj;
        this.f36913w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f36912v.a(null, this);
    }
}
