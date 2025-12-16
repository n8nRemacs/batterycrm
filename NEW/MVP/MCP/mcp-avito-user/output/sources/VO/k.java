package vo;

import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvo/k;", "", "Lvo/j;", "color", "", "iconName", "<init>", "(Lvo/j;Ljava/lang/String;)V", "Lvo/j;", "a", "()Lvo/j;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final j color;

    @com.google.gson.annotations.c("iconName")
    @Y61.k
    private final String iconName;

    public k(@Y61.l j jVar, @Y61.k String str) {
        this.color = jVar;
        this.iconName = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final j getColor() {
        return this.color;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }
}
