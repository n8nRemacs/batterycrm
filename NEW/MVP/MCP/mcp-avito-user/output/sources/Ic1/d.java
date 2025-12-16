package ic1;

import G41.i;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.foundation.O0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sberid.sdk.ui.models.root.UIColorMode;
import sc1.o;

@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"SberIdSDK_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Object f398589a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Object f398590b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f398591a;

        static {
            int[] iArr = new int[UIColorMode.values().length];
            try {
                UIColorMode uIColorMode = UIColorMode.f437788b;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UIColorMode uIColorMode2 = UIColorMode.f437788b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UIColorMode uIColorMode3 = UIColorMode.f437788b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f398591a = iArr;
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Context> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f398592l = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
        @Override // Y41.a
        @k
        public final Context invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(Context.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G41.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f398593l = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [G41.a, java.lang.Object] */
        @Override // Y41.a
        @k
        public final G41.a invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(G41.a.class);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        f398589a = C42727D.b(lazyThreadSafetyMode, b.f398592l);
        f398590b = C42727D.b(lazyThreadSafetyMode, c.f398593l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @InterfaceC22132o
    public static final boolean a(@l A a12) {
        boolean zA2;
        a12.I(784501692);
        UIColorMode uIColorMode = (UIColorMode) C22126m3.b(((i) ((G41.a) f398590b.getValue())).f6335f, a12).getF42167b();
        if (uIColorMode == UIColorMode.f437790d) {
            zA2 = O0.a(a12);
        } else if (uIColorMode == UIColorMode.f437789c) {
            zA2 = true;
        } else {
            if (uIColorMode != UIColorMode.f437788b) {
                throw new NoWhenBranchMatchedException();
            }
            zA2 = false;
        }
        a12.O();
        return zA2;
    }
}
