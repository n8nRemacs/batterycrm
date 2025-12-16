package N11;

import Y41.p;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.compose.close.CloseIconKt;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11172d;

    public /* synthetic */ a(int i12, int i13, Object obj) {
        this.f11170b = i13;
        this.f11172d = obj;
        this.f11171c = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int i12 = this.f11170b;
        A a12 = (A) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i12) {
            case 0:
                return CloseIconKt.CloseIcon$lambda$2((Y41.a) this.f11172d, this.f11171c, a12, iIntValue);
            case 1:
                return GroupSubscriptionSheet.Content$lambda$26((GroupSubscriptionSheet) this.f11172d, this.f11171c, a12, iIntValue);
            default:
                return GroupSubscriptionSnackbarHost.Content$lambda$7((GroupSubscriptionSnackbarHost) this.f11172d, this.f11171c, a12, iIntValue);
        }
    }
}
