package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0}, l = {1835}, m = "writeSuspendSession$suspendImpl", n = {"session"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class U extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.utils.io.internal.u f400767q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400768r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41619a f400769s;

    /* renamed from: t, reason: collision with root package name */
    public int f400770t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C41619a c41619a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400769s = c41619a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400768r = obj;
        this.f400770t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41619a.g1(this.f400769s, null, this);
    }
}
