package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivFixedSize.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/q1;", "Lcom/yandex/div/json/b;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.q1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38502q1 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f376146c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSizeUnit> f376147d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376148e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C38293e1 f376149f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38502q1> f376150g;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivSizeUnit> f376151a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f376152b;

    /* compiled from: DivFixedSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/q1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/q1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.q1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38502q1> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376153l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38502q1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38502q1.f376146c.getClass();
            return c.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivFixedSize.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.q1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376154l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivFixedSize.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/q1$c;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div/json/expressions/b;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "VALUE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.q1$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38502q1 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivSizeUnit.f371957c.getClass();
            Y41.l<String, DivSizeUnit> lVar = DivSizeUnit.f371958d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar = C38502q1.f376147d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVarI = C38107c.i(jSONObject, "unit", lVar, C38107c.f370139a, f370579a, bVar, C38502q1.f376148e);
            if (bVarI != null) {
                bVar = bVarI;
            }
            return new C38502q1(bVar, C38107c.c(jSONObject, "value", com.yandex.div.internal.parser.y.f370151e, C38502q1.f376149f, f370579a, com.yandex.div.internal.parser.E.f370132b));
        }

        public c() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        aVar.getClass();
        f376147d = b.a.a(divSizeUnit);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSizeUnit.values());
        b bVar = b.f376154l;
        aVar2.getClass();
        f376148e = new com.yandex.div.internal.parser.C(bVar, objC);
        f376149f = new C38293e1(23);
        f376150g = a.f376153l;
    }

    @C21.b
    public C38502q1(@Y61.k com.yandex.div.json.expressions.b<DivSizeUnit> bVar, @Y61.k com.yandex.div.json.expressions.b<Long> bVar2) {
        this.f376151a = bVar;
        this.f376152b = bVar2;
    }

    public /* synthetic */ C38502q1(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f376147d : bVar, bVar2);
    }
}
