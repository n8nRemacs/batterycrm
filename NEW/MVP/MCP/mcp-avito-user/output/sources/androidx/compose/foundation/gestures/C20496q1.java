package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0}, l = {122}, m = "userScroll", n = {"this"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20496q1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20456g1 f27922q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27923r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20456g1 f27924s;

    /* renamed from: t, reason: collision with root package name */
    public int f27925t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20496q1(C20456g1 c20456g1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27924s = c20456g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27923r = obj;
        this.f27925t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f27924s.f(null, null, this);
    }
}
