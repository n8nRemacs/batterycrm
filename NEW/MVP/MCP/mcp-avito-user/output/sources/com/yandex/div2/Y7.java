package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTooltipTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/Y7;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivTooltip;", "j", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Y7 implements com.yandex.div.json.b, com.yandex.div.json.c<DivTooltip> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final j f374048h = new j(null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374049i = com.google.firebase.components.g.i(5000, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374050j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final D7 f374051k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final D7 f374052l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final D7 f374053m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final D7 f374054n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAnimation> f374055o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAnimation> f374056p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, AbstractC38330g> f374057q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f374058r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f374059s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, D4> f374060t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivTooltip.Position>> f374061u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, Y7> f374062v;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38583w> f374063a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38583w> f374064b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<AbstractC38259a7> f374065c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f374066d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f374067e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<E4> f374068f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivTooltip.Position>> f374069g;

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAnimation;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAnimation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAnimation> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374070l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final DivAnimation invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            DivAnimation.f371255h.getClass();
            return (DivAnimation) C38107c.g(jSONObject2, str, DivAnimation.f371264q, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAnimation;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAnimation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAnimation> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f374071l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final DivAnimation invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            DivAnimation.f371255h.getClass();
            return (DivAnimation) C38107c.g(jSONObject2, str, DivAnimation.f371264q, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Y7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Y7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Y7> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f374072l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final Y7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new Y7(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/g;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/g;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, AbstractC38330g> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f374073l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final AbstractC38330g invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            AbstractC38330g.f375012a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38330g> pVar = AbstractC38330g.f375013b;
            eVar2.getClass();
            return (AbstractC38330g) C38107c.b(jSONObject2, str, pVar, eVar2);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f374074l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            D7 d72 = Y7.f374052l;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = Y7.f374049i;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, d72, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f374075l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            D7 d72 = Y7.f374054n;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, d72);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/D4;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/D4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, D4> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f374076l = new g();

        public g() {
            super(3);
        }

        @Override // Y41.q
        public final D4 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            D4.f371168c.getClass();
            return (D4) C38107c.g(jSONObject2, str, D4.f371169d, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivTooltip$Position;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivTooltip.Position>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f374077l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivTooltip.Position> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivTooltip.Position.f372143c.getClass();
            return C38107c.c(jSONObject, str2, DivTooltip.Position.f372144d, C38107c.f370139a, eVar.getF370579a(), Y7.f374050j);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f374078l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTooltip.Position);
        }
    }

    /* compiled from: DivTooltipTemplate.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/Y7$j;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivTooltip$Position;", "TYPE_HELPER_POSITION", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class j {
        public /* synthetic */ j(C42822w c42822w) {
            this();
        }

        public j() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivTooltip.Position.values());
        i iVar = i.f374078l;
        aVar.getClass();
        f374050j = new com.yandex.div.internal.parser.C(iVar, objC);
        f374051k = new D7(16);
        f374052l = new D7(17);
        f374053m = new D7(18);
        f374054n = new D7(19);
        f374055o = a.f374070l;
        f374056p = b.f374071l;
        f374057q = d.f374073l;
        f374058r = e.f374074l;
        f374059s = f.f374075l;
        f374060t = g.f374076l;
        f374061u = h.f374077l;
        f374062v = c.f374072l;
    }

    public Y7(com.yandex.div.json.e eVar, Y7 y72, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        y72 = (i12 & 2) != 0 ? null : y72;
        z12 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<C38583w> aVar = y72 == null ? null : y72.f374063a;
        C38583w.f376783i.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, C38583w> pVar = C38583w.f376782D;
        this.f374063a = com.yandex.div.internal.parser.s.g(jSONObject, "animation_in", z12, aVar, pVar, f370579a, eVar);
        this.f374064b = com.yandex.div.internal.parser.s.g(jSONObject, "animation_out", z12, y72 == null ? null : y72.f374064b, pVar, f370579a, eVar);
        H21.a<AbstractC38259a7> aVar2 = y72 == null ? null : y72.f374065c;
        AbstractC38259a7.f374357a.getClass();
        this.f374065c = com.yandex.div.internal.parser.s.c(jSONObject, "div", z12, aVar2, AbstractC38259a7.f374358b, f370579a, eVar);
        this.f374066d = com.yandex.div.internal.parser.s.i(jSONObject, "duration", z12, y72 == null ? null : y72.f374066d, com.yandex.div.internal.parser.y.f370151e, f374051k, f370579a, com.yandex.div.internal.parser.E.f370132b);
        this.f374067e = com.yandex.div.internal.parser.s.b(jSONObject, "id", z12, y72 == null ? null : y72.f374067e, C38107c.f370141c, f374053m, f370579a);
        H21.a<E4> aVar3 = y72 == null ? null : y72.f374068f;
        E4.f372231c.getClass();
        this.f374068f = com.yandex.div.internal.parser.s.g(jSONObject, "offset", z12, aVar3, E4.f372234f, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivTooltip.Position>> aVar4 = y72 != null ? y72.f374069g : null;
        DivTooltip.Position.f372143c.getClass();
        this.f374069g = com.yandex.div.internal.parser.s.d(jSONObject, "position", z12, aVar4, DivTooltip.Position.f372144d, C38107c.f370139a, f370579a, f374050j);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        DivAnimation divAnimation = (DivAnimation) H21.b.f(this.f374063a, eVar, "animation_in", jSONObject, f374055o);
        DivAnimation divAnimation2 = (DivAnimation) H21.b.f(this.f374064b, eVar, "animation_out", jSONObject, f374056p);
        AbstractC38330g abstractC38330g = (AbstractC38330g) H21.b.h(this.f374065c, eVar, "div", jSONObject, f374057q);
        com.yandex.div.json.expressions.b<Long> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f374066d, eVar, "duration", jSONObject, f374058r);
        if (bVar == null) {
            bVar = f374049i;
        }
        return new DivTooltip(divAnimation, divAnimation2, abstractC38330g, bVar, (String) H21.b.b(this.f374067e, eVar, "id", jSONObject, f374059s), (D4) H21.b.f(this.f374068f, eVar, "offset", jSONObject, f374060t), (com.yandex.div.json.expressions.b) H21.b.b(this.f374069g, eVar, "position", jSONObject, f374061u));
    }
}
