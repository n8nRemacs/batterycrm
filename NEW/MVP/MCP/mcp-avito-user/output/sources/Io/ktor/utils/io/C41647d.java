package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {1200, 1271, 1279}, m = "copyDirect$ktor_io", n = {"this", "src", "joined", "copied", "this_$iv", "current$iv", "capacity$iv", VoiceInfo.STATE, "dstBuffer", "$this$copyDirect_u24lambda_u2475", "limit", "autoFlush", "before$iv", "this", "src", "joined", "copied", "limit", "autoFlush", "this", "src", "joined", "copied", "limit", "autoFlush"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "Z$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0"})
/* renamed from: io.ktor.utils.io.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41647d extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public long f400915A;

    /* renamed from: B, reason: collision with root package name */
    public long f400916B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f400917C;

    /* renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f400918D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C41619a f400919E;

    /* renamed from: F, reason: collision with root package name */
    public int f400920F;

    /* renamed from: q, reason: collision with root package name */
    public C41619a f400921q;

    /* renamed from: r, reason: collision with root package name */
    public C41619a f400922r;

    /* renamed from: s, reason: collision with root package name */
    public io.ktor.utils.io.internal.g f400923s;

    /* renamed from: t, reason: collision with root package name */
    public l0.g f400924t;

    /* renamed from: u, reason: collision with root package name */
    public C41619a f400925u;

    /* renamed from: v, reason: collision with root package name */
    public C41619a f400926v;

    /* renamed from: w, reason: collision with root package name */
    public io.ktor.utils.io.internal.l f400927w;

    /* renamed from: x, reason: collision with root package name */
    public io.ktor.utils.io.internal.l f400928x;

    /* renamed from: y, reason: collision with root package name */
    public ByteBuffer f400929y;

    /* renamed from: z, reason: collision with root package name */
    public C41619a f400930z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41647d(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400919E = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400918D = obj;
        this.f400920F |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400919E.W(null, 0L, this);
    }
}
