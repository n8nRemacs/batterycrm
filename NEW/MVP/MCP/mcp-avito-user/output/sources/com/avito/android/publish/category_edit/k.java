package com.avito.android.publish.category_edit;

import android.annotation.SuppressLint;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.blueprints.publish.checkable.CheckableItem;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.util.InterfaceC35745a5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryEditViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/category_edit/k;", "Landroidx/lifecycle/M0;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.category_edit.a f232390E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Navigation f232391J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232392K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f232393L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232394M = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<a> f232395N = new C23038g0<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public WizardParameter f232396O;

    /* compiled from: CategoryEditViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/category_edit/k$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/publish/category_edit/k$a$a;", "Lcom/avito/android/publish/category_edit/k$a$b;", "Lcom/avito/android/publish/category_edit/k$a$c;", "Lcom/avito/android/publish/category_edit/k$a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: CategoryEditViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/k$a$a;", "Lcom/avito/android/publish/category_edit/k$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.category_edit.k$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7066a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f232397a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final NavigationButtonType f232398b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final CategoriesListMove f232399c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final UV0.c<TV0.a> f232400d;

            public C7066a(@Y61.k String str, @Y61.k NavigationButtonType navigationButtonType, @Y61.k CategoriesListMove categoriesListMove, @Y61.k UV0.c<TV0.a> cVar) {
                super(null);
                this.f232397a = str;
                this.f232398b = navigationButtonType;
                this.f232399c = categoriesListMove;
                this.f232400d = cVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7066a)) {
                    return false;
                }
                C7066a c7066a = (C7066a) obj;
                return L.f(this.f232397a, c7066a.f232397a) && this.f232398b == c7066a.f232398b && this.f232399c == c7066a.f232399c && L.f(this.f232400d, c7066a.f232400d);
            }

            public final int hashCode() {
                return this.f232400d.f16399b.hashCode() + ((this.f232399c.hashCode() + ((this.f232398b.hashCode() + (this.f232397a.hashCode() * 31)) * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                return "CategoriesSheet(title=" + this.f232397a + ", button=" + this.f232398b + ", listMove=" + this.f232399c + ", items=" + this.f232400d + ')';
            }
        }

        /* compiled from: CategoryEditViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/k$a$b;", "Lcom/avito/android/publish/category_edit/k$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f232401a;

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f232401a, ((b) obj).f232401a);
            }

            public final int hashCode() {
                String str = this.f232401a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f232401a, ')');
            }

            public b(@Y61.l String str) {
                super(null);
                this.f232401a = str;
            }

            public /* synthetic */ b(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str);
            }
        }

        /* compiled from: CategoryEditViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/category_edit/k$a$c;", "Lcom/avito/android/publish/category_edit/k$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f232402a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: CategoryEditViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/k$a$d;", "Lcom/avito/android/publish/category_edit/k$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final WizardParameter f232403a;

            public d(@Y61.k WizardParameter wizardParameter) {
                super(null);
                this.f232403a = wizardParameter;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f232403a, ((d) obj).f232403a);
            }

            public final int hashCode() {
                return this.f232403a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SelectCategory(category=" + this.f232403a + ')';
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k com.avito.android.publish.category_edit.a aVar, @Y61.k Navigation navigation2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v) {
        this.f232390E = aVar;
        this.f232391J = navigation2;
        this.f232392K = interfaceC35745a5;
        this.f232393L = interfaceC33535v;
    }

    public static boolean ke(WizardParameter wizardParameter, WizardParameter wizardParameter2) {
        WizardParameter parent = wizardParameter.getParent();
        if (wizardParameter.equals(wizardParameter2)) {
            return true;
        }
        if (parent == null) {
            return false;
        }
        return ke(parent, wizardParameter2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"HardcodeStringDetector"})
    public final void le(WizardParameter wizardParameter, CategoriesListMove categoriesListMove) {
        boolean hasChildren = wizardParameter.getHasChildren();
        C23038g0<a> c23038g0 = this.f232395N;
        if (!hasChildren) {
            InterfaceC33535v.a.b(this.f232393L, "CategoryEdit: section without children " + wizardParameter.getNavigation(), null, 6);
            c23038g0.setValue(new a.b(null, 1, 0 == true ? 1 : 0));
            return;
        }
        WizardParameter wizardParameterFindNodeByNavigation = wizardParameter.findNodeByNavigation(this.f232391J);
        String description = wizardParameter.getDescription();
        if (description == null) {
            description = wizardParameter.getTitle();
        }
        NavigationButtonType navigationButtonType = wizardParameter.getParent() != null ? NavigationButtonType.f232337c : NavigationButtonType.f232336b;
        List<WizardParameter> children = wizardParameter.getChildren();
        ArrayList arrayList = new ArrayList();
        for (WizardParameter wizardParameter2 : children) {
            boolean zKe = wizardParameterFindNodeByNavigation != null ? ke(wizardParameterFindNodeByNavigation, wizardParameter2) : false;
            String string = wizardParameter2.getNavigation().toString();
            String description2 = wizardParameter2.getDescription();
            arrayList.add(new CheckableItem(string, description2 == null ? wizardParameter2.getTitle() : description2, zKe, null, null, 24, null));
        }
        c23038g0.setValue(new a.C7066a(description, navigationButtonType, categoriesListMove, new UV0.c(arrayList)));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f232394M.e();
        super.onCleared();
    }
}
