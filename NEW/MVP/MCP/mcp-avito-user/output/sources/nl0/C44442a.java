package nl0;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SuggestParamsApiV2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnl0/a;", "", "", "id", "", "isScalar", "", "values", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44442a {

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isScalar")
    @l
    private final Boolean isScalar;

    @com.google.gson.annotations.c("values")
    @k
    private final List<String> values;

    public C44442a(@k String str, @l Boolean bool, @k List<String> list) {
        this.id = str;
        this.isScalar = bool;
        this.values = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<String> b() {
        return this.values;
    }
}
