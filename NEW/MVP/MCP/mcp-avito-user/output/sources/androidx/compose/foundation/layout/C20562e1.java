package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "index", "Landroidx/compose/foundation/layout/Y0;", RequestReviewResultKt.INFO_TYPE, "", "Landroidx/compose/ui/layout/h0;", "invoke", "(ILandroidx/compose/foundation/layout/Y0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.layout.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20562e1 extends kotlin.jvm.internal.N implements Y41.p<Integer, Y0, List<? extends InterfaceC22363h0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.Z0 f28599l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20567f1 f28600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20562e1(C20567f1 c20567f1, androidx.compose.ui.layout.Z0 z02) {
        super(2);
        this.f28599l = z02;
        this.f28600m = c20567f1;
    }

    @Override // Y41.p
    public final List<? extends InterfaceC22363h0> invoke(Integer num, Y0 y02) {
        int iIntValue = num.intValue();
        return this.f28599l.h0(Integer.valueOf(iIntValue), new C22096n(-195060736, new C20557d1(this.f28600m, iIntValue, y02), true));
    }
}
