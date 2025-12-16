package io.ktor.serialization.kotlinx;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {74, 78}, m = "deserialize", n = {"this", "charset", "typeInfo", "content", "this", "charset", "serializer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f400310q;

    /* renamed from: r, reason: collision with root package name */
    public Charset f400311r;

    /* renamed from: s, reason: collision with root package name */
    public Object f400312s;

    /* renamed from: t, reason: collision with root package name */
    public W0 f400313t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f400314u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f400315v;

    /* renamed from: w, reason: collision with root package name */
    public int f400316w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400315v = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400314u = obj;
        this.f400316w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400315v.a(null, null, null, this);
    }
}
