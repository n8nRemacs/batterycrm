package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.Z0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AndroidGraphicsLayer.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/g;", "", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f39604a = a.f39605a;

    /* compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/layer/g$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f39605a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> f39606b = C1660a.f39607l;

        /* compiled from: AndroidGraphicsLayer.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.graphics.layer.g$a$a, reason: collision with other inner class name */
        public static final class C1660a extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1660a f39607l = new C1660a();

            public C1660a() {
                super(1);
            }

            @Override // Y41.l
            public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                T.f39320b.getClass();
                androidx.compose.ui.graphics.drawscope.g.c0(gVar, T.f39329k, 0L, 0L, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT);
                return G0.f406611a;
            }
        }
    }

    /* renamed from: A */
    float getF39677r();

    /* renamed from: B */
    long getF39682w();

    /* renamed from: C */
    float getF39653t();

    @Y61.k
    Matrix D();

    /* renamed from: E */
    int getF39673n();

    void F(int i12, int i13, long j12);

    /* renamed from: G */
    long getF39681v();

    /* renamed from: H */
    int getF39672m();

    void I(int i12);

    void J(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection, @Y61.k C22267c c22267c, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar);

    default boolean a() {
        return true;
    }

    void b(float f12);

    void c(float f12);

    void d(float f12);

    void e(@Y61.l Z0 z02);

    void f();

    void g(float f12);

    /* renamed from: getAlpha */
    float getF39674o();

    void h(float f12);

    @Y61.l
    /* renamed from: i */
    Z0 getF39660A();

    void j(float f12);

    void k(float f12);

    void l(float f12);

    void m(@Y61.l Outline outline, long j12);

    /* renamed from: n */
    float getF39679t();

    /* renamed from: o */
    float getF39678s();

    void p(boolean z12);

    void q(float f12);

    /* renamed from: r */
    float getF39680u();

    void s(@Y61.k M m12);

    void setAlpha(float f12);

    /* renamed from: t */
    float getF39684y();

    /* renamed from: u */
    float getF39685z();

    void v(long j12);

    void w(long j12);

    /* renamed from: x */
    float getF39676q();

    void y(long j12);

    /* renamed from: z */
    float getF39683x();
}
