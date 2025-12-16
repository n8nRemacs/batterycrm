package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
/* renamed from: kotlinx.coroutines.channels.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43091d0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f410872q;

    /* renamed from: r, reason: collision with root package name */
    public int f410873r;

    public C43091d0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410872q = obj;
        this.f410873r = (this.f410873r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410873r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                throw null;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            if (((Boolean) obj).booleanValue()) {
                throw null;
            }
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                D.a(null, th2);
                throw th3;
            }
        }
    }
}
