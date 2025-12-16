package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/toast_bar/c;", "T", "", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.component.toast_bar.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* data */ class C27354c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC27357f f63243a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22096n f63244b;

    public C27354c(InterfaceC27357f interfaceC27357f, @Y61.k C22096n c22096n) {
        this.f63243a = interfaceC27357f;
        this.f63244b = c22096n;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27354c)) {
            return false;
        }
        C27354c c27354c = (C27354c) obj;
        return L.f(this.f63243a, c27354c.f63243a) && this.f63244b.equals(c27354c.f63244b);
    }

    public final int hashCode() {
        InterfaceC27357f interfaceC27357f = this.f63243a;
        return this.f63244b.hashCode() + ((interfaceC27357f == null ? 0 : interfaceC27357f.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f63243a + ", transition=" + this.f63244b + ')';
    }
}
