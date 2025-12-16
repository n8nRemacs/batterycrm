package kotlinx.datetime.internal.format;

import androidx.camera.camera2.internal.G;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlinx.datetime.internal.format.parser.InterfaceC43375a;

/* compiled from: FieldFormatDirective.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/s;", "Target", "Lkotlinx/datetime/internal/format/l;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class s<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E<Target> f412601a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f412602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f412603c;

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/s$a;", "Lkotlinx/datetime/internal/format/parser/a;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements InterfaceC43375a<Target, String> {
        public a() {
        }

        @Override // kotlinx.datetime.internal.format.parser.InterfaceC43375a
        public final String c(Object obj, String str) {
            s<Target> sVar = s.this;
            InterfaceC43370b<Target, Integer> interfaceC43370b = sVar.f412601a.f412505a;
            List<String> list = sVar.f412602b;
            int iIndexOf = list.indexOf(str);
            E<Target> e12 = sVar.f412601a;
            Integer numC = interfaceC43370b.c(obj, Integer.valueOf(iIndexOf + e12.f412506b));
            if (numC != null) {
                return list.get(numC.intValue() - e12.f412506b);
            }
            return null;
        }

        @Override // kotlinx.datetime.internal.format.parser.InterfaceC43375a
        @Y61.k
        public final String getName() {
            return s.this.f412603c;
        }
    }

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Target, String> {
        @Override // Y41.l
        public final String invoke(Object obj) {
            s sVar = (s) this.receiver;
            E<Target> e12 = sVar.f412601a;
            int iIntValue = e12.f412505a.b(obj).intValue();
            String str = (String) C42745f0.K(iIntValue - e12.f412506b, sVar.f412602b);
            return str == null ? AK.c.s(G.j(iIntValue, "The value ", " of "), e12.f412508d, " does not have a corresponding string representation") : str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Y61.k E<? super Target> e12, @Y61.k List<String> list, @Y61.k String str) {
        this.f412601a = e12;
        this.f412602b = list;
        this.f412603c = str;
        int size = list.size();
        int i12 = (e12.f412507c - e12.f412506b) + 1;
        if (size == i12) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("The number of values (");
        sb2.append(list.size());
        sb2.append(") in ");
        sb2.append(list);
        sb2.append(" does not match the range of the field (");
        throw new IllegalArgumentException(androidx.appcompat.app.r.t(sb2, i12, ')').toString());
    }

    @Override // kotlinx.datetime.internal.format.l
    public final /* bridge */ /* synthetic */ n a() {
        return this.f412601a;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final J51.e<Target> b() {
        return new J51.j(new b(1, this, s.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0));
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<Target> c() {
        List<String> list = this.f412602b;
        return new kotlinx.datetime.internal.format.parser.v<>(Collections.singletonList(new kotlinx.datetime.internal.format.parser.C(list, new a(), "one of " + list + " for " + this.f412603c)), C42784z0.f406748b);
    }
}
