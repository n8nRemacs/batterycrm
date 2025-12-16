package com.airbnb.lottie.compose;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.airbnb.lottie.C27291k;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43314z;

/* compiled from: LottieCompositionResult.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/u;", "Lcom/airbnb/lottie/compose/t;", "<init>", "()V", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u implements InterfaceC27283t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<C27291k> f59544b = kotlinx.coroutines.B.a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59545c = C22126m3.g(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f59546d = C22126m3.g(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final I3 f59547e = C22126m3.d(new c());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I3 f59548f = C22126m3.d(new a());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final I3 f59549g = C22126m3.d(new b());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final I3 f59550h = C22126m3.d(new d());

    /* compiled from: LottieCompositionResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            u uVar = u.this;
            return Boolean.valueOf((((C27291k) ((C22082i3) uVar.f59545c).getF42167b()) == null && ((Throwable) ((C22082i3) uVar.f59546d).getF42167b()) == null) ? false : true);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(((Throwable) ((C22082i3) u.this.f59546d).getF42167b()) != null);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            u uVar = u.this;
            return Boolean.valueOf(((C27291k) ((C22082i3) uVar.f59545c).getF42167b()) == null && ((Throwable) ((C22082i3) uVar.f59546d).getF42167b()) == null);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(((C27291k) ((C22082i3) u.this.f59545c).getF42167b()) != null);
        }
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final C27291k getF42167b() {
        return (C27291k) ((C22082i3) this.f59545c).getF42167b();
    }
}
