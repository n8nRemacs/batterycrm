package Pl0;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LPl0/f;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "LPl0/e;", "compatibilityV3Info", "LPl0/a;", "compatibilityV4Info", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LPl0/e;LPl0/a;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LPl0/e;", "b", "()LPl0/e;", "LPl0/a;", "c", "()LPl0/a;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @com.google.gson.annotations.c("action")
    @l
    private final DeepLink action;

    @com.google.gson.annotations.c("compatibilityV3Info")
    @l
    private final e compatibilityV3Info;

    @com.google.gson.annotations.c("compatibilityV4Info")
    @l
    private final C14803a compatibilityV4Info;

    public f(@l DeepLink deepLink, @l e eVar, @l C14803a c14803a) {
        this.action = deepLink;
        this.compatibilityV3Info = eVar;
        this.compatibilityV4Info = c14803a;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final e getCompatibilityV3Info() {
        return this.compatibilityV3Info;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C14803a getCompatibilityV4Info() {
        return this.compatibilityV4Info;
    }
}
