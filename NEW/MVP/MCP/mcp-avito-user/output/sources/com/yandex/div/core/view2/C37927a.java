package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C22808a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AccessibilityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/a;", "Landroidx/core/view/a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37927a extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C22808a f367909d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.p<View, androidx.core.view.accessibility.f, G0> f367910e;

    /* compiled from: AccessibilityDelegateWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Landroidx/core/view/accessibility/f;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroid/view/View;Landroidx/core/view/accessibility/f;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.a$a, reason: collision with other inner class name */
    public static final class C10866a extends kotlin.jvm.internal.N implements Y41.p<View, androidx.core.view.accessibility.f, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10866a f367911l = new C10866a();

        public C10866a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(View view, androidx.core.view.accessibility.f fVar) {
            return G0.f406611a;
        }
    }

    public /* synthetic */ C37927a(C22808a c22808a, Y41.p pVar, int i12, C42822w c42822w) {
        this(c22808a, (i12 & 2) != 0 ? C10866a.f367911l : pVar);
    }

    @Override // androidx.core.view.C22808a
    public final boolean a(@Y61.l View view, @Y61.l AccessibilityEvent accessibilityEvent) {
        C22808a c22808a = this.f367909d;
        Boolean boolValueOf = c22808a == null ? null : Boolean.valueOf(c22808a.a(view, accessibilityEvent));
        return boolValueOf == null ? this.f44991a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : boolValueOf.booleanValue();
    }

    @Override // androidx.core.view.C22808a
    @Y61.l
    public final androidx.core.view.accessibility.g b(@Y61.l View view) {
        C22808a c22808a = this.f367909d;
        androidx.core.view.accessibility.g gVarB = c22808a == null ? null : c22808a.b(view);
        return gVarB == null ? super.b(view) : gVarB;
    }

    @Override // androidx.core.view.C22808a
    public final void c(@Y61.l View view, @Y61.l AccessibilityEvent accessibilityEvent) {
        G0 g02;
        C22808a c22808a = this.f367909d;
        if (c22808a == null) {
            g02 = null;
        } else {
            c22808a.c(view, accessibilityEvent);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C22808a
    public final void d(@Y61.l View view, @Y61.l androidx.core.view.accessibility.f fVar) {
        G0 g02;
        C22808a c22808a = this.f367909d;
        if (c22808a == null) {
            g02 = null;
        } else {
            c22808a.d(view, fVar);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        }
        this.f367910e.invoke(view, fVar);
    }

    @Override // androidx.core.view.C22808a
    public final void e(@Y61.l View view, @Y61.l AccessibilityEvent accessibilityEvent) {
        G0 g02;
        C22808a c22808a = this.f367909d;
        if (c22808a == null) {
            g02 = null;
        } else {
            c22808a.e(view, accessibilityEvent);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C22808a
    public final boolean f(@Y61.l ViewGroup viewGroup, @Y61.l View view, @Y61.l AccessibilityEvent accessibilityEvent) {
        C22808a c22808a = this.f367909d;
        Boolean boolValueOf = c22808a == null ? null : Boolean.valueOf(c22808a.f(viewGroup, view, accessibilityEvent));
        return boolValueOf == null ? this.f44991a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : boolValueOf.booleanValue();
    }

    @Override // androidx.core.view.C22808a
    public final boolean g(@Y61.l View view, int i12, @Y61.l Bundle bundle) {
        C22808a c22808a = this.f367909d;
        Boolean boolValueOf = c22808a == null ? null : Boolean.valueOf(c22808a.g(view, i12, bundle));
        return boolValueOf == null ? super.g(view, i12, bundle) : boolValueOf.booleanValue();
    }

    @Override // androidx.core.view.C22808a
    public final void h(@Y61.l View view, int i12) {
        G0 g02;
        C22808a c22808a = this.f367909d;
        if (c22808a == null) {
            g02 = null;
        } else {
            c22808a.h(view, i12);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            super.h(view, i12);
        }
    }

    @Override // androidx.core.view.C22808a
    public final void i(@Y61.l View view, @Y61.l AccessibilityEvent accessibilityEvent) {
        G0 g02;
        C22808a c22808a = this.f367909d;
        if (c22808a == null) {
            g02 = null;
        } else {
            c22808a.i(view, accessibilityEvent);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            super.i(view, accessibilityEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37927a(@Y61.l C22808a c22808a, @Y61.k Y41.p<? super View, ? super androidx.core.view.accessibility.f, G0> pVar) {
        this.f367909d = c22808a;
        this.f367910e = pVar;
    }
}
