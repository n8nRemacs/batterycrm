package com.yandex.div2;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.yandex.div2.C38267b5;
import com.yandex.div2.C38269b7;
import com.yandex.div2.C38304f2;
import com.yandex.div2.C38383i8;
import com.yandex.div2.C38404j6;
import com.yandex.div2.C38577v2;
import com.yandex.div2.C38584w0;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivTabs;
import com.yandex.div2.O1;
import com.yandex.div2.T5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: Div.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/yandex/div2/g;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "Lcom/yandex/div2/g$h;", "Lcom/yandex/div2/g$f;", "Lcom/yandex/div2/g$q;", "Lcom/yandex/div2/g$m;", "Lcom/yandex/div2/g$c;", "Lcom/yandex/div2/g$g;", "Lcom/yandex/div2/g$e;", "Lcom/yandex/div2/g$k;", "Lcom/yandex/div2/g$p;", "Lcom/yandex/div2/g$o;", "Lcom/yandex/div2/g$d;", "Lcom/yandex/div2/g$i;", "Lcom/yandex/div2/g$n;", "Lcom/yandex/div2/g$j;", "Lcom/yandex/div2/g$l;", "Lcom/yandex/div2/g$r;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38330g implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f375012a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38330g> f375013b = a.f375014l;

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/g;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/g;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38330g> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f375014l = new a();

        public a() {
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
        public final AbstractC38330g invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38330g.f375012a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        C38584w0.f376820D.getClass();
                        return new d(C38584w0.e.a(eVar2, jSONObject2));
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        C38267b5.f374404L.getClass();
                        return new l(C38267b5.h.a(eVar2, jSONObject2));
                    }
                    break;
                case -899647263:
                    if (str.equals("slider")) {
                        T5.f373585M.getClass();
                        return new n(T5.e.a(eVar2, jSONObject2));
                    }
                    break;
                case -711999985:
                    if (str.equals("indicator")) {
                        DivIndicator.f371567M.getClass();
                        return new i(DivIndicator.f.a(eVar2, jSONObject2));
                    }
                    break;
                case -410956671:
                    if (str.equals("container")) {
                        DivContainer.f371308N.getClass();
                        return new c(DivContainer.i.a(eVar2, jSONObject2));
                    }
                    break;
                case -196315310:
                    if (str.equals(AdvertDetailsBlockIdKt.GALLERY_BLOCK)) {
                        DivGallery.f371456J.getClass();
                        return new e(DivGallery.h.a(eVar2, jSONObject2));
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        O1.f373047N.getClass();
                        return new f(O1.h.a(eVar2, jSONObject2));
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        C38304f2.f374771J.getClass();
                        return new C10942g(C38304f2.g.a(eVar2, jSONObject2));
                    }
                    break;
                case 3552126:
                    if (str.equals("tabs")) {
                        DivTabs.f371991K.getClass();
                        return new p(DivTabs.e.a(eVar2, jSONObject2));
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        C38269b7.f374518a0.getClass();
                        return new q(C38269b7.l.a(eVar2, jSONObject2));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        C38577v2.f376679S.getClass();
                        return new h(C38577v2.i.a(eVar2, jSONObject2));
                    }
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        DivInput.f371660R.getClass();
                        return new j(DivInput.i.a(eVar2, jSONObject2));
                    }
                    break;
                case 106426307:
                    if (str.equals("pager")) {
                        DivPager.f371768G.getClass();
                        return new k(DivPager.f.a(eVar2, jSONObject2));
                    }
                    break;
                case 109757585:
                    if (str.equals(VoiceInfo.STATE)) {
                        C38404j6.f375564E.getClass();
                        return new o(C38404j6.f.a(eVar2, jSONObject2));
                    }
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        C38383i8.f375312K.getClass();
                        return new r(C38383i8.e.a(eVar2, jSONObject2));
                    }
                    break;
                case 1732829925:
                    if (str.equals("separator")) {
                        DivSeparator.f371876G.getClass();
                        return new m(DivSeparator.e.a(eVar2, jSONObject2));
                    }
                    break;
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38259a7 abstractC38259a7 = cVarA instanceof AbstractC38259a7 ? (AbstractC38259a7) cVarA : null;
            if (abstractC38259a7 != null) {
                return abstractC38259a7.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/g$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$c;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$c */
    public static class c extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivContainer f375015c;

        public c(@Y61.k DivContainer divContainer) {
            super(null);
            this.f375015c = divContainer;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$d;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$d */
    public static class d extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38584w0 f375016c;

        public d(@Y61.k C38584w0 c38584w0) {
            super(null);
            this.f375016c = c38584w0;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$e;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$e */
    public static class e extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivGallery f375017c;

        public e(@Y61.k DivGallery divGallery) {
            super(null);
            this.f375017c = divGallery;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$f;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$f */
    public static class f extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final O1 f375018c;

        public f(@Y61.k O1 o12) {
            super(null);
            this.f375018c = o12;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$g;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$g, reason: collision with other inner class name */
    public static class C10942g extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38304f2 f375019c;

        public C10942g(@Y61.k C38304f2 c38304f2) {
            super(null);
            this.f375019c = c38304f2;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$h;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$h */
    public static class h extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38577v2 f375020c;

        public h(@Y61.k C38577v2 c38577v2) {
            super(null);
            this.f375020c = c38577v2;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$i;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$i */
    public static class i extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivIndicator f375021c;

        public i(@Y61.k DivIndicator divIndicator) {
            super(null);
            this.f375021c = divIndicator;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$j;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$j */
    public static class j extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivInput f375022c;

        public j(@Y61.k DivInput divInput) {
            super(null);
            this.f375022c = divInput;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$k;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$k */
    public static class k extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivPager f375023c;

        public k(@Y61.k DivPager divPager) {
            super(null);
            this.f375023c = divPager;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$l;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$l */
    public static class l extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38267b5 f375024c;

        public l(@Y61.k C38267b5 c38267b5) {
            super(null);
            this.f375024c = c38267b5;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$m;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$m */
    public static class m extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivSeparator f375025c;

        public m(@Y61.k DivSeparator divSeparator) {
            super(null);
            this.f375025c = divSeparator;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$n;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$n */
    public static class n extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final T5 f375026c;

        public n(@Y61.k T5 t52) {
            super(null);
            this.f375026c = t52;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$o;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$o */
    public static class o extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38404j6 f375027c;

        public o(@Y61.k C38404j6 c38404j6) {
            super(null);
            this.f375027c = c38404j6;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$p;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$p */
    public static class p extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivTabs f375028c;

        public p(@Y61.k DivTabs divTabs) {
            super(null);
            this.f375028c = divTabs;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$q;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$q */
    public static class q extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38269b7 f375029c;

        public q(@Y61.k C38269b7 c38269b7) {
            super(null);
            this.f375029c = c38269b7;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/g$r;", "Lcom/yandex/div2/g;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.g$r */
    public static class r extends AbstractC38330g {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38383i8 f375030c;

        public r(@Y61.k C38383i8 c38383i8) {
            super(null);
            this.f375030c = c38383i8;
        }
    }

    public /* synthetic */ AbstractC38330g(C42822w c42822w) {
        this();
    }

    @Y61.k
    public final H a() {
        if (this instanceof h) {
            return ((h) this).f375020c;
        }
        if (this instanceof f) {
            return ((f) this).f375018c;
        }
        if (this instanceof q) {
            return ((q) this).f375029c;
        }
        if (this instanceof m) {
            return ((m) this).f375025c;
        }
        if (this instanceof c) {
            return ((c) this).f375015c;
        }
        if (this instanceof C10942g) {
            return ((C10942g) this).f375019c;
        }
        if (this instanceof e) {
            return ((e) this).f375017c;
        }
        if (this instanceof k) {
            return ((k) this).f375023c;
        }
        if (this instanceof p) {
            return ((p) this).f375028c;
        }
        if (this instanceof o) {
            return ((o) this).f375027c;
        }
        if (this instanceof d) {
            return ((d) this).f375016c;
        }
        if (this instanceof i) {
            return ((i) this).f375021c;
        }
        if (this instanceof n) {
            return ((n) this).f375026c;
        }
        if (this instanceof j) {
            return ((j) this).f375022c;
        }
        if (this instanceof l) {
            return ((l) this).f375024c;
        }
        if (this instanceof r) {
            return ((r) this).f375030c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC38330g() {
    }
}
