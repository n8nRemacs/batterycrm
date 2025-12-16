package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.InterfaceC43123w;

/* compiled from: Transformable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {337, 339, 385}, m = "detectZoom", n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "event", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", PaymentStateKt.PAYMENT_STATE_CANCELED}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
/* loaded from: classes.dex */
final class v2 extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f28069A;

    /* renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f28070B;

    /* renamed from: C, reason: collision with root package name */
    public int f28071C;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f28072q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43123w f28073r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.l f28074s;

    /* renamed from: t, reason: collision with root package name */
    public C22340s f28075t;

    /* renamed from: u, reason: collision with root package name */
    public float f28076u;

    /* renamed from: v, reason: collision with root package name */
    public float f28077v;

    /* renamed from: w, reason: collision with root package name */
    public float f28078w;

    /* renamed from: x, reason: collision with root package name */
    public long f28079x;

    /* renamed from: y, reason: collision with root package name */
    public int f28080y;

    /* renamed from: z, reason: collision with root package name */
    public int f28081z;

    public v2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28070B = obj;
        this.f28071C |= BeduinInputModel.MIN_TEXT_VERSION;
        return y2.b(null, null, null, this);
    }
}
