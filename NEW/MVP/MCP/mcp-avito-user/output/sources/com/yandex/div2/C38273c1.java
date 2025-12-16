package com.yandex.div2;

import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivExtension.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/c1;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.c1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38273c1 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f374687c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final J0 f374688d = new J0(26);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38273c1> f374689e = a.f374692l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f374690a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final JSONObject f374691b;

    /* compiled from: DivExtension.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/c1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/c1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.c1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38273c1> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374692l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38273c1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C38273c1.f374687c.getClass();
            com.yandex.div.json.i iVarB = eVar.getF370579a();
            J0 j02 = C38273c1.f374688d;
            C38105a c38105a = C38107c.f370141c;
            return new C38273c1((String) C38107c.a(jSONObject2, "id", c38105a, j02), (JSONObject) C38107c.h(jSONObject2, "params", c38105a, C38107c.f370139a, iVarB));
        }
    }

    /* compiled from: DivExtension.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/c1$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ID_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.c1$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public C38273c1(@Y61.k String str, @Y61.l JSONObject jSONObject) {
        this.f374690a = str;
        this.f374691b = jSONObject;
    }

    public /* synthetic */ C38273c1(String str, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : jSONObject);
    }
}
