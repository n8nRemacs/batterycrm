package kotlinx.datetime.format;

import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.datetime.D;
import kotlinx.datetime.format.C43342k;
import kotlinx.datetime.internal.format.C43374f;
import kotlinx.datetime.q;
import kotlinx.datetime.t;
import kotlinx.datetime.w;

/* compiled from: DateTimeFormat.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f412330a = C42727D.c(b.f412331l);

    /* compiled from: DateTimeFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Padding.values().length];
            try {
                Padding padding = Padding.f412371b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Padding padding2 = Padding.f412371b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Padding padding3 = Padding.f412371b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: DateTimeFormat.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/Q;", "", "Lkotlinx/datetime/internal/format/f;", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.Q<? extends String, ? extends C43374f<?>>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f412331l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends kotlin.Q<? extends String, ? extends C43374f<?>>> invoke() {
            C43342k.b.f412424a.getClass();
            kotlin.Q q12 = new kotlin.Q("dateTimeComponents(DateTimeComponents.Formats.RFC_1123)", C43342k.b.f412426c.b());
            kotlin.Q q13 = new kotlin.Q("dateTimeComponents(DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET)", C43342k.b.f412425b.b());
            t.b.f412682a.getClass();
            kotlin.Q q14 = new kotlin.Q("date(LocalDateTime.Formats.ISO)", t.b.f412683b.b());
            q.b.f412620a.getClass();
            kotlin.Q q15 = new kotlin.Q("date(LocalDate.Formats.ISO)", ((AbstractC43322a) S.a()).b());
            kotlin.Q q16 = new kotlin.Q("date(LocalDate.Formats.ISO_BASIC)", ((AbstractC43322a) q.b.f412621b).b());
            w.b.f412685a.getClass();
            kotlin.Q q17 = new kotlin.Q("time(LocalTime.Formats.ISO)", ((C43325b0) C43335g0.f412406a.getValue()).f412400a);
            D.b.f412307a.getClass();
            return C42745f0.U(q12, q13, q14, q15, q16, q17, new kotlin.Q("offset(UtcOffset.Formats.ISO)", ((y0) A0.f412317a.getValue()).b()), new kotlin.Q("offset(UtcOffset.Formats.ISO_BASIC)", ((y0) A0.f412318b.getValue()).b()), new kotlin.Q("offset(UtcOffset.Formats.FOUR_DIGITS)", ((y0) A0.f412319c.getValue()).b()));
        }
    }
}
