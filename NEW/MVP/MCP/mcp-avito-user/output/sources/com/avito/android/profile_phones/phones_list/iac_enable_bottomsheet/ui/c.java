package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.ui;

import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacEnableBottomSheetContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f227864a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f227865b = new C22096n(-1796034828, a.f227866l, false);

    /* compiled from: IacEnableBottomSheetContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f227866l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                d.a(new IacEnableBottomSheetState(true, false, false), com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.ui.a.f227862l, b.f227863l, C20588k2.d(v.f42878y1, 1.0f), a13, 3510, 0);
            }
            return G0.f406611a;
        }
    }
}
