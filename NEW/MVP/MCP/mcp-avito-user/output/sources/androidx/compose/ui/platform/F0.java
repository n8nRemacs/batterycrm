package androidx.compose.ui.platform;

import androidx.compose.ui.platform.I0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", i = {}, l = {230}, m = "startInputMethod", n = {}, s = {})
/* loaded from: classes.dex */
final class F0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f41111q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0.a f41112r;

    /* renamed from: s, reason: collision with root package name */
    public int f41113s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(I0.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41112r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41111q = obj;
        this.f41113s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f41112r.b(null, this);
    }
}
