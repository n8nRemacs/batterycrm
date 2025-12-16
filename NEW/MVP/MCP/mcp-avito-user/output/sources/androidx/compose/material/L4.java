package androidx.compose.material;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {384}, m = "animateElevation", n = {"this", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class L4 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f32866q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.interaction.j f32867r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f32868s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N4 f32869t;

    /* renamed from: u, reason: collision with root package name */
    public int f32870u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L4(N4 n42, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32869t = n42;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32868s = obj;
        this.f32870u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f32869t.a(null, this);
    }
}
