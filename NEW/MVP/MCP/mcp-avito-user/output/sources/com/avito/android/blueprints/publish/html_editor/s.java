package com.avito.android.blueprints.publish.html_editor;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.html_formatter.jsoup.a0;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;

/* compiled from: HtmlEditorViewModelImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/s;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s extends M0 implements HtmlEditorViewModel {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.b f106302E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final hJ.g f106303J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final hJ.h f106304K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final a f106305L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<HtmlEditorViewModel.c> f106306M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Integer> f106307N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<HtmlEditorViewModel.b> f106308O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f106309P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f106310Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f106311R;

    /* compiled from: HtmlEditorViewModelImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/s$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C23060r0 f106312a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f106313b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f106314c = new LinkedHashMap();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f106315d = new LinkedHashMap();

        public a(@Y61.k C23060r0 c23060r0) {
            this.f106312a = c23060r0;
        }

        @Y61.k
        public final HtmlEditorViewModel.HistoryState a(@Y61.k String str) {
            C23060r0 c23060r0 = this.f106312a;
            HtmlEditorViewModel.HistoryState historyState = (HtmlEditorViewModel.HistoryState) c23060r0.b(str);
            if (historyState != null) {
                return historyState;
            }
            HtmlEditorViewModel.HistoryState historyState2 = new HtmlEditorViewModel.HistoryState(0, 0);
            c23060r0.e(historyState2, str);
            return historyState2;
        }
    }

    /* compiled from: HtmlEditorViewModelImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[EditorNavigationEvent.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EditorNavigationEvent editorNavigationEvent = EditorNavigationEvent.f164126b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public s(@Y61.k C23060r0 c23060r0, @Y61.k com.avito.android.html_editor.b bVar, @Y61.k hJ.g gVar, @Y61.k hJ.h hVar) {
        this.f106302E = bVar;
        this.f106303J = gVar;
        this.f106304K = hVar;
        this.f106305L = new a(c23060r0);
        C23038g0<HtmlEditorViewModel.c> c23038g0 = new C23038g0<>();
        this.f106306M = c23038g0;
        C23038g0<Integer> c23038g02 = new C23038g0<>();
        this.f106307N = c23038g02;
        C23038g0<HtmlEditorViewModel.b> c23038g03 = new C23038g0<>();
        this.f106308O = c23038g03;
        this.f106309P = c23038g0;
        this.f106310Q = c23038g02;
        this.f106311R = c23038g03;
        if (b1.h(b1.h(c23060r0.f46876a.keySet(), c23060r0.f46877b.keySet()), c23060r0.f46878c.keySet()).isEmpty()) {
            bVar.b();
        }
    }

    public static HtmlEditorViewModel.b ke(HtmlEditorViewModel.HistoryState historyState) {
        int i12 = historyState.f106241c;
        return new HtmlEditorViewModel.b(i12 > 0, i12 < historyState.f106240b);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final com.jakewharton.rxrelay3.c Fa(String str) {
        LinkedHashMap linkedHashMap = this.f106305L.f106314c;
        Object cVar = linkedHashMap.get(str);
        if (cVar == null) {
            cVar = new com.jakewharton.rxrelay3.c();
            linkedHashMap.put(str, cVar);
        }
        return (com.jakewharton.rxrelay3.c) cVar;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    @Y61.k
    /* renamed from: G9, reason: from getter */
    public final C23038g0 getF106309P() {
        return this.f106309P;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    @Y61.k
    /* renamed from: Jd, reason: from getter */
    public final C23038g0 getF106311R() {
        return this.f106311R;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final com.jakewharton.rxrelay3.c R9(String str) {
        LinkedHashMap linkedHashMap = this.f106305L.f106315d;
        Object cVar = linkedHashMap.get(str);
        if (cVar == null) {
            cVar = new com.jakewharton.rxrelay3.c();
            linkedHashMap.put(str, cVar);
        }
        return (com.jakewharton.rxrelay3.c) cVar;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final void a7(@Y61.k EditorNavigationEvent editorNavigationEvent) {
        String str;
        HtmlEditorViewModel.c value = this.f106306M.getValue();
        HtmlEditorViewModel.c.b bVar = value instanceof HtmlEditorViewModel.c.b ? (HtmlEditorViewModel.c.b) value : null;
        if (bVar == null || (str = bVar.f106245a) == null) {
            return;
        }
        a aVar = this.f106305L;
        HtmlEditorViewModel.HistoryState historyStateA = aVar.a(str);
        int iOrdinal = editorNavigationEvent.ordinal();
        com.avito.android.html_editor.b bVar2 = this.f106302E;
        if (iOrdinal == 0) {
            if (bVar2.a(historyStateA.f106241c, str) == null) {
                LinkedHashMap linkedHashMap = aVar.f106315d;
                Object cVar = linkedHashMap.get(str);
                if (cVar == null) {
                    cVar = new com.jakewharton.rxrelay3.c();
                    linkedHashMap.put(str, cVar);
                }
                ((com.jakewharton.rxrelay3.c) cVar).accept(G0.f406611a);
            }
            historyStateA.f106241c--;
        } else if (iOrdinal == 1) {
            historyStateA.f106241c++;
        }
        this.f106308O.setValue(ke(historyStateA));
        com.avito.android.html_editor.d dVarA = bVar2.a(historyStateA.f106241c, str);
        if (dVarA != null) {
            a0 a0VarA = this.f106303J.a(dVarA.f164133a);
            LinkedHashMap linkedHashMap2 = aVar.f106314c;
            Object cVar2 = linkedHashMap2.get(str);
            if (cVar2 == null) {
                cVar2 = new com.jakewharton.rxrelay3.c();
                linkedHashMap2.put(str, cVar2);
            }
            ((com.jakewharton.rxrelay3.c) cVar2).accept(new com.avito.android.html_editor.r(a0VarA.i(this.f106304K), a0VarA, dVarA.f164133a, dVarA.f164134b, dVarA.f164135c));
        }
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final void bd(@Y61.k FormatChange formatChange) {
        String str;
        HtmlEditorViewModel.c value = this.f106306M.getValue();
        HtmlEditorViewModel.c.b bVar = value instanceof HtmlEditorViewModel.c.b ? (HtmlEditorViewModel.c.b) value : null;
        if (bVar == null || (str = bVar.f106245a) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f106305L.f106313b;
        Object cVar = linkedHashMap.get(str);
        if (cVar == null) {
            cVar = new com.jakewharton.rxrelay3.c();
            linkedHashMap.put(str, cVar);
        }
        ((com.jakewharton.rxrelay3.c) cVar).accept(formatChange);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final void e2(@Y61.k HtmlEditorViewModel.c cVar) {
        this.f106306M.setValue(cVar);
        if (cVar instanceof HtmlEditorViewModel.c.b) {
            this.f106308O.setValue(ke(this.f106305L.a(((HtmlEditorViewModel.c.b) cVar).f106245a)));
        } else {
            boolean z12 = cVar instanceof HtmlEditorViewModel.c.a;
        }
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final boolean n2() {
        String str;
        HtmlEditorViewModel.HistoryState historyStateA;
        int i12;
        int i13;
        HtmlEditorViewModel.c value = this.f106306M.getValue();
        HtmlEditorViewModel.c.b bVar = value instanceof HtmlEditorViewModel.c.b ? (HtmlEditorViewModel.c.b) value : null;
        if (bVar == null || (str = bVar.f106245a) == null || (i12 = (historyStateA = this.f106305L.a(str)).f106241c) >= (i13 = historyStateA.f106240b)) {
            return false;
        }
        this.f106302E.c(i12 + 1, i13, str);
        int i14 = historyStateA.f106241c + 1;
        historyStateA.f106241c = i14;
        historyStateA.f106240b = i14;
        this.f106308O.setValue(ke(historyStateA));
        return true;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final void setFormat(int i12) {
        this.f106307N.setValue(Integer.valueOf(i12));
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final com.jakewharton.rxrelay3.c v7(String str) {
        LinkedHashMap linkedHashMap = this.f106305L.f106313b;
        Object cVar = linkedHashMap.get(str);
        if (cVar == null) {
            cVar = new com.jakewharton.rxrelay3.c();
            linkedHashMap.put(str, cVar);
        }
        return (com.jakewharton.rxrelay3.c) cVar;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    @Y61.k
    /* renamed from: x6, reason: from getter */
    public final C23038g0 getF106310Q() {
        return this.f106310Q;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel
    public final void y7(@Y61.k com.avito.android.html_editor.d dVar, boolean z12) {
        String str;
        HtmlEditorViewModel.c value = this.f106306M.getValue();
        HtmlEditorViewModel.c.b bVar = value instanceof HtmlEditorViewModel.c.b ? (HtmlEditorViewModel.c.b) value : null;
        if (bVar == null || (str = bVar.f106245a) == null) {
            return;
        }
        HtmlEditorViewModel.HistoryState historyStateA = this.f106305L.a(str);
        this.f106302E.d(str, historyStateA.f106241c, dVar);
        if (z12) {
            historyStateA.f106241c++;
            historyStateA.f106240b++;
        }
        this.f106308O.setValue(ke(historyStateA));
    }
}
