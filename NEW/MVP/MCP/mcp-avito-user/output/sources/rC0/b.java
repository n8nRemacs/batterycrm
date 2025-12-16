package Rc0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ProfileVkLinkingApiResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LRc0/b;", "", "LRc0/a;", "action", "LRc0/c;", "analyticParams", "", "title", "<init>", "(LRc0/a;LRc0/c;Ljava/lang/String;)V", "LRc0/a;", "a", "()LRc0/a;", "LRc0/c;", "getAnalyticParams", "()LRc0/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    @com.google.gson.annotations.c("action")
    @l
    private final C15030a action;

    @com.google.gson.annotations.c("analyticParams")
    @l
    private final c analyticParams;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@l C15030a c15030a, @l c cVar, @k String str) {
        this.action = c15030a;
        this.analyticParams = cVar;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C15030a getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
