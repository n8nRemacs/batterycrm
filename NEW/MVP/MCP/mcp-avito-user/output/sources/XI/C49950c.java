package xi;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.beduin.ui.screen.home_tab.HomeTabBeduinScreenLink;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HomeTabBeduinScreenLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxi/c;", "LKu/a;", "Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenLink;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49950c extends AbstractC14350a<HomeTabBeduinScreenLink> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        ScreenStyle screenStyleA;
        String strN = i.n(uri, ContextActionHandler.Link.URL);
        String queryParameter = uri.getQueryParameter("presentationStyle");
        NavigationTab navigationTab = null;
        if (queryParameter != null) {
            ScreenStyle.f133646c.getClass();
            screenStyleA = ScreenStyle.a.a(queryParameter);
        } else {
            screenStyleA = null;
        }
        String queryParameter2 = uri.getQueryParameter("navigationTab");
        if (queryParameter2 != null) {
            switch (queryParameter2.hashCode()) {
                case -1785238953:
                    if (queryParameter2.equals("favorites")) {
                        navigationTab = NavigationTab.f106971g;
                        break;
                    }
                    break;
                case -906336856:
                    if (queryParameter2.equals(SingleLineInputModel.STYLE_SEARCH)) {
                        navigationTab = NavigationTab.f106970f;
                        break;
                    }
                    break;
                case -309425751:
                    if (queryParameter2.equals("profile")) {
                        navigationTab = NavigationTab.f106974j;
                        break;
                    }
                    break;
                case 394207915:
                    if (queryParameter2.equals("user_adverts")) {
                        navigationTab = NavigationTab.f106972h;
                        break;
                    }
                    break;
                case 954925063:
                    if (queryParameter2.equals("message")) {
                        navigationTab = NavigationTab.f106973i;
                        break;
                    }
                    break;
            }
        }
        NavigationTab navigationTab2 = navigationTab;
        String queryParameter3 = uri.getQueryParameter("showNavigation");
        return new HomeTabBeduinScreenLink(strN, screenStyleA, navigationTab2, queryParameter3 != null ? Boolean.parseBoolean(queryParameter3) : true, Boolean.parseBoolean(uri.getQueryParameter("needAuthorization")));
    }
}
