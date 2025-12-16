package io.ktor.client.statement;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpResponse.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {97}, m = "bodyAsChannel", n = {}, s = {})
/* loaded from: classes8.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f399787q;

    /* renamed from: r, reason: collision with root package name */
    public int f399788r;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        f fVar;
        this.f399787q = obj;
        int i12 = this.f399788r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f399788r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f399788r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            fVar = this;
        } else {
            fVar = new f(this);
        }
        Object obj2 = fVar.f399787q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = fVar.f399788r;
        if (i13 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        if (obj2 != null) {
            return (W0) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
    }
}
