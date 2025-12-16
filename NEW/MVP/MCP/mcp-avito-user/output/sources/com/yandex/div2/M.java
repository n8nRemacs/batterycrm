package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivChangeBoundsTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/M;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/c8;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class M implements com.yandex.div.json.b, InterfaceC38280c8 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f372761d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372762e = com.google.firebase.components.g.i(200, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f372763f = b.a.a(DivAnimationInterpolator.EASE_IN_OUT);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372764g = b.a.a(0L);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372765h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38574v f372766i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C38574v f372767j;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f372768a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f372769b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f372770c;

    /* compiled from: DivChangeBoundsTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/M;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/M;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, M> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372771l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final M invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            M.f372761d.getClass();
            return c.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivChangeBoundsTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372772l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivChangeBoundsTransition.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div2/M$c;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static M a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38574v c38574v = M.f372766i;
            com.yandex.div.json.expressions.b<Long> bVar = M.f372762e;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, "duration", lVar, c38574v, f370579a, bVar, dVar);
            if (bVarI != null) {
                bVar = bVarI;
            }
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar2 = M.f372763f;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI2 = C38107c.i(jSONObject, "interpolator", lVar2, C38107c.f370139a, f370579a, bVar2, M.f372765h);
            if (bVarI2 != null) {
                bVar2 = bVarI2;
            }
            C38574v c38574v2 = M.f372767j;
            com.yandex.div.json.expressions.b<Long> bVar3 = M.f372764g;
            com.yandex.div.json.expressions.b<Long> bVarI3 = C38107c.i(jSONObject, "start_delay", lVar, c38574v2, f370579a, bVar3, dVar);
            if (bVarI3 != null) {
                bVar3 = bVarI3;
            }
            return new M(bVar, bVar2, bVar3);
        }

        public c() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAnimationInterpolator.values());
        b bVar = b.f372772l;
        aVar.getClass();
        f372765h = new com.yandex.div.internal.parser.C(bVar, objC);
        f372766i = new C38574v(10);
        f372767j = new C38574v(11);
        int i12 = a.f372771l;
    }

    @C21.b
    public M() {
        this(null, null, null, 7, null);
    }

    @C21.b
    public M(@Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.k com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar2, @Y61.k com.yandex.div.json.expressions.b<Long> bVar3) {
        this.f372768a = bVar;
        this.f372769b = bVar2;
        this.f372770c = bVar3;
    }

    public /* synthetic */ M(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f372762e : bVar, (i12 & 2) != 0 ? f372763f : bVar2, (i12 & 4) != 0 ? f372764g : bVar3);
    }
}
