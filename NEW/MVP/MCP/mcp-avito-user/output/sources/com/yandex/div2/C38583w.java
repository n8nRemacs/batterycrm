package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.AbstractC38548s0;
import com.yandex.div2.DivAnimation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAnimationTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/w;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivAnimation;", "l", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38583w implements com.yandex.div.json.b, com.yandex.div.json.c<DivAnimation> {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, AbstractC38548s0> f376779A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376780B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f376781C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38583w> f376782D;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final l f376783i = new l(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376784j = com.google.firebase.components.g.i(300, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f376785k = b.a.a(DivAnimationInterpolator.SPRING);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final AbstractC38548s0.d f376786l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376787m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376788n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376789o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final C38364h f376790p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final C38364h f376791q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final C38491p f376792r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final C38491p f376793s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final C38364h f376794t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final C38574v f376795u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376796v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f376797w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAnimationInterpolator>> f376798x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAnimation>> f376799y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAnimation.Name>> f376800z;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f376801a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f376802b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAnimationInterpolator>> f376803c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<C38583w>> f376804d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAnimation.Name>> f376805e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<AbstractC38557t0> f376806f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f376807g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f376808h;

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/w;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/w;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38583w> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376809l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38583w invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C38583w(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376810l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38364h c38364h = C38583w.f376791q;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = C38583w.f376784j;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, c38364h, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f376811l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370150d, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370134d);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAnimationInterpolator;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAnimationInterpolator>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f376812l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar = C38583w.f376785k;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, C38583w.f376788n);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAnimation;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAnimation>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f376813l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAnimation> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAnimation.f371255h.getClass();
            return C38107c.k(jSONObject, str2, DivAnimation.f371264q, C38583w.f376792r, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAnimation$Name;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAnimation.Name>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f376814l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAnimation.Name> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAnimation.Name.f371272c.getClass();
            return C38107c.c(jSONObject, str2, DivAnimation.Name.f371273d, C38107c.f370139a, eVar.getF370579a(), C38583w.f376789o);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/s0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/s0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, AbstractC38548s0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f376815l = new g();

        public g() {
            super(3);
        }

        @Override // Y41.q
        public final AbstractC38548s0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            AbstractC38548s0.f376579a.getClass();
            AbstractC38548s0 abstractC38548s0 = (AbstractC38548s0) C38107c.g(jSONObject, str, AbstractC38548s0.f376580b, eVar2.getF370579a(), eVar2);
            return abstractC38548s0 == null ? C38583w.f376786l : abstractC38548s0;
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f376816l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38574v c38574v = C38583w.f376795u;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = C38583w.f376787m;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, c38574v, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f376817l = new i();

        public i() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370150d, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370134d);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f376818l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f376819l = new k();

        public k() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimation.Name);
        }
    }

    /* compiled from: DivAnimationTemplate.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yandex/div2/w$l;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/w;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAnimation;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/s0$d;", "REPEAT_DEFAULT_VALUE", "Lcom/yandex/div2/s0$d;", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAnimation$Name;", "TYPE_HELPER_NAME", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w$l */
    public static final class l {
        public /* synthetic */ l(C42822w c42822w) {
            this();
        }

        public l() {
        }
    }

    static {
        new C38442l3();
        f376786l = new AbstractC38548s0.d(null);
        f376787m = b.a.a(0L);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAnimationInterpolator.values());
        j jVar = j.f376818l;
        aVar.getClass();
        f376788n = new com.yandex.div.internal.parser.C(jVar, objC);
        f376789o = new com.yandex.div.internal.parser.C(k.f376819l, C42756l.C(DivAnimation.Name.values()));
        f376790p = new C38364h(27);
        f376791q = new C38364h(28);
        f376792r = new C38491p(7);
        f376793s = new C38491p(8);
        f376794t = new C38364h(29);
        f376795u = new C38574v(0);
        f376796v = b.f376810l;
        f376797w = c.f376811l;
        f376798x = d.f376812l;
        f376799y = e.f376813l;
        f376800z = f.f376814l;
        f376779A = g.f376815l;
        f376780B = h.f376816l;
        f376781C = i.f376817l;
        f376782D = a.f376809l;
    }

    public C38583w(com.yandex.div.json.e eVar, C38583w c38583w, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        C38583w c38583w2 = (i12 & 2) != 0 ? null : c38583w;
        boolean z13 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar = c38583w2 == null ? null : c38583w2.f376801a;
        Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f376801a = com.yandex.div.internal.parser.s.i(jSONObject, "duration", z13, aVar, lVar, f376790p, f370579a, dVar);
        H21.a<com.yandex.div.json.expressions.b<Double>> aVar2 = c38583w2 == null ? null : c38583w2.f376802b;
        Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
        E.c cVar = com.yandex.div.internal.parser.E.f370134d;
        C38106b c38106b = C38107c.f370139a;
        this.f376802b = com.yandex.div.internal.parser.s.i(jSONObject, "end_value", z13, aVar2, lVar2, c38106b, f370579a, cVar);
        H21.a<com.yandex.div.json.expressions.b<DivAnimationInterpolator>> aVar3 = c38583w2 == null ? null : c38583w2.f376803c;
        DivAnimationInterpolator.f371286c.getClass();
        this.f376803c = com.yandex.div.internal.parser.s.i(jSONObject, "interpolator", z13, aVar3, DivAnimationInterpolator.f371287d, c38106b, f370579a, f376788n);
        this.f376804d = com.yandex.div.internal.parser.s.j(jSONObject, "items", z13, c38583w2 == null ? null : c38583w2.f376804d, f376782D, f376793s, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivAnimation.Name>> aVar4 = c38583w2 == null ? null : c38583w2.f376805e;
        DivAnimation.Name.f371272c.getClass();
        this.f376805e = com.yandex.div.internal.parser.s.d(jSONObject, "name", z13, aVar4, DivAnimation.Name.f371273d, c38106b, f370579a, f376789o);
        H21.a<AbstractC38557t0> aVar5 = c38583w2 == null ? null : c38583w2.f376806f;
        AbstractC38557t0.f376598a.getClass();
        this.f376806f = com.yandex.div.internal.parser.s.g(jSONObject, "repeat", z13, aVar5, AbstractC38557t0.f376599b, f370579a, eVar);
        this.f376807g = com.yandex.div.internal.parser.s.i(jSONObject, "start_delay", z13, c38583w2 == null ? null : c38583w2.f376807g, lVar, f376794t, f370579a, dVar);
        this.f376808h = com.yandex.div.internal.parser.s.i(jSONObject, "start_value", z13, c38583w2 != null ? c38583w2.f376808h : null, lVar2, c38106b, f370579a, cVar);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        com.yandex.div.json.expressions.b<Long> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f376801a, eVar, "duration", jSONObject, f376796v);
        if (bVar == null) {
            bVar = f376784j;
        }
        com.yandex.div.json.expressions.b<Long> bVar2 = bVar;
        com.yandex.div.json.expressions.b bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f376802b, eVar, "end_value", jSONObject, f376797w);
        com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar4 = (com.yandex.div.json.expressions.b) H21.b.d(this.f376803c, eVar, "interpolator", jSONObject, f376798x);
        if (bVar4 == null) {
            bVar4 = f376785k;
        }
        com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar5 = bVar4;
        List listG = H21.b.g(this.f376804d, eVar, "items", jSONObject, f376792r, f376799y);
        com.yandex.div.json.expressions.b bVar6 = (com.yandex.div.json.expressions.b) H21.b.b(this.f376805e, eVar, "name", jSONObject, f376800z);
        com.yandex.div.json.expressions.b<Long> bVar7 = (com.yandex.div.json.expressions.b) H21.b.d(this.f376807g, eVar, "start_delay", jSONObject, f376780B);
        if (bVar7 == null) {
            bVar7 = f376787m;
        }
        return new DivAnimation(bVar2, bVar3, bVar5, listG, bVar6, bVar7, (com.yandex.div.json.expressions.b) H21.b.d(this.f376808h, eVar, "start_value", jSONObject, f376781C));
    }
}
