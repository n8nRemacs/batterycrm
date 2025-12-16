package io.ktor.client.statement;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpResponse.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0}, l = {97}, m = "bodyAsText", n = {"decoder"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public CharsetDecoder f399789q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f399790r;

    /* renamed from: s, reason: collision with root package name */
    public int f399791s;

    public g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399790r = obj;
        this.f399791s |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.a(null, null, this);
    }
}
