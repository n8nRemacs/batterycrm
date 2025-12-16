package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LayerSnapshot.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {JfifUtil.MARKER_APP1}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
/* loaded from: classes.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f39689q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f39690r;

    /* renamed from: s, reason: collision with root package name */
    public int f39691s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f39690r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Exception {
        p pVar;
        this.f39689q = obj;
        this.f39691s |= BeduinInputModel.MIN_TEXT_VERSION;
        r rVar = this.f39690r;
        rVar.getClass();
        int i12 = this.f39691s;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f39691s = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            pVar = this;
        } else {
            pVar = new p(rVar, this);
        }
        Object obj2 = pVar.f39689q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = pVar.f39691s;
        if (i13 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            C42729a0.b(obj2);
            Bitmap bitmapA = t.a((Image) obj2);
            V41.b.a(null, null);
            return bitmapA;
        } finally {
        }
    }
}
