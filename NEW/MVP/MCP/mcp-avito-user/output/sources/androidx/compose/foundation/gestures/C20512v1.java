package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {537}, m = "awaitRelease", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20512v1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f28066q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20521y1 f28067r;

    /* renamed from: s, reason: collision with root package name */
    public int f28068s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20512v1(C20521y1 c20521y1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28067r = c20521y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28066q = obj;
        this.f28068s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f28067r.k1(this);
    }
}
