package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {609}, m = "snapElevation", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class M7 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f35120q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f35121r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N7 f35122s;

    /* renamed from: t, reason: collision with root package name */
    public int f35123t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(N7 n72, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35122s = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f35121r = obj;
        this.f35123t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f35122s.b(this);
    }
}
