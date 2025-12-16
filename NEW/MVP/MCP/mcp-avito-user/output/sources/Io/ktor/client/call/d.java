package io.ktor.client.call;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClientCall.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 0, 1, 1}, l = {86, 89}, m = "bodyNullable", n = {"this", RequestReviewResultKt.INFO_TYPE, "this", RequestReviewResultKt.INFO_TYPE}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f398809q;

    /* renamed from: r, reason: collision with root package name */
    public U31.b f398810r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f398811s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f398812t;

    /* renamed from: u, reason: collision with root package name */
    public int f398813u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f398812t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f398811s = obj;
        this.f398813u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f398812t.b(null, this);
    }
}
