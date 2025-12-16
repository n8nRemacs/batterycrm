package kotlinx.serialization.json.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.LinkedHashMap;
import kotlin.AbstractC42799j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JsonTreeReader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
final class b0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC42799j f413056q;

    /* renamed from: r, reason: collision with root package name */
    public c0 f413057r;

    /* renamed from: s, reason: collision with root package name */
    public LinkedHashMap f413058s;

    /* renamed from: t, reason: collision with root package name */
    public String f413059t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f413060u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c0 f413061v;

    /* renamed from: w, reason: collision with root package name */
    public int f413062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.f413061v = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f413060u = obj;
        this.f413062w |= BeduinInputModel.MIN_TEXT_VERSION;
        return c0.a(this.f413061v, null, this);
    }
}
