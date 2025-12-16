package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TransformedTextFieldState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {747}, m = "collectImeNotifications", n = {"this", "transformedNotifyImeListener"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class v1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p.a f31495q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1 f31497s;

    /* renamed from: t, reason: collision with root package name */
    public int f31498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(t1 t1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31497s = t1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31496r = obj;
        this.f31498t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f31497s.a(null, this);
    }
}
