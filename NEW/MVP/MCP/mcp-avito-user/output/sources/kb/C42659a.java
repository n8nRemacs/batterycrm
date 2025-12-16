package kb;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Action;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AdvertStatistics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lkb/a;", "", "", "maxValue", "", "Lkb/e;", "weeks", "", "description", "", "Lkb/c;", "services", "Lcom/avito/android/remote/model/Action;", "action", "hint", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/Action;)V", "I", "c", "()I", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/Action;", "a", "()Lcom/avito/android/remote/model/Action;", "getHint", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C42659a {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("hint")
    @l
    private final Action hint;

    @com.google.gson.annotations.c("maxValue")
    private final int maxValue;

    @com.google.gson.annotations.c("services")
    @l
    private final Map<String, C42661c> services;

    @com.google.gson.annotations.c("weeks")
    @k
    private final List<e> weeks;

    public C42659a(int i12, @k List<e> list, @l String str, @l Map<String, C42661c> map, @l Action action, @l Action action2) {
        this.maxValue = i12;
        this.weeks = list;
        this.description = str;
        this.services = map;
        this.action = action;
        this.hint = action2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    @l
    public final Map<String, C42661c> d() {
        return this.services;
    }

    @k
    public final List<e> e() {
        return this.weeks;
    }
}
