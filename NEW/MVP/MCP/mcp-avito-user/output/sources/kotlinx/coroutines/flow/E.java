package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Collection.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class E<T, C extends Collection<? super T>> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Collection f411127q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411128r;

    /* renamed from: s, reason: collision with root package name */
    public int f411129s;

    public E() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411128r = obj;
        this.f411129s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43175k.W(null, null, this);
    }
}
