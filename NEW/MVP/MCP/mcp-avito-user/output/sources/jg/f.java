package jg;

import Y61.k;
import Y61.l;
import com.avito.android.avito_finance_user_profile.pub.generated.api.api_2_profile_finance_get.FinanceWidgetFeature;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2ProfileFinanceGetResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljg/f;", "", "", "Lcom/avito/android/avito_finance_user_profile/pub/generated/api/api_2_profile_finance_get/FinanceWidgetFeature;", "features", "Ljg/g;", "onAppear", "onSelect", "", "title", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @com.google.gson.annotations.c("features")
    @k
    private final List<List<FinanceWidgetFeature>> features;

    @com.google.gson.annotations.c("onAppear")
    @l
    private final List<g> onAppear;

    @com.google.gson.annotations.c("onSelect")
    @l
    private final List<g> onSelect;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k List<? extends List<FinanceWidgetFeature>> list, @l List<? extends g> list2, @l List<? extends g> list3, @l String str) {
        this.features = list;
        this.onAppear = list2;
        this.onSelect = list3;
        this.title = str;
    }

    @k
    public final List<List<FinanceWidgetFeature>> a() {
        return this.features;
    }

    @l
    public final List<g> b() {
        return this.onAppear;
    }

    @l
    public final List<g> c() {
        return this.onSelect;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
