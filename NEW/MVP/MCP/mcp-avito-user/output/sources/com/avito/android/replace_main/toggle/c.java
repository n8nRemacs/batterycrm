package com.avito.android.replace_main.toggle;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.replace_main.toggle.d;
import com.avito.android.replace_main.toggle.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: ReplaceMainToggleContentPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f254613a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f254614b = new C22096n(-411581394, a.f254615l, false);

    /* compiled from: ReplaceMainToggleContentPreview.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f254615l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Z1 z1A = p2.a(new d(BottomNavigationSpace.f107065b, "Сразу открывать Бизнес 360", "Каждый раз при входе в приложение", "", new d.a(new d.c("Теперь будем открывать Авито при входе", new d.b("Хорошо")), new d.c("Теперь будем открывать Бизнес 360 при входе", new d.b("Хорошо"))), false));
                j.a(new C34406a(), z1A, new v.a.C7618a(R.dimen.spinner_medium_size, R.dimen.spinner_medium_size), new b(z1A), a13, 576);
            }
            return G0.f406611a;
        }
    }
}
