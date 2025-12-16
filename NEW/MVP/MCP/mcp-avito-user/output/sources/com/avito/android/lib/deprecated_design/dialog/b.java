package com.avito.android.lib.deprecated_design.dialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.l;
import com.avito.android.R;
import com.avito.android.util.D6;
import hw.InterfaceC41179d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DialogRouter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/dialog/b;", "Lcom/avito/android/lib/deprecated_design/dialog/a;", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class b implements com.avito.android.lib.deprecated_design.dialog.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f177939a;

    /* compiled from: DialogRouter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/dialog/b$a;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final r f177940a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final androidx.appcompat.app.l f177941b;

        public a(@Y61.k r rVar, @Y61.k androidx.appcompat.app.l lVar) {
            this.f177940a = rVar;
            this.f177941b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f177940a.equals(aVar.f177940a) && this.f177941b.equals(aVar.f177941b);
        }

        public final int hashCode() {
            return this.f177941b.hashCode() + (this.f177940a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ComponentInfo(component=" + this.f177940a + ", dialog=" + this.f177941b + ')';
        }
    }

    @Inject
    public b(@Y61.k Activity activity) {
        this.f177939a = activity;
    }

    public static a f(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.simple_dialog, (ViewGroup) null);
        return new a(new r(viewInflate), new l.a(context).setView(viewInflate).create());
    }

    @Override // com.avito.android.lib.deprecated_design.dialog.a
    @Y61.k
    public final androidx.appcompat.app.l a(@Y61.k String str, @Y61.k CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        a aVarF = f(this.f177939a);
        r rVar = aVarF.f177940a;
        rVar.i(str);
        rVar.c(charSequence);
        OU.d dVar = rVar.f177952e;
        D6.H(dVar.f12285b);
        dVar.g0(charSequence2);
        rVar.d(R.string.close);
        rVar.g();
        androidx.appcompat.app.l lVar = aVarF.f177941b;
        rVar.f(new g(lVar));
        com.avito.android.lib.util.g.a(lVar);
        return lVar;
    }

    @Override // com.avito.android.lib.deprecated_design.dialog.a
    @Y61.k
    public final androidx.appcompat.app.l b(@Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k Y41.a aVar, @Y61.k String str4, @Y61.k Y41.a aVar2) {
        a aVarF = f(this.f177939a);
        r rVar = aVarF.f177940a;
        rVar.e(str4);
        rVar.f177948a.f177877b.b(str3);
        rVar.f(new c(aVar2));
        rVar.h(new d(aVar));
        if (str2 == null) {
            rVar.a();
        } else {
            rVar.c(str2);
        }
        if (str == null) {
            rVar.b();
        } else {
            rVar.i(str);
        }
        androidx.appcompat.app.l lVar = aVarF.f177941b;
        lVar.setCancelable(true);
        com.avito.android.lib.util.g.a(lVar);
        return lVar;
    }

    @Override // com.avito.android.lib.deprecated_design.dialog.a
    @Y61.k
    public final androidx.appcompat.app.l c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.a aVar) {
        a aVarF = f(this.f177939a);
        r rVar = aVarF.f177940a;
        rVar.i(str);
        rVar.c(str2);
        rVar.e(str3);
        rVar.g();
        rVar.f(new l(aVar));
        androidx.appcompat.app.l lVar = aVarF.f177941b;
        lVar.setCancelable(false);
        com.avito.android.lib.util.g.a(lVar);
        return lVar;
    }

    @Override // com.avito.android.lib.deprecated_design.dialog.a
    @Y61.k
    public final ProgressDialog d() {
        Activity activity = this.f177939a;
        return ProgressDialog.show(activity, null, activity.getString(R.string.wait), true, true);
    }

    @Override // com.avito.android.lib.deprecated_design.dialog.a
    @Y61.k
    public final androidx.appcompat.app.l e(@Y61.k Y41.a aVar, @Y61.l String str, @Y61.k String str2) {
        a aVarF = f(this.f177939a);
        r rVar = aVarF.f177940a;
        rVar.e(str2);
        rVar.f(new e(aVar));
        rVar.g();
        if (str == null) {
            rVar.a();
        } else {
            rVar.c(str);
        }
        rVar.b();
        androidx.appcompat.app.l lVar = aVarF.f177941b;
        lVar.setCancelable(true);
        com.avito.android.lib.util.g.a(lVar);
        return lVar;
    }
}
