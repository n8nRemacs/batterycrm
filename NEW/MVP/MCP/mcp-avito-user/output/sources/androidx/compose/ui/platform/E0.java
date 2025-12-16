package androidx.compose.ui.platform;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", i = {}, l = {219}, m = "textInputSession", n = {}, s = {})
/* loaded from: classes.dex */
final class E0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f41104q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J0 f41105r;

    /* renamed from: s, reason: collision with root package name */
    public int f41106s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(J0 j02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41105r = j02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41104q = obj;
        this.f41106s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f41105r.a(null, null, this);
    }
}
