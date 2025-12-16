package com.avito.beduin.v2.repository.screen_lifecycle;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ScreenState.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"screen-lifecycle_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {
    public static final A a(C36272i c36272i, String str) {
        return new A(new Q(VoiceInfo.STATE, c36272i.e(str)));
    }
}
