package com.yandex.div.core.view2.divs;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.C19960l0;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div.internal.widget.menu.c;
import com.yandex.div2.DivAction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DivActionBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/g;", "", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37955g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C37916k f368381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37915j f368382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C37935b f368383c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f368384d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f368385e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f368386f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<View, Boolean> f368387g = c.f368391l;

    /* compiled from: DivActionBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0081\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/g$a;", "", "<init>", "()V", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    /* renamed from: com.yandex.div.core.view2.divs.g$a */
    public @interface a {

        /* compiled from: DivActionBinder.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/g$a$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.g$a$a, reason: collision with other inner class name */
        public static final class C10873a {
            static {
                new C10873a();
            }
        }
    }

    /* compiled from: DivActionBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/g$b;", "Lcom/yandex/div/internal/widget/menu/c$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.g$b */
    public final class b extends c.a.C10933a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C38029k f368388a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<DivAction.d> f368389b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k C38029k c38029k, @Y61.k List<? extends DivAction.d> list) {
            this.f368388a = c38029k;
            this.f368389b = list;
        }

        @Override // com.yandex.div.internal.widget.menu.c.a.C10933a, com.yandex.div.internal.widget.menu.c.a
        public final void a(@Y61.k C19960l0 c19960l0) {
            final com.yandex.div.json.expressions.e expressionResolver = this.f368388a.getExpressionResolver();
            androidx.appcompat.view.menu.h hVar = c19960l0.f22564a;
            for (final DivAction.d dVar : this.f368389b) {
                final int size = hVar.f21836f.size();
                androidx.appcompat.view.menu.k kVarA = hVar.a(0, 0, 0, dVar.f371236c.a(expressionResolver));
                final C37955g c37955g = C37955g.this;
                kVarA.f21876p = new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        l0.a aVar = new l0.a();
                        DivAction.d dVar2 = dVar;
                        C37955g c37955g2 = c37955g;
                        int i12 = size;
                        com.yandex.div.json.expressions.e eVar = expressionResolver;
                        C37955g.b bVar = this.f368455b;
                        bVar.f368388a.m(new C37963i(dVar2, aVar, c37955g2, bVar, i12, eVar));
                        return aVar.f406838b;
                    }
                };
            }
        }
    }

    /* compiled from: DivActionBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.g$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<View, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f368391l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(View view) {
            View view2 = view;
            boolean zPerformLongClick = false;
            do {
                ViewParent parent = view2.getParent();
                view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (view2 == null || view2.getParent() == null) {
                    break;
                }
                zPerformLongClick = view2.performLongClick();
            } while (!zPerformLongClick);
            return Boolean.valueOf(zPerformLongClick);
        }
    }

    @Inject
    public C37955g(@Y61.k C37916k c37916k, @Y61.k InterfaceC37915j interfaceC37915j, @Y61.k C37935b c37935b, @com.yandex.div.core.dagger.B boolean z12, @com.yandex.div.core.dagger.B boolean z13, @com.yandex.div.core.dagger.B boolean z14) {
        this.f368381a = c37916k;
        this.f368382b = interfaceC37915j;
        this.f368383c = c37935b;
        this.f368384d = z12;
        this.f368385e = z13;
        this.f368386f = z14;
    }

    public final void a(@Y61.k C38029k c38029k, @Y61.k DivAction divAction, @Y61.l String str) {
        C37916k actionHandler = c38029k.getActionHandler();
        C37916k c37916k = this.f368381a;
        if (!c37916k.getUseActionUid() || str == null) {
            if (actionHandler == null || !actionHandler.handleAction(divAction, c38029k)) {
                c37916k.handleAction(divAction, c38029k);
                return;
            }
            return;
        }
        if (actionHandler == null || !actionHandler.handleAction(divAction, c38029k, str)) {
            c37916k.handleAction(divAction, c38029k, str);
        }
    }
}
