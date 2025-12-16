package androidx.core.os;

import android.os.LocaleList;
import j.X;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocaleListPlatformWrapper.java */
@X
/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f44807a;

    public t(LocaleList localeList) {
        this.f44807a = localeList;
    }

    @Override // androidx.core.os.s
    public final Object a() {
        return this.f44807a;
    }

    public final boolean equals(Object obj) {
        return this.f44807a.equals(((s) obj).a());
    }

    public final int hashCode() {
        return this.f44807a.hashCode();
    }

    public final String toString() {
        return this.f44807a.toString();
    }
}
