package yL0;

import HL0.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.preloading.d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VisualVasPreloadable.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"LyL0/a;", "Lcom/avito/android/preloading/d;", "Lkotlin/G0;", "Lcom/avito/android/util/P2;", "LHL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50128a implements d<G0, P2<? super b>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443034a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f443035b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.vas_performance.repository.a f443036c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f443037d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TL0.d f443038e;

    public C50128a(@k String str, @k String str2, @k com.avito.android.vas_performance.repository.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k TL0.d dVar) {
        this.f443034a = str;
        this.f443035b = str2;
        this.f443036c = aVar;
        this.f443037d = interfaceC35745a5;
        this.f443038e = dVar;
    }

    @Override // com.avito.android.preloading.d
    public final z<? extends P2<? super b>> a(G0 g02) {
        this.f443038e.c();
        String str = this.f443035b;
        return this.f443036c.e(this.f443034a, str).j0(this.f443037d.e());
    }
}
