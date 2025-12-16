package com.yandex.div2;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ServiceTypeKt;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivFocus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/u1;", "Lcom/yandex/div/json/b;", "b", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.u1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38567u1 implements com.yandex.div.json.b {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f376619f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final K f376620g = new K(null, null, null, null, null, 31, null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f376621h = new C38458n1(3);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f376622i = new C38458n1(4);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f376623j = new C38458n1(5);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38567u1> f376624k = a.f376630l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<F> f376625a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final K f376626b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final c f376627c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f376628d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f376629e;

    /* compiled from: DivFocus.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/u1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/u1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.u1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38567u1> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376630l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38567u1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            C38567u1.f376619f.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            F.f372262a.getClass();
            List listK = C38107c.k(jSONObject2, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, C38567u1.f376621h, f370579a, eVar2);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject2, "border", K.f372638i, f370579a, eVar2);
            if (k12 == null) {
                k12 = C38567u1.f376620g;
            }
            K k13 = k12;
            c.f376631f.getClass();
            c cVar = (c) C38107c.g(jSONObject2, "next_focus_ids", c.f376637l, f370579a, eVar2);
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            return new C38567u1(listK, k13, cVar, C38107c.k(jSONObject2, "on_blur", pVar, C38567u1.f376622i, f370579a, eVar2), C38107c.k(jSONObject2, "on_focus", pVar, C38567u1.f376623j, f370579a, eVar2));
        }
    }

    /* compiled from: DivFocus.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/u1$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "Lcom/yandex/div2/DivAction;", "ON_BLUR_VALIDATOR", "ON_FOCUS_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.u1$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivFocus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/u1$c;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.u1$c */
    public static class c implements com.yandex.div.json.b {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final b f376631f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final C38293e1 f376632g = new C38293e1(26);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final C38293e1 f376633h = new C38293e1(27);

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final C38293e1 f376634i = new C38293e1(28);

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public static final C38293e1 f376635j = new C38293e1(29);

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public static final C38576v1 f376636k = new C38576v1(0);

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, c> f376637l = a.f376643l;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<String> f376638a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<String> f376639b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<String> f376640c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<String> f376641d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<String> f376642e;

        /* compiled from: DivFocus.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/u1$c;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/u1$c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.yandex.div2.u1$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, c> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f376643l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final c invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                c.f376631f.getClass();
                com.yandex.div.json.i f370579a = eVar.getF370579a();
                C38293e1 c38293e1 = c.f376632g;
                E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
                C38105a c38105a = C38107c.f370141c;
                return new c(C38107c.i(jSONObject2, "down", c38105a, c38293e1, f370579a, null, eVar2), C38107c.i(jSONObject2, "forward", c38105a, c.f376633h, f370579a, null, eVar2), C38107c.i(jSONObject2, "left", c38105a, c.f376634i, f370579a, null, eVar2), C38107c.i(jSONObject2, "right", c38105a, c.f376635j, f370579a, null, eVar2), C38107c.i(jSONObject2, ServiceTypeKt.SERVICE_PUSHUP, c38105a, c.f376636k, f370579a, null, eVar2));
            }
        }

        /* compiled from: DivFocus.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/u1$c$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "DOWN_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DOWN_VALIDATOR", "FORWARD_TEMPLATE_VALIDATOR", "FORWARD_VALIDATOR", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "UP_TEMPLATE_VALIDATOR", "UP_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div2.u1$c$b */
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        @C21.b
        public c() {
            this(null, null, null, null, null, 31, null);
        }

        @C21.b
        public c(@Y61.l com.yandex.div.json.expressions.b<String> bVar, @Y61.l com.yandex.div.json.expressions.b<String> bVar2, @Y61.l com.yandex.div.json.expressions.b<String> bVar3, @Y61.l com.yandex.div.json.expressions.b<String> bVar4, @Y61.l com.yandex.div.json.expressions.b<String> bVar5) {
            this.f376638a = bVar;
            this.f376639b = bVar2;
            this.f376640c = bVar3;
            this.f376641d = bVar4;
            this.f376642e = bVar5;
        }

        public /* synthetic */ c(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : bVar2, (i12 & 4) != 0 ? null : bVar3, (i12 & 8) != 0 ? null : bVar4, (i12 & 16) != 0 ? null : bVar5);
        }
    }

    @C21.b
    public C38567u1() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public C38567u1(@Y61.l List<? extends F> list, @Y61.k K k12, @Y61.l c cVar, @Y61.l List<? extends DivAction> list2, @Y61.l List<? extends DivAction> list3) {
        this.f376625a = list;
        this.f376626b = k12;
        this.f376627c = cVar;
        this.f376628d = list2;
        this.f376629e = list3;
    }

    public /* synthetic */ C38567u1(List list, K k12, c cVar, List list2, List list3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? f376620g : k12, (i12 & 4) != 0 ? null : cVar, (i12 & 8) != 0 ? null : list2, (i12 & 16) != 0 ? null : list3);
    }
}
