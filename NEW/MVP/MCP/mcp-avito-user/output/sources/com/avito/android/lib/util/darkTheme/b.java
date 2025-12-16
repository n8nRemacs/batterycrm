package com.avito.android.lib.util.darkTheme;

import Y61.k;
import android.os.Build;
import androidx.appcompat.app.p;
import com.avito.android.lib.util.darkTheme.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DarkThemeManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/darkTheme/b;", "Lcom/avito/android/lib/util/darkTheme/a;", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.lib.util.darkTheme.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<a.AbstractC5328a> f181345d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final List<a.AbstractC5328a> f181346e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC5330b f181347a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<a.AbstractC5328a> f181348b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a.AbstractC5328a f181349c;

    /* compiled from: DarkThemeManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/darkTheme/b$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DarkThemeManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/darkTheme/b$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.util.darkTheme.b$b, reason: collision with other inner class name */
    public interface InterfaceC5330b {
        void a(int i12);

        int get(int i12);
    }

    static {
        new a(null);
        a.AbstractC5328a.d dVar = a.AbstractC5328a.d.f181344b;
        a.AbstractC5328a.b bVar = a.AbstractC5328a.b.f181342b;
        f181345d = C42745f0.U(a.AbstractC5328a.C5329a.f181341b, dVar, bVar);
        f181346e = C42745f0.U(a.AbstractC5328a.c.f181343b, dVar, bVar);
    }

    public b(@k InterfaceC5330b interfaceC5330b) {
        this.f181347a = interfaceC5330b;
        int i12 = Build.VERSION.SDK_INT;
        this.f181348b = i12 < 29 ? f181345d : f181346e;
        this.f181349c = i12 < 29 ? a.AbstractC5328a.C5329a.f181341b : a.AbstractC5328a.c.f181343b;
    }

    @Override // com.avito.android.lib.util.darkTheme.a
    @k
    public final a.AbstractC5328a a() {
        Object next;
        a.AbstractC5328a abstractC5328a = this.f181349c;
        int i12 = this.f181347a.get(abstractC5328a.f181340a);
        Iterator<T> it = this.f181348b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.AbstractC5328a) next).f181340a == i12) {
                break;
            }
        }
        a.AbstractC5328a abstractC5328a2 = (a.AbstractC5328a) next;
        return abstractC5328a2 == null ? abstractC5328a : abstractC5328a2;
    }

    @Override // com.avito.android.lib.util.darkTheme.a
    public final void b() {
        p.D(a().f181340a);
    }

    @Override // com.avito.android.lib.util.darkTheme.a
    public final void c(@k a.AbstractC5328a abstractC5328a) {
        int i12 = abstractC5328a.f181340a;
        this.f181347a.a(i12);
        p.D(i12);
    }

    @Override // com.avito.android.lib.util.darkTheme.a
    @k
    public final List<a.AbstractC5328a> d() {
        return this.f181348b;
    }
}
