package androidx.view.dynamicfeatures;

import AK.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.compose.runtime.C22026a;
import androidx.view.AbstractC23301M0;
import androidx.view.C23278A0;
import androidx.view.C23280B0;
import androidx.view.C23303N0;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import androidx.view.C23395u;
import androidx.view.dynamicfeatures.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DynamicIncludeGraphNavigator.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/dynamicfeatures/g;", "Landroidx/navigation/M0;", "Landroidx/navigation/dynamicfeatures/g$a;", "a", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC23301M0.b("include-dynamic")
/* loaded from: classes.dex */
public final class g extends AbstractC23301M0<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f53081c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C23303N0 f53082d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C23278A0 f53083e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f53084f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f53085g;

    /* compiled from: DynamicIncludeGraphNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/dynamicfeatures/g$a;", "Landroidx/navigation/W;", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C23317W {

        /* renamed from: l, reason: collision with root package name */
        @l
        public String f53086l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public String f53087m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public String f53088n;

        public a() {
            throw null;
        }

        @Override // androidx.view.C23317W
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            if (super.equals(obj)) {
                a aVar = (a) obj;
                if (L.f(this.f53086l, aVar.f53086l) && L.f(this.f53087m, aVar.f53087m) && L.f(this.f53088n, aVar.f53088n)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.view.C23317W
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f53086l;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f53087m;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f53088n;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // androidx.view.C23317W
        public final void l(@k Context context, @k AttributeSet attributeSet) {
            String strA0;
            super.l(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.c.f53106c, 0, 0);
            String string = typedArrayObtainStyledAttributes.getString(2);
            this.f53088n = string;
            if (string == null || string.length() == 0) {
                throw new IllegalArgumentException("`moduleName` must be set for <include-dynamic>");
            }
            String string2 = typedArrayObtainStyledAttributes.getString(0);
            if (string2 != null && string2.length() <= 0) {
                StringBuilder sb2 = new StringBuilder("`graphPackage` cannot be empty for <include-dynamic>. You can omit the `graphPackage` attribute entirely to use the default of ");
                sb2.append(context.getPackageName());
                sb2.append('.');
                throw new IllegalArgumentException(C22026a.c(sb2, this.f53088n, '.').toString());
            }
            if (string2 != null) {
                strA0 = C43066x.a0(string2, "${applicationId}", context.getPackageName(), false);
            } else {
                strA0 = context.getPackageName() + '.' + this.f53088n;
            }
            this.f53087m = strA0;
            String string3 = typedArrayObtainStyledAttributes.getString(1);
            this.f53086l = string3;
            if (string3 == null || string3.length() == 0) {
                throw new IllegalArgumentException("`graphResName` must be set for <include-dynamic>");
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public g(@k Context context, @k C23303N0 c23303n0, @k C23278A0 c23278a0, @k j jVar) {
        this.f53081c = context;
        this.f53082d = c23303n0;
        this.f53083e = c23278a0;
        this.f53084f = jVar;
        context.getPackageName();
        this.f53085g = new ArrayList();
    }

    @Override // androidx.view.AbstractC23301M0
    public final C23317W a() {
        a aVar = new a(this);
        this.f53085g.add(aVar);
        return aVar;
    }

    @Override // androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) throws Resources.NotFoundException {
        for (C23395u c23395u : list) {
            a aVar2 = (a) c23395u.f53182c;
            e eVar = aVar instanceof e ? (e) aVar : null;
            String str = aVar2.f53088n;
            if (str != null) {
                j jVar = this.f53084f;
                if (jVar.a(str)) {
                    jVar.b(c23395u, eVar, str);
                }
            }
            C23324b0 c23324b0K = k(aVar2);
            this.f53082d.b(c23324b0K.f52879b).d(Collections.singletonList(b().a(c23324b0K, c23395u.a())), c23280b0, aVar);
        }
    }

    @Override // androidx.view.AbstractC23301M0
    public final void g(@k Bundle bundle) throws Resources.NotFoundException {
        while (true) {
            ArrayList arrayList = this.f53085g;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = new ArrayList(arrayList).iterator();
            arrayList.clear();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                String str = aVar.f53088n;
                if (str == null || !this.f53084f.a(str)) {
                    k(aVar);
                }
            }
        }
    }

    @Override // androidx.view.AbstractC23301M0
    @l
    public final Bundle h() {
        return Bundle.EMPTY;
    }

    public final C23324b0 k(a aVar) throws Resources.NotFoundException {
        int identifier = this.f53081c.getResources().getIdentifier(aVar.f53086l, "navigation", aVar.f53087m);
        if (identifier == 0) {
            throw new Resources.NotFoundException(aVar.f53087m + ":navigation/" + aVar.f53086l);
        }
        C23324b0 c23324b0B = this.f53083e.b(identifier);
        int i12 = c23324b0B.f52886i;
        if (i12 != 0 && i12 != aVar.f52886i) {
            StringBuilder sb2 = new StringBuilder("The included <navigation>'s id ");
            sb2.append(c23324b0B.D());
            sb2.append(" is different from the destination id ");
            String strValueOf = aVar.f52881d;
            if (strValueOf == null) {
                strValueOf = String.valueOf(aVar.f52886i);
            }
            throw new IllegalStateException(c.s(sb2, strValueOf, ". Either remove the <navigation> id or make them match.").toString());
        }
        c23324b0B.s(aVar.f52886i);
        C23324b0 c23324b0 = aVar.f52880c;
        if (c23324b0 != null) {
            c23324b0.w(c23324b0B);
            this.f53085g.remove(aVar);
            return c23324b0B;
        }
        StringBuilder sb3 = new StringBuilder("The include-dynamic destination with id ");
        String strValueOf2 = aVar.f52881d;
        if (strValueOf2 == null) {
            strValueOf2 = String.valueOf(aVar.f52886i);
        }
        throw new IllegalStateException(c.s(sb3, strValueOf2, " does not have a parent. Make sure it is attached to a NavGraph."));
    }
}
