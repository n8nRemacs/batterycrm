package androidx.view;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;

/* compiled from: NavType.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/navigation/H0;", "T", "", "l", "m", "n", "o", "p", "q", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.H0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23292H0<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final l f52782b = new l(null);

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final f f52783c = new f();

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final i f52784d = new i();

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final e f52785e = new e();

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final h f52786f = new h();

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final g f52787g = new g();

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final d f52788h = new d();

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final c f52789i = new c();

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final b f52790j = new b();

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a f52791k = new a();

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final k f52792l = new k();

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final j f52793m = new j();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52794a;

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$a", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$a */
    public static final class a extends AbstractC23292H0<boolean[]> {
        public a() {
            super(true);
        }

        @Override // androidx.view.AbstractC23292H0
        public final boolean[] a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "boolean[]";
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object c(Object obj, String str) {
            boolean[] zArr = (boolean[]) obj;
            b bVar = AbstractC23292H0.f52790j;
            if (zArr == null) {
                return new boolean[]{((Boolean) bVar.f(str)).booleanValue()};
            }
            boolean[] zArr2 = {((Boolean) bVar.f(str)).booleanValue()};
            int length = zArr.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, 1);
            return zArrCopyOf;
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final boolean[] f(String str) {
            return new boolean[]{((Boolean) AbstractC23292H0.f52790j.f(str)).booleanValue()};
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$b", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$b */
    public static final class b extends AbstractC23292H0<Boolean> {
        public b() {
            super(false);
        }

        @Override // androidx.view.AbstractC23292H0
        public final Boolean a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return BooleanParameter.TYPE;
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Boolean f(String str) {
            boolean z12;
            if (str.equals("true")) {
                z12 = true;
            } else {
                if (!str.equals("false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$c", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$c */
    public static final class c extends AbstractC23292H0<float[]> {
        public c() {
            super(true);
        }

        @Override // androidx.view.AbstractC23292H0
        public final float[] a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "float[]";
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object c(Object obj, String str) {
            float[] fArr = (float[]) obj;
            d dVar = AbstractC23292H0.f52788h;
            if (fArr == null) {
                return new float[]{((Number) dVar.f(str)).floatValue()};
            }
            float[] fArr2 = {((Number) dVar.f(str)).floatValue()};
            int length = fArr.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, 1);
            return fArrCopyOf;
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final float[] f(String str) {
            return new float[]{((Number) AbstractC23292H0.f52788h.f(str)).floatValue()};
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$d", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$d */
    public static final class d extends AbstractC23292H0<Float> {
        public d() {
            super(false);
        }

        @Override // androidx.view.AbstractC23292H0
        public final Float a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "float";
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Float f(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putFloat(str, ((Number) obj).floatValue());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$e", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$e */
    public static final class e extends AbstractC23292H0<int[]> {
        public e() {
            super(true);
        }

        @Override // androidx.view.AbstractC23292H0
        public final int[] a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "integer[]";
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object c(Object obj, String str) {
            int[] iArr = (int[]) obj;
            f fVar = AbstractC23292H0.f52783c;
            if (iArr == null) {
                return new int[]{((Number) fVar.f(str)).intValue()};
            }
            int[] iArr2 = {((Number) fVar.f(str)).intValue()};
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, 1);
            return iArrCopyOf;
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final int[] f(String str) {
            return new int[]{((Number) AbstractC23292H0.f52783c.f(str)).intValue()};
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$f", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$f */
    public static final class f extends AbstractC23292H0<Integer> {
        public f() {
            super(false);
        }

        @Override // androidx.view.AbstractC23292H0
        public final Integer a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "integer";
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Integer f(String str) throws NumberFormatException {
            int i12;
            if (C43066x.h0(str, "0x", false)) {
                String strSubstring = str.substring(2);
                C43044a.a(16);
                i12 = Integer.parseInt(strSubstring, 16);
            } else {
                i12 = Integer.parseInt(str);
            }
            return Integer.valueOf(i12);
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putInt(str, ((Number) obj).intValue());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$g", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$g */
    public static final class g extends AbstractC23292H0<long[]> {
        public g() {
            super(true);
        }

        @Override // androidx.view.AbstractC23292H0
        public final long[] a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "long[]";
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object c(Object obj, String str) {
            long[] jArr = (long[]) obj;
            h hVar = AbstractC23292H0.f52786f;
            if (jArr == null) {
                return new long[]{((Number) hVar.f(str)).longValue()};
            }
            long[] jArr2 = {((Number) hVar.f(str)).longValue()};
            int length = jArr.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, 1);
            return jArrCopyOf;
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final long[] f(String str) {
            return new long[]{((Number) AbstractC23292H0.f52786f.f(str)).longValue()};
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$h", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$h */
    public static final class h extends AbstractC23292H0<Long> {
        public h() {
            super(false);
        }

        @Override // androidx.view.AbstractC23292H0
        public final Long a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return Constants.LONG;
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Long f(String str) throws NumberFormatException {
            long j12;
            String strH = C43066x.z(str, "L", false) ? androidx.compose.ui.graphics.colorspace.e.h(1, 0, str) : str;
            if (C43066x.h0(str, "0x", false)) {
                String strSubstring = strH.substring(2);
                C43044a.a(16);
                j12 = Long.parseLong(strSubstring, 16);
            } else {
                j12 = Long.parseLong(strH);
            }
            return Long.valueOf(j12);
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putLong(str, ((Number) obj).longValue());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$i", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$i */
    public static final class i extends AbstractC23292H0<Integer> {
        public i() {
            super(false);
        }

        @Override // androidx.view.AbstractC23292H0
        public final Integer a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "reference";
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Integer f(String str) throws NumberFormatException {
            int i12;
            if (C43066x.h0(str, "0x", false)) {
                String strSubstring = str.substring(2);
                C43044a.a(16);
                i12 = Integer.parseInt(strSubstring, 16);
            } else {
                i12 = Integer.parseInt(str);
            }
            return Integer.valueOf(i12);
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putInt(str, ((Number) obj).intValue());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"androidx/navigation/H0$j", "Landroidx/navigation/H0;", "", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$j */
    public static final class j extends AbstractC23292H0<String[]> {
        public j() {
            super(true);
        }

        @Override // androidx.view.AbstractC23292H0
        public final String[] a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "string[]";
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object c(Object obj, String str) {
            String[] strArr = (String[]) obj;
            return strArr != null ? (String[]) C42756l.X(strArr, new String[]{str}) : new String[]{str};
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final String[] f(String str) {
            return new String[]{str};
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/H0$k", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$k */
    public static final class k extends AbstractC23292H0<String> {
        public k() {
            super(true);
        }

        @Override // androidx.view.AbstractC23292H0
        public final String a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return "string";
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final String f(String str) {
            if (str.equals("null")) {
                return null;
            }
            return str;
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Landroidx/navigation/H0$l;", "", "<init>", "()V", "Landroidx/navigation/H0;", "", "BoolArrayType", "Landroidx/navigation/H0;", "", "BoolType", "", "FloatArrayType", "", "FloatType", "", "IntArrayType", "", "IntType", "", "LongArrayType", "", "LongType", "ReferenceType", "", "", "StringArrayType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$l */
    public static final class l {
        public /* synthetic */ l(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static AbstractC23292H0 a(@Y61.l String str, @Y61.l String str2) throws ClassNotFoundException {
            f fVar = AbstractC23292H0.f52783c;
            fVar.getClass();
            if ("integer".equals(str)) {
                return fVar;
            }
            e eVar = AbstractC23292H0.f52785e;
            eVar.getClass();
            if ("integer[]".equals(str)) {
                return eVar;
            }
            h hVar = AbstractC23292H0.f52786f;
            hVar.getClass();
            if (Constants.LONG.equals(str)) {
                return hVar;
            }
            g gVar = AbstractC23292H0.f52787g;
            gVar.getClass();
            if ("long[]".equals(str)) {
                return gVar;
            }
            b bVar = AbstractC23292H0.f52790j;
            bVar.getClass();
            if (BooleanParameter.TYPE.equals(str)) {
                return bVar;
            }
            a aVar = AbstractC23292H0.f52791k;
            aVar.getClass();
            if ("boolean[]".equals(str)) {
                return aVar;
            }
            k kVar = AbstractC23292H0.f52792l;
            kVar.getClass();
            if ("string".equals(str)) {
                return kVar;
            }
            j jVar = AbstractC23292H0.f52793m;
            jVar.getClass();
            if ("string[]".equals(str)) {
                return jVar;
            }
            d dVar = AbstractC23292H0.f52788h;
            dVar.getClass();
            if ("float".equals(str)) {
                return dVar;
            }
            c cVar = AbstractC23292H0.f52789i;
            cVar.getClass();
            if ("float[]".equals(str)) {
                return cVar;
            }
            i iVar = AbstractC23292H0.f52784d;
            iVar.getClass();
            if ("reference".equals(str)) {
                return iVar;
            }
            if (str == null || str.length() == 0) {
                return kVar;
            }
            try {
                String strConcat = (!C43066x.h0(str, ".", false) || str2 == null) ? str : str2.concat(str);
                if (C43066x.z(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false)) {
                    strConcat = strConcat.substring(0, strConcat.length() - 2);
                    Class<?> cls = Class.forName(strConcat);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        return new n(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        return new p(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(strConcat);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        return new o(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        return new m(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        return new q(cls2);
                    }
                }
                throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(e12);
            }
        }

        public l() {
        }
    }

    /* compiled from: NavType.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/H0$m;", "", "D", "Landroidx/navigation/H0$q;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$m */
    public static final class m<D extends Enum<?>> extends q<D> {

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final Class<D> f52795o;

        public m(@Y61.k Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f52795o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.view.AbstractC23292H0.q, androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return this.f52795o.getName();
        }

        @Override // androidx.view.AbstractC23292H0.q
        @Y61.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D f(@Y61.k String str) {
            D d12;
            Class<D> cls = this.f52795o;
            D[] enumConstants = cls.getEnumConstants();
            int length = enumConstants.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    d12 = null;
                    break;
                }
                d12 = enumConstants[i12];
                if (C43066x.C(d12.name(), str, true)) {
                    break;
                }
                i12++;
            }
            D d13 = d12;
            if (d13 != null) {
                return d13;
            }
            StringBuilder sbA = r.A("Enum value ", str, " not found for type ");
            sbA.append(cls.getName());
            sbA.append('.');
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/H0$n;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$n */
    public static final class n<D extends Parcelable> extends AbstractC23292H0<D[]> {

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final Class<D[]> f52796n;

        public n(@Y61.k Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f52796n = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return this.f52796n.getName();
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Object f(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f52796n.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !n.class.equals(obj.getClass())) {
                return false;
            }
            return L.f(this.f52796n, ((n) obj).f52796n);
        }

        public final int hashCode() {
            return this.f52796n.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/H0$o;", "D", "Landroidx/navigation/H0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$o */
    public static final class o<D> extends AbstractC23292H0<D> {

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final Class<D> f52797n;

        public o(@Y61.k Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f52797n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.l
        public final D a(@Y61.k Bundle bundle, @Y61.k String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return this.f52797n.getName();
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final D f(@Y61.k String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(@Y61.k String str, @Y61.k Bundle bundle, Object obj) {
            this.f52797n.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !o.class.equals(obj.getClass())) {
                return false;
            }
            return L.f(this.f52797n, ((o) obj).f52797n);
        }

        public final int hashCode() {
            return this.f52797n.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/H0$p;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/H0;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$p */
    public static final class p<D extends Serializable> extends AbstractC23292H0<D[]> {

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final Class<D[]> f52798n;

        public p(@Y61.k Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f52798n = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public final String b() {
            return this.f52798n.getName();
        }

        @Override // androidx.view.AbstractC23292H0
        /* renamed from: d */
        public final Object f(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            ?? r42 = (Serializable[]) obj;
            this.f52798n.cast(r42);
            bundle.putSerializable(str, r42);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !p.class.equals(obj.getClass())) {
                return false;
            }
            return L.f(this.f52798n, ((p) obj).f52798n);
        }

        public final int hashCode() {
            return this.f52798n.hashCode();
        }
    }

    public AbstractC23292H0(boolean z12) {
        this.f52794a = z12;
    }

    @Y61.l
    public abstract T a(@Y61.k Bundle bundle, @Y61.k String str);

    @Y61.k
    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, @Y61.k String str) {
        return f(str);
    }

    /* renamed from: d */
    public abstract T f(@Y61.k String str);

    public abstract void e(@Y61.k String str, @Y61.k Bundle bundle, Object obj);

    @Y61.k
    public final String toString() {
        return b();
    }

    /* compiled from: NavType.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/H0$q;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/H0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.H0$q */
    public static class q<D extends Serializable> extends AbstractC23292H0<D> {

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final Class<D> f52799n;

        public q(@Y61.k Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.f52799n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.view.AbstractC23292H0
        public final Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public String b() {
            return this.f52799n.getName();
        }

        @Override // androidx.view.AbstractC23292H0
        public final void e(String str, Bundle bundle, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f52799n.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return L.f(this.f52799n, ((q) obj).f52799n);
        }

        @Override // androidx.view.AbstractC23292H0
        @Y61.k
        public D f(@Y61.k String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f52799n.hashCode();
        }

        public q(@Y61.k Class cls, int i12) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f52799n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
