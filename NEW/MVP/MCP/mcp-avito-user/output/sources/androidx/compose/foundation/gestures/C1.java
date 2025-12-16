package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ScrollExtensions.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {57}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
/* loaded from: classes.dex */
final class C1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.e f27208q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27209r;

    /* renamed from: s, reason: collision with root package name */
    public int f27210s;

    public C1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27209r = obj;
        this.f27210s |= BeduinInputModel.MIN_TEXT_VERSION;
        return F1.b(null, 0.0f, this);
    }
}
