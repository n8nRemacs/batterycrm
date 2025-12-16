package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {575}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
/* renamed from: androidx.compose.material3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21982y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C21916v f37731q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f37732r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21916v<Object> f37733s;

    /* renamed from: t, reason: collision with root package name */
    public int f37734t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21982y(C21916v c21916v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f37733s = c21916v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f37732r = obj;
        this.f37734t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f37733s.b(null, null, null, this);
    }
}
