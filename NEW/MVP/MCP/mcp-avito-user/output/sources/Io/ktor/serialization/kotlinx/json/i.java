package io.ktor.serialization.kotlinx.json;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.KSerializer;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {80, 121, 89}, m = "serialize", n = {"this", "$this$serialize", "serializer", "charset", "channel", "jsonArraySymbols", "channel", "jsonArraySymbols"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class i<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f400372q;

    /* renamed from: r, reason: collision with root package name */
    public Object f400373r;

    /* renamed from: s, reason: collision with root package name */
    public KSerializer f400374s;

    /* renamed from: t, reason: collision with root package name */
    public Charset f400375t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC41649d1 f400376u;

    /* renamed from: v, reason: collision with root package name */
    public Object f400377v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f400378w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f400379x;

    /* renamed from: y, reason: collision with root package name */
    public int f400380y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400379x = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400378w = obj;
        this.f400380y |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.c(this.f400379x, null, null, null, null, this);
    }
}
