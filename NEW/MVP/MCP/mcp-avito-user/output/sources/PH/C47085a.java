package ph;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1BblContactHistoryResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lph/a;", "", "Lph/c;", "button", "", "Lph/b;", "events", "Lph/d;", "headers", "", "title", "<init>", "(Lph/c;Ljava/util/List;Lph/d;Ljava/lang/String;)V", "Lph/c;", "a", "()Lph/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lph/d;", "c", "()Lph/d;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ph.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47085a {

    @com.google.gson.annotations.c("button")
    @l
    private final C47087c button;

    @com.google.gson.annotations.c("events")
    @k
    private final List<C47086b> events;

    @com.google.gson.annotations.c("headers")
    @k
    private final C47088d headers;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C47085a(@l C47087c c47087c, @k List<C47086b> list, @k C47088d c47088d, @k String str) {
        this.button = c47087c;
        this.events = list;
        this.headers = c47088d;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C47087c getButton() {
        return this.button;
    }

    @k
    public final List<C47086b> b() {
        return this.events;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C47088d getHeaders() {
        return this.headers;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
