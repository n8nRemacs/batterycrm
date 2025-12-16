package com.avito.android.verification.verification_input_inn;

import android.content.res.Resources;
import com.avito.android.di.C29972i;
import com.avito.android.verification.di.input_inn.b;
import cv.InterfaceC39417a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationInputInnFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/verification/di/input_inn/b;", "invoke", "()Lcom/avito/android/verification/di/input_inn/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<com.avito.android.verification.di.input_inn.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationInputInnFragment f325610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VerificationInputInnArgs f325611m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VerificationInputInnFragment verificationInputInnFragment, VerificationInputInnArgs verificationInputInnArgs) {
        super(0);
        this.f325610l = verificationInputInnFragment;
        this.f325611m = verificationInputInnArgs;
    }

    @Override // Y41.a
    public final com.avito.android.verification.di.input_inn.b invoke() {
        b.a aVarA = com.avito.android.verification.di.input_inn.a.a();
        VerificationInputInnFragment verificationInputInnFragment = this.f325610l;
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(verificationInputInnFragment);
        Resources resources = verificationInputInnFragment.getResources();
        com.avito.android.verification.di.input_inn.c cVar = (com.avito.android.verification.di.input_inn.c) C29972i.a(C29972i.b(verificationInputInnFragment), com.avito.android.verification.di.input_inn.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(verificationInputInnFragment);
        return aVarA.a(rVarC, resources, this.f325611m, verificationInputInnFragment.getF42820b(), cVar, interfaceC39417aB);
    }
}
