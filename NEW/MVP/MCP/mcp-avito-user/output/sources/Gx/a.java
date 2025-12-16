package GX;

import Y61.l;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api1BonusesMainGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"LGX/a;", "", "", "bonusesCount", "", "formattedBonusesCount", "LGX/b;", "onboarding", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/Long;Ljava/lang/String;LGX/b;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LGX/b;", "c", "()LGX/b;", "d", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    @c("bonusesCount")
    @l
    private final Long bonusesCount;

    @c("formattedBonusesCount")
    @l
    private final String formattedBonusesCount;

    @c("onboarding")
    @l
    private final b onboarding;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final String uri;

    public a(@l Long l12, @l String str, @l b bVar, @l String str2) {
        this.bonusesCount = l12;
        this.formattedBonusesCount = str;
        this.onboarding = bVar;
        this.uri = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getBonusesCount() {
        return this.bonusesCount;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getFormattedBonusesCount() {
        return this.formattedBonusesCount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final b getOnboarding() {
        return this.onboarding;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUri() {
        return this.uri;
    }
}
