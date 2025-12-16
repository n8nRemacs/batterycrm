package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt", f = "Slider.kt", i = {0}, l = {903}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
/* loaded from: classes.dex */
final class K8 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.e f32842q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32843r;

    /* renamed from: s, reason: collision with root package name */
    public int f32844s;

    public K8() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32843r = obj;
        this.f32844s |= BeduinInputModel.MIN_TEXT_VERSION;
        return I8.c(null, 0L, 0, this);
    }
}
