package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {623}, m = "animateElevation", n = {"this", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class L7 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f35054q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.interaction.j f35055r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f35056s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N7 f35057t;

    /* renamed from: u, reason: collision with root package name */
    public int f35058u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(N7 n72, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35057t = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f35056s = obj;
        this.f35058u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f35057t.a(null, this);
    }
}
