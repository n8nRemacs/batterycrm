package androidx.compose.ui.contentcapture;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: AndroidContentCaptureManager.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", i = {0, 1}, l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f38972q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f38973r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f38974s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f38975t;

    /* renamed from: u, reason: collision with root package name */
    public int f38976u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f38975t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f38974s = obj;
        this.f38976u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f38975t.b(this);
    }
}
