package Bj0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GetStepOrderV4Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LBj0/h;", "", "", "label", "strikeThrough", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class h {

    @com.google.gson.annotations.c("label")
    @k
    private final String label;

    @com.google.gson.annotations.c("strikeThrough")
    @l
    private final String strikeThrough;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    public h(@k String str, @l String str2, @k String str3) {
        this.label = str;
        this.strikeThrough = str2;
        this.value = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getStrikeThrough() {
        return this.strikeThrough;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
