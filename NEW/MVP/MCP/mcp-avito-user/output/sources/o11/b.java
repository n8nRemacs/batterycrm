package O11;

import Y41.p;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11923d;

    public /* synthetic */ b(String str, int i12, int i13) {
        this.f11921b = i13;
        this.f11922c = str;
        this.f11923d = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int i12 = this.f11921b;
        A a12 = (A) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i12) {
            case 0:
                return CircleProgressKt.CircleProgressWhite$lambda$1(this.f11922c, this.f11923d, a12, iIntValue);
            default:
                return CircleProgressKt.CircleProgressBlue$lambda$2(this.f11922c, this.f11923d, a12, iIntValue);
        }
    }
}
