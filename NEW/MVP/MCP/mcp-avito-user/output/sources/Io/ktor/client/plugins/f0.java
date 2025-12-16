package io.ktor.client.plugins;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.plugins.e0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpSend.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", i = {0}, l = {138}, m = "execute", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class f0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f399423q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399424r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0.b f399425s;

    /* renamed from: t, reason: collision with root package name */
    public int f399426t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f399425s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399424r = obj;
        this.f399426t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f399425s.a(null, this);
    }
}
