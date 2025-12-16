package wk;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1LandingContentResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwk/f;", "", "Lwk/g;", "action", "", "Lwk/a;", "advantages", "Lwk/d;", "conditions", "", "header", "<init>", "(Lwk/g;Ljava/util/List;Lwk/d;Ljava/lang/String;)V", "Lwk/g;", "a", "()Lwk/g;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lwk/d;", "c", "()Lwk/d;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @com.google.gson.annotations.c("action")
    @k
    private final g action;

    @com.google.gson.annotations.c("advantages")
    @k
    private final List<C49644a> advantages;

    @com.google.gson.annotations.c("conditions")
    @k
    private final d conditions;

    @com.google.gson.annotations.c("header")
    @k
    private final String header;

    public f(@k g gVar, @k List<C49644a> list, @k d dVar, @k String str) {
        this.action = gVar;
        this.advantages = list;
        this.conditions = dVar;
        this.header = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final g getAction() {
        return this.action;
    }

    @k
    public final List<C49644a> b() {
        return this.advantages;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final d getConditions() {
        return this.conditions;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getHeader() {
        return this.header;
    }
}
