package androidx.compose.ui.input.nestedscroll;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NestedScrollModifier.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {200}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f40085q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f40086r;

    /* renamed from: s, reason: collision with root package name */
    public int f40087s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f40086r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f40085q = obj;
        this.f40087s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f40086r.c(0L, this);
    }
}
