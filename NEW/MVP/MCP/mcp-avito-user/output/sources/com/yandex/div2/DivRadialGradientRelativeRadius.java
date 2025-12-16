package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadius.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius;", "Lcom/yandex/div/json/b;", "c", "Value", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivRadialGradientRelativeRadius implements com.yandex.div.json.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f371862b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371863c;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Value> f371864a;

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Value {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371865c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Value> f371866d = a.f371873l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371872b;

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Value> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371873l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Value invoke(String str) {
                String str2 = str;
                Value value = Value.NEAREST_CORNER;
                if (str2.equals("nearest_corner")) {
                    return value;
                }
                Value value2 = Value.FARTHEST_CORNER;
                if (str2.equals("farthest_corner")) {
                    return value2;
                }
                Value value3 = Value.NEAREST_SIDE;
                if (str2.equals("nearest_side")) {
                    return value3;
                }
                Value value4 = Value.FARTHEST_SIDE;
                if (str2.equals("farthest_side")) {
                    return value4;
                }
                return null;
            }
        }

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Value(String str) {
            this.f371872b = str;
        }
    }

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivRadialGradientRelativeRadius;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivRadialGradientRelativeRadius;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivRadialGradientRelativeRadius> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371874l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivRadialGradientRelativeRadius invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            DivRadialGradientRelativeRadius.f371862b.getClass();
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Value.f371865c.getClass();
            return new DivRadialGradientRelativeRadius(C38107c.c(jSONObject2, "value", Value.f371866d, C38107c.f370139a, f370579a, DivRadialGradientRelativeRadius.f371863c));
        }
    }

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371875l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Value);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$c;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "TYPE_HELPER_VALUE", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Value.values());
        b bVar = b.f371875l;
        aVar.getClass();
        f371863c = new com.yandex.div.internal.parser.C(bVar, objC);
        int i12 = a.f371874l;
    }

    @C21.b
    public DivRadialGradientRelativeRadius(@Y61.k com.yandex.div.json.expressions.b<Value> bVar) {
        this.f371864a = bVar;
    }
}
