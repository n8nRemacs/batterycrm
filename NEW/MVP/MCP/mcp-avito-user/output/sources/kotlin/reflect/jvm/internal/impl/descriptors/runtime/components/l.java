package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import j51.InterfaceC42201a;
import j51.InterfaceC42202b;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x;

/* compiled from: RuntimeSourceElementFactory.kt */
/* loaded from: classes8.dex */
public final class l implements InterfaceC42202b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f407818a = new l();

    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class a implements InterfaceC42201a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final x f407819b;

        public a(@Y61.k x xVar) {
            this.f407819b = xVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.b0
        @Y61.k
        public final c0 a() {
            return c0.f407540a;
        }

        @Override // j51.InterfaceC42201a
        public final x b() {
            return this.f407819b;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            androidx.compose.ui.graphics.colorspace.e.u(a.class, sb2, ": ");
            sb2.append(this.f407819b);
            return sb2.toString();
        }
    }

    @Override // j51.InterfaceC42202b
    @Y61.k
    public final a a(@Y61.k k51.l lVar) {
        return new a((x) lVar);
    }
}
