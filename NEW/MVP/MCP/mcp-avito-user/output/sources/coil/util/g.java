package coil.util;

import androidx.view.Lifecycle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Lifecycles.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", i = {0, 0}, l = {44}, m = "awaitStarted", n = {"$this$awaitStarted", "observer"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Lifecycle f58775q;

    /* renamed from: r, reason: collision with root package name */
    public l0.h f58776r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f58777s;

    /* renamed from: t, reason: collision with root package name */
    public int f58778t;

    public g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f58777s = obj;
        this.f58778t |= BeduinInputModel.MIN_TEXT_VERSION;
        return i.a(null, this);
    }
}
