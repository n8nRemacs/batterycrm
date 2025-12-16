package XE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1TravelOnboardingGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LXE0/d;", "", "", "LXE0/e;", "conditions", "LXE0/f;", "header", "<init>", "(Ljava/util/List;LXE0/f;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LXE0/f;", "b", "()LXE0/f;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    @com.google.gson.annotations.c("conditions")
    @k
    private final List<e> conditions;

    @com.google.gson.annotations.c("header")
    @l
    private final f header;

    public d(@k List<e> list, @l f fVar) {
        this.conditions = list;
        this.header = fVar;
    }

    @k
    public final List<e> a() {
        return this.conditions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final f getHeader() {
        return this.header;
    }
}
