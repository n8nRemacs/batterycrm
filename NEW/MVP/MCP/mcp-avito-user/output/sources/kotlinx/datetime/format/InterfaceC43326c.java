package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlinx.datetime.format.C;
import kotlinx.datetime.internal.format.C43373e;

/* compiled from: LocalDateFormat.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/format/c;", "Lkotlinx/datetime/format/C$a;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43326c extends C.a {

    /* compiled from: LocalDateFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.c$a */
    public static final class a {
        public static void a(@Y61.k InterfaceC43326c interfaceC43326c, @Y61.k Padding padding) {
            interfaceC43326c.v(new C43373e(new F(padding)));
        }

        public static void b(@Y61.k InterfaceC43326c interfaceC43326c) {
            Padding padding = Padding.f412371b;
            interfaceC43326c.v(new C43373e(new C43339i0()));
        }

        public static void c(@Y61.k InterfaceC43326c interfaceC43326c) {
            interfaceC43326c.v(new C43373e(new V0(Padding.f412372c, false, 2, null)));
        }
    }

    void v(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43338i> oVar);
}
