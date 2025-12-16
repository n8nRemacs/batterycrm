package androidx.compose.foundation.relocation;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BringIntoViewRequester.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {100}, m = "bringIntoView", n = {"rect", "content$iv", "i$iv", "size$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.j f30068q;

    /* renamed from: r, reason: collision with root package name */
    public Object[] f30069r;

    /* renamed from: s, reason: collision with root package name */
    public int f30070s;

    /* renamed from: t, reason: collision with root package name */
    public int f30071t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f30072u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f30073v;

    /* renamed from: w, reason: collision with root package name */
    public int f30074w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30073v = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f30072u = obj;
        this.f30074w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f30073v.a(null, this);
    }
}
