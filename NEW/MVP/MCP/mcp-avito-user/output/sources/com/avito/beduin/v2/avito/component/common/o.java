package com.avito.beduin.v2.avito.component.common;

import com.avito.beduin.v2.avito.component.common.Corner;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShapeDeclaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/o;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/common/n;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements com.avito.beduin.v2.theme.d<n> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f334145a = new o();

    /* compiled from: ShapeDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/common/Corner;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/common/Corner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, Corner> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334146l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Corner invoke(G g12) {
            return o.b(o.f334145a, g12);
        }
    }

    /* compiled from: ShapeDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/common/Corner;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/common/Corner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<G, Corner> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334147l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Corner invoke(G g12) {
            return o.b(o.f334145a, g12);
        }
    }

    /* compiled from: ShapeDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/common/Corner;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/common/Corner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<G, Corner> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f334148l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Corner invoke(G g12) {
            return o.b(o.f334145a, g12);
        }
    }

    /* compiled from: ShapeDeclaration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/common/Corner;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/common/Corner;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<G, Corner> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f334149l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Corner invoke(G g12) {
            return o.b(o.f334145a, g12);
        }
    }

    public static final Corner b(o oVar, G g12) {
        Corner.Type typeValueOf;
        String string;
        Float fN2;
        oVar.getClass();
        float fFloatValue = (g12 == null || (fN2 = g12.n("radius")) == null) ? 0.0f : fN2.floatValue();
        if (g12 == null || (string = g12.getString("type")) == null || (typeValueOf = Corner.Type.valueOf(string)) == null) {
            typeValueOf = Corner.Type.f334112b;
        }
        return new Corner(fFloatValue, typeValueOf);
    }

    @Y61.k
    public static n c(@Y61.k G g12) {
        return new n((Corner) g12.k(a.f334146l, "cornerLeftTop", "cornerLeftTop"), (Corner) g12.k(b.f334147l, "cornerLeftBottom", "cornerLeftBottom"), (Corner) g12.k(c.f334148l, "cornerRightTop", "cornerRightTop"), (Corner) g12.k(d.f334149l, "cornerRightBottom", "cornerRightBottom"));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ n a(G g12) {
        return c(g12);
    }
}
