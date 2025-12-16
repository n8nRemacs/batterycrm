package P3;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ImageLoaderFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LP3/e;", "Lcom/avito/android/A0;", "<init>", "()V", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f12801d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f12802b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f12803c;

    static {
        h0 h0Var = new h0(e.class, "adaptiveImageLoadingMode", "getAdaptiveImageLoadingMode()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f12801d = new n[]{n0Var.i(h0Var), C0.k(e.class, "adaptiveImageLoading", "getAdaptiveImageLoading()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public e() {
        OptionSet optionSet = new OptionSet("none", C42745f0.U("none", "test", "control"));
        Owners owners = Owners.f210497i0;
        this.f12802b = A0.u(this, "Адаптивный алгоритм выбора изображения из пачки. Переключатель групп", "adaptiveImageLoadingMode", optionSet, false, 0, owners, 40);
        this.f12803c = A0.u(this, "Адаптивный алгоритм выбора изображения из пачки", "adaptiveImageLoading", Boolean.TRUE, false, 0, owners, 56);
    }
}
