package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTrigger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivTrigger;", "Lcom/yandex/div/json/b;", "c", "Mode", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivTrigger implements com.yandex.div.json.b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f372175d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Mode> f372176e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372177f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final U7 f372178g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, DivTrigger> f372179h;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<DivAction> f372180a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f372181b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Mode> f372182c;

    /* compiled from: DivTrigger.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivTrigger$Mode;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Mode {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f372183c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Mode> f372184d = a.f372189l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f372188b;

        /* compiled from: DivTrigger.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivTrigger$Mode;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Mode> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f372189l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Mode invoke(String str) {
                String str2 = str;
                Mode mode = Mode.ON_CONDITION;
                if (str2.equals("on_condition")) {
                    return mode;
                }
                Mode mode2 = Mode.ON_VARIABLE;
                if (str2.equals("on_variable")) {
                    return mode2;
                }
                return null;
            }
        }

        /* compiled from: DivTrigger.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivTrigger$Mode$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Mode(String str) {
            this.f372188b = str;
        }
    }

    /* compiled from: DivTrigger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivTrigger;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivTrigger;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivTrigger> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372190l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivTrigger invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            DivTrigger.f372175d.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            U7 u72 = DivTrigger.f372178g;
            C38106b c38106b = C38107c.f370139a;
            List listF = C38107c.f(jSONObject2, "actions", pVar, u72, f370579a, eVar2);
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject2, "condition", com.yandex.div.internal.parser.y.f370149c, c38106b, f370579a, com.yandex.div.internal.parser.E.f370131a);
            Mode.f372183c.getClass();
            Y41.l<String, Mode> lVar = Mode.f372184d;
            com.yandex.div.json.expressions.b<Mode> bVar = DivTrigger.f372176e;
            com.yandex.div.json.expressions.b<Mode> bVarI = C38107c.i(jSONObject2, "mode", lVar, c38106b, f370579a, bVar, DivTrigger.f372177f);
            if (bVarI != null) {
                bVar = bVarI;
            }
            return new DivTrigger(listF, bVarC, bVar);
        }
    }

    /* compiled from: DivTrigger.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372191l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Mode);
        }
    }

    /* compiled from: DivTrigger.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/DivTrigger$c;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivTrigger$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Mode mode = Mode.ON_CONDITION;
        aVar.getClass();
        f372176e = b.a.a(mode);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Mode.values());
        b bVar = b.f372191l;
        aVar2.getClass();
        f372177f = new com.yandex.div.internal.parser.C(bVar, objC);
        f372178g = new U7(6);
        f372179h = a.f372190l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public DivTrigger(@Y61.k List<? extends DivAction> list, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar, @Y61.k com.yandex.div.json.expressions.b<Mode> bVar2) {
        this.f372180a = list;
        this.f372181b = bVar;
        this.f372182c = bVar2;
    }

    public /* synthetic */ DivTrigger(List list, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
        this(list, bVar, (i12 & 4) != 0 ? f372176e : bVar2);
    }
}
