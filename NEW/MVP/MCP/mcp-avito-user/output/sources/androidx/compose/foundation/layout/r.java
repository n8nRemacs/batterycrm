package androidx.compose.foundation.layout;

import androidx.compose.ui.i;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class r extends kotlin.jvm.internal.N implements Y41.p<Integer, LayoutDirection, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i.a f28729l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i.a aVar) {
        super(2);
        this.f28729l = aVar;
    }

    @Override // Y41.p
    public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
        return Integer.valueOf(this.f28729l.a(0, num.intValue(), layoutDirection));
    }
}
