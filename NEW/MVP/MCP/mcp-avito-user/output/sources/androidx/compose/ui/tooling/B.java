package androidx.compose.ui.tooling;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PreviewActivity.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class B extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f42742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f42743m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, String str2) {
        super(2);
        this.f42742l = str;
        this.f42743m = str2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Exception {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22679a c22679a = C22679a.f42765a;
            String str = this.f42742l;
            String str2 = this.f42743m;
            c22679a.getClass();
            C22679a.c(str, str2, a13, new Object[0]);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
