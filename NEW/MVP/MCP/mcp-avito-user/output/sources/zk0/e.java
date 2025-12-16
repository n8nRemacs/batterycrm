package Zk0;

import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3InternalBannerRotationBannersGetResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LZk0/e;", "", "LZk0/c;", "androidDownloadUpdateConfig", "", "", "blockedVendors", "maxVersion", "", "periodicDownloadDisabled", "<init>", "(LZk0/c;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "LZk0/c;", "a", "()LZk0/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    @com.google.gson.annotations.c("androidDownloadUpdateConfig")
    @l
    private final C19573c androidDownloadUpdateConfig;

    @com.google.gson.annotations.c("blockedVendors")
    @l
    private final List<String> blockedVendors;

    @com.google.gson.annotations.c("maxVersion")
    @l
    private final String maxVersion;

    @com.google.gson.annotations.c("periodicDownloadDisabled")
    @l
    private final Boolean periodicDownloadDisabled;

    public e(@l C19573c c19573c, @l List<String> list, @l String str, @l Boolean bool) {
        this.androidDownloadUpdateConfig = c19573c;
        this.blockedVendors = list;
        this.maxVersion = str;
        this.periodicDownloadDisabled = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C19573c getAndroidDownloadUpdateConfig() {
        return this.androidDownloadUpdateConfig;
    }

    @l
    public final List<String> b() {
        return this.blockedVendors;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getMaxVersion() {
        return this.maxVersion;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getPeriodicDownloadDisabled() {
        return this.periodicDownloadDisabled;
    }
}
