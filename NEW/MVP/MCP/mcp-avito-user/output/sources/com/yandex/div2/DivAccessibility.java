package com.yandex.div2;

import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAccessibility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/b;", "c", "Mode", "Type", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivAccessibility implements com.yandex.div.json.b {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final c f371175f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Mode> f371176g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f371177h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371178i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C38364h f371179j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C38364h f371180k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final C38364h f371181l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, DivAccessibility> f371182m;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<String> f371183a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<String> f371184b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Mode> f371185c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<String> f371186d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final Type f371187e;

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Mode;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Mode {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371188c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Mode> f371189d = a.f371195l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371194b;

        /* compiled from: DivAccessibility.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAccessibility$Mode;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Mode> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371195l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Mode invoke(String str) {
                String str2 = str;
                Mode mode = Mode.DEFAULT;
                if (str2.equals("default")) {
                    return mode;
                }
                Mode mode2 = Mode.MERGE;
                if (str2.equals("merge")) {
                    return mode2;
                }
                Mode mode3 = Mode.EXCLUDE;
                if (str2.equals("exclude")) {
                    return mode3;
                }
                return null;
            }
        }

        /* compiled from: DivAccessibility.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Mode$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Mode(String str) {
            this.f371194b = str;
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Type;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371196c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Type> f371197d = a.f371208l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371207b;

        /* compiled from: DivAccessibility.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAccessibility$Type;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Type> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371208l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Type invoke(String str) {
                String str2 = str;
                Type type = Type.NONE;
                if (str2.equals("none")) {
                    return type;
                }
                Type type2 = Type.BUTTON;
                if (str2.equals("button")) {
                    return type2;
                }
                Type type3 = Type.IMAGE;
                if (str2.equals("image")) {
                    return type3;
                }
                Type type4 = Type.TEXT;
                if (str2.equals("text")) {
                    return type4;
                }
                Type type5 = Type.EDIT_TEXT;
                if (str2.equals("edit_text")) {
                    return type5;
                }
                Type type6 = Type.HEADER;
                if (str2.equals("header")) {
                    return type6;
                }
                Type type7 = Type.TAB_BAR;
                if (str2.equals("tab_bar")) {
                    return type7;
                }
                Type type8 = Type.LIST;
                if (str2.equals("list")) {
                    return type8;
                }
                return null;
            }
        }

        /* compiled from: DivAccessibility.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Type$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Type(String str) {
            this.f371207b = str;
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivAccessibility;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivAccessibility;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivAccessibility> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371209l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivAccessibility invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            DivAccessibility.f371175f.getClass();
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            C38364h c38364h = DivAccessibility.f371179j;
            E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
            C38105a c38105a = C38107c.f370141c;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject2, "description", c38105a, c38364h, f370579a, null, eVar2);
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject2, "hint", c38105a, DivAccessibility.f371180k, f370579a, null, eVar2);
            Mode.f371188c.getClass();
            Y41.l<String, Mode> lVar = Mode.f371189d;
            com.yandex.div.json.expressions.b<Mode> bVar = DivAccessibility.f371176g;
            com.yandex.div.internal.parser.C c12 = DivAccessibility.f371178i;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b<Mode> bVarI3 = C38107c.i(jSONObject2, "mode", lVar, c38106b, f370579a, bVar, c12);
            if (bVarI3 != null) {
                bVar = bVarI3;
            }
            C38107c.i(jSONObject2, "mute_after_action", com.yandex.div.internal.parser.y.f370149c, c38106b, f370579a, DivAccessibility.f371177h, com.yandex.div.internal.parser.E.f370131a);
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject2, "state_description", c38105a, DivAccessibility.f371181l, f370579a, null, eVar2);
            Type.f371196c.getClass();
            return new DivAccessibility(bVarI, bVarI2, bVar, bVarI4, (Type) C38107c.h(jSONObject2, "type", Type.f371197d, c38106b, f370579a));
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371210l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Mode);
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div2/DivAccessibility$c;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "DESCRIPTION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DESCRIPTION_VALIDATOR", "HINT_TEMPLATE_VALIDATOR", "HINT_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAccessibility$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "", "MUTE_AFTER_ACTION_DEFAULT_VALUE", "STATE_DESCRIPTION_TEMPLATE_VALIDATOR", "STATE_DESCRIPTION_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Mode mode = Mode.DEFAULT;
        aVar.getClass();
        f371176g = b.a.a(mode);
        f371177h = b.a.a(Boolean.FALSE);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Mode.values());
        b bVar = b.f371210l;
        aVar2.getClass();
        f371178i = new com.yandex.div.internal.parser.C(bVar, objC);
        f371179j = new C38364h(10);
        f371180k = new C38364h(11);
        f371181l = new C38364h(12);
        f371182m = a.f371209l;
    }

    @C21.b
    public DivAccessibility() {
        this(null, null, null, null, null, null, 63, null);
    }

    @C21.b
    public DivAccessibility(@Y61.l com.yandex.div.json.expressions.b bVar, @Y61.l com.yandex.div.json.expressions.b bVar2, @Y61.k com.yandex.div.json.expressions.b bVar3, @Y61.l com.yandex.div.json.expressions.b bVar4, @Y61.l Type type) {
        this.f371183a = bVar;
        this.f371184b = bVar2;
        this.f371185c = bVar3;
        this.f371186d = bVar4;
        this.f371187e = type;
    }

    public /* synthetic */ DivAccessibility(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, Type type, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : bVar2, (i12 & 4) != 0 ? f371176g : bVar3, (i12 & 16) != 0 ? null : bVar5, (i12 & 32) != 0 ? null : type);
    }
}
