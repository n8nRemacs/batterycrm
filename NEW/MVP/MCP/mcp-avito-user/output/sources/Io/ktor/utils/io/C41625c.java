package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1512, 1513}, m = "awaitFreeSpaceOrDelegate", n = {"this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: io.ktor.utils.io.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41625c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400852q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f400853r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400854s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C41619a f400855t;

    /* renamed from: u, reason: collision with root package name */
    public int f400856u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41625c(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400855t = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400854s = obj;
        this.f400856u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400855t.R(0, null, this);
    }
}
