package androidx.compose.ui.contentcapture;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.A0;
import androidx.collection.J;
import androidx.collection.K;
import androidx.collection.R0;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.contentcapture.b;
import androidx.compose.ui.contentcapture.g;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C22473f2;
import androidx.compose.ui.platform.C22477g2;
import androidx.compose.ui.platform.C22481h2;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.semantics.E;
import androidx.compose.ui.semantics.m;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.text.C22602e;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import j.X;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: AndroidContentCaptureManager.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/contentcapture/b;", "Landroidx/compose/ui/contentcapture/g;", "Landroidx/lifecycle/q;", "Landroid/view/View$OnAttachStateChangeListener;", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements g, InterfaceC23057q, View.OnAttachStateChangeListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f38946q = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AndroidComposeView f38947b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<? extends androidx.compose.ui.platform.coreshims.b> f38948c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public androidx.compose.ui.platform.coreshims.b f38949d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f38950e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final long f38951f = 100;

    /* renamed from: g, reason: collision with root package name */
    @k
    public EnumC1655b f38952g = EnumC1655b.f38962b;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38953h = true;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43108m f38954i = A.a(1, null, null, 6);

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Handler f38955j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    @k
    public A0 f38956k;

    /* renamed from: l, reason: collision with root package name */
    public long f38957l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A0<C22473f2> f38958m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public C22473f2 f38959n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38960o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final androidx.compose.ui.contentcapture.a f38961p;

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/contentcapture/b$a;", "", "<init>", "()V", "", "VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX", "Ljava/lang/String;", "VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/b$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.contentcapture.b$b, reason: collision with other inner class name */
    public static final class EnumC1655b {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC1655b f38962b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC1655b f38963c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumC1655b[] f38964d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f38965e;

        static {
            EnumC1655b enumC1655b = new EnumC1655b("SHOW_ORIGINAL", 0);
            f38962b = enumC1655b;
            EnumC1655b enumC1655b2 = new EnumC1655b("SHOW_TRANSLATED", 1);
            f38963c = enumC1655b2;
            EnumC1655b[] enumC1655bArr = {enumC1655b, enumC1655b2};
            f38964d = enumC1655bArr;
            f38965e = kotlin.enums.c.a(enumC1655bArr);
        }

        public EnumC1655b() {
            throw null;
        }

        public static EnumC1655b valueOf(String str) {
            return (EnumC1655b) Enum.valueOf(EnumC1655b.class, str);
        }

        public static EnumC1655b[] values() {
            return (EnumC1655b[]) f38964d.clone();
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/contentcapture/b$c;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f38966a = new c();

        public static void a(b bVar, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            C22477g2 c22477g2B;
            u uVar;
            Y41.l lVar;
            int size = longSparseArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                long jKeyAt = longSparseArray.keyAt(i12);
                ViewTranslationResponse viewTranslationResponseP = Is0.d.p(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseP != null && (value = viewTranslationResponseP.getValue("android:text")) != null && (text = value.getText()) != null && (c22477g2B = bVar.d().b((int) jKeyAt)) != null && (uVar = c22477g2B.f41462a) != null) {
                    androidx.compose.ui.semantics.k.f41760a.getClass();
                    C22553a c22553a = (C22553a) m.a(uVar.f41797d, androidx.compose.ui.semantics.k.f41771l);
                    if (c22553a != null && (lVar = (Y41.l) c22553a.f41728b) != null) {
                    }
                }
            }
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[androidx.compose.ui.contentcapture.f.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                androidx.compose.ui.contentcapture.f fVar = androidx.compose.ui.contentcapture.f.f38981b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Landroidx/compose/ui/semantics/u;", "child", "Lkotlin/G0;", "invoke", "(ILandroidx/compose/ui/semantics/u;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements p<Integer, u, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22473f2 f38967l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f38968m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C22473f2 c22473f2, b bVar) {
            super(2);
            this.f38967l = c22473f2;
            this.f38968m = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, u uVar) {
            int iIntValue = num.intValue();
            u uVar2 = uVar;
            if (!this.f38967l.f41447b.a(uVar2.f41800g)) {
                int i12 = b.f38946q;
                b bVar = this.f38968m;
                bVar.n(iIntValue, uVar2);
                bVar.f38954i.w(G0.f406611a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "i", "Landroidx/compose/ui/semantics/u;", "child", "Lkotlin/G0;", "invoke", "(ILandroidx/compose/ui/semantics/u;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements p<Integer, u, G0> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, u uVar) {
            int i12 = b.f38946q;
            b.this.n(num.intValue(), uVar);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.a] */
    public b(@k AndroidComposeView androidComposeView, @k Y41.a<? extends androidx.compose.ui.platform.coreshims.b> aVar) {
        this.f38947b = androidComposeView;
        this.f38948c = aVar;
        A0 a02 = K.f25558a;
        this.f38956k = a02;
        this.f38958m = K.a();
        this.f38959n = new C22473f2(androidComposeView.getSemanticsOwner().a(), a02);
        this.f38961p = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView2;
                A0<C22473f2> a03;
                A0<C22473f2> a04;
                int i12;
                A0<C22473f2> a05;
                J<C22477g2> j12;
                int[] iArr;
                long[] jArr;
                int i13;
                J<C22477g2> j13;
                int[] iArr2;
                AndroidComposeView androidComposeView3;
                A0<C22473f2> a06;
                long[] jArr2;
                int i14;
                long j14;
                int i15;
                Object[] objArr;
                long[] jArr3;
                int i16;
                long[] jArr4;
                Object[] objArr2;
                int i17;
                int i18;
                int i19 = b.f38946q;
                b bVar = this.f38945b;
                if (bVar.e()) {
                    J0.a aVar2 = J0.f40575D1;
                    AndroidComposeView androidComposeView4 = bVar.f38947b;
                    androidComposeView4.w(true);
                    A0<C22473f2> a07 = bVar.f38958m;
                    int[] iArr3 = a07.f25554b;
                    long[] jArr5 = a07.f25553a;
                    int length = jArr5.length - 2;
                    long j15 = 255;
                    int i22 = 8;
                    long j16 = -9187201950435737472L;
                    if (length >= 0) {
                        int i23 = 0;
                        while (true) {
                            long j17 = jArr5[i23];
                            if ((((~j17) << 7) & j17 & j16) != j16) {
                                int i24 = 8 - ((~(i23 - length)) >>> 31);
                                int i25 = 0;
                                while (i25 < i24) {
                                    if ((j17 & j15) < 128) {
                                        int i26 = iArr3[(i23 << 3) + i25];
                                        if (!bVar.d().a(i26)) {
                                            bVar.f38950e.add(new e(i26, bVar.f38957l, f.f38982c, null));
                                            bVar.f38954i.w(G0.f406611a);
                                        }
                                        i18 = 8;
                                    } else {
                                        i18 = i22;
                                    }
                                    j17 >>= i18;
                                    i25++;
                                    i22 = i18;
                                    j15 = 255;
                                }
                                i17 = 1;
                                if (i24 != i22) {
                                    break;
                                }
                            } else {
                                i17 = 1;
                            }
                            if (i23 == length) {
                                break;
                            }
                            i23 += i17;
                            j15 = 255;
                            i22 = 8;
                            j16 = -9187201950435737472L;
                        }
                    }
                    bVar.l(androidComposeView4.getSemanticsOwner().a(), bVar.f38959n);
                    J<C22477g2> jD2 = bVar.d();
                    int[] iArr4 = jD2.f25554b;
                    long[] jArr6 = jD2.f25553a;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i27 = 0;
                        while (true) {
                            long j18 = jArr6[i27];
                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                int i29 = 0;
                                while (i29 < i28) {
                                    if ((j18 & 255) < 128) {
                                        int i32 = iArr4[(i27 << 3) + i29];
                                        C22473f2 c22473f2B = a07.b(i32);
                                        C22477g2 c22477g2B = jD2.b(i32);
                                        u uVar = c22477g2B != null ? c22477g2B.f41462a : null;
                                        if (uVar == null) {
                                            throw H.s("no value for specified key");
                                        }
                                        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
                                        int i33 = uVar.f41800g;
                                        R0<E<?>, Object> r02 = lVar.f41786b;
                                        if (c22473f2B == null) {
                                            Object[] objArr3 = r02.f25722b;
                                            long[] jArr7 = r02.f25721a;
                                            j13 = jD2;
                                            int length3 = jArr7.length - 2;
                                            iArr2 = iArr4;
                                            androidComposeView3 = androidComposeView4;
                                            a06 = a07;
                                            if (length3 >= 0) {
                                                int i34 = 0;
                                                while (true) {
                                                    long j19 = jArr7[i34];
                                                    jArr2 = jArr6;
                                                    i14 = length2;
                                                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i34 - length3)) >>> 31);
                                                        long[] jArr8 = jArr7;
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j19 & 255) < 128) {
                                                                jArr4 = jArr8;
                                                                E e12 = (E) objArr3[(i34 << 3) + i36];
                                                                y.f41820a.getClass();
                                                                objArr2 = objArr3;
                                                                E<List<C22602e>> e13 = y.f41806A;
                                                                if (L.f(e12, e13)) {
                                                                    List list = (List) m.a(lVar, e13);
                                                                    bVar.m(i33, String.valueOf(list != null ? (C22602e) C42745f0.G(list) : null));
                                                                }
                                                            } else {
                                                                jArr4 = jArr8;
                                                                objArr2 = objArr3;
                                                            }
                                                            j19 >>= 8;
                                                            i36++;
                                                            objArr3 = objArr2;
                                                            jArr8 = jArr4;
                                                        }
                                                        jArr3 = jArr8;
                                                        objArr = objArr3;
                                                        i16 = 1;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr = objArr3;
                                                        jArr3 = jArr7;
                                                        i16 = 1;
                                                    }
                                                    if (i34 == length3) {
                                                        break;
                                                    }
                                                    i34 += i16;
                                                    jArr6 = jArr2;
                                                    length2 = i14;
                                                    objArr3 = objArr;
                                                    jArr7 = jArr3;
                                                }
                                            } else {
                                                jArr2 = jArr6;
                                                i14 = length2;
                                            }
                                        } else {
                                            j13 = jD2;
                                            iArr2 = iArr4;
                                            androidComposeView3 = androidComposeView4;
                                            a06 = a07;
                                            jArr2 = jArr6;
                                            i14 = length2;
                                            Object[] objArr4 = r02.f25722b;
                                            long[] jArr9 = r02.f25721a;
                                            int length4 = jArr9.length - 2;
                                            if (length4 >= 0) {
                                                int i37 = 0;
                                                while (true) {
                                                    long j22 = jArr9[i37];
                                                    i15 = i27;
                                                    j14 = j18;
                                                    if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                                        for (int i39 = 0; i39 < i38; i39++) {
                                                            if ((j22 & 255) < 128) {
                                                                E e14 = (E) objArr4[(i37 << 3) + i39];
                                                                y.f41820a.getClass();
                                                                E<List<C22602e>> e15 = y.f41806A;
                                                                if (L.f(e14, e15)) {
                                                                    List list2 = (List) m.a(c22473f2B.f41446a, e15);
                                                                    C22602e c22602e = list2 != null ? (C22602e) C42745f0.G(list2) : null;
                                                                    List list3 = (List) m.a(lVar, e15);
                                                                    C22602e c22602e2 = list3 != null ? (C22602e) C42745f0.G(list3) : null;
                                                                    if (!L.f(c22602e, c22602e2)) {
                                                                        bVar.m(i33, String.valueOf(c22602e2));
                                                                    }
                                                                }
                                                            }
                                                            j22 >>= 8;
                                                        }
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i37 == length4) {
                                                        break;
                                                    }
                                                    i37++;
                                                    i27 = i15;
                                                    j18 = j14;
                                                }
                                            }
                                            j18 = j14 >> 8;
                                            i29++;
                                            i27 = i15;
                                            jD2 = j13;
                                            iArr4 = iArr2;
                                            androidComposeView4 = androidComposeView3;
                                            a07 = a06;
                                            jArr6 = jArr2;
                                            length2 = i14;
                                        }
                                    } else {
                                        j13 = jD2;
                                        iArr2 = iArr4;
                                        androidComposeView3 = androidComposeView4;
                                        a06 = a07;
                                        jArr2 = jArr6;
                                        i14 = length2;
                                    }
                                    i15 = i27;
                                    j14 = j18;
                                    j18 = j14 >> 8;
                                    i29++;
                                    i27 = i15;
                                    jD2 = j13;
                                    iArr4 = iArr2;
                                    androidComposeView4 = androidComposeView3;
                                    a07 = a06;
                                    jArr6 = jArr2;
                                    length2 = i14;
                                }
                                j12 = jD2;
                                iArr = iArr4;
                                androidComposeView2 = androidComposeView4;
                                a03 = a07;
                                jArr = jArr6;
                                int i42 = length2;
                                int i43 = i27;
                                if (i28 != 8) {
                                    break;
                                }
                                i13 = i43;
                                length2 = i42;
                            } else {
                                j12 = jD2;
                                iArr = iArr4;
                                androidComposeView2 = androidComposeView4;
                                a03 = a07;
                                jArr = jArr6;
                                i13 = i27;
                            }
                            if (i13 == length2) {
                                break;
                            }
                            i27 = i13 + 1;
                            jD2 = j12;
                            iArr4 = iArr;
                            androidComposeView4 = androidComposeView2;
                            a07 = a03;
                            jArr6 = jArr;
                        }
                    } else {
                        androidComposeView2 = androidComposeView4;
                        a03 = a07;
                    }
                    a03.c();
                    J<C22477g2> jD3 = bVar.d();
                    int[] iArr5 = jD3.f25554b;
                    Object[] objArr5 = jD3.f25555c;
                    long[] jArr10 = jD3.f25553a;
                    int length5 = jArr10.length - 2;
                    if (length5 >= 0) {
                        int i44 = 0;
                        while (true) {
                            long j23 = jArr10[i44];
                            if ((((~j23) << 7) & j23 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i45 = 8 - ((~(i44 - length5)) >>> 31);
                                int i46 = 0;
                                while (i46 < i45) {
                                    if ((j23 & 255) < 128) {
                                        int i47 = (i44 << 3) + i46;
                                        int i48 = iArr5[i47];
                                        C22473f2 c22473f2 = new C22473f2(((C22477g2) objArr5[i47]).f41462a, bVar.d());
                                        a05 = a03;
                                        a05.h(i48, c22473f2);
                                    } else {
                                        a05 = a03;
                                    }
                                    j23 >>= 8;
                                    i46++;
                                    a03 = a05;
                                }
                                a04 = a03;
                                i12 = 1;
                                if (i45 != 8) {
                                    break;
                                }
                            } else {
                                a04 = a03;
                                i12 = 1;
                            }
                            if (i44 == length5) {
                                break;
                            }
                            i44 += i12;
                            a03 = a04;
                        }
                    }
                    bVar.f38959n = new C22473f2(androidComposeView2.getSemanticsOwner().a(), bVar.d());
                    bVar.f38960o = false;
                }
            }
        };
    }

    @X
    public static void k(@k final b bVar, @k final LongSparseArray longSparseArray) {
        c.f38966a.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (L.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            c.a(bVar, longSparseArray);
        } else {
            bVar.f38947b.post(new Runnable() { // from class: androidx.compose.ui.contentcapture.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.f38966a.getClass();
                    b.c.a(this.f38970b, longSparseArray);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:13:0x002f). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.d
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.d r0 = (androidx.compose.ui.contentcapture.d) r0
            int r1 = r0.f38976u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38976u = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.d r0 = new androidx.compose.ui.contentcapture.d
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f38974s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f38976u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlinx.coroutines.channels.y r2 = r0.f38973r
            androidx.compose.ui.contentcapture.b r5 = r0.f38972q
            kotlin.C42729a0.b(r10)
        L2f:
            r10 = r2
            r2 = r5
            goto L4c
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            kotlinx.coroutines.channels.y r2 = r0.f38973r
            androidx.compose.ui.contentcapture.b r5 = r0.f38972q
            kotlin.C42729a0.b(r10)
            goto L5d
        L42:
            kotlin.C42729a0.b(r10)
            kotlinx.coroutines.channels.m r10 = r9.f38954i
            kotlinx.coroutines.channels.y r10 = r10.iterator()
            r2 = r9
        L4c:
            r0.f38972q = r2
            r0.f38973r = r10
            r0.f38976u = r4
            java.lang.Object r5 = r10.a(r0)
            if (r5 != r1) goto L59
            return r1
        L59:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8d
            r2.next()
            boolean r10 = r5.e()
            if (r10 == 0) goto L71
            r5.f()
        L71:
            boolean r10 = r5.f38960o
            if (r10 != 0) goto L7e
            r5.f38960o = r4
            android.os.Handler r10 = r5.f38955j
            androidx.compose.ui.contentcapture.a r6 = r5.f38961p
            r10.post(r6)
        L7e:
            r0.f38972q = r5
            r0.f38973r = r2
            r0.f38976u = r3
            long r6 = r5.f38951f
            java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r6, r0)
            if (r10 != r1) goto L2f
            return r1
        L8d:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(u uVar, p<? super Integer, ? super u, G0> pVar) {
        uVar.getClass();
        List listH = u.h(4, uVar);
        int size = listH.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = listH.get(i13);
            if (d().a(((u) obj).f41800g)) {
                pVar.invoke(Integer.valueOf(i12), obj);
                i12++;
            }
        }
    }

    @k
    public final J<C22477g2> d() {
        if (this.f38953h) {
            this.f38953h = false;
            this.f38956k = C22481h2.b(this.f38947b.getSemanticsOwner());
            this.f38957l = System.currentTimeMillis();
        }
        return this.f38956k;
    }

    public final boolean e() {
        g.f38985A1.getClass();
        return g.a.f38987b && this.f38949d != null;
    }

    public final void f() {
        AutofillId autofillIdB;
        androidx.compose.ui.platform.coreshims.b bVar = this.f38949d;
        if (bVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f38950e;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                androidx.compose.ui.contentcapture.e eVar = (androidx.compose.ui.contentcapture.e) arrayList.get(i12);
                int iOrdinal = eVar.f38979c.ordinal();
                if (iOrdinal == 0) {
                    androidx.compose.ui.platform.coreshims.d dVar = eVar.f38980d;
                    if (dVar != null) {
                        bVar.d(dVar.f41426a);
                    }
                } else if (iOrdinal == 1 && (autofillIdB = bVar.b(eVar.f38977a)) != null) {
                    bVar.e(autofillIdB);
                }
            }
            bVar.a();
            arrayList.clear();
        }
    }

    public final void g() {
        Y41.a aVar;
        this.f38952g = EnumC1655b.f38962b;
        J<C22477g2> jD2 = d();
        Object[] objArr = jD2.f25555c;
        long[] jArr = jD2.f25553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j12) < 128) {
                        androidx.compose.ui.semantics.l lVar = ((C22477g2) objArr[(i12 << 3) + i14]).f41462a.f41797d;
                        y.f41820a.getClass();
                        if (m.a(lVar, y.f41808C) != null) {
                            androidx.compose.ui.semantics.k.f41760a.getClass();
                            C22553a c22553a = (C22553a) m.a(lVar, androidx.compose.ui.semantics.k.f41773n);
                            if (c22553a != null && (aVar = (Y41.a) c22553a.f41728b) != null) {
                            }
                        }
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    @X
    public final void h(@k long[] jArr, @k Consumer consumer) {
        u uVar;
        String strB;
        c.f38966a.getClass();
        for (long j12 : jArr) {
            C22477g2 c22477g2B = d().b((int) j12);
            if (c22477g2B != null && (uVar = c22477g2B.f41462a) != null) {
                Is0.d.s();
                ViewTranslationRequest.Builder builderN = Is0.d.n(this.f38947b.getAutofillId(), uVar.f41800g);
                y.f41820a.getClass();
                List list = (List) m.a(uVar.f41797d, y.f41806A);
                if (list != null && (strB = E0.d.b(list, "\n", null, 62)) != null) {
                    builderN.setValue("android:text", TranslationRequestValue.forText(new C22602e(strB, null, 2, null)));
                    consumer.accept(builderN.build());
                }
            }
        }
    }

    public final void i() {
        Y41.l lVar;
        this.f38952g = EnumC1655b.f38962b;
        J<C22477g2> jD2 = d();
        Object[] objArr = jD2.f25555c;
        long[] jArr = jD2.f25553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j12) < 128) {
                        androidx.compose.ui.semantics.l lVar2 = ((C22477g2) objArr[(i12 << 3) + i14]).f41462a.f41797d;
                        y.f41820a.getClass();
                        if (L.f(m.a(lVar2, y.f41808C), Boolean.TRUE)) {
                            androidx.compose.ui.semantics.k.f41760a.getClass();
                            C22553a c22553a = (C22553a) m.a(lVar2, androidx.compose.ui.semantics.k.f41772m);
                            if (c22553a != null && (lVar = (Y41.l) c22553a.f41728b) != null) {
                            }
                        }
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void j() {
        Y41.l lVar;
        this.f38952g = EnumC1655b.f38963c;
        J<C22477g2> jD2 = d();
        Object[] objArr = jD2.f25555c;
        long[] jArr = jD2.f25553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j12) < 128) {
                        androidx.compose.ui.semantics.l lVar2 = ((C22477g2) objArr[(i12 << 3) + i14]).f41462a.f41797d;
                        y.f41820a.getClass();
                        if (L.f(m.a(lVar2, y.f41808C), Boolean.FALSE)) {
                            androidx.compose.ui.semantics.k.f41760a.getClass();
                            C22553a c22553a = (C22553a) m.a(lVar2, androidx.compose.ui.semantics.k.f41772m);
                            if (c22553a != null && (lVar = (Y41.l) c22553a.f41728b) != null) {
                            }
                        }
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void l(u uVar, C22473f2 c22473f2) {
        c(uVar, new e(c22473f2, this));
        List listH = u.h(4, uVar);
        int size = listH.size();
        for (int i12 = 0; i12 < size; i12++) {
            u uVar2 = (u) listH.get(i12);
            if (d().a(uVar2.f41800g)) {
                A0<C22473f2> a02 = this.f38958m;
                int i13 = uVar2.f41800g;
                if (a02.a(i13)) {
                    C22473f2 c22473f2B = a02.b(i13);
                    if (c22473f2B == null) {
                        throw H.s("node not present in pruned tree before this change");
                    }
                    l(uVar2, c22473f2B);
                } else {
                    continue;
                }
            }
        }
    }

    public final void m(int i12, String str) {
        androidx.compose.ui.platform.coreshims.b bVar;
        if (Build.VERSION.SDK_INT >= 29 && (bVar = this.f38949d) != null) {
            AutofillId autofillIdB = bVar.b(i12);
            if (autofillIdB == null) {
                throw H.s("Invalid content capture ID");
            }
            bVar.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r21, androidx.compose.ui.semantics.u r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.b.n(int, androidx.compose.ui.semantics.u):void");
    }

    public final void o(u uVar) {
        if (e()) {
            this.f38950e.add(new androidx.compose.ui.contentcapture.e(uVar.f41800g, this.f38957l, androidx.compose.ui.contentcapture.f.f38982c, null));
            List listH = u.h(4, uVar);
            int size = listH.size();
            for (int i12 = 0; i12 < size; i12++) {
                o((u) listH.get(i12));
            }
        }
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStart(@k InterfaceC22983P interfaceC22983P) {
        this.f38949d = this.f38948c.invoke();
        n(-1, this.f38947b.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@k InterfaceC22983P interfaceC22983P) {
        o(this.f38947b.getSemanticsOwner().a());
        f();
        this.f38949d = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@k View view) {
        this.f38955j.removeCallbacks(this.f38961p);
        this.f38949d = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@k View view) {
    }
}
