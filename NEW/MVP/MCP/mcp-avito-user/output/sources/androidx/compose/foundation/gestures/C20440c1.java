package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ForEachGesture.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0}, l = {84}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp", "pass"}, s = {"L$0", "L$1"})
/* renamed from: androidx.compose.foundation.gestures.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20440c1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27590q;

    /* renamed from: r, reason: collision with root package name */
    public PointerEventPass f27591r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27592s;

    /* renamed from: t, reason: collision with root package name */
    public int f27593t;

    public C20440c1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27592s = obj;
        this.f27593t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20444d1.b(null, null, this);
    }
}
