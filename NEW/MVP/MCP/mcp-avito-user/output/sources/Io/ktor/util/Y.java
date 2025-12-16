package io.ktor.util;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EncodersJvm.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", i = {0}, l = {157}, m = "inflateTo", n = {"inflated"}, s = {"I$0"})
/* loaded from: classes8.dex */
final class Y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400425q;

    /* renamed from: r, reason: collision with root package name */
    public int f400426r;

    public Y() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Y y12;
        this.f400425q = obj;
        int i12 = this.f400426r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f400426r = i12;
        int i13 = W.f400424a;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f400426r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            y12 = this;
        } else {
            y12 = new Y(this);
        }
        Object obj2 = y12.f400425q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = y12.f400426r;
        if (i14 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        return Boxing.boxInt(0);
    }
}
