package jg;

import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2ProfileFinanceGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljg/c;", "", "", "Ljg/g;", "onAppear", "onSelect", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42374c {

    @com.google.gson.annotations.c("onAppear")
    @l
    private final List<g> onAppear;

    @com.google.gson.annotations.c("onSelect")
    @l
    private final List<g> onSelect;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public C42374c(@l List<? extends g> list, @l List<? extends g> list2, @l String str, @l String str2) {
        this.onAppear = list;
        this.onSelect = list2;
        this.style = str;
        this.title = str2;
    }

    @l
    public final List<g> a() {
        return this.onAppear;
    }

    @l
    public final List<g> b() {
        return this.onSelect;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
