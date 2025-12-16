package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "", "it", "invoke", "(Landroidx/compose/runtime/saveable/x;J)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20848b0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, Long, Long> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.selection.V0 f30650l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20848b0(androidx.compose.foundation.text.selection.V0 v02) {
        super(2);
        this.f30650l = v02;
    }

    @Override // Y41.p
    public final Long invoke(androidx.compose.runtime.saveable.x xVar, Long l12) {
        long jLongValue = l12.longValue();
        if (androidx.compose.foundation.text.selection.Z0.a(this.f30650l, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
