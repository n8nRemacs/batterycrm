package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ScrollExtensions.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {38}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
/* loaded from: classes.dex */
final class A1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.e f27162q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27163r;

    /* renamed from: s, reason: collision with root package name */
    public int f27164s;

    public A1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27163r = obj;
        this.f27164s |= BeduinInputModel.MIN_TEXT_VERSION;
        return F1.a(null, 0.0f, null, this);
    }
}
