package androidx.compose.ui.platform;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {136}, m = "establishTextInputSession", n = {}, s = {})
/* loaded from: classes.dex */
final class S1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f41270q;

    /* renamed from: r, reason: collision with root package name */
    public int f41271r;

    public S1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41270q = obj;
        this.f41271r |= BeduinInputModel.MIN_TEXT_VERSION;
        return R1.a(null, null, this);
    }
}
