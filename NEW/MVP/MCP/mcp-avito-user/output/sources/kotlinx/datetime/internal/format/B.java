package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.InterfaceC43375a;

/* compiled from: FieldFormatDirective.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/B;", "Target", "Lkotlinx/datetime/internal/format/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class B<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f412501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f412502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f412503c;

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Target, Integer> {
        @Override // Y41.l
        public final Integer invoke(Object obj) {
            return (Integer) ((InterfaceC43370b) this.receiver).b(obj);
        }
    }

    public B(@Y61.k q qVar, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f412501a = qVar;
        this.f412502b = num;
        this.f412503c = num2;
        if (num.intValue() >= 0) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final n<Target, Integer> a() {
        return this.f412501a;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final J51.e<Target> b() {
        J51.h hVar = new J51.h(this.f412502b.intValue(), new a(1, this.f412501a.f412597a, InterfaceC43370b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
        return this.f412503c != null ? new J51.i(hVar) : hVar;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<Target> c() {
        q qVar = this.f412501a;
        InterfaceC43375a interfaceC43375a = qVar.f412597a;
        Integer num = this.f412502b;
        Integer num2 = this.f412503c;
        String str = qVar.f412598b;
        ArrayList arrayListE0 = C42745f0.e0(kotlinx.datetime.internal.format.parser.u.a(num, null, num2, interfaceC43375a, str, true));
        arrayListE0.add(kotlinx.datetime.internal.format.parser.u.a(num, 4, num2, interfaceC43375a, str, false));
        List listU = C42745f0.U(new kotlinx.datetime.internal.format.parser.y("+"), new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new kotlinx.datetime.internal.format.parser.F(5, null, interfaceC43375a, str, false))));
        C42784z0 c42784z0 = C42784z0.f406748b;
        arrayListE0.add(new kotlinx.datetime.internal.format.parser.v(listU, c42784z0));
        return new kotlinx.datetime.internal.format.parser.v<>(c42784z0, arrayListE0);
    }
}
