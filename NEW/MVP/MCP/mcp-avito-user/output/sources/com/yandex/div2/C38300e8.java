package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivTrigger;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTriggerTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/e8;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivTrigger;", "f", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.e8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38300e8 implements com.yandex.div.json.b, com.yandex.div.json.c<DivTrigger> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final f f374727d = new f(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivTrigger.Mode> f374728e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374729f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final U7 f374730g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final U7 f374731h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f374732i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f374733j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivTrigger.Mode>> f374734k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38300e8> f374735l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f374736a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f374737b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivTrigger.Mode>> f374738c;

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a$\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.e8$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374739l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.f(jSONObject, str2, DivAction.f371215j, C38300e8.f374730g, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.e8$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f374740l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370149c, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370131a);
        }
    }

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/e8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/e8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.e8$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38300e8> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f374741l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final C38300e8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C38300e8(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivTrigger$Mode;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.e8$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivTrigger.Mode>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f374742l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivTrigger.Mode> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivTrigger.Mode.f372183c.getClass();
            Y41.l<String, DivTrigger.Mode> lVar = DivTrigger.Mode.f372184d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivTrigger.Mode> bVar = C38300e8.f374728e;
            com.yandex.div.json.expressions.b<DivTrigger.Mode> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, C38300e8.f374729f);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.e8$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f374743l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTrigger.Mode);
        }
    }

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/e8$f;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/r;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivTrigger$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.e8$f */
    public static final class f {
        public /* synthetic */ f(C42822w c42822w) {
            this();
        }

        public f() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        DivTrigger.Mode mode = DivTrigger.Mode.ON_CONDITION;
        aVar.getClass();
        f374728e = b.a.a(mode);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivTrigger.Mode.values());
        e eVar = e.f374743l;
        aVar2.getClass();
        f374729f = new com.yandex.div.internal.parser.C(eVar, objC);
        f374730g = new U7(7);
        f374731h = new U7(8);
        f374732i = a.f374739l;
        f374733j = b.f374740l;
        f374734k = d.f374742l;
        f374735l = c.f374741l;
    }

    public C38300e8(com.yandex.div.json.e eVar, C38300e8 c38300e8, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        c38300e8 = (i12 & 2) != 0 ? null : c38300e8;
        z12 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<List<r>> aVar = c38300e8 == null ? null : c38300e8.f374736a;
        r.f376158i.getClass();
        this.f374736a = com.yandex.div.internal.parser.s.e(jSONObject, "actions", z12, aVar, r.f376172w, f374731h, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Boolean>> aVar2 = c38300e8 == null ? null : c38300e8.f374737b;
        Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
        E.a aVar3 = com.yandex.div.internal.parser.E.f370131a;
        C38106b c38106b = C38107c.f370139a;
        this.f374737b = com.yandex.div.internal.parser.s.d(jSONObject, "condition", z12, aVar2, lVar, c38106b, f370579a, aVar3);
        H21.a<com.yandex.div.json.expressions.b<DivTrigger.Mode>> aVar4 = c38300e8 != null ? c38300e8.f374738c : null;
        DivTrigger.Mode.f372183c.getClass();
        this.f374738c = com.yandex.div.internal.parser.s.i(jSONObject, "mode", z12, aVar4, DivTrigger.Mode.f372184d, c38106b, f370579a, f374729f);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        List listI = H21.b.i(this.f374736a, eVar, "actions", jSONObject, f374730g, f374732i);
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.b(this.f374737b, eVar, "condition", jSONObject, f374733j);
        com.yandex.div.json.expressions.b<DivTrigger.Mode> bVar2 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374738c, eVar, "mode", jSONObject, f374734k);
        if (bVar2 == null) {
            bVar2 = f374728e;
        }
        return new DivTrigger(listI, bVar, bVar2);
    }
}
