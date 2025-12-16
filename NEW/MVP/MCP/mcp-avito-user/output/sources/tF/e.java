package tF;

import Y61.k;
import com.avito.android.remote.model.SuggestLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestLocationsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LtF/e;", "", "<init>", "()V", "a", "b", "c", "LtF/e$a;", "LtF/e$b;", "LtF/e$c;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class e {

    /* compiled from: SuggestLocationsResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtF/e$a;", "LtF/e;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e {
    }

    /* compiled from: SuggestLocationsResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtF/e$b;", "LtF/e;", "<init>", "()V", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends e {
        public b() {
            super(null);
        }
    }

    /* compiled from: SuggestLocationsResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LtF/e$c;", "LtF/e;", "", "Lcom/avito/android/remote/model/SuggestLocation;", "locations", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends e {

        @com.google.gson.annotations.c("locations")
        @k
        private final List<SuggestLocation> locations;

        public c(@k List<SuggestLocation> list) {
            super(null);
            this.locations = list;
        }

        @k
        public final List<SuggestLocation> a() {
            return this.locations;
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    private e() {
    }
}
