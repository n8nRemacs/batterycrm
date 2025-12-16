package M11;

import Y41.p;
import androidx.compose.runtime.A;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionAnalytics f10340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10342e;

    public /* synthetic */ b(GroupSubscriptionAnalytics groupSubscriptionAnalytics, Object obj, int i12, int i13) {
        this.f10339b = i13;
        this.f10340c = groupSubscriptionAnalytics;
        this.f10341d = obj;
        this.f10342e = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        int i12 = this.f10339b;
        A a12 = (A) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i12) {
            case 0:
                return GroupSubscriptionAnalytics.ErrorShown$lambda$5(this.f10340c, (String) this.f10341d, this.f10342e, a12, iIntValue);
            case 1:
                return GroupSubscriptionAnalytics.SheetShown$lambda$2(this.f10340c, (String) this.f10341d, this.f10342e, a12, iIntValue);
            default:
                return GroupSubscriptionAnalytics.SheetScreenShown$lambda$10(this.f10340c, (Y41.a) this.f10341d, this.f10342e, a12, iIntValue);
        }
    }
}
