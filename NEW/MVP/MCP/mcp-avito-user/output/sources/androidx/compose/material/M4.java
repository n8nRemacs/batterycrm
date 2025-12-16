package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {370}, m = "snapElevation", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class M4 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f32893q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32894r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N4 f32895s;

    /* renamed from: t, reason: collision with root package name */
    public int f32896t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(N4 n42, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32895s = n42;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32894r = obj;
        this.f32896t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f32895s.b(this);
    }
}
