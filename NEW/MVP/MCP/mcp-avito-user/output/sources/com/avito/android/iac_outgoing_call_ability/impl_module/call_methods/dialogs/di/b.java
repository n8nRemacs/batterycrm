package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di;

import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment;
import com.avito.android.permissions.z;
import h31.d;
import kotlin.Metadata;
import vN.C49237a;

/* compiled from: IacCallMethodsDialogComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/di/b;", "", "a", "b", "c", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: IacCallMethodsDialogComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/di/b$a;", "", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: IacCallMethodsDialogComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/di/b$b;", "Lcom/avito/android/di/h;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b$b, reason: collision with other inner class name */
    public interface InterfaceC4984b extends InterfaceC29971h {
        @k
        z A();

        @k
        InterfaceC28481c b();

        @k
        C49237a h1();
    }

    /* compiled from: IacCallMethodsDialogComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/di/b$c;", "", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @k
        b a(@h31.b @k IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment, @h31.b @k r rVar, @k InterfaceC4984b interfaceC4984b);
    }

    void a(@k IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment);
}
