package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {212, 213, 232, 233, 241, 249}, m = "readFrame", n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "fin", "length", "frameType", "flagsAndOpcode", "fin", "maskKey"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "I$0", "J$1", "L$0", "B$0", "I$0", "I$1"})
/* renamed from: io.ktor.websocket.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41732s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f401612q;

    /* renamed from: r, reason: collision with root package name */
    public FrameType f401613r;

    /* renamed from: s, reason: collision with root package name */
    public long f401614s;

    /* renamed from: t, reason: collision with root package name */
    public long f401615t;

    /* renamed from: u, reason: collision with root package name */
    public int f401616u;

    /* renamed from: v, reason: collision with root package name */
    public int f401617v;

    /* renamed from: w, reason: collision with root package name */
    public byte f401618w;

    /* renamed from: x, reason: collision with root package name */
    public byte f401619x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f401620y;

    /* renamed from: z, reason: collision with root package name */
    public int f401621z;

    public C41732s() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401620y = obj;
        this.f401621z |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41735v.b(null, 0L, 0, this);
    }
}
