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

/* compiled from: DivPatch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/DivPatch;", "Lcom/yandex/div/json/b;", "a", "d", "Mode", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivPatch implements com.yandex.div.json.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final d f371843b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Mode> f371844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final R3 f371846e;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<a> f371847a;

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivPatch$Mode;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371848c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Mode> f371849d = a.f371854l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371853b;

        /* compiled from: DivPatch.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivPatch$Mode;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Mode> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371854l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Mode invoke(String str) {
                String str2 = str;
                Mode mode = Mode.TRANSACTIONAL;
                if (str2.equals("transactional")) {
                    return mode;
                }
                Mode mode2 = Mode.PARTIAL;
                if (str2.equals("partial")) {
                    return mode2;
                }
                return null;
            }
        }

        /* compiled from: DivPatch.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivPatch$Mode$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Mode(String str) {
            this.f371853b = str;
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivPatch;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivPatch;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivPatch> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371860l = 0;

        static {
            new b();
        }

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final DivPatch invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            DivPatch.f371843b.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            a.f371855b.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, a> pVar = a.f371857d;
            R3 r32 = DivPatch.f371846e;
            C38106b c38106b = C38107c.f370139a;
            List listF = C38107c.f(jSONObject2, "changes", pVar, r32, f370579a, eVar2);
            Mode.f371848c.getClass();
            C38107c.i(jSONObject2, "mode", Mode.f371849d, c38106b, f370579a, DivPatch.f371844c, DivPatch.f371845d);
            return new DivPatch(listF);
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371861l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Mode);
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/DivPatch$d;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivPatch$a;", "CHANGES_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivPatch$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Mode mode = Mode.PARTIAL;
        aVar.getClass();
        f371844c = b.a.a(mode);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Mode.values());
        c cVar = c.f371861l;
        aVar2.getClass();
        f371845d = new com.yandex.div.internal.parser.C(cVar, objC);
        f371846e = new R3(27);
        int i12 = b.f371860l;
    }

    @C21.b
    public DivPatch(@Y61.k List list) {
        this.f371847a = list;
    }

    /* compiled from: DivPatch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivPatch$a;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a implements com.yandex.div.json.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f371855b = new b(null);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final R3 f371856c = new R3(28);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, a> f371857d = C10938a.f371859l;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final List<AbstractC38330g> f371858a;

        /* compiled from: DivPatch.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivPatch$a;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivPatch$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.yandex.div2.DivPatch$a$a, reason: collision with other inner class name */
        public static final class C10938a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10938a f371859l = new C10938a();

            public C10938a() {
                super(2);
            }

            @Override // Y41.p
            public final a invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                com.yandex.div.json.e eVar2 = eVar;
                JSONObject jSONObject2 = jSONObject;
                a.f371855b.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                AbstractC38330g.f375012a.getClass();
                return new a(C38107c.k(jSONObject2, "items", AbstractC38330g.f375013b, a.f371856c, f370579a, eVar2));
            }
        }

        /* compiled from: DivPatch.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div2/DivPatch$a$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/g;", "ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        @C21.b
        public a(@Y61.l List list) {
            this.f371858a = list;
        }

        public /* synthetic */ a(String str, List list, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : list);
        }
    }

    public /* synthetic */ DivPatch(List list, com.yandex.div.json.expressions.b bVar, int i12, C42822w c42822w) {
        this(list);
    }
}
