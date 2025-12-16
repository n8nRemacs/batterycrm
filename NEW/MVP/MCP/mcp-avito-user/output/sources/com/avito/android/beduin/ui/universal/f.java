package com.avito.android.beduin.ui.universal;

import androidx.view.InterfaceC23040h0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;

/* compiled from: UniversalBeduinFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f104486b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f104486b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f104486b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f104486b;
        }

        public final int hashCode() {
            return this.f104486b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104486b.invoke(obj);
        }
    }
}
