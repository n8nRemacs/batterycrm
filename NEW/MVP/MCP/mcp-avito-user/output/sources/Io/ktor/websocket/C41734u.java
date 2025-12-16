package io.ktor.websocket;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {174, 184, 187, 188, 196, 201}, m = "writeFrame", n = {"$this$writeFrame", "frame", "masking", "length", "$this$writeFrame", "frame", "masking", "length", "formattedLength", "$this$writeFrame", "frame", "masking", "$this$writeFrame", "frame", "masking", "$this$writeFrame", "data", "maskKey"}, s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "I$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "I$0"})
/* renamed from: io.ktor.websocket.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41734u extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41649d1 f401628q;

    /* renamed from: r, reason: collision with root package name */
    public Object f401629r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f401630s;

    /* renamed from: t, reason: collision with root package name */
    public int f401631t;

    /* renamed from: u, reason: collision with root package name */
    public int f401632u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f401633v;

    /* renamed from: w, reason: collision with root package name */
    public int f401634w;

    public C41734u() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401633v = obj;
        this.f401634w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41735v.c(null, null, false, this);
    }
}
