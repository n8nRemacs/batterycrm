package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2437}, m = "readShort", n = {"this_$iv", "size$iv"}, s = {"L$0", "I$0"})
/* renamed from: io.ktor.utils.io.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41709y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f401357q;

    /* renamed from: r, reason: collision with root package name */
    public int f401358r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401359s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f401360t;

    /* renamed from: u, reason: collision with root package name */
    public int f401361u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41709y(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401360t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401359s = obj;
        this.f401361u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401360t.j(this);
    }
}
