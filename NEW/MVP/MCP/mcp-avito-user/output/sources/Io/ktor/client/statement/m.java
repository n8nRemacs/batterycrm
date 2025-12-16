package io.ktor.client.statement;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpStatement.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {108}, m = "executeUnsafe", n = {}, s = {})
/* loaded from: classes8.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f399810q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f399811r;

    /* renamed from: s, reason: collision with root package name */
    public int f399812s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399811r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399810q = obj;
        this.f399812s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399811r.d(this);
    }
}
