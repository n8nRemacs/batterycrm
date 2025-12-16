package Ee0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavigationData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEe0/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ee0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C13479a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final CategoryPublishStep.Params.NavigationButtonAction f4127a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CategoryPublishStep.Params.Confirmation f4128b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f4129c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<BeduinAction> f4130d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CategoryPublishStep.Params.ParamsToFill f4131e;

    public C13479a() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13479a)) {
            return false;
        }
        C13479a c13479a = (C13479a) obj;
        return this.f4127a == c13479a.f4127a && L.f(this.f4128b, c13479a.f4128b) && L.f(this.f4129c, c13479a.f4129c) && L.f(this.f4130d, c13479a.f4130d) && L.f(this.f4131e, c13479a.f4131e);
    }

    public final int hashCode() {
        CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f4127a;
        int iHashCode = (navigationButtonAction == null ? 0 : navigationButtonAction.hashCode()) * 31;
        CategoryPublishStep.Params.Confirmation confirmation = this.f4128b;
        int iHashCode2 = (iHashCode + (confirmation == null ? 0 : confirmation.hashCode())) * 31;
        DeepLink deepLink = this.f4129c;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<BeduinAction> list = this.f4130d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CategoryPublishStep.Params.ParamsToFill paramsToFill = this.f4131e;
        return iHashCode4 + (paramsToFill != null ? paramsToFill.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "NavigationData(navigationButtonAction=" + this.f4127a + ", confirmation=" + this.f4128b + ", deepLink=" + this.f4129c + ", beduinActions=" + this.f4130d + ", paramsToFill=" + this.f4131e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13479a(@l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @l CategoryPublishStep.Params.Confirmation confirmation, @l DeepLink deepLink, @l List<? extends BeduinAction> list, @l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        this.f4127a = navigationButtonAction;
        this.f4128b = confirmation;
        this.f4129c = deepLink;
        this.f4130d = list;
        this.f4131e = paramsToFill;
    }

    public /* synthetic */ C13479a(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, CategoryPublishStep.Params.Confirmation confirmation, DeepLink deepLink, List list, CategoryPublishStep.Params.ParamsToFill paramsToFill, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : navigationButtonAction, (i12 & 2) != 0 ? null : confirmation, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : paramsToFill);
    }
}
