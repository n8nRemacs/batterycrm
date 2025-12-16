package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.unit.s;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {132, 135}, m = "onScrollCaptureImageRequest", n = {"this", "session", "captureArea", "targetMin", "targetMax", "this", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f41686q;

    /* renamed from: r, reason: collision with root package name */
    public Object f41687r;

    /* renamed from: s, reason: collision with root package name */
    public s f41688s;

    /* renamed from: t, reason: collision with root package name */
    public int f41689t;

    /* renamed from: u, reason: collision with root package name */
    public int f41690u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f41691v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f41692w;

    /* renamed from: x, reason: collision with root package name */
    public int f41693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41692w = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41691v = obj;
        this.f41693x |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.a(this.f41692w, null, null, this);
    }
}
