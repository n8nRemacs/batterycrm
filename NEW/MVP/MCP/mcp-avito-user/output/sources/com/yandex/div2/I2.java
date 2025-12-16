package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivImageBackgroundTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/I2;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/E2;", "m", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class I2 implements com.yandex.div.json.b, com.yandex.div.json.c<E2> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f372543h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f372544i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentVertical> f372545j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372546k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivImageScale> f372547l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372548m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372549n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372550o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f372551p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f372552q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f372553r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f372554s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f372555t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f372556u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> f372557v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<AbstractC38386j1>> f372558w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f372559x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f372560y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivImageScale>> f372561z;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f372562a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f372563b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> f372564c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<AbstractC38409k1>> f372565d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f372566e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f372567f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivImageScale>> f372568g;

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372569l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38459n2 c38459n2 = I2.f372552q;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = I2.f372543h;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, c38459n2, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372570l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = I2.f372544i;
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, I2.f372548m);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentVertical;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f372571l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentVertical> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentVertical.f371246c.getClass();
            Y41.l<String, DivAlignmentVertical> lVar = DivAlignmentVertical.f371247d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar = I2.f372545j;
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, I2.f372549n);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/I2;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/I2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, I2> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372572l = 0;

        static {
            new d();
        }

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final I2 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new I2(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/j1;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<AbstractC38386j1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f372573l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final List<AbstractC38386j1> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            AbstractC38386j1.f375414a.getClass();
            return C38107c.k(jSONObject, str2, AbstractC38386j1.f375415b, I2.f372553r, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f372574l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f372575l = new g();

        public g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Boolean> bVar = I2.f372546k;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivImageScale;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivImageScale>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f372576l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivImageScale> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivImageScale.f371558c.getClass();
            Y41.l<String, DivImageScale> lVar = DivImageScale.f371559d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivImageScale> bVar = I2.f372547l;
            com.yandex.div.json.expressions.b<DivImageScale> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, I2.f372550o);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f372577l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f372578l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f372579l = new k();

        public k() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372580l = 0;

        static {
            new l();
        }

        public l() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/div2/I2$m;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/k1;", "FILTERS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/j1;", "FILTERS_VALIDATOR", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class m {
        public /* synthetic */ m(C42822w c42822w) {
            this();
        }

        public m() {
        }
    }

    static {
        new m(null);
        f372543h = C38492p0.a(1.0d, com.yandex.div.json.expressions.b.f370552a);
        f372544i = b.a.a(DivAlignmentHorizontal.CENTER);
        f372545j = b.a.a(DivAlignmentVertical.CENTER);
        f372546k = b.a.a(Boolean.FALSE);
        f372547l = b.a.a(DivImageScale.FILL);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        i iVar = i.f372577l;
        aVar.getClass();
        f372548m = new com.yandex.div.internal.parser.C(iVar, objC);
        f372549n = new com.yandex.div.internal.parser.C(j.f372578l, C42756l.C(DivAlignmentVertical.values()));
        f372550o = new com.yandex.div.internal.parser.C(k.f372579l, C42756l.C(DivImageScale.values()));
        f372551p = new C38459n2(11);
        f372552q = new C38459n2(12);
        f372553r = new C38450m2(21);
        f372554s = new C38450m2(22);
        f372555t = a.f372569l;
        f372556u = b.f372570l;
        f372557v = c.f372571l;
        f372558w = e.f372573l;
        f372559x = f.f372574l;
        f372560y = g.f372575l;
        f372561z = h.f372576l;
        int i12 = l.f372580l;
        int i13 = d.f372572l;
    }

    public /* synthetic */ I2(com.yandex.div.json.e eVar, I2 i22, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : i22, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final E2 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.expressions.b<Double> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f372562a, eVar, "alpha", jSONObject, f372555t);
        if (bVar == null) {
            bVar = f372543h;
        }
        com.yandex.div.json.expressions.b<Double> bVar2 = bVar;
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372563b, eVar, "content_alignment_horizontal", jSONObject, f372556u);
        if (bVar3 == null) {
            bVar3 = f372544i;
        }
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar4 = bVar3;
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372564c, eVar, "content_alignment_vertical", jSONObject, f372557v);
        if (bVar5 == null) {
            bVar5 = f372545j;
        }
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar6 = bVar5;
        List listG = H21.b.g(this.f372565d, eVar, "filters", jSONObject, f372553r, f372558w);
        com.yandex.div.json.expressions.b bVar7 = (com.yandex.div.json.expressions.b) H21.b.b(this.f372566e, eVar, "image_url", jSONObject, f372559x);
        com.yandex.div.json.expressions.b<Boolean> bVar8 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372567f, eVar, "preload_required", jSONObject, f372560y);
        if (bVar8 == null) {
            bVar8 = f372546k;
        }
        com.yandex.div.json.expressions.b<Boolean> bVar9 = bVar8;
        com.yandex.div.json.expressions.b<DivImageScale> bVar10 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372568g, eVar, "scale", jSONObject, f372561z);
        if (bVar10 == null) {
            bVar10 = f372547l;
        }
        return new E2(bVar2, bVar4, bVar6, listG, bVar7, bVar9, bVar10);
    }

    public I2(@Y61.k com.yandex.div.json.e eVar, @Y61.l I2 i22, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        this.f372562a = com.yandex.div.internal.parser.s.i(jSONObject, "alpha", z12, i22 == null ? null : i22.f372562a, com.yandex.div.internal.parser.y.f370150d, f372551p, f370579a, com.yandex.div.internal.parser.E.f370134d);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> aVar = i22 == null ? null : i22.f372563b;
        DivAlignmentHorizontal.f371238c.getClass();
        Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
        C38106b c38106b = C38107c.f370139a;
        this.f372563b = com.yandex.div.internal.parser.s.i(jSONObject, "content_alignment_horizontal", z12, aVar, lVar, c38106b, f370579a, f372548m);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> aVar2 = i22 == null ? null : i22.f372564c;
        DivAlignmentVertical.f371246c.getClass();
        this.f372564c = com.yandex.div.internal.parser.s.i(jSONObject, "content_alignment_vertical", z12, aVar2, DivAlignmentVertical.f371247d, c38106b, f370579a, f372549n);
        H21.a<List<AbstractC38409k1>> aVar3 = i22 == null ? null : i22.f372565d;
        AbstractC38409k1.f375635a.getClass();
        this.f372565d = com.yandex.div.internal.parser.s.j(jSONObject, "filters", z12, aVar3, AbstractC38409k1.f375636b, f372554s, f370579a, eVar);
        this.f372566e = com.yandex.div.internal.parser.s.d(jSONObject, "image_url", z12, i22 == null ? null : i22.f372566e, com.yandex.div.internal.parser.y.f370148b, c38106b, f370579a, com.yandex.div.internal.parser.E.f370135e);
        this.f372567f = com.yandex.div.internal.parser.s.i(jSONObject, "preload_required", z12, i22 == null ? null : i22.f372567f, com.yandex.div.internal.parser.y.f370149c, c38106b, f370579a, com.yandex.div.internal.parser.E.f370131a);
        H21.a<com.yandex.div.json.expressions.b<DivImageScale>> aVar4 = i22 == null ? null : i22.f372568g;
        DivImageScale.f371558c.getClass();
        this.f372568g = com.yandex.div.internal.parser.s.i(jSONObject, "scale", z12, aVar4, DivImageScale.f371559d, c38106b, f370579a, f372550o);
    }
}
