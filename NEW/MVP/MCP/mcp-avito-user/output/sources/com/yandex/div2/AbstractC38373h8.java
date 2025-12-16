package com.yandex.div2;

import android.net.Uri;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div2.AbstractC38363g8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivVariableTemplate.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\b\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div2/h8;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/g8;", "<init>", "()V", "a", "b", "d", "e", "f", "g", "h", "i", "Lcom/yandex/div2/h8$h;", "Lcom/yandex/div2/h8$g;", "Lcom/yandex/div2/h8$f;", "Lcom/yandex/div2/h8$a;", "Lcom/yandex/div2/h8$b;", "Lcom/yandex/div2/h8$i;", "Lcom/yandex/div2/h8$e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.h8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38373h8 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38363g8> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f375277a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38373h8> f375278b = c.f375281l;

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$a;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$a */
    public static class a extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38261b f375279c;

        public a(@Y61.k C38261b c38261b) {
            super(null);
            this.f375279c = c38261b;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$b;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$b */
    public static class b extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38281d f375280c;

        public b(@Y61.k C38281d c38281d) {
            super(null);
            this.f375280c = c38281d;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/h8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/h8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.h8$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38373h8> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f375281l = new c();

        public c() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @Override // Y41.p
        public final AbstractC38373h8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            AbstractC38373h8 gVar;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38373h8.f375277a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            AbstractC38373h8 abstractC38373h8 = cVar instanceof AbstractC38373h8 ? (AbstractC38373h8) cVar : null;
            if (abstractC38373h8 != null) {
                if (abstractC38373h8 instanceof h) {
                    str = "string";
                } else if (abstractC38373h8 instanceof g) {
                    str = "number";
                } else if (abstractC38373h8 instanceof f) {
                    str = "integer";
                } else if (abstractC38373h8 instanceof a) {
                    str = BooleanParameter.TYPE;
                } else if (abstractC38373h8 instanceof b) {
                    str = "color";
                } else if (abstractC38373h8 instanceof i) {
                    str = ContextActionHandler.Link.URL;
                } else {
                    if (!(abstractC38373h8 instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "dict";
                }
            }
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        gVar = new g(new G8(eVar2, (G8) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        gVar = new h(new I8(eVar2, (I8) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
                case 116079:
                    if (str.equals(ContextActionHandler.Link.URL)) {
                        gVar = new i(new K8(eVar2, (K8) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
                case 3083190:
                    if (str.equals("dict")) {
                        gVar = new e(new C38301f(eVar2, (C38301f) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
                case 64711720:
                    if (str.equals(BooleanParameter.TYPE)) {
                        gVar = new a(new C38261b(eVar2, (C38261b) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        gVar = new b(new C38281d(eVar2, (C38281d) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        gVar = new f(new E8(eVar2, (E8) (abstractC38373h8 != null ? abstractC38373h8.c() : null), false, jSONObject2));
                        return gVar;
                    }
                    break;
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/h8$d;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$d */
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$e;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$e */
    public static class e extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38301f f375282c;

        public e(@Y61.k C38301f c38301f) {
            super(null);
            this.f375282c = c38301f;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$f;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$f */
    public static class f extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final E8 f375283c;

        public f(@Y61.k E8 e82) {
            super(null);
            this.f375283c = e82;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$g;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$g */
    public static class g extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final G8 f375284c;

        public g(@Y61.k G8 g82) {
            super(null);
            this.f375284c = g82;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$h;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$h */
    public static class h extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final I8 f375285c;

        public h(@Y61.k I8 i82) {
            super(null);
            this.f375285c = i82;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h8$i;", "Lcom/yandex/div2/h8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h8$i */
    public static class i extends AbstractC38373h8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final K8 f375286c;

        public i(@Y61.k K8 k82) {
            super(null);
            this.f375286c = k82;
        }
    }

    public /* synthetic */ AbstractC38373h8(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38363g8 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof h) {
            I8 i82 = ((h) this).f375285c;
            i82.getClass();
            return new AbstractC38363g8.h(new H8((String) H21.b.b(i82.f372606a, eVar, "name", jSONObject, I8.f372604e), (String) H21.b.b(i82.f372607b, eVar, "value", jSONObject, I8.f372605f)));
        }
        if (this instanceof g) {
            return new AbstractC38363g8.g(((g) this).f375284c.a(eVar, jSONObject));
        }
        if (this instanceof f) {
            return new AbstractC38363g8.f(((f) this).f375283c.a(eVar, jSONObject));
        }
        if (this instanceof a) {
            return new AbstractC38363g8.a(((a) this).f375279c.a(eVar, jSONObject));
        }
        if (this instanceof b) {
            return new AbstractC38363g8.b(((b) this).f375280c.a(eVar, jSONObject));
        }
        if (this instanceof i) {
            K8 k82 = ((i) this).f375286c;
            k82.getClass();
            return new AbstractC38363g8.i(new J8((String) H21.b.b(k82.f372722a, eVar, "name", jSONObject, K8.f372720e), (Uri) H21.b.b(k82.f372723b, eVar, "value", jSONObject, K8.f372721f)));
        }
        if (!(this instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        C38301f c38301f = ((e) this).f375282c;
        c38301f.getClass();
        return new AbstractC38363g8.e(new C38291e((String) H21.b.b(c38301f.f374748a, eVar, "name", jSONObject, C38301f.f374746e), (JSONObject) H21.b.b(c38301f.f374749b, eVar, "value", jSONObject, C38301f.f374747f)));
    }

    @Y61.k
    public final Object c() {
        if (this instanceof h) {
            return ((h) this).f375285c;
        }
        if (this instanceof g) {
            return ((g) this).f375284c;
        }
        if (this instanceof f) {
            return ((f) this).f375283c;
        }
        if (this instanceof a) {
            return ((a) this).f375279c;
        }
        if (this instanceof b) {
            return ((b) this).f375280c;
        }
        if (this instanceof i) {
            return ((i) this).f375286c;
        }
        if (this instanceof e) {
            return ((e) this).f375282c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC38373h8() {
    }
}
