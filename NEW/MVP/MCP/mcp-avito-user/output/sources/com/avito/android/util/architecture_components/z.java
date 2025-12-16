package com.avito.android.util.architecture_components;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.publish.details.C33796v0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z {

    /* compiled from: LiveDatas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f318823b;

        public a(Y41.l lVar) {
            this.f318823b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f318823b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f318823b;
        }

        public final int hashCode() {
            return this.f318823b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f318823b.invoke(obj);
        }
    }

    /* compiled from: LiveDatas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class b implements InterfaceC23040h0, kotlin.jvm.internal.D {
        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(null, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            throw null;
        }
    }

    public static final void a(@Y61.k C35747a c35747a, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k C33796v0 c33796v0) {
        c35747a.observe(interfaceC22983P, new a(new x(interfaceC22983P, c33796v0)));
    }
}
