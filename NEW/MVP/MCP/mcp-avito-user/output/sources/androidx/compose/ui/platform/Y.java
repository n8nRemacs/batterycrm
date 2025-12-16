package androidx.compose.ui.platform;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {71}, m = "startInputMethod", n = {}, s = {})
/* loaded from: classes.dex */
final class Y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f41331q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22459c0 f41332r;

    /* renamed from: s, reason: collision with root package name */
    public int f41333s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C22459c0 c22459c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41332r = c22459c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41331q = obj;
        this.f41333s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f41332r.b(null, this);
    }
}
