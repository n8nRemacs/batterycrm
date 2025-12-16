package androidx.privacysandbox.ads.adservices.measurement;

import X41.n;
import Y61.k;
import Y61.l;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.v;
import j.InterfaceC42164u;
import j.Y;
import j.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: MeasurementManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/c;", "", "<init>", "()V", "a", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f53580a = new b(null);

    /* compiled from: MeasurementManager.kt */
    @s0
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0014H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/c$a;", "Landroidx/privacysandbox/ads/adservices/measurement/c;", "Landroidx/privacysandbox/ads/adservices/measurement/a;", "deletionRequest", "Lkotlin/G0;", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "d", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "request", "e", "(Landroidx/privacysandbox/ads/adservices/measurement/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/g;", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Y
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MeasurementManager f53581b;

        public a(@k Context context) {
            this.f53581b = androidx.privacysandbox.ads.adservices.measurement.b.e(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.b.r()));
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.c
        @InterfaceC42164u
        @l
        public Object a(@k androidx.privacysandbox.ads.adservices.measurement.a aVar, @k Continuation<? super G0> continuation) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            this.f53581b.deleteRegistrations(androidx.privacysandbox.ads.adservices.measurement.b.c().setDeletionMode(aVar.f53574a).setMatchBehavior(aVar.f53575b).setStart(aVar.f53576c).setEnd(aVar.f53577d).setDomainUris(aVar.f53578e).setOriginUris(aVar.f53579f).build(), new androidx.arch.core.executor.a(1), v.a(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.c
        @InterfaceC42164u
        @l
        @a0
        public Object b(@k Continuation<? super Integer> continuation) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            this.f53581b.getMeasurementApiStatus(new androidx.arch.core.executor.a(1), v.a(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.c
        @InterfaceC42164u
        @l
        @a0
        public Object c(@k Uri uri, @l InputEvent inputEvent, @k Continuation<? super G0> continuation) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            this.f53581b.registerSource(uri, inputEvent, new androidx.arch.core.executor.a(1), v.a(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.c
        @InterfaceC42164u
        @l
        @a0
        public Object d(@k Uri uri, @k Continuation<? super G0> continuation) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            this.f53581b.registerTrigger(uri, new androidx.arch.core.executor.a(1), v.a(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.c
        @InterfaceC42164u
        @l
        @a0
        public Object e(@k e eVar, @k Continuation<? super G0> continuation) {
            r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            MeasurementManager measurementManager = this.f53581b;
            androidx.privacysandbox.ads.adservices.measurement.b.C();
            List<d> list = eVar.f53582a;
            ArrayList arrayList = new ArrayList();
            for (d dVar : list) {
                androidx.privacysandbox.ads.adservices.measurement.b.D();
                dVar.getClass();
                arrayList.add(androidx.privacysandbox.ads.adservices.measurement.b.f().setDebugKeyAllowed(false).build());
            }
            measurementManager.registerWebSource(androidx.privacysandbox.ads.adservices.measurement.b.i(arrayList, eVar.f53583b).setWebDestination(eVar.f53586e).setAppDestination(eVar.f53585d).setInputEvent(eVar.f53584c).setVerifiedDestination(eVar.f53587f).build(), new androidx.arch.core.executor.a(1), v.a(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.c
        @InterfaceC42164u
        @l
        @a0
        public Object f(@k g gVar, @k Continuation<? super G0> continuation) {
            new r(1, IntrinsicsKt.intercepted(continuation)).p();
            androidx.privacysandbox.ads.adservices.measurement.b.t();
            gVar.getClass();
            new ArrayList();
            throw null;
        }
    }

    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/c$b;", "", "<init>", "()V", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @n
        @l
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public static c a(@k Context context) {
            androidx.privacysandbox.ads.adservices.internal.a.f53525a.getClass();
            androidx.privacysandbox.ads.adservices.internal.a.a();
            if (androidx.privacysandbox.ads.adservices.internal.a.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    @l
    public abstract Object a(@k androidx.privacysandbox.ads.adservices.measurement.a aVar, @k Continuation<? super G0> continuation);

    @l
    @a0
    public abstract Object b(@k Continuation<? super Integer> continuation);

    @l
    @a0
    public abstract Object c(@k Uri uri, @l InputEvent inputEvent, @k Continuation<? super G0> continuation);

    @l
    @a0
    public abstract Object d(@k Uri uri, @k Continuation<? super G0> continuation);

    @l
    @a0
    public abstract Object e(@k e eVar, @k Continuation<? super G0> continuation);

    @l
    @a0
    public abstract Object f(@k g gVar, @k Continuation<? super G0> continuation);
}
