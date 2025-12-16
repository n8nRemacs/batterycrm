package io.ktor.network.sockets;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DatagramSendChannel.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0, 0}, l = {95}, m = "sendSuspend", n = {"this", "buffer", AddressParameter.TYPE}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class B extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f400205q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f400206r;

    /* renamed from: s, reason: collision with root package name */
    public U f400207s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400208t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f400209u;

    /* renamed from: v, reason: collision with root package name */
    public int f400210v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400209u = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400208t = obj;
        this.f400210v |= BeduinInputModel.MIN_TEXT_VERSION;
        return A.a(this.f400209u, null, null, this);
    }
}
