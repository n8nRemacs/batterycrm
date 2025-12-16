package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {531}, m = "reset", n = {"this"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20515w1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20521y1 f28082q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28083r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20521y1 f28084s;

    /* renamed from: t, reason: collision with root package name */
    public int f28085t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20515w1(C20521y1 c20521y1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28084s = c20521y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f28083r = obj;
        this.f28085t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f28084s.r(this);
    }
}
