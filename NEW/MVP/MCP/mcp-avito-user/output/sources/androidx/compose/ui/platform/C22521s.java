package androidx.compose.ui.platform;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 0, 1, 1}, l = {1916, 1951}, m = "boundsUpdatesEventLoop$ui_release", n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: androidx.compose.ui.platform.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22521s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public r f41586q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.collection.B0 f41587r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f41588s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f41589t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f41590u;

    /* renamed from: v, reason: collision with root package name */
    public int f41591v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22521s(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f41590u = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f41589t = obj;
        this.f41591v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f41590u.l(this);
    }
}
