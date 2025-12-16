package QT0;

import Y61.k;
import com.avito.beduin.v2.datetime.api.exception.DateTimeCreateException;
import com.avito.beduin.v2.datetime.api.model.TimeZone;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.datetime.A;
import kotlinx.datetime.InterfaceC43316a;
import kotlinx.datetime.l;
import kotlinx.datetime.q;
import kotlinx.datetime.t;
import kotlinx.datetime.w;
import kotlinx.datetime.z;

/* compiled from: KotlinxDateTimeProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQT0/c;", "LRT0/f;", "<init>", "()V", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements RT0.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f13720a = new c();

    /* compiled from: KotlinxDateTimeProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TimeZone.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeZone timeZone = TimeZone.f336386b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static z c(TimeZone timeZone) {
        int iOrdinal = timeZone.ordinal();
        if (iOrdinal == 0) {
            z.INSTANCE.getClass();
            return z.Companion.a(ZoneId.systemDefault());
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        z.INSTANCE.getClass();
        return z.f412687b;
    }

    @Override // RT0.b
    @k
    public final ST0.f E() {
        InterfaceC43316a.b.f412314a.getClass();
        l lVarA = InterfaceC43316a.b.a();
        z.INSTANCE.getClass();
        return new ST0.f(A.a(lVarA, z.Companion.a(ZoneId.systemDefault())).f412681b.toString());
    }

    @Override // RT0.b
    @k
    public final ST0.g O() {
        InterfaceC43316a.b.f412314a.getClass();
        l lVarA = InterfaceC43316a.b.a();
        z.INSTANCE.getClass();
        return new ST0.g(A.a(lVarA, z.Companion.a(ZoneId.systemDefault())).b().f412684b.toString());
    }

    @Override // RT0.d
    @k
    public final ST0.f R(int i12, int i13, int i14, int i15, int i16, @Y61.l Integer num) {
        try {
            return new ST0.f(new t(i14, i13, i12, i15, i16, num != null ? num.intValue() : 0, 0, 64, (C42822w) null).f412681b.toString());
        } catch (IllegalArgumentException e12) {
            throw new DateTimeCreateException("LocalDateTime", e12);
        }
    }

    @Override // RT0.b
    @k
    public final ST0.e a() {
        InterfaceC43316a.b.f412314a.getClass();
        l lVarA = InterfaceC43316a.b.a();
        z.INSTANCE.getClass();
        return new ST0.e(A.a(lVarA, z.Companion.a(ZoneId.systemDefault())).a().f412619b.toString());
    }

    @Override // RT0.d
    @k
    public final ST0.f b(@k ST0.e eVar, @k ST0.g gVar) {
        try {
            f.f13722a.getClass();
            q qVarA = f.a(eVar);
            h.f13724a.getClass();
            return new ST0.f(new t(qVarA, h.a(gVar)).f412681b.toString());
        } catch (IllegalArgumentException e12) {
            throw new DateTimeCreateException("LocalDateTime", e12);
        }
    }

    @Override // RT0.d
    @k
    public final ST0.f f(@k ST0.d dVar, @k TimeZone timeZone) {
        QT0.a.f13718a.getClass();
        return new ST0.f(A.a(QT0.a.a(dVar), c(timeZone)).f412681b.toString());
    }

    @Override // RT0.d
    @k
    public final ST0.d g(@k ST0.f fVar, @k TimeZone timeZone) {
        g.f13723a.getClass();
        return new ST0.d(String.valueOf(new l(g.a(fVar).f412681b.atZone(c(timeZone).f412688a).toInstant()).a()));
    }

    @Override // RT0.b
    @k
    public final ST0.d h() {
        InterfaceC43316a.b.f412314a.getClass();
        return new ST0.d(String.valueOf(InterfaceC43316a.b.a().a()));
    }

    @Override // RT0.d
    @k
    public final ST0.e k(int i12, int i13, int i14) {
        try {
            return new ST0.e(new q(i14, i13, i12).f412619b.toString());
        } catch (IllegalArgumentException e12) {
            throw new DateTimeCreateException("LocalDate", e12);
        }
    }

    @Override // RT0.d
    @k
    public final ST0.g q(int i12, int i13, @Y61.l Integer num) {
        try {
            return new ST0.g(new w(i12, i13, num != null ? num.intValue() : 0, 0, 8, null).f412684b.toString());
        } catch (IllegalArgumentException e12) {
            throw new DateTimeCreateException("LocalTime", e12);
        }
    }
}
