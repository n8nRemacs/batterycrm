package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMask.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/o1;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/w3;", "b", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.o1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38467o1 implements com.yandex.div.json.b, InterfaceC38587w3 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f375883e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f375884f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C38293e1 f375885g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f375886h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38293e1 f375887i;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f375888a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<String> f375889b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<c> f375890c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f375891d;

    /* compiled from: DivFixedLengthInputMask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/o1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/o1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.o1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38467o1> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f375892l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38467o1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38467o1.f375883e.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivFixedLengthInputMask.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div2/o1$b;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ALWAYS_VISIBLE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/o1$c;", "PATTERN_ELEMENTS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div/internal/parser/F;", "", "PATTERN_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "PATTERN_VALIDATOR", "RAW_TEXT_VARIABLE_TEMPLATE_VALIDATOR", "RAW_TEXT_VARIABLE_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.o1$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38467o1 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.expressions.b<Boolean> bVar = C38467o1.f375884f;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, "always_visible", lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            if (bVarI != null) {
                bVar = bVarI;
            }
            C38293e1 c38293e1 = C38467o1.f375885g;
            E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
            C38105a c38105a = C38107c.f370141c;
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject, "pattern", c38105a, c38293e1, f370579a, eVar2);
            c.f375893d.getClass();
            return new C38467o1(bVar, bVarC, C38107c.f(jSONObject, "pattern_elements", c.f375897h, C38467o1.f375886h, f370579a, eVar), (String) C38107c.a(jSONObject, "raw_text_variable", c38105a, C38467o1.f375887i));
        }

        public b() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        f375884f = b.a.a(bool);
        f375885g = new C38293e1(11);
        f375886h = new C38458n1(0);
        f375887i = new C38293e1(12);
        int i12 = a.f375892l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public C38467o1(@Y61.k com.yandex.div.json.expressions.b<Boolean> bVar, @Y61.k com.yandex.div.json.expressions.b<String> bVar2, @Y61.k List<? extends c> list, @Y61.k String str) {
        this.f375888a = bVar;
        this.f375889b = bVar2;
        this.f375890c = list;
        this.f375891d = str;
    }

    @Override // com.yandex.div2.InterfaceC38587w3
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF375891d() {
        return this.f375891d;
    }

    /* compiled from: DivFixedLengthInputMask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/o1$c;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.o1$c */
    public static class c implements com.yandex.div.json.b {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final b f375893d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<String> f375894e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final C38293e1 f375895f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final C38293e1 f375896g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, c> f375897h;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<String> f375898a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<String> f375899b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<String> f375900c;

        /* compiled from: DivFixedLengthInputMask.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/o1$c;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/o1$c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.yandex.div2.o1$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, c> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f375901l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final c invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                c.f375893d.getClass();
                com.yandex.div.json.i f370579a = eVar.getF370579a();
                C38293e1 c38293e1 = c.f375895f;
                E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
                C38105a c38105a = C38107c.f370141c;
                com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject2, "key", c38105a, c38293e1, f370579a, eVar2);
                com.yandex.div.json.expressions.b<String> bVar = c.f375894e;
                com.yandex.div.json.expressions.b<String> bVarI = C38107c.i(jSONObject2, ChannelContext.Item.PLACEHOLDER, c38105a, C38107c.f370139a, f370579a, bVar, eVar2);
                if (bVarI != null) {
                    bVar = bVarI;
                }
                return new c(bVarC, bVar, C38107c.i(jSONObject2, "regex", c38105a, c.f375896g, f370579a, null, eVar2));
            }
        }

        /* compiled from: DivFixedLengthInputMask.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/o1$c$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "KEY_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "KEY_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "PLACEHOLDER_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "REGEX_TEMPLATE_VALIDATOR", "REGEX_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div2.o1$c$b */
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            com.yandex.div.json.expressions.b.f370552a.getClass();
            f375894e = b.a.a("_");
            f375895f = new C38293e1(13);
            f375896g = new C38293e1(14);
            f375897h = a.f375901l;
        }

        @C21.b
        public c(@Y61.k com.yandex.div.json.expressions.b<String> bVar, @Y61.k com.yandex.div.json.expressions.b<String> bVar2, @Y61.l com.yandex.div.json.expressions.b<String> bVar3) {
            this.f375898a = bVar;
            this.f375899b = bVar2;
            this.f375900c = bVar3;
        }

        public /* synthetic */ c(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, int i12, C42822w c42822w) {
            this(bVar, (i12 & 2) != 0 ? f375894e : bVar2, (i12 & 4) != 0 ? null : bVar3);
        }
    }

    public /* synthetic */ C38467o1(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, List list, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f375884f : bVar, bVar2, list, str);
    }
}
