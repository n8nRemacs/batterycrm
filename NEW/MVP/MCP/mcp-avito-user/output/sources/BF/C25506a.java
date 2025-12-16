package bF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1FreemiumContactHistoryResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LbF/a;", "", "LbF/c;", "button", "", "LbF/b;", "events", "LbF/d;", "headers", "", "title", "<init>", "(LbF/c;Ljava/util/List;LbF/d;Ljava/lang/String;)V", "LbF/c;", "a", "()LbF/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LbF/d;", "c", "()LbF/d;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C25506a {

    @com.google.gson.annotations.c("button")
    @l
    private final c button;

    @com.google.gson.annotations.c("events")
    @k
    private final List<b> events;

    @com.google.gson.annotations.c("headers")
    @k
    private final d headers;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C25506a(@l c cVar, @k List<b> list, @k d dVar, @k String str) {
        this.button = cVar;
        this.events = list;
        this.headers = dVar;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final c getButton() {
        return this.button;
    }

    @k
    public final List<b> b() {
        return this.events;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final d getHeaders() {
        return this.headers;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
