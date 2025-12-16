package com.avito.android.messenger.conversation.create.phone_verification;

import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.analytics.G;
import com.avito.android.messenger.analytics.H;
import com.avito.android.messenger.conversation.create.phone_verification.a;
import dagger.internal.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerPhoneVerificationActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/create/phone_verification/MessengerPhoneVerificationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class MessengerPhoneVerificationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f189609o = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public PhoneManagementIntentFactory f189610m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f189611n;

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        if (i12 != 1) {
            super.onActivityResult(i12, i13, intent);
        } else if (i13 == -1) {
            setResult(i13, intent);
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        a.b bVar = new a.b();
        d dVar = (d) C29972i.a(C29972i.b(this), d.class);
        bVar.f189612a = dVar;
        d dVar2 = new a.c(dVar, null).f189613a;
        this.f189610m = dVar2.E2();
        InterfaceC28373a interfaceC28373aA = dVar2.a();
        t.c(interfaceC28373aA);
        this.f189611n = interfaceC28373aA;
        setContentView(R.layout.messenger_activity_phone_verification);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle((CharSequence) null);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.conversation.create.phone_verification.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MessengerPhoneVerificationActivity f189615c;

            {
                this.f189615c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessengerPhoneVerificationActivity messengerPhoneVerificationActivity = this.f189615c;
                switch (i12) {
                    case 0:
                        int i13 = MessengerPhoneVerificationActivity.f189609o;
                        messengerPhoneVerificationActivity.finish();
                        break;
                    default:
                        InterfaceC28373a interfaceC28373a = messengerPhoneVerificationActivity.f189611n;
                        if (interfaceC28373a == null) {
                            interfaceC28373a = null;
                        }
                        interfaceC28373a.c(new G());
                        PhoneManagementIntentFactory phoneManagementIntentFactory = messengerPhoneVerificationActivity.f189610m;
                        messengerPhoneVerificationActivity.startActivityForResult((phoneManagementIntentFactory != null ? phoneManagementIntentFactory : null).b(PhoneManagementIntentFactory.CallSource.Messenger.f119665b), 1);
                        break;
                }
            }
        });
        View viewFindViewById = findViewById(R.id.messenger_verify_phone_button);
        if (viewFindViewById != null) {
            final int i13 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.conversation.create.phone_verification.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ MessengerPhoneVerificationActivity f189615c;

                {
                    this.f189615c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessengerPhoneVerificationActivity messengerPhoneVerificationActivity = this.f189615c;
                    switch (i13) {
                        case 0:
                            int i132 = MessengerPhoneVerificationActivity.f189609o;
                            messengerPhoneVerificationActivity.finish();
                            break;
                        default:
                            InterfaceC28373a interfaceC28373a = messengerPhoneVerificationActivity.f189611n;
                            if (interfaceC28373a == null) {
                                interfaceC28373a = null;
                            }
                            interfaceC28373a.c(new G());
                            PhoneManagementIntentFactory phoneManagementIntentFactory = messengerPhoneVerificationActivity.f189610m;
                            messengerPhoneVerificationActivity.startActivityForResult((phoneManagementIntentFactory != null ? phoneManagementIntentFactory : null).b(PhoneManagementIntentFactory.CallSource.Messenger.f119665b), 1);
                            break;
                    }
                }
            });
        }
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f189611n;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new H());
        }
    }
}
