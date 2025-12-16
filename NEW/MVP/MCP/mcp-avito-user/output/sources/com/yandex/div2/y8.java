package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivWrapContentSize.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/y8;", "Lcom/yandex/div/json/b;", "b", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class y8 implements com.yandex.div.json.b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f377206d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Boolean> f377207a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final c f377208b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final c f377209c;

    /* compiled from: DivWrapContentSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/y8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/y8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, y8> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f377210l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final y8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            y8.f377206d.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivWrapContentSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/y8$b;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static y8 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "constrained", com.yandex.div.internal.parser.y.f370149c, C38107c.f370139a, f370579a, null, com.yandex.div.internal.parser.E.f370131a);
            c.f377211c.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, c> pVar = c.f377215g;
            return new y8(bVarI, (c) C38107c.g(jSONObject, "max_size", pVar, f370579a, eVar), (c) C38107c.g(jSONObject, "min_size", pVar, f370579a, eVar));
        }

        public b() {
        }
    }

    static {
        int i12 = a.f377210l;
    }

    @C21.b
    public y8() {
        this(null, null, null, 7, null);
    }

    @C21.b
    public y8(@Y61.l com.yandex.div.json.expressions.b<Boolean> bVar, @Y61.l c cVar, @Y61.l c cVar2) {
        this.f377207a = bVar;
        this.f377208b = cVar;
        this.f377209c = cVar2;
    }

    /* compiled from: DivWrapContentSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/y8$c;", "Lcom/yandex/div/json/b;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c implements com.yandex.div.json.b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C10944c f377211c = new C10944c(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<DivSizeUnit> f377212d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f377213e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final p8 f377214f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, c> f377215g;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<DivSizeUnit> f377216a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Long> f377217b;

        /* compiled from: DivWrapContentSize.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/y8$c;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/y8$c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, c> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f377218l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final c invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                c.f377211c.getClass();
                com.yandex.div.json.i f370579a = eVar.getF370579a();
                DivSizeUnit.f371957c.getClass();
                Y41.l<String, DivSizeUnit> lVar = DivSizeUnit.f371958d;
                com.yandex.div.json.expressions.b<DivSizeUnit> bVar = c.f377212d;
                com.yandex.div.json.expressions.b<DivSizeUnit> bVarI = C38107c.i(jSONObject2, "unit", lVar, C38107c.f370139a, f370579a, bVar, c.f377213e);
                if (bVarI != null) {
                    bVar = bVarI;
                }
                return new c(bVar, C38107c.c(jSONObject2, "value", com.yandex.div.internal.parser.y.f370151e, c.f377214f, f370579a, com.yandex.div.internal.parser.E.f370132b));
            }
        }

        /* compiled from: DivWrapContentSize.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f377219l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        }

        /* compiled from: DivWrapContentSize.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/div2/y8$c$c;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div/json/expressions/b;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "VALUE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div2.y8$c$c, reason: collision with other inner class name */
        public static final class C10944c {
            public /* synthetic */ C10944c(C42822w c42822w) {
                this();
            }

            public C10944c() {
            }
        }

        static {
            b.a aVar = com.yandex.div.json.expressions.b.f370552a;
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            aVar.getClass();
            f377212d = b.a.a(divSizeUnit);
            D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
            Object objC = C42756l.C(DivSizeUnit.values());
            b bVar = b.f377219l;
            aVar2.getClass();
            f377213e = new com.yandex.div.internal.parser.C(bVar, objC);
            f377214f = new p8(26);
            f377215g = a.f377218l;
        }

        @C21.b
        public c(@Y61.k com.yandex.div.json.expressions.b<DivSizeUnit> bVar, @Y61.k com.yandex.div.json.expressions.b<Long> bVar2) {
            this.f377216a = bVar;
            this.f377217b = bVar2;
        }

        public /* synthetic */ c(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? f377212d : bVar, bVar2);
        }
    }

    public /* synthetic */ y8(com.yandex.div.json.expressions.b bVar, c cVar, c cVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : cVar, (i12 & 4) != 0 ? null : cVar2);
    }
}
