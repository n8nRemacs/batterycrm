package un0;

import Y61.k;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import com.avito.android.rubricator.list.category.mvi.entity.CategoriesList;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryListConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lun0/b;", "Lun0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: un0.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49082b implements InterfaceC49081a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f440282a;

    @Inject
    public C49082b(@k J0 j02) {
        this.f440282a = j02;
    }

    @Override // un0.InterfaceC49081a
    @k
    public final ArrayList a(@k List list) {
        List<RubricatorWidget.RubricatorWidgetAction> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (RubricatorWidget.RubricatorWidgetAction rubricatorWidgetAction : list2) {
            String strValueOf = String.valueOf(this.f440282a.a());
            Uri iconUri = rubricatorWidgetAction.getIconUri();
            String title = rubricatorWidgetAction.getTitle();
            if (title == null) {
                title = "";
            }
            String str = title;
            String subtitle = rubricatorWidgetAction.getSubtitle();
            DeepLink uri = rubricatorWidgetAction.getUri();
            if (uri == null) {
                uri = new NoMatchLink();
            }
            DeepLink deepLink = uri;
            boolean activeForSearch = rubricatorWidgetAction.getActiveForSearch();
            List<RubricatorWidget.RubricatorWidgetAction> actions = rubricatorWidgetAction.getActions();
            List listA = actions != null ? a(actions) : C42784z0.f406748b;
            Parcelable.Creator<CategoriesList> creator = CategoriesList.CREATOR;
            arrayList.add(new CategoryListItem(strValueOf, str, deepLink, listA, iconUri, subtitle, null, activeForSearch, false, 320, null));
        }
        return arrayList;
    }
}
