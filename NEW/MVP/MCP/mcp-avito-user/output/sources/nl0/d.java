package nl0;

import Y61.k;
import com.avito.android.remote.model.Navigation;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SuggestParamsApiV2Request.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnl0/d;", "", "", "Lnl0/c;", Navigation.ATTRIBUTES, "", "categoryId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "getAttributes", "()Ljava/util/List;", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    @com.google.gson.annotations.c(Navigation.ATTRIBUTES)
    @k
    private final List<C44444c> attributes;

    @com.google.gson.annotations.c("categoryId")
    @k
    private final String categoryId;

    public d(@k List<C44444c> list, @k String str) {
        this.attributes = list;
        this.categoryId = str;
    }
}
