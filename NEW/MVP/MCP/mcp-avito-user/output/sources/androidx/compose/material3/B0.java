package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC20307p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {1578, 1594}, m = "settleAppBarBottom", n = {VoiceInfo.STATE, "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
final class B0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f34530q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC20307p f34531r;

    /* renamed from: s, reason: collision with root package name */
    public l0.e f34532s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f34533t;

    /* renamed from: u, reason: collision with root package name */
    public int f34534u;

    public B0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34533t = obj;
        this.f34534u |= BeduinInputModel.MIN_TEXT_VERSION;
        return E0.b(null, 0.0f, null, null, this);
    }
}
