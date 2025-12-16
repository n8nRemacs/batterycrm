package M11;

import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10338c;

    public /* synthetic */ a(String str, int i12) {
        this.f10337b = i12;
        this.f10338c = str;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f10337b) {
            case 0:
                return GroupSubscriptionAnalytics.ErrorShown$lambda$4$lambda$3(this.f10338c);
            default:
                return GroupSubscriptionAnalytics.SheetShown$lambda$1$lambda$0(this.f10338c);
        }
    }
}
