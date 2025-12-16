package com.yandex.div2;

import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div2.C38231a;
import com.yandex.div2.C38271c;
import com.yandex.div2.C38291e;
import com.yandex.div2.C8;
import com.yandex.div2.F8;
import com.yandex.div2.H8;
import com.yandex.div2.J8;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivVariable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/g8;", "Lcom/yandex/div/json/b;", "<init>", "()V", "a", "b", "d", "e", "f", "g", "h", "i", "Lcom/yandex/div2/g8$h;", "Lcom/yandex/div2/g8$g;", "Lcom/yandex/div2/g8$f;", "Lcom/yandex/div2/g8$a;", "Lcom/yandex/div2/g8$b;", "Lcom/yandex/div2/g8$i;", "Lcom/yandex/div2/g8$e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.g8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38363g8 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f375230a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38363g8> f375231b = c.f375234l;

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$a;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$a */
    public static class a extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38231a f375232c;

        public a(@Y61.k C38231a c38231a) {
            super(null);
            this.f375232c = c38231a;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$b;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$b */
    public static class b extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38271c f375233c;

        public b(@Y61.k C38271c c38271c) {
            super(null);
            this.f375233c = c38271c;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/g8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/g8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.g8$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38363g8> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f375234l = new c();

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
        public final AbstractC38363g8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38363g8.f375230a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        F8.f372303c.getClass();
                        return new g(F8.b.a(eVar2, jSONObject2));
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        H8.f372534c.getClass();
                        return new h(H8.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 116079:
                    if (str.equals(ContextActionHandler.Link.URL)) {
                        J8.f372630c.getClass();
                        return new i(J8.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 3083190:
                    if (str.equals("dict")) {
                        C38291e.f374720c.getClass();
                        return new e(C38291e.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 64711720:
                    if (str.equals(BooleanParameter.TYPE)) {
                        C38231a.f374126c.getClass();
                        return new a(C38231a.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        C38271c.f374682c.getClass();
                        return new b(C38271c.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        C8.f371158c.getClass();
                        return new f(C8.b.a(eVar2, jSONObject2));
                    }
                    break;
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38373h8 abstractC38373h8 = cVarA instanceof AbstractC38373h8 ? (AbstractC38373h8) cVarA : null;
            if (abstractC38373h8 != null) {
                return abstractC38373h8.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/g8$d;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$d */
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$e;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$e */
    public static class e extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38291e f375235c;

        public e(@Y61.k C38291e c38291e) {
            super(null);
            this.f375235c = c38291e;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$f;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$f */
    public static class f extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C8 f375236c;

        public f(@Y61.k C8 c82) {
            super(null);
            this.f375236c = c82;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$g;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$g */
    public static class g extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final F8 f375237c;

        public g(@Y61.k F8 f82) {
            super(null);
            this.f375237c = f82;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$h;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$h */
    public static class h extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final H8 f375238c;

        public h(@Y61.k H8 h82) {
            super(null);
            this.f375238c = h82;
        }
    }

    /* compiled from: DivVariable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g8$i;", "Lcom/yandex/div2/g8;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g8$i */
    public static class i extends AbstractC38363g8 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J8 f375239c;

        public i(@Y61.k J8 j82) {
            super(null);
            this.f375239c = j82;
        }
    }

    public /* synthetic */ AbstractC38363g8(C42822w c42822w) {
        this();
    }

    public AbstractC38363g8() {
    }
}
