package io.ktor.serialization;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContentConverter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {123}, m = "deserialize", n = {"body", "typeInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public W0 f400291q;

    /* renamed from: r, reason: collision with root package name */
    public U31.b f400292r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400293s;

    /* renamed from: t, reason: collision with root package name */
    public int f400294t;

    public e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f400293s = obj;
        this.f400294t |= BeduinInputModel.MIN_TEXT_VERSION;
        return g.a(null, null, null, null, this);
    }
}
