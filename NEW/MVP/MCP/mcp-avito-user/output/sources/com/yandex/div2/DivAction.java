package com.yandex.div2;

import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/DivAction;", "Lcom/yandex/div/json/b;", "c", "d", "Target", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivAction implements com.yandex.div.json.b {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final c f371211f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371212g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38364h f371213h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371214i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, DivAction> f371215j;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Uri> f371216a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<d> f371217b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final JSONObject f371218c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Uri> f371219d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Uri> f371220e;

    /* compiled from: DivAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivAction$Target;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Target {
        SELF("_self"),
        BLANK("_blank");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371221c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Target> f371222d = a.f371227l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371226b;

        /* compiled from: DivAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAction$Target;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Target> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371227l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Target invoke(String str) {
                String str2 = str;
                Target target = Target.SELF;
                if (str2.equals("_self")) {
                    return target;
                }
                Target target2 = Target.BLANK;
                if (str2.equals("_blank")) {
                    return target2;
                }
                return null;
            }
        }

        /* compiled from: DivAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivAction$Target$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Target(String str) {
            this.f371226b = str;
        }
    }

    /* compiled from: DivAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivAction;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivAction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivAction> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371228l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivAction invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            DivAction.f371211f.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            U0.f373676c.getClass();
            U0 u02 = (U0) C38107c.g(jSONObject2, "download_callbacks", U0.f373679f, f370579a, eVar2);
            C38364h c38364h = DivAction.f371213h;
            C38105a c38105a = C38107c.f370141c;
            String str = (String) C38107c.a(jSONObject2, "log_id", c38105a, c38364h);
            Y41.l<String, Uri> lVar = com.yandex.div.internal.parser.y.f370148b;
            E.f fVar = com.yandex.div.internal.parser.E.f370135e;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject2, "log_url", lVar, c38106b, f370579a, null, fVar);
            d.f371230d.getClass();
            List listK = C38107c.k(jSONObject2, "menu_items", d.f371233g, DivAction.f371214i, f370579a, eVar2);
            JSONObject jSONObject3 = (JSONObject) C38107c.h(jSONObject2, "payload", c38105a, c38106b, f370579a);
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject2, "referer", lVar, c38106b, f370579a, null, fVar);
            Target.f371221c.getClass();
            C38107c.i(jSONObject2, "target", Target.f371222d, c38106b, f370579a, null, DivAction.f371212g);
            return new DivAction(u02, str, bVarI, listK, jSONObject3, bVarI2, C38107c.i(jSONObject2, ContextActionHandler.Link.URL, lVar, c38106b, f370579a, null, fVar));
        }
    }

    /* compiled from: DivAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371229l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Target);
        }
    }

    /* compiled from: DivAction.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/DivAction$c;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction$d;", "MENU_ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAction$Target;", "TYPE_HELPER_TARGET", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Target.values());
        b bVar = b.f371229l;
        aVar.getClass();
        f371212g = new com.yandex.div.internal.parser.C(bVar, objC);
        f371213h = new C38364h(19);
        f371214i = new C38491p(0);
        f371215j = a.f371228l;
    }

    @C21.b
    public DivAction(@Y61.l U0 u02, @Y61.k String str, @Y61.l com.yandex.div.json.expressions.b bVar, @Y61.l List list, @Y61.l JSONObject jSONObject, @Y61.l com.yandex.div.json.expressions.b bVar2, @Y61.l com.yandex.div.json.expressions.b bVar3) {
        this.f371216a = bVar;
        this.f371217b = list;
        this.f371218c = jSONObject;
        this.f371219d = bVar2;
        this.f371220e = bVar3;
    }

    /* compiled from: DivAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivAction$d;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d implements com.yandex.div.json.b {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final b f371230d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C38491p f371231e = new C38491p(1);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final C38364h f371232f = new C38364h(20);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, d> f371233g = a.f371237l;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final DivAction f371234a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final List<DivAction> f371235b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<String> f371236c;

        /* compiled from: DivAction.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivAction$d;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivAction$d;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, d> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371237l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final d invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                com.yandex.div.json.e eVar2 = eVar;
                JSONObject jSONObject2 = jSONObject;
                d.f371230d.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                DivAction.f371211f.getClass();
                Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
                return new d((DivAction) C38107c.g(jSONObject2, "action", pVar, f370579a, eVar2), C38107c.k(jSONObject2, "actions", pVar, d.f371231e, f370579a, eVar2), C38107c.c(jSONObject2, "text", C38107c.f370141c, d.f371232f, f370579a, com.yandex.div.internal.parser.E.f370133c));
            }
        }

        /* compiled from: DivAction.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivAction$d$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div/internal/parser/F;", "", "TEXT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "TEXT_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @C21.b
        public d(@Y61.l DivAction divAction, @Y61.l List<? extends DivAction> list, @Y61.k com.yandex.div.json.expressions.b<String> bVar) {
            this.f371234a = divAction;
            this.f371235b = list;
            this.f371236c = bVar;
        }

        public /* synthetic */ d(DivAction divAction, List list, com.yandex.div.json.expressions.b bVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : divAction, (i12 & 2) != 0 ? null : list, bVar);
        }
    }

    public /* synthetic */ DivAction(U0 u02, String str, com.yandex.div.json.expressions.b bVar, List list, JSONObject jSONObject, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : u02, str, (i12 & 4) != 0 ? null : bVar, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : jSONObject, (i12 & 32) != 0 ? null : bVar2, (i12 & 128) == 0 ? bVar4 : null);
    }
}
