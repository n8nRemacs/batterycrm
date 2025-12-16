package kotlinx.datetime.format;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.format.P;
import kotlinx.datetime.internal.format.C43372d;

/* compiled from: LocalDateFormat.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f412377a = C42727D.c(a.f412380l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f412378b = C42727D.c(b.f412381l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final L f412379c = new L(null, null, null, null, 15, null);

    /* compiled from: LocalDateFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/datetime/format/B;", "Lkotlinx/datetime/q;", "invoke", "()Lkotlinx/datetime/format/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<B<kotlinx.datetime.q>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412380l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final B<kotlinx.datetime.q> invoke() {
            P.b bVar = P.f412368b;
            Q q12 = Q.f412376l;
            bVar.getClass();
            P.a aVar = new P.a(new C43372d());
            q12.invoke(aVar);
            return new P(InterfaceC43324b.a.c(aVar));
        }
    }

    /* compiled from: LocalDateFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/datetime/format/B;", "Lkotlinx/datetime/q;", "invoke", "()Lkotlinx/datetime/format/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<B<kotlinx.datetime.q>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f412381l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final B<kotlinx.datetime.q> invoke() {
            P.b bVar = P.f412368b;
            T t12 = T.f412383l;
            bVar.getClass();
            P.a aVar = new P.a(new C43372d());
            t12.invoke(aVar);
            return new P(InterfaceC43324b.a.c(aVar));
        }
    }

    @Y61.k
    public static final B<kotlinx.datetime.q> a() {
        return (B) f412377a.getValue();
    }

    public static final void b(@Y61.l Object obj, @Y61.k String str) {
        if (obj == null) {
            throw new DateTimeFormatException(androidx.camera.core.Q.a("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}
