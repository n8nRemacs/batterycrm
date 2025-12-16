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

/* compiled from: DivFadeTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/f1;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/c8;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.f1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38303f1 implements com.yandex.div.json.b, InterfaceC38280c8 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final c f374755e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374756f = C38492p0.a(0.0d, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374757g = b.a.a(200L);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f374758h = b.a.a(DivAnimationInterpolator.EASE_IN_OUT);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374759i = b.a.a(0L);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374760j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final J0 f374761k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final C38293e1 f374762l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final C38293e1 f374763m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38303f1> f374764n;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f374765a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374766b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f374767c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374768d;

    /* compiled from: DivFadeTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/f1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/f1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38303f1> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374769l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38303f1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38303f1.f374755e.getClass();
            return c.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivFadeTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f374770l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivFadeTransition.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div2/f1$c;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "", "DURATION_DEFAULT_VALUE", "DURATION_TEMPLATE_VALIDATOR", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f1$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38303f1 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            J0 j02 = C38303f1.f374761k;
            com.yandex.div.json.expressions.b<Double> bVar = C38303f1.f374756f;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, "alpha", lVar, j02, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            if (bVarI != null) {
                bVar = bVarI;
            }
            Y41.l<Number, Long> lVar2 = com.yandex.div.internal.parser.y.f370151e;
            C38293e1 c38293e1 = C38303f1.f374762l;
            com.yandex.div.json.expressions.b<Long> bVar2 = C38303f1.f374757g;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI2 = C38107c.i(jSONObject, "duration", lVar2, c38293e1, f370579a, bVar2, dVar);
            if (bVarI2 != null) {
                bVar2 = bVarI2;
            }
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar3 = C38303f1.f374758h;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI3 = C38107c.i(jSONObject, "interpolator", lVar3, C38107c.f370139a, f370579a, bVar3, C38303f1.f374760j);
            if (bVarI3 != null) {
                bVar3 = bVarI3;
            }
            C38293e1 c38293e12 = C38303f1.f374763m;
            com.yandex.div.json.expressions.b<Long> bVar4 = C38303f1.f374759i;
            com.yandex.div.json.expressions.b<Long> bVarI4 = C38107c.i(jSONObject, "start_delay", lVar2, c38293e12, f370579a, bVar4, dVar);
            if (bVarI4 != null) {
                bVar4 = bVarI4;
            }
            return new C38303f1(bVar, bVar2, bVar3, bVar4);
        }

        public c() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAnimationInterpolator.values());
        b bVar = b.f374770l;
        aVar.getClass();
        f374760j = new com.yandex.div.internal.parser.C(bVar, objC);
        f374761k = new J0(29);
        f374762l = new C38293e1(0);
        f374763m = new C38293e1(1);
        f374764n = a.f374769l;
    }

    @C21.b
    public C38303f1() {
        this(null, null, null, null, 15, null);
    }

    @C21.b
    public C38303f1(@Y61.k com.yandex.div.json.expressions.b<Double> bVar, @Y61.k com.yandex.div.json.expressions.b<Long> bVar2, @Y61.k com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar3, @Y61.k com.yandex.div.json.expressions.b<Long> bVar4) {
        this.f374765a = bVar;
        this.f374766b = bVar2;
        this.f374767c = bVar3;
        this.f374768d = bVar4;
    }

    public /* synthetic */ C38303f1(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f374756f : bVar, (i12 & 2) != 0 ? f374757g : bVar2, (i12 & 4) != 0 ? f374758h : bVar3, (i12 & 8) != 0 ? f374759i : bVar4);
    }
}
