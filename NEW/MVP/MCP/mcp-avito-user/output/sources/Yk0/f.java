package Yk0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.profile.generated.api.api_2_profile_finance_get.FinanceWidgetFeature;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2ProfileFinanceGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"LYk0/f;", "", "", "Lcom/avito/android/remote/profile/generated/api/api_2_profile_finance_get/FinanceWidgetFeature;", "features", "LYk0/g;", "onAppear", "onSelect", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "c", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k List<? extends List<FinanceWidgetFeature>> list, @l List<? extends g> list2, @l List<? extends g> list3) {
        this.features = list;
        this.onAppear = list2;
        this.onSelect = list3;
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
}
