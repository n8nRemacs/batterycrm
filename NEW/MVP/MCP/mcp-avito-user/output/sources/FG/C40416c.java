package fg;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: V2JobSeekersCvSetStateResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfg/c;", "", "Lfg/a;", "currentState", "", "Lfg/b;", "states", "", "subtitle", "title", "<init>", "(Lfg/a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Lfg/a;", "a", "()Lfg/a;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40416c {

    @com.google.gson.annotations.c("currentState")
    @l
    private final C40414a currentState;

    @com.google.gson.annotations.c("states")
    @k
    private final List<C40415b> states;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C40416c(@l C40414a c40414a, @k List<C40415b> list, @k String str, @k String str2) {
        this.currentState = c40414a;
        this.states = list;
        this.subtitle = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C40414a getCurrentState() {
        return this.currentState;
    }

    @k
    public final List<C40415b> b() {
        return this.states;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
