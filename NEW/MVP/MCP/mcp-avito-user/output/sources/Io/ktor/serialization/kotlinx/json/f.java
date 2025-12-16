package io.ktor.serialization.kotlinx.json;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {66}, m = "deserialize", n = {}, s = {})
/* loaded from: classes8.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400352q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f400353r;

    /* renamed from: s, reason: collision with root package name */
    public int f400354s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400353r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400352q = obj;
        this.f400354s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400353r.a(null, null, null, this);
    }
}
