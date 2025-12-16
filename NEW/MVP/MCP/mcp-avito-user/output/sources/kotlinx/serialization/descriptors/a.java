package kotlinx.serialization.descriptors;

import androidx.appcompat.app.r;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SerialDescriptors.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public List<? extends Annotation> f412708b = C42784z0.f406748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412709c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashSet f412710d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412711e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412712f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412713g = new ArrayList();

    public a(@Y61.k String str) {
        this.f412707a = str;
    }

    public static void b(a aVar, String str, SerialDescriptor serialDescriptor) {
        aVar.a(str, serialDescriptor, C42784z0.f406748b, false);
    }

    public final void a(@Y61.k String str, @Y61.k SerialDescriptor serialDescriptor, @Y61.k List<? extends Annotation> list, boolean z12) {
        if (!this.f412710d.add(str)) {
            StringBuilder sbA = r.A("Element with name '", str, "' is already registered in ");
            sbA.append(this.f412707a);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        this.f412709c.add(str);
        this.f412711e.add(serialDescriptor);
        this.f412712f.add(list);
        this.f412713g.add(Boolean.valueOf(z12));
    }
}
