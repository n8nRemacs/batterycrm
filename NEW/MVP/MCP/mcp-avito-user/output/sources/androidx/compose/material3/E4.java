package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", SelectionType.TYPE_YEAR, "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class E4 extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f34656l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f34657m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.w0 f34658n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f34659o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C21784p2 f34660p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4(kotlinx.coroutines.T t12, InterfaceC22204y1<Boolean> interfaceC22204y1, androidx.compose.foundation.lazy.w0 w0Var, kotlin.ranges.l lVar, C21784p2 c21784p2) {
        super(1);
        this.f34656l = t12;
        this.f34657m = interfaceC22204y1;
        this.f34658n = w0Var;
        this.f34659o = lVar;
        this.f34660p = c21784p2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f34657m;
        float f12 = V4.f35601a;
        interfaceC22204y1.setValue(Boolean.valueOf(!interfaceC22204y1.getF42167b().booleanValue()));
        C43259k.d(this.f34656l, null, null, new D4(this.f34658n, iIntValue, this.f34659o, this.f34660p, null), 3);
        return kotlin.G0.f406611a;
    }
}
