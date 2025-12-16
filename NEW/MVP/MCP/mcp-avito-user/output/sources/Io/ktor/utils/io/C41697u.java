package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readLong", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
/* renamed from: io.ktor.utils.io.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41697u extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401307q;

    /* renamed from: r, reason: collision with root package name */
    public int f401308r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401309s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f401310t;

    /* renamed from: u, reason: collision with root package name */
    public int f401311u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41697u(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401310t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401309s = obj;
        this.f401311u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401310t.J(this);
    }
}
