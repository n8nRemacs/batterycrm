package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {572}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class A extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C21398x f32329q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32330r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21398x<Object> f32331s;

    /* renamed from: t, reason: collision with root package name */
    public int f32332t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C21398x c21398x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32331s = c21398x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32330r = obj;
        this.f32332t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f32331s.b(null, null, null, this);
    }
}
