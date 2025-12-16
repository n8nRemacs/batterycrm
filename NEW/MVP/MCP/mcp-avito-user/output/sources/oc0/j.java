package Oc0;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileVkGroupsApiResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOc0/j;", "", "", "LOc0/f;", "groups", "LOc0/g;", "popup", "<init>", "(Ljava/util/List;LOc0/g;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LOc0/g;", "b", "()LOc0/g;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j {

    @com.google.gson.annotations.c("groups")
    @k
    private final List<f> groups;

    @com.google.gson.annotations.c("popup")
    @k
    private final g popup;

    public j(@k List<f> list, @k g gVar) {
        this.groups = list;
        this.popup = gVar;
    }

    @k
    public final List<f> a() {
        return this.groups;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final g getPopup() {
        return this.popup;
    }
}
