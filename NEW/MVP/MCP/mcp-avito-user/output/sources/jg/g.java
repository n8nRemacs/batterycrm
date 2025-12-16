package jg;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api2ProfileFinanceGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljg/g;", "", "a", "b", "Ljg/g$a;", "Ljg/g$b;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g {

    /* compiled from: Api2ProfileFinanceGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljg/g$a;", "Ljg/g;", "", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        public a(@k String str) {
            this.url = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: Api2ProfileFinanceGetResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B<\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R-\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Ljg/g$b;", "Ljg/g;", "", "hasSensitiveData", "", "id", "", "", "", "LX41/o;", "params", "version", "<init>", "(Ljava/lang/Boolean;JLjava/util/Map;J)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "J", "b", "()J", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "d", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements g {

        @com.google.gson.annotations.c("hasSensitiveData")
        @l
        private final Boolean hasSensitiveData;

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("params")
        @l
        private final Map<String, Object> params;

        @com.google.gson.annotations.c("version")
        private final long version;

        public b(@l Boolean bool, long j12, @l Map<String, Object> map, long j13) {
            this.hasSensitiveData = bool;
            this.id = j12;
            this.params = map;
            this.version = j13;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Boolean getHasSensitiveData() {
            return this.hasSensitiveData;
        }

        /* renamed from: b, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        public final Map<String, Object> c() {
            return this.params;
        }

        /* renamed from: d, reason: from getter */
        public final long getVersion() {
            return this.version;
        }
    }
}
