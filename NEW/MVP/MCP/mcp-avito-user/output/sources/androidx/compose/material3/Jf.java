package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {1262}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
/* loaded from: classes.dex */
final class Jf extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.e f34956q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f34957r;

    /* renamed from: s, reason: collision with root package name */
    public int f34958s;

    public Jf() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34957r = obj;
        this.f34958s |= BeduinInputModel.MIN_TEXT_VERSION;
        return Tf.f(null, 0L, 0, this);
    }
}
