package GQ;

import Y61.l;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShortCvSuccessScreenResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B6\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR-\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"LGQ/a;", "", "", "id", "", "", "LX41/o;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "version", "<init>", "(Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "getVersion", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    @com.google.gson.annotations.c("id")
    @l
    private final Long id;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final Map<String, Object> parameters;

    @com.google.gson.annotations.c("version")
    @l
    private final Long version;

    public a(@l Long l12, @l Map<String, Object> map, @l Long l13) {
        this.id = l12;
        this.parameters = map;
        this.version = l13;
    }
}
