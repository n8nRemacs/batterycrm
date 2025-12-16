package TB0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2SfTariffLimitsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LTB0/c;", "", "", "LTB0/b;", "categories", "", "isSelected", "", "tabName", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Z", "c", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("categories")
    @k
    private final List<b> categories;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("tabName")
    @k
    private final String tabName;

    public c(@k List<b> list, boolean z12, @k String str) {
        this.categories = list;
        this.isSelected = z12;
        this.tabName = str;
    }

    @k
    public final List<b> a() {
        return this.categories;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
