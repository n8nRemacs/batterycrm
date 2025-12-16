package vC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.generated.api.api_tariff_cpt_configure_levels_v_2.ApiTariffCptConfigureLevelsV2Badge;
import com.avito.android.tariff_cpt.generated.api.api_tariff_cpt_configure_levels_v_2.ApiTariffCptConfigureLevelsV2DockingBadge;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCptConfigureLevelsV2Response.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LvC0/e;", "", "", "LvC0/d;", "advantages", "Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge;", "badge", "LvC0/a;", "button", "Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2DockingBadge;", "dockingBadges", "LvC0/f;", "otherAdvantages", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge;LvC0/a;Ljava/util/List;LvC0/f;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge;", "b", "()Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge;", "LvC0/a;", "c", "()LvC0/a;", "d", "LvC0/f;", "e", "()LvC0/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("advantages")
    @k
    private final List<d> advantages;

    @com.google.gson.annotations.c("badge")
    @l
    private final ApiTariffCptConfigureLevelsV2Badge badge;

    @com.google.gson.annotations.c("button")
    @l
    private final C49193a button;

    @com.google.gson.annotations.c("dockingBadges")
    @l
    private final List<ApiTariffCptConfigureLevelsV2DockingBadge> dockingBadges;

    @com.google.gson.annotations.c("otherAdvantages")
    @l
    private final f otherAdvantages;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public e(@k List<d> list, @l ApiTariffCptConfigureLevelsV2Badge apiTariffCptConfigureLevelsV2Badge, @l C49193a c49193a, @l List<ApiTariffCptConfigureLevelsV2DockingBadge> list2, @l f fVar, @k AttributedText attributedText) {
        this.advantages = list;
        this.badge = apiTariffCptConfigureLevelsV2Badge;
        this.button = c49193a;
        this.dockingBadges = list2;
        this.otherAdvantages = fVar;
        this.title = attributedText;
    }

    @k
    public final List<d> a() {
        return this.advantages;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiTariffCptConfigureLevelsV2Badge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C49193a getButton() {
        return this.button;
    }

    @l
    public final List<ApiTariffCptConfigureLevelsV2DockingBadge> d() {
        return this.dockingBadges;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getOtherAdvantages() {
        return this.otherAdvantages;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
