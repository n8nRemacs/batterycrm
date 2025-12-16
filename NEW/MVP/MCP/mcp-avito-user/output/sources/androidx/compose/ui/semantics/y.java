package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SemanticsProperties.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/y;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final y f41820a = new y();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final E<List<String>> f41821b = C.a(b.f41847l, "ContentDescription");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final E<String> f41822c = C.b("StateDescription");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final E<androidx.compose.ui.semantics.h> f41823d = C.b("ProgressBarRangeInfo");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final E<String> f41824e = C.a(i.f41854l, "PaneTitle");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41825f = C.b("SelectableGroup");

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final E<C22554b> f41826g = C.b("CollectionInfo");

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final E<C22555c> f41827h = C.b("CollectionItemInfo");

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41828i = C.b("Heading");

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41829j = C.b("Disabled");

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final E<C22559g> f41830k = C.b("LiveRegion");

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final E<Boolean> f41831l = C.b("Focused");

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final E<Boolean> f41832m = C.b("IsContainer");

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final E<Boolean> f41833n = new E<>("IsTraversalGroup", null, 2, null);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41834o = new E<>(e.f41850l, "InvisibleToUser");

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41835p = new E<>(d.f41849l, "HideFromAccessibility");

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final E<androidx.compose.ui.autofill.v> f41836q = new E<>(c.f41848l, "ContentType");

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final E<androidx.compose.ui.autofill.t> f41837r = new E<>(a.f41846l, "ContentDataType");

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final E<Float> f41838s = new E<>(m.f41858l, "TraversalIndex");

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final E<androidx.compose.ui.semantics.j> f41839t = C.b("HorizontalScrollAxisRange");

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final E<androidx.compose.ui.semantics.j> f41840u = C.b("VerticalScrollAxisRange");

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41841v = C.a(g.f41852l, "IsPopup");

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41842w = C.a(f.f41851l, "IsDialog");

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final E<androidx.compose.ui.semantics.i> f41843x = C.a(j.f41855l, "Role");

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final E<String> f41844y = new E<>("TestTag", false, k.f41856l);

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41845z = new E<>("LinkTestMarker", false, h.f41853l);

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final E<List<C22602e>> f41806A = C.a(l.f41857l, "Text");

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final E<C22602e> f41807B = new E<>("TextSubstitution", null, 2, null);

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final E<Boolean> f41808C = new E<>("IsShowingTextSubstitution", null, 2, null);

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final E<C22602e> f41809D = C.b("InputText");

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public static final E<C22602e> f41810E = C.b("EditableText");

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public static final E<v0> f41811F = C.b("TextSelectionRange");

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public static final E<C22654u> f41812G = C.b("ImeAction");

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public static final E<Boolean> f41813H = C.b("Selected");

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public static final E<ToggleableState> f41814I = C.b("ToggleableState");

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final E<G0> f41815J = C.b("Password");

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final E<String> f41816K = C.b("Error");

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final E<Y41.l<Object, Integer>> f41817L = new E<>("IndexForKey", null, 2, null);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final E<Boolean> f41818M = new E<>("IsEditable", null, 2, null);

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final E<Integer> f41819N = new E<>("MaxTextLength", null, 2, null);

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/autofill/t;", "parentValue", "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/autofill/t;Landroidx/compose/ui/autofill/t;)Landroidx/compose/ui/autofill/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.ui.autofill.t, androidx.compose.ui.autofill.t, androidx.compose.ui.autofill.t> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41846l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final androidx.compose.ui.autofill.t invoke(androidx.compose.ui.autofill.t tVar, androidx.compose.ui.autofill.t tVar2) {
            return tVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "parentValue", "childValue", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f41847l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/autofill/v;", "parentValue", "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/autofill/v;Landroidx/compose/ui/autofill/v;)Landroidx/compose/ui/autofill/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<androidx.compose.ui.autofill.v, androidx.compose.ui.autofill.v, androidx.compose.ui.autofill.v> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f41848l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final androidx.compose.ui.autofill.v invoke(androidx.compose.ui.autofill.v vVar, androidx.compose.ui.autofill.v vVar2) {
            return vVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "parentValue", "<anonymous parameter 1>", "invoke", "(Lkotlin/G0;Lkotlin/G0;)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<G0, G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f41849l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(G0 g02, G0 g03) {
            return g02;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "parentValue", "<anonymous parameter 1>", "invoke", "(Lkotlin/G0;Lkotlin/G0;)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.p<G0, G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f41850l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(G0 g02, G0 g03) {
            return g02;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Lkotlin/G0;Lkotlin/G0;)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<G0, G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f41851l = new f();

        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(G0 g02, G0 g03) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Lkotlin/G0;Lkotlin/G0;)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.p<G0, G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f41852l = new g();

        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(G0 g02, G0 g03) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "parentValue", "<anonymous parameter 1>", "invoke", "(Lkotlin/G0;Lkotlin/G0;)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.p<G0, G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f41853l = new h();

        public h() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(G0 g02, G0 g03) {
            return g02;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.p<String, String, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f41854l = new i();

        public i() {
            super(2);
        }

        @Override // Y41.p
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/semantics/i;", "parentValue", "<anonymous parameter 1>", "invoke-qtA-w6s", "(Landroidx/compose/ui/semantics/i;I)Landroidx/compose/ui/semantics/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.p<androidx.compose.ui.semantics.i, androidx.compose.ui.semantics.i, androidx.compose.ui.semantics.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f41855l = new j();

        public j() {
            super(2);
        }

        @Override // Y41.p
        public final androidx.compose.ui.semantics.i invoke(androidx.compose.ui.semantics.i iVar, androidx.compose.ui.semantics.i iVar2) {
            androidx.compose.ui.semantics.i iVar3 = iVar;
            int i12 = iVar2.f41753a;
            return iVar3;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "parentValue", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.p<String, String, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f41856l = new k();

        public k() {
            super(2);
        }

        @Override // Y41.p
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/e;", "parentValue", "childValue", "invoke", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.p<List<? extends C22602e>, List<? extends C22602e>, List<? extends C22602e>> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f41857l = new l();

        public l() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends C22602e> invoke(List<? extends C22602e> list, List<? extends C22602e> list2) {
            List<? extends C22602e> list3 = list;
            List<? extends C22602e> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "parentValue", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.p<Float, Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final m f41858l = new m();

        public m() {
            super(2);
        }

        @Override // Y41.p
        public final Float invoke(Float f12, Float f13) {
            Float f14 = f12;
            f13.floatValue();
            return f14;
        }
    }
}
