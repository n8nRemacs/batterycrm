package io.ktor.client.statement;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.C;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: HttpStatement.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "cleanup", n = {}, s = {})
/* loaded from: classes8.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C f399799q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399800r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f399801s;

    /* renamed from: t, reason: collision with root package name */
    public int f399802t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399801s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399800r = obj;
        this.f399802t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399801s.a(null, this);
    }
}
