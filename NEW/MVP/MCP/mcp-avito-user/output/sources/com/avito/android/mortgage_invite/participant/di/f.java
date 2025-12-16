package com.avito.android.mortgage_invite.participant.di;

import Y61.k;
import c20.InterfaceC26928e;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.mortgage_invite.model.participant.ParticipantArguments;
import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ParticipantComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/di/f;", "", "a", "b", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: ParticipantComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/di/f$a;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @h31.h
    public interface a {
    }

    /* compiled from: ParticipantComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/di/f$b;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        f a(@k InterfaceC26928e interfaceC26928e, @k InterfaceC39417a interfaceC39417a, @h31.b @k ParticipantArguments participantArguments, @h31.b @k C28478k c28478k);
    }

    void a(@k ParticipantFragment participantFragment);
}
