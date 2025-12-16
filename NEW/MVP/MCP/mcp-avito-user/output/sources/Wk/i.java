package wk;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1LandingContentResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lwk/i;", "", "Lwk/g;", "action", "", "header", "", "Lwk/h;", "items", "subHeader", "<init>", "(Lwk/g;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Lwk/g;", "a", "()Lwk/g;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    @com.google.gson.annotations.c("action")
    @k
    private final g action;

    @com.google.gson.annotations.c("header")
    @k
    private final String header;

    @com.google.gson.annotations.c("items")
    @k
    private final List<h> items;

    @com.google.gson.annotations.c("subHeader")
    @k
    private final String subHeader;

    public i(@k g gVar, @k String str, @k List<h> list, @k String str2) {
        this.action = gVar;
        this.header = str;
        this.items = list;
        this.subHeader = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final g getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @k
    public final List<h> c() {
        return this.items;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getSubHeader() {
        return this.subHeader;
    }
}
