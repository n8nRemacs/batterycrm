package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NonMessageStub.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f192737a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f192738b = new C22096n(561853714, C5696a.f192739l, false);

    /* compiled from: NonMessageStub.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.other.a$a, reason: collision with other inner class name */
    public static final class C5696a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5696a f192739l = new C5696a();

        public C5696a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                j.a("UnreadMessagesDivider", C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), a13, 54);
            }
            return G0.f406611a;
        }
    }
}
