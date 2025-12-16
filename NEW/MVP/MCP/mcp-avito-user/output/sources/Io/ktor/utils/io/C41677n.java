package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {}, l = {818}, m = "readBoolean", n = {}, s = {})
/* renamed from: io.ktor.utils.io.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41677n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f401214q;

    /* renamed from: r, reason: collision with root package name */
    public int f401215r;

    public C41677n() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401214q = obj;
        this.f401215r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
