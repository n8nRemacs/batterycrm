package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/x7;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.x7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38600x7 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f376971c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final P6 f376972d = new P6(27);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38600x7> f376973e = a.f376976l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376974a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final C38656z6 f376975b;

    /* compiled from: DivTextRangeBorder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/x7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/x7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.x7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38600x7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376976l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38600x7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            C38600x7.f376971c.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject2, "corner_radius", com.yandex.div.internal.parser.y.f370151e, C38600x7.f376972d, f370579a, null, com.yandex.div.internal.parser.E.f370132b);
            C38656z6.f377427d.getClass();
            return new C38600x7(bVarI, (C38656z6) C38107c.g(jSONObject2, "stroke", C38656z6.f377432i, f370579a, eVar2));
        }
    }

    /* compiled from: DivTextRangeBorder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/x7$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "CORNER_RADIUS_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.x7$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public C38600x7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @C21.b
    public C38600x7(@Y61.l com.yandex.div.json.expressions.b<Long> bVar, @Y61.l C38656z6 c38656z6) {
        this.f376974a = bVar;
        this.f376975b = c38656z6;
    }

    public /* synthetic */ C38600x7(com.yandex.div.json.expressions.b bVar, C38656z6 c38656z6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : c38656z6);
    }
}
