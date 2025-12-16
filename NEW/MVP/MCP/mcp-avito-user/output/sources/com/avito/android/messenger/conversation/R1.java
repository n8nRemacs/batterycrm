package com.avito.android.messenger.conversation;

import androidx.view.InterfaceC23040h0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class R1 {

    /* compiled from: ChannelFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f189140b;

        public a(Y41.l lVar) {
            this.f189140b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f189140b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f189140b;
        }

        public final int hashCode() {
            return this.f189140b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f189140b.invoke(obj);
        }
    }
}
