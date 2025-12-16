package QT0;

import Y61.k;
import com.avito.beduin.v2.datetime.api.exception.DateTimeParsingException;
import java.time.Instant;
import kotlin.Metadata;
import kotlinx.datetime.l;

/* compiled from: KotlinxParsingUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQT0/a;", "", "<init>", "()V", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f13718a = new a();

    @k
    public static l a(@k ST0.d dVar) throws NumberFormatException {
        String str = dVar.f14989a;
        try {
            long j12 = Long.parseLong(str);
            l.INSTANCE.getClass();
            return new l(Instant.ofEpochMilli(j12));
        } catch (NumberFormatException e12) {
            throw new DateTimeParsingException(str, "Instant", e12);
        }
    }
}
