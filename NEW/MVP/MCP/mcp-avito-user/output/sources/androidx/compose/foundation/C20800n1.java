package androidx.compose.foundation;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Hoverable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {114}, m = "emitExit", n = {"this"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20800n1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f29774q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f29775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20803o1 f29776s;

    /* renamed from: t, reason: collision with root package name */
    public int f29777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20800n1(C20803o1 c20803o1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29776s = c20803o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f29775r = obj;
        this.f29777t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20803o1.l2(this.f29776s, this);
    }
}
