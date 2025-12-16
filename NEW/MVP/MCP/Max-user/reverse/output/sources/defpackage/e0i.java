package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final class e0i implements yzh {
    public final /* synthetic */ WebAppsSettingScreen a;

    public e0i(WebAppsSettingScreen webAppsSettingScreen) {
        this.a = webAppsSettingScreen;
    }

    @Override // defpackage.yzh
    public final void a(xzh xzhVar) {
        yy7[] yy7VarArr = WebAppsSettingScreen.o;
        h0i h0iVar = (h0i) this.a.b.getValue();
        h0iVar.getClass();
        if ((xzhVar instanceof vzh) || (xzhVar instanceof uzh)) {
            return;
        }
        if (!(xzhVar instanceof wzh)) {
            throw new NoWhenBranchMatchedException();
        }
        xfh.r(h0iVar.Y, ((wzh) xzhVar).b);
    }
}
