package androidx.compose.foundation.lazy.layout;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AwaitFirstLayoutModifier.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {49}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
/* renamed from: androidx.compose.foundation.lazy.layout.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20711c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r f29395q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f29396r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20713d f29397s;

    /* renamed from: t, reason: collision with root package name */
    public int f29398t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20711c(C20713d c20713d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29397s = c20713d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f29396r = obj;
        this.f29398t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f29397s.a(this);
    }
}
