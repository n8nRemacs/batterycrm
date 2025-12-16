package mb;

import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertSerpPlaceResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmb/a;", "", "", "Lmb/b;", "positions", "", "description", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "getPositions", "()Ljava/util/List;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mb.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C44039a {

    @c("description")
    @l
    private final String description;

    @c("positions")
    @l
    private final List<C44040b> positions;

    public C44039a(@l List<C44040b> list, @l String str) {
        this.positions = list;
        this.description = str;
    }
}
