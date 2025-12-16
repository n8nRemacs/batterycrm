package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/U0;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class U0 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f373676c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final B0 f373677d = new B0(24);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final B0 f373678e = new B0(25);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, U0> f373679f = a.f373682l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373680a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373681b;

    /* compiled from: DivDownloadCallbacks.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/U0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/U0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, U0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373682l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final U0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            U0.f373676c.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            return new U0(C38107c.k(jSONObject2, "on_fail_actions", pVar, U0.f373677d, f370579a, eVar2), C38107c.k(jSONObject2, "on_success_actions", pVar, U0.f373678e, f370579a, eVar2));
        }
    }

    /* compiled from: DivDownloadCallbacks.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/U0$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ON_FAIL_ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "ON_SUCCESS_ACTIONS_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public U0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public U0(@Y61.l List<? extends DivAction> list, @Y61.l List<? extends DivAction> list2) {
        this.f373680a = list;
        this.f373681b = list2;
    }

    public /* synthetic */ U0(List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : list2);
    }
}
