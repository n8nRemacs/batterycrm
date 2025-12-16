package io.ktor.serialization.kotlinx;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.C41524i;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0, 0}, l = {59}, m = "serializeNullable", n = {"this", "contentType", "charset", "typeInfo", "value"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes8.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f400333q;

    /* renamed from: r, reason: collision with root package name */
    public C41524i f400334r;

    /* renamed from: s, reason: collision with root package name */
    public Charset f400335s;

    /* renamed from: t, reason: collision with root package name */
    public U31.b f400336t;

    /* renamed from: u, reason: collision with root package name */
    public Object f400337u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f400338v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f400339w;

    /* renamed from: x, reason: collision with root package name */
    public int f400340x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400339w = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400338v = obj;
        this.f400340x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400339w.b(null, null, null, null, this);
    }
}
