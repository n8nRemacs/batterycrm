package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Adaptation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a;", "", "d", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final d f39377b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C1658a f39378c = new C1658a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final float[] f39379a;

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$a", "Landroidx/compose/ui/graphics/colorspace/a;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.a$a, reason: collision with other inner class name */
    public static final class C1658a extends a {
        public final String toString() {
            return "Bradford";
        }
    }

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$b", "Landroidx/compose/ui/graphics/colorspace/a;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {
        public final String toString() {
            return "Ciecat02";
        }
    }

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$c", "Landroidx/compose/ui/graphics/colorspace/a;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {
        public final String toString() {
            return "VonKries";
        }
    }

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a$d;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    static {
        new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f}, null);
        new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f}, null);
    }

    public a(float[] fArr, C42822w c42822w) {
        this.f39379a = fArr;
    }
}
