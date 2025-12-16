package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.avito.android.R;
import com.yandex.div.core.dagger.InterfaceC37908b;
import com.yandex.div.core.view2.C38029k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Div2Context.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/g;", "Landroid/content/ContextWrapper;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37912g extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37908b f367538a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f367539b;

    /* compiled from: Div2Context.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/g$a;", "Landroid/view/LayoutInflater$Factory2;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.g$a */
    public static final class a implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C37912g f367540b;

        /* compiled from: Div2Context.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/g$a$a;", "", "<init>", "()V", "", "DIV_VIEW_CLASS_NAME", "Ljava/lang/String;", "DIV_VIEW_SIMPLE_CLASS_NAME", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.g$a$a, reason: collision with other inner class name */
        public static final class C10858a {
            public /* synthetic */ C10858a(C42822w c42822w) {
                this();
            }

            public C10858a() {
            }
        }

        static {
            new C10858a(null);
        }

        public a(@Y61.k C37912g c37912g) {
            this.f367540b = c37912g;
        }

        @Override // android.view.LayoutInflater.Factory2
        @Y61.l
        public final View onCreateView(@Y61.l View view, @Y61.k String str, @Y61.k Context context, @Y61.k AttributeSet attributeSet) {
            return onCreateView(str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        @Y61.l
        public final View onCreateView(@Y61.k String str, @Y61.k Context context, @Y61.k AttributeSet attributeSet) {
            if ("com.yandex.div.core.view2.Div2View".equals(str) || "Div2View".equals(str)) {
                return new C38029k(this.f367540b, attributeSet, 0, 4, null);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37912g(ContextThemeWrapper contextThemeWrapper, C37918m c37918m, int i12, int i13, C42822w c42822w) {
        super(contextThemeWrapper);
        i12 = (i13 & 4) != 0 ? R.style.Div_Theme : i12;
        InterfaceC37908b.a aVarB = Z.f367267b.a(contextThemeWrapper).f367270a.b();
        aVarB.c(contextThemeWrapper);
        aVarB.e(c37918m);
        aVarB.b(i12);
        aVarB.a(new Q(SystemClock.uptimeMillis()));
        aVarB.d(c37918m.f367587r);
        InterfaceC37908b interfaceC37908bBuild = aVarB.build();
        this.f367538a = interfaceC37908bBuild;
        Q qI2 = interfaceC37908bBuild.i();
        if (qI2.f367259b >= 0) {
            return;
        }
        Q.f367255f.getClass();
        qI2.f367259b = SystemClock.uptimeMillis();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @Y61.l
    public final Object getSystemService(@Y61.k String str) {
        LayoutInflater layoutInflaterCloneInContext;
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.f367539b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        synchronized (this) {
            try {
                layoutInflaterCloneInContext = this.f367539b;
                if (layoutInflaterCloneInContext == null) {
                    layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                    if (layoutInflaterCloneInContext == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                    }
                    layoutInflaterCloneInContext.setFactory2(new a(this));
                    this.f367539b = layoutInflaterCloneInContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layoutInflaterCloneInContext;
    }
}
