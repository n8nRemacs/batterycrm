package sI;

import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiLocationSuggestByQueryV3Response.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LsI/c;", "", "LsI/d;", "defaultVisible", "", "LsI/e;", "list", "", "suggestType", "title", "<init>", "(LsI/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "LsI/d;", "a", "()LsI/d;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "getSuggestType", "()Ljava/lang/String;", "c", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48054c {

    @com.google.gson.annotations.c("defaultVisible")
    @l
    private final d defaultVisible;

    @com.google.gson.annotations.c("list")
    @l
    private final List<e> list;

    @com.google.gson.annotations.c("suggestType")
    @l
    private final String suggestType;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C48054c(@l d dVar, @l List<e> list, @l String str, @l String str2) {
        this.defaultVisible = dVar;
        this.list = list;
        this.suggestType = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final d getDefaultVisible() {
        return this.defaultVisible;
    }

    @l
    public final List<e> b() {
        return this.list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
