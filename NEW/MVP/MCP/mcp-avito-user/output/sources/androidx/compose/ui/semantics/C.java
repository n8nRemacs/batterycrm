package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22654u;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f41719a;

    static {
        Y y12 = new Y(C.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        n0 n0Var = m0.f406844a;
        f41719a = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(C.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, n0Var)};
        y.f41820a.getClass();
        k.f41760a.getClass();
    }

    @Y61.k
    public static final E a(@Y61.k Y41.p pVar, @Y61.k String str) {
        return new E(str, true, pVar);
    }

    @Y61.k
    public static final <T> E<T> b(@Y61.k String str) {
        E<T> e12 = new E<>(str, null, 2, null);
        e12.f41724c = true;
        return e12;
    }

    public static final void c(@Y61.k F f12) {
        y.f41820a.getClass();
        f12.a(y.f41829j, G0.f406611a);
    }

    public static final void d(@Y61.k F f12, @Y61.l String str, @Y61.l Y41.a<Boolean> aVar) {
        k.f41760a.getClass();
        f12.a(k.f41781v, new C22553a(str, aVar));
    }

    public static void e(F f12, Y41.a aVar) {
        k.f41760a.getClass();
        f12.a(k.f41759C, new C22553a(null, new B(aVar)));
    }

    public static void f(F f12, Y41.l lVar) {
        k.f41760a.getClass();
        f12.a(k.f41761b, new C22553a(null, lVar));
    }

    public static void g(F f12, Y41.a aVar) {
        k.f41760a.getClass();
        f12.a(k.f41762c, new C22553a(null, aVar));
    }

    public static void h(F f12, int i12, Y41.a aVar) {
        y.f41820a.getClass();
        f12.a(y.f41812G, C22654u.a(i12));
        k.f41760a.getClass();
        f12.a(k.f41775p, new C22553a(null, aVar));
    }

    public static final void i(@Y61.k F f12, @Y61.l String str, @Y61.l Y41.a<Boolean> aVar) {
        k.f41760a.getClass();
        f12.a(k.f41763d, new C22553a(str, aVar));
    }

    public static final void j(@Y61.k F f12) {
        y.f41820a.getClass();
        f12.a(y.f41841v, G0.f406611a);
    }

    public static final void k(@Y61.k F f12, @Y61.k C22554b c22554b) {
        y.f41820a.getClass();
        E<C22554b> e12 = y.f41826g;
        kotlin.reflect.n<Object> nVar = f41719a[21];
        e12.getClass();
        f12.a(e12, c22554b);
    }

    public static final void l(@Y61.k F f12) {
        y.f41820a.getClass();
        E<Boolean> e12 = y.f41832m;
        kotlin.reflect.n<Object> nVar = f41719a[5];
        Boolean bool = Boolean.TRUE;
        e12.getClass();
        f12.a(e12, bool);
    }

    public static final void m(@Y61.k F f12, @Y61.k String str) {
        y.f41820a.getClass();
        f12.a(y.f41821b, Collections.singletonList(str));
    }

    public static final void n(@Y61.k F f12, @Y61.k j jVar) {
        y.f41820a.getClass();
        E<j> e12 = y.f41839t;
        kotlin.reflect.n<Object> nVar = f41719a[10];
        e12.getClass();
        f12.a(e12, jVar);
    }

    public static final void o(@Y61.k F f12, int i12) {
        y.f41820a.getClass();
        E<C22559g> e12 = y.f41830k;
        kotlin.reflect.n<Object> nVar = f41719a[3];
        C22559g c22559gA = C22559g.a(i12);
        e12.getClass();
        f12.a(e12, c22559gA);
    }

    public static final void p(@Y61.k F f12, @Y61.k String str) {
        y.f41820a.getClass();
        E<String> e12 = y.f41824e;
        kotlin.reflect.n<Object> nVar = f41719a[2];
        e12.getClass();
        f12.a(e12, str);
    }

    public static void q(F f12, Y41.l lVar) {
        k.f41760a.getClass();
        f12.a(k.f41768i, new C22553a(null, lVar));
    }

    public static final void r(@Y61.k F f12, @Y61.k h hVar) {
        y.f41820a.getClass();
        E<h> e12 = y.f41823d;
        kotlin.reflect.n<Object> nVar = f41719a[1];
        e12.getClass();
        f12.a(e12, hVar);
    }

    public static final void s(@Y61.k F f12, int i12) {
        y.f41820a.getClass();
        E<i> e12 = y.f41843x;
        kotlin.reflect.n<Object> nVar = f41719a[12];
        i iVarA = i.a(i12);
        e12.getClass();
        f12.a(e12, iVarA);
    }

    public static final void t(@Y61.k F f12, boolean z12) {
        y.f41820a.getClass();
        E<Boolean> e12 = y.f41813H;
        kotlin.reflect.n<Object> nVar = f41719a[20];
        Boolean boolValueOf = Boolean.valueOf(z12);
        e12.getClass();
        f12.a(e12, boolValueOf);
    }

    public static final void u(@Y61.k F f12, @Y61.k C22602e c22602e) {
        y.f41820a.getClass();
        f12.a(y.f41806A, Collections.singletonList(c22602e));
    }

    public static final void v(@Y61.k F f12, @Y61.k ToggleableState toggleableState) {
        y.f41820a.getClass();
        E<ToggleableState> e12 = y.f41814I;
        kotlin.reflect.n<Object> nVar = f41719a[23];
        e12.getClass();
        f12.a(e12, toggleableState);
    }

    public static final void w(@Y61.k F f12) {
        y.f41820a.getClass();
        E<Boolean> e12 = y.f41833n;
        kotlin.reflect.n<Object> nVar = f41719a[6];
        Boolean bool = Boolean.TRUE;
        e12.getClass();
        f12.a(e12, bool);
    }

    public static final void x(@Y61.k F f12, @Y61.k j jVar) {
        y.f41820a.getClass();
        E<j> e12 = y.f41840u;
        kotlin.reflect.n<Object> nVar = f41719a[11];
        e12.getClass();
        f12.a(e12, jVar);
    }
}
