package jo0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SafetySettingsV1Response.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u001c"}, d2 = {"Ljo0/b;", "", "", "Ljo0/a;", "actions", "", "deviceId", "", "isCurrent", "loginType", "sessionIdHash", "subtitle", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "c", "d", "e", "f", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42406b {

    @com.google.gson.annotations.c("actions")
    @l
    private final List<C42405a> actions;

    @com.google.gson.annotations.c("deviceId")
    @l
    private final String deviceId;

    @com.google.gson.annotations.c("isCurrent")
    @l
    private final Boolean isCurrent;

    @com.google.gson.annotations.c("loginType")
    @l
    private final String loginType;

    @com.google.gson.annotations.c("sessionIdHash")
    @l
    private final String sessionIdHash;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C42406b(@l List<C42405a> list, @l String str, @l Boolean bool, @l String str2, @l String str3, @l String str4, @k String str5) {
        this.actions = list;
        this.deviceId = str;
        this.isCurrent = bool;
        this.loginType = str2;
        this.sessionIdHash = str3;
        this.subtitle = str4;
        this.title = str5;
    }

    @l
    public final List<C42405a> a() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getLoginType() {
        return this.loginType;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getSessionIdHash() {
        return this.sessionIdHash;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsCurrent() {
        return this.isCurrent;
    }
}
