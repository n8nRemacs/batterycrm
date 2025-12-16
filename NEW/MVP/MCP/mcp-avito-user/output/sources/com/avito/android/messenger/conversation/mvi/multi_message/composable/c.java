package com.avito.android.messenger.conversation.mvi.multi_message.composable;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.mvi.multi_message.composable.i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiMessageBannerContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f193659a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f193660b = new C22096n(1681745560, a.f193661l, false);

    /* compiled from: MultiMessageBannerContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f193661l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                d.d(new i("Найдите нужное быстрее", null, null, null, true, new i.a("Выбрать объявления", null)), com.avito.android.messenger.conversation.mvi.multi_message.composable.a.f193657l, b.f193658l, v.f42878y1, a13, 3512, 0);
            }
            return G0.f406611a;
        }
    }
}
