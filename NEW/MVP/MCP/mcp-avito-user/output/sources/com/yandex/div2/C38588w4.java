package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPivotFixed.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/w4;", "Lcom/yandex/div/json/b;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.w4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38588w4 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f376931c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSizeUnit> f376932d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376933e;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivSizeUnit> f376934a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376935b;

    /* compiled from: DivPivotFixed.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/w4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/w4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38588w4> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f376936l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38588w4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38588w4.f376931c.getClass();
            return c.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivPivotFixed.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w4$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376937l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivPivotFixed.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/w4$c;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div/json/expressions/b;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w4$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38588w4 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivSizeUnit.f371957c.getClass();
            Y41.l<String, DivSizeUnit> lVar = DivSizeUnit.f371958d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar = C38588w4.f376932d;
            com.yandex.div.internal.parser.C c12 = C38588w4.f376933e;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVarI = C38107c.i(jSONObject, "unit", lVar, c38106b, f370579a, bVar, c12);
            if (bVarI != null) {
                bVar = bVarI;
            }
            return new C38588w4(bVar, C38107c.i(jSONObject, "value", com.yandex.div.internal.parser.y.f370151e, c38106b, f370579a, null, com.yandex.div.internal.parser.E.f370132b));
        }

        public c() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        aVar.getClass();
        f376932d = b.a.a(divSizeUnit);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSizeUnit.values());
        b bVar = b.f376937l;
        aVar2.getClass();
        f376933e = new com.yandex.div.internal.parser.C(bVar, objC);
        int i12 = a.f376936l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public C38588w4() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @C21.b
    public C38588w4(@Y61.k com.yandex.div.json.expressions.b<DivSizeUnit> bVar, @Y61.l com.yandex.div.json.expressions.b<Long> bVar2) {
        this.f376934a = bVar;
        this.f376935b = bVar2;
    }

    public /* synthetic */ C38588w4(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f376932d : bVar, (i12 & 2) != 0 ? null : bVar2);
    }
}
