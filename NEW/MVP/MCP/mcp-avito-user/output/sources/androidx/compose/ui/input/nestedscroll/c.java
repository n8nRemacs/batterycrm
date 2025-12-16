package androidx.compose.ui.input.nestedscroll;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NestedScrollModifier.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {223, JfifUtil.MARKER_APP1}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
/* loaded from: classes.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f40082q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f40083r;

    /* renamed from: s, reason: collision with root package name */
    public int f40084s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40083r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f40082q = obj;
        this.f40084s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f40083r.a(0L, 0L, this);
    }
}
