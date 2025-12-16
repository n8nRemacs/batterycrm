package z80;

import Y61.k;
import Y61.l;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.util.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: PinchToZoomOnboardingController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lz80/c;", "", "a", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z80.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50397c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.pinch_to_zoom.b f443853a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PinchToZoomSource f443854b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f443855c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public N0 f443856d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443857e;

    /* compiled from: PinchToZoomOnboardingController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz80/c$a;", "", "<init>", "()V", "", "ONBOARDING_DELAY", "J", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z80.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C50397c(@k R0 r02, @k com.avito.android.pinch_to_zoom.b bVar, @k PinchToZoomSource pinchToZoomSource) {
        this.f443853a = bVar;
        this.f443854b = pinchToZoomSource;
        this.f443855c = U.a(r02.b().plus(t1.b()));
    }
}
