package androidx.compose.ui.scrollcapture;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {296}, m = "scrollBy", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f41701q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f41702r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f41703s;

    /* renamed from: t, reason: collision with root package name */
    public int f41704t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41703s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41702r = obj;
        this.f41704t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f41703s.a(0.0f, this);
    }
}
