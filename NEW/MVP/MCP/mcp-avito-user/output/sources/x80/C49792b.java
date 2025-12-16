package x80;

import Y61.k;
import com.avito.android.C36135w2;
import com.avito.android.C36168y2;
import com.avito.android.pinch_to_zoom.c;
import com.avito.android.pinch_to_zoom.d;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.n;

/* compiled from: PinchToZoomHelperModule_ProvidePinchToZoomHelperFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lx80/b;", "Ldagger/internal/h;", "Lcom/avito/android/pinch_to_zoom/b;", "a", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x80.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49792b implements h<com.avito.android.pinch_to_zoom.b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f442262c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C36168y2 f442263a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.pinch_to_zoom.data.b f442264b;

    /* compiled from: PinchToZoomHelperModule_ProvidePinchToZoomHelperFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx80/b$a;", "", "<init>", "()V", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x80.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49792b(@k C36168y2 c36168y2, @k com.avito.android.pinch_to_zoom.data.b bVar) {
        this.f442263a = c36168y2;
        this.f442264b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = (C36135w2) this.f442263a.get();
        d dVar = (d) this.f442264b.get();
        f442262c.getClass();
        C49791a.f442261a.getClass();
        n<Object>[] nVarArr = C36135w2.f327457X;
        n<Object> nVar = nVarArr[28];
        if (!((Boolean) c36135w2.f327504y.a().invoke()).booleanValue()) {
            return new com.avito.android.pinch_to_zoom.a();
        }
        n<Object> nVar2 = nVarArr[29];
        return new c(((Boolean) c36135w2.f327505z.a().invoke()).booleanValue(), dVar);
    }
}
