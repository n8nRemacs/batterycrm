package WV0;

import Y61.k;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemVisibilityFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWV0/a;", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17930a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17931b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17932c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17933d;

    public a(boolean z12, boolean z13, float f12, long j12) {
        this.f17930a = z12;
        this.f17931b = z13;
        this.f17932c = f12;
        this.f17933d = j12;
    }

    public abstract boolean a(@k b.InterfaceC10495b interfaceC10495b);

    public abstract void b(int i12, @k b.InterfaceC10495b interfaceC10495b);

    public /* synthetic */ a(boolean z12, boolean z13, float f12, long j12, int i12, C42822w c42822w) {
        this(z12, z13, (i12 & 4) != 0 ? 0.5f : f12, (i12 & 8) != 0 ? 2000L : j12);
    }
}
