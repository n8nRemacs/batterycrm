package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.AbstractC38579v4;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTransform.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/a8;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.a8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38260a8 implements com.yandex.div.json.b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f374376d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final AbstractC38579v4.d f374377e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final AbstractC38579v4.d f374378f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38260a8> f374379g;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final AbstractC38579v4 f374380a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final AbstractC38579v4 f374381b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Double> f374382c;

    /* compiled from: DivTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/a8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/a8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.a8$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38260a8> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374383l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38260a8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            C38260a8.f374376d.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            AbstractC38579v4.f376770a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38579v4> pVar = AbstractC38579v4.f376771b;
            AbstractC38579v4 abstractC38579v4 = (AbstractC38579v4) C38107c.g(jSONObject2, "pivot_x", pVar, f370579a, eVar2);
            if (abstractC38579v4 == null) {
                abstractC38579v4 = C38260a8.f374377e;
            }
            AbstractC38579v4 abstractC38579v42 = abstractC38579v4;
            AbstractC38579v4 abstractC38579v43 = (AbstractC38579v4) C38107c.g(jSONObject2, "pivot_y", pVar, f370579a, eVar2);
            if (abstractC38579v43 == null) {
                abstractC38579v43 = C38260a8.f374378f;
            }
            return new C38260a8(abstractC38579v42, abstractC38579v43, C38107c.i(jSONObject2, "rotation", com.yandex.div.internal.parser.y.f370150d, C38107c.f370139a, f370579a, null, com.yandex.div.internal.parser.E.f370134d));
        }
    }

    /* compiled from: DivTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div2/a8$b;", "", "<init>", "()V", "Lcom/yandex/div2/v4$d;", "PIVOT_X_DEFAULT_VALUE", "Lcom/yandex/div2/v4$d;", "PIVOT_Y_DEFAULT_VALUE", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.a8$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Double dValueOf = Double.valueOf(50.0d);
        aVar.getClass();
        f374377e = new AbstractC38579v4.d(new A4(b.a.a(dValueOf)));
        f374378f = new AbstractC38579v4.d(new A4(b.a.a(dValueOf)));
        f374379g = a.f374383l;
    }

    @C21.b
    public C38260a8() {
        this(null, null, null, 7, null);
    }

    @C21.b
    public C38260a8(@Y61.k AbstractC38579v4 abstractC38579v4, @Y61.k AbstractC38579v4 abstractC38579v42, @Y61.l com.yandex.div.json.expressions.b<Double> bVar) {
        this.f374380a = abstractC38579v4;
        this.f374381b = abstractC38579v42;
        this.f374382c = bVar;
    }

    public /* synthetic */ C38260a8(AbstractC38579v4 abstractC38579v4, AbstractC38579v4 abstractC38579v42, com.yandex.div.json.expressions.b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f374377e : abstractC38579v4, (i12 & 2) != 0 ? f374378f : abstractC38579v42, (i12 & 4) != 0 ? null : bVar);
    }
}
