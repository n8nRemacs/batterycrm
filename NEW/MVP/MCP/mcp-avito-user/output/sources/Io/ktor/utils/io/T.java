package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2412}, m = "writeSuspend", n = {"this", "size"}, s = {"L$0", "I$0"})
/* loaded from: classes8.dex */
final class T extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400757q;

    /* renamed from: r, reason: collision with root package name */
    public int f400758r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400759s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f400760t;

    /* renamed from: u, reason: collision with root package name */
    public int f400761u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400760t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400759s = obj;
        this.f400761u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400760t.d1(0, this);
    }
}
