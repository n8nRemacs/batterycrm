package com.avito.android.messenger.conversation.mvi.voice;

import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "accuracy", "", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32313h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32313h<T, R> f195160b = new C32313h<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Integer num = (Integer) obj;
        boolean z12 = true;
        if ((num == null || num.intValue() != 3) && ((num == null || num.intValue() != 2) && (num == null || num.intValue() != 1))) {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
