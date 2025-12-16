package androidx.compose.ui.platform;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {184, 186}, m = "interceptedTextInputSession", n = {}, s = {})
/* loaded from: classes.dex */
final class T1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f41275q;

    /* renamed from: r, reason: collision with root package name */
    public int f41276r;

    public T1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41275q = obj;
        this.f41276r |= BeduinInputModel.MIN_TEXT_VERSION;
        return R1.b(null, null, null, this);
    }
}
