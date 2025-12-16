package jJ;

import Y61.k;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.appcompat.app.p;
import androidx.core.app.t;
import androidx.core.os.q;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: LocaleStoreImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LjJ/c;", "LjJ/b;", "LjJ/a;", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* renamed from: jJ.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42263c implements InterfaceC42262b, InterfaceC42261a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f405539a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f405540b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public q f405541c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public q f405542d;

    @Inject
    public C42263c(@k Application application) {
        this.f405539a = application;
        this.f405540b = Build.VERSION.SDK_INT >= 33;
        q qVar = q.f44804b;
        this.f405541c = qVar;
        this.f405542d = qVar;
    }

    @Override // jJ.InterfaceC42261a
    @k
    public final Locale P4() {
        return Locale.getDefault();
    }

    @Override // jJ.InterfaceC42262b
    public final void a(@k String str) {
        this.f405541c = q.a(str);
        this.f405542d = t.a(this.f405539a);
    }

    @Override // jJ.InterfaceC42262b
    public final void b(@k Locale locale) {
        q qVar = q.f44804b;
        p.z(q.g(new LocaleList(locale)));
        this.f405542d = t.a(this.f405539a);
        f();
    }

    @Override // jJ.InterfaceC42262b
    @k
    /* renamed from: c, reason: from getter */
    public final q getF405542d() {
        return this.f405542d;
    }

    @Override // jJ.InterfaceC42262b
    public final void d() {
        if (this.f405540b) {
            return;
        }
        f();
    }

    @Override // jJ.InterfaceC42262b
    @k
    /* renamed from: e, reason: from getter */
    public final q getF405541c() {
        return this.f405541c;
    }

    public final void f() {
        Object objF = this.f405542d.f();
        LocaleList localeList = objF instanceof LocaleList ? (LocaleList) objF : null;
        if (localeList == null || localeList.isEmpty()) {
            return;
        }
        LocaleList.setDefault(localeList);
        Locale.setDefault(localeList.get(0));
        if (this.f405540b) {
            return;
        }
        Resources resources = this.f405539a.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocales(LocaleList.getDefault());
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
