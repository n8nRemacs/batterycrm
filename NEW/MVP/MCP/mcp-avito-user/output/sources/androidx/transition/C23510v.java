package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: GhostViewPlatform.java */
@j.X
/* renamed from: androidx.transition.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23510v implements InterfaceC23508t {

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f54848c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f54849d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f54850e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f54851f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f54852g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f54853h;

    /* renamed from: b, reason: collision with root package name */
    public final View f54854b;

    public C23510v(@j.N View view) {
        this.f54854b = view;
    }

    @Override // androidx.transition.InterfaceC23508t
    public final void setVisibility(int i12) {
        this.f54854b.setVisibility(i12);
    }

    @Override // androidx.transition.InterfaceC23508t
    public final void a(View view, ViewGroup viewGroup) {
    }
}
