package com.avito.android.messenger.conversation.mvi.messages.renderers.other;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.messenger.conversation.mvi.messages.composables.other.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TypingIndicatorContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f193484a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f193485b = new C22096n(-1575615712, C5715a.f193486l, false);

    /* compiled from: TypingIndicatorContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.other.a$a, reason: collision with other inner class name */
    public static final class C5715a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5715a f193486l = new C5715a();

        public C5715a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                s.b(null, a13, 0);
            }
            return G0.f406611a;
        }
    }
}
