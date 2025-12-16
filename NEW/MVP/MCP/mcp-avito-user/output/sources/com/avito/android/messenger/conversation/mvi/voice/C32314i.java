package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "distance", "", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Float;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32314i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f195162b;

    public C32314i(float f12) {
        this.f195162b = f12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Float f12 = (Float) obj;
        float fFloatValue = f12.floatValue();
        float f13 = this.f195162b;
        boolean z12 = fFloatValue < f13;
        X2.f318778a.i("LegacyVoicePlayerPresenterImpl", "OutputSwitchingOnProximityChanges: distance = " + f12 + ", proximitySensorMaximumRange = " + f13 + " => emit shouldSetOutputToEarpiece = " + z12, null);
        return Boolean.valueOf(z12);
    }
}
