package com.avito.android.lib.util;

import android.view.View;
import androidx.core.graphics.C22771k;
import androidx.core.view.J0;
import androidx.core.view.M;
import com.avito.android.lib.util.i;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class h implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f181366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f181367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f181370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f181372h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(View view, Y41.s sVar, int i12, int i13, int i14, int i15, boolean z12) {
        this.f181366b = view;
        this.f181367c = (N) sVar;
        this.f181368d = i12;
        this.f181369e = i13;
        this.f181370f = i14;
        this.f181371g = i15;
        this.f181372h = z12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.s, kotlin.jvm.internal.N] */
    @Override // androidx.core.view.M
    public final J0 h(View view, J0 j02) {
        C22771k c22771kE = j02.e(i.f181375c);
        i.f181373a.getClass();
        kotlin.reflect.n<Object>[] nVarArr = i.f181374b;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        int i12 = c22771kE.f44778d;
        i.a aVar = i.f181378f;
        Integer numValueOf = Integer.valueOf(i12);
        int i13 = aVar.f181381b;
        View view2 = this.f181366b;
        view2.setTag(i13, numValueOf);
        int i14 = j02.e(i.f181376d).f44778d;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        view2.setTag(i.f181379g.f181381b, Integer.valueOf(i14));
        if (i.b(view2) > 0) {
            int iE2 = i.e(view2);
            kotlin.reflect.n<Object> nVar3 = nVarArr[2];
            view2.setTag(i.f181380h.f181381b, Integer.valueOf(iE2));
        }
        return (J0) this.f181367c.invoke(j02, Integer.valueOf(this.f181368d + c22771kE.f44775a), Integer.valueOf(this.f181369e + c22771kE.f44776b), Integer.valueOf(this.f181370f + c22771kE.f44777c), Integer.valueOf(this.f181371g + (this.f181372h ? Math.max(i.c(view2), i.e(view2)) : Math.max(i.c(view2), i.b(view2)))));
    }
}
