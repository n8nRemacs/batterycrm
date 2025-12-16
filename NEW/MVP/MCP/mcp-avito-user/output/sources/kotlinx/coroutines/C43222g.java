package kotlinx.coroutines;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Await.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
/* renamed from: kotlinx.coroutines.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43222g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Iterator f411852q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411853r;

    /* renamed from: s, reason: collision with root package name */
    public int f411854s;

    public C43222g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411853r = obj;
        this.f411854s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43225h.c(null, this);
    }
}
