package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelLittleEndian.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {35}, m = "readLongLittleEndian", n = {}, s = {})
/* renamed from: io.ktor.utils.io.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41685p1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f401242q;

    /* renamed from: r, reason: collision with root package name */
    public int f401243r;

    public C41685p1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C41685p1 c41685p1;
        this.f401242q = obj;
        int i12 = this.f401243r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f401243r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f401243r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            c41685p1 = this;
        } else {
            c41685p1 = new C41685p1(this);
        }
        Object obj2 = c41685p1.f401242q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c41685p1.f401243r;
        if (i13 == 0) {
            C42729a0.b(obj2);
            c41685p1.f401243r = 1;
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        return Boxing.boxLong(Long.reverseBytes(((Number) obj2).longValue()));
    }
}
