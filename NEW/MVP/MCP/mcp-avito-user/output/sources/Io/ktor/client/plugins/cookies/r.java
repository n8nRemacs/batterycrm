package io.ktor.client.plugins.cookies;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.plugins.C;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {142}, m = "cookies", n = {}, s = {})
/* loaded from: classes8.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f399400q;

    /* renamed from: r, reason: collision with root package name */
    public int f399401r;

    public r() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399400q = obj;
        int i12 = this.f399401r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f399401r = i12;
        org.slf4j.a aVar = t.f399403a;
        this.f399401r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f399401r;
        if (i13 == 0) {
            C42729a0.b(obj);
            C.b(null, k.f399366e);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        List list = (List) obj;
        return list == null ? C42784z0.f406748b : list;
    }
}
