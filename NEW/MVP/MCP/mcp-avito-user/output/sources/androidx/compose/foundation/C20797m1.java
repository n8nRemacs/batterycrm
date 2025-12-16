package androidx.compose.foundation;

import androidx.compose.foundation.interaction.g;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Hoverable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {106}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
/* renamed from: androidx.compose.foundation.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20797m1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f29764q;

    /* renamed from: r, reason: collision with root package name */
    public g.a f29765r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f29766s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20803o1 f29767t;

    /* renamed from: u, reason: collision with root package name */
    public int f29768u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20797m1(C20803o1 c20803o1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29767t = c20803o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f29766s = obj;
        this.f29768u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20803o1.k2(this.f29767t, this);
    }
}
