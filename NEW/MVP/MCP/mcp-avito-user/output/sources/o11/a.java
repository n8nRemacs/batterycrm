package O11;

import Y41.p;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;
import com.vk.id.group.subscription.compose.snackbar.GroupSubscriptionSnackbarKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionStyle f11918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11920e;

    public /* synthetic */ a(GroupSubscriptionStyle groupSubscriptionStyle, String str, int i12, int i13) {
        this.f11917b = i13;
        this.f11918c = groupSubscriptionStyle;
        this.f11919d = str;
        this.f11920e = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int i12 = this.f11917b;
        A a12 = (A) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i12) {
            case 0:
                return CircleProgressKt.CircleProgress$lambda$0(this.f11918c, this.f11919d, this.f11920e, a12, iIntValue);
            default:
                return GroupSubscriptionSnackbarKt.GroupSubscriptionSnackbar$lambda$0(this.f11918c, this.f11919d, this.f11920e, a12, iIntValue);
        }
    }
}
