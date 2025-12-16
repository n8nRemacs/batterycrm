package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {1960, 2036}, m = "readUTF8LineToUtf8Suspend", n = {"this", "out", "consumed", "required", "caret", "newLine", "output", "transferBuffer", "transferredRemaining", "limit", "this", "consumed", "caret", "newLine"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
final class D extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f400576A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C41619a f400577B;

    /* renamed from: C, reason: collision with root package name */
    public int f400578C;

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400579q;

    /* renamed from: r, reason: collision with root package name */
    public Object f400580r;

    /* renamed from: s, reason: collision with root package name */
    public Serializable f400581s;

    /* renamed from: t, reason: collision with root package name */
    public Serializable f400582t;

    /* renamed from: u, reason: collision with root package name */
    public l0.a f400583u;

    /* renamed from: v, reason: collision with root package name */
    public l0.a f400584v;

    /* renamed from: w, reason: collision with root package name */
    public char[] f400585w;

    /* renamed from: x, reason: collision with root package name */
    public l0.h f400586x;

    /* renamed from: y, reason: collision with root package name */
    public l0.f f400587y;

    /* renamed from: z, reason: collision with root package name */
    public int f400588z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400577B = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400576A = obj;
        this.f400578C |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C41619a.f400817l;
        return this.f400577B.x0(null, 0, this);
    }
}
