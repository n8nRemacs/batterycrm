package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlinx.datetime.format.C;
import kotlinx.datetime.internal.format.C43373e;

/* compiled from: LocalTimeFormat.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/format/f;", "Lkotlinx/datetime/format/C$d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43332f extends C.d {

    /* compiled from: LocalTimeFormat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.f$a */
    public static final class a {
        public static void a(@Y61.k InterfaceC43332f interfaceC43332f) {
            Padding padding = Padding.f412371b;
            interfaceC43332f.b(new C43373e(new K()));
        }

        public static void b(@Y61.k InterfaceC43332f interfaceC43332f) {
            Padding padding = Padding.f412371b;
            interfaceC43332f.b(new C43373e(new C43337h0()));
        }

        public static void c(@Y61.k InterfaceC43332f interfaceC43332f) {
            Padding padding = Padding.f412371b;
            interfaceC43332f.b(new C43373e(new C43349n0()));
        }

        public static void d(@Y61.k InterfaceC43332f interfaceC43332f, int i12, int i13) {
            interfaceC43332f.b(new C43373e(new J(i12, i13, null, 4, null)));
        }
    }

    void b(@Y61.k kotlinx.datetime.internal.format.o<? super InterfaceC43351o0> oVar);
}
