package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {384}, m = "waitForLongPress", n = {"result"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20465i2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f27764q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27765r;

    /* renamed from: s, reason: collision with root package name */
    public int f27766s;

    public C20465i2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27765r = obj;
        this.f27766s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20445d2.k(null, null, this);
    }
}
