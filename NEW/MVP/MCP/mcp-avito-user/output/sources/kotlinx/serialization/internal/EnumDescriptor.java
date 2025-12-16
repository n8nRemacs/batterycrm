package kotlinx.serialization.internal;

import androidx.compose.runtime.C22026a;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.descriptors.p;

/* compiled from: Enums.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final o.b f412764l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f412765m;

    /* compiled from: Enums.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<SerialDescriptor[]> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f412766l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f412767m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ EnumDescriptor f412768n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, String str, EnumDescriptor enumDescriptor) {
            super(0);
            this.f412766l = i12;
            this.f412767m = str;
            this.f412768n = enumDescriptor;
        }

        @Override // Y41.a
        public final SerialDescriptor[] invoke() {
            int i12 = this.f412766l;
            SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                serialDescriptorArr[i13] = kotlinx.serialization.descriptors.n.c(this.f412767m + '.' + this.f412768n.f412803e[i13], p.d.f412754a, new SerialDescriptor[0], kotlinx.serialization.descriptors.m.f412748l);
            }
            return serialDescriptorArr;
        }
    }

    public EnumDescriptor(@Y61.k String str, int i12) {
        super(str, null, i12, 2, null);
        this.f412764l = o.b.f412750a;
        this.f412765m = C42727D.c(new a(i12, str, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.getF412729b() != o.b.f412750a) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f412799a, serialDescriptor.getF412728a()) && kotlin.jvm.internal.L.f(D0.a(this), D0.a(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: getKind */
    public final kotlinx.serialization.descriptors.o getF412729b() {
        return this.f412764l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final SerialDescriptor h(int i12) {
        return ((SerialDescriptor[]) this.f412765m.getValue())[i12];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.f412799a.hashCode();
        Iterator<String> it = new kotlinx.serialization.descriptors.j(this).iterator();
        int iHashCode2 = 1;
        while (true) {
            kotlinx.serialization.descriptors.h hVar = (kotlinx.serialization.descriptors.h) it;
            if (!hVar.hasNext()) {
                return (iHashCode * 31) + iHashCode2;
            }
            int i12 = iHashCode2 * 31;
            String str = (String) hVar.next();
            iHashCode2 = i12 + (str != null ? str.hashCode() : 0);
        }
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @Y61.k
    public final String toString() {
        return C42745f0.O(new kotlinx.serialization.descriptors.j(this), ", ", C22026a.c(new StringBuilder(), this.f412799a, '('), ")", null, 56);
    }
}
