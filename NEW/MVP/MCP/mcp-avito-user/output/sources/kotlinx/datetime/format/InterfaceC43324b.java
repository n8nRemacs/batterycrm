package kotlinx.datetime.format;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.datetime.format.InterfaceC43324b;
import kotlinx.datetime.internal.format.C43371c;
import kotlinx.datetime.internal.format.C43372d;
import kotlinx.datetime.internal.format.C43374f;

/* compiled from: DateTimeFormatBuilder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/b;", "Target", "ActualSelf", "Lkotlinx/datetime/format/C;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43324b<Target, ActualSelf extends InterfaceC43324b<Target, ActualSelf>> extends C {

    /* compiled from: DateTimeFormatBuilder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.b$a */
    public static final class a {
        public static <Target, ActualSelf extends InterfaceC43324b<Target, ActualSelf>> void a(@Y61.k InterfaceC43324b<Target, ActualSelf> interfaceC43324b, @Y61.k Y41.l<? super ActualSelf, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super ActualSelf, kotlin.G0> lVar) {
            ArrayList arrayList = new ArrayList(lVarArr.length);
            for (Y41.l<? super ActualSelf, kotlin.G0> lVar2 : lVarArr) {
                InterfaceC43324b interfaceC43324bJ = interfaceC43324b.j();
                lVar2.invoke(interfaceC43324bJ);
                arrayList.add(new kotlinx.datetime.internal.format.h(interfaceC43324bJ.h().f412518a));
            }
            InterfaceC43324b interfaceC43324bJ2 = interfaceC43324b.j();
            lVar.invoke(interfaceC43324bJ2);
            interfaceC43324b.h().a(new C43371c(new kotlinx.datetime.internal.format.h(interfaceC43324bJ2.h().f412518a), arrayList));
        }

        public static <Target, ActualSelf extends InterfaceC43324b<Target, ActualSelf>> void b(@Y61.k InterfaceC43324b<Target, ActualSelf> interfaceC43324b, @Y61.k String str, @Y61.k Y41.l<? super ActualSelf, kotlin.G0> lVar) {
            C43372d<Target> c43372dH = interfaceC43324b.h();
            InterfaceC43324b interfaceC43324bJ = interfaceC43324b.j();
            lVar.invoke(interfaceC43324bJ);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            c43372dH.a(new kotlinx.datetime.internal.format.u(str, new kotlinx.datetime.internal.format.h(interfaceC43324bJ.h().f412518a)));
        }

        @Y61.k
        public static <Target, ActualSelf extends InterfaceC43324b<Target, ActualSelf>> C43374f<Target> c(@Y61.k InterfaceC43324b<Target, ActualSelf> interfaceC43324b) {
            return new C43374f<>(interfaceC43324b.h().f412518a);
        }

        public static <Target, ActualSelf extends InterfaceC43324b<Target, ActualSelf>> void d(@Y61.k InterfaceC43324b<Target, ActualSelf> interfaceC43324b, @Y61.k String str) {
            interfaceC43324b.h().a(new kotlinx.datetime.internal.format.j(str));
        }
    }

    void g(@Y61.k Y41.l<? super ActualSelf, kotlin.G0>[] lVarArr, @Y61.k Y41.l<? super ActualSelf, kotlin.G0> lVar);

    @Y61.k
    C43372d<Target> h();

    @Y61.k
    ActualSelf j();

    void q(@Y61.k String str, @Y61.k Y41.l<? super ActualSelf, kotlin.G0> lVar);
}
