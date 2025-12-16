package Vj0;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api4FeaturesGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LVj0/a;", "", "LVj0/a$a;", "analyticParams", "", "testGroup", "<init>", "(LVj0/a$a;Ljava/lang/String;)V", "LVj0/a$a;", "a", "()LVj0/a$a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C15687a {

    @c("analyticParams")
    @k
    private final C1196a analyticParams;

    @c("testGroup")
    @k
    private final String testGroup;

    /* compiled from: Api4FeaturesGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LVj0/a$a;", "", "", "ab", "", "defaultEvent", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vj0.a$a, reason: collision with other inner class name */
    public static final class C1196a {

        @c("ab")
        @l
        private final String ab;

        @c("defaultEvent")
        @l
        private final Boolean defaultEvent;

        public C1196a(@l String str, @l Boolean bool) {
            this.ab = str;
            this.defaultEvent = bool;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getAb() {
            return this.ab;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Boolean getDefaultEvent() {
            return this.defaultEvent;
        }
    }

    public C15687a(@k C1196a c1196a, @k String str) {
        this.analyticParams = c1196a;
        this.testGroup = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C1196a getAnalyticParams() {
        return this.analyticParams;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTestGroup() {
        return this.testGroup;
    }
}
