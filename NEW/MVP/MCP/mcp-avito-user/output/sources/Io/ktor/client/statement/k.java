package io.ktor.client.statement;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpStatement.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 0, 1, 1}, l = {47, 50, 52, 52}, m = "execute", n = {"this", "block", "this", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class k<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f399803q;

    /* renamed from: r, reason: collision with root package name */
    public Object f399804r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399805s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f399806t;

    /* renamed from: u, reason: collision with root package name */
    public int f399807u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399806t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399805s = obj;
        this.f399807u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399806t.b(null, this);
    }
}
