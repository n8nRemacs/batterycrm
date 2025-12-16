package com.avito.android.remote.parse.adapter.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VoiceInfoTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/VoiceInfoTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/voice/VoiceInfo;", "Lcom/google/gson/h;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VoiceInfoTypeAdapter implements o<VoiceInfo>, h<VoiceInfo> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        VoiceInfo voiceInfo = (VoiceInfo) obj;
        k kVar = new k();
        kVar.t("duration", nVar.c(Long.valueOf(voiceInfo.getDuration())));
        kVar.t(VoiceInfo.STATE, nVar.c(voiceInfo.getState()));
        kVar.t("error", nVar.c(voiceInfo.getError()));
        return kVar;
    }

    @Override // com.google.gson.h
    public final VoiceInfo deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        i iVarD = kVarI.D("duration");
        if (iVarD == null) {
            return null;
        }
        Long lValueOf = iVarD instanceof j ? null : Long.valueOf(iVarD.l());
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        i iVarD2 = kVarI.D(VoiceInfo.STATE);
        Integer numB = iVarD2 != null ? C34328m0.b(iVarD2) : null;
        i iVarD3 = kVarI.D("error");
        return new VoiceInfo(jLongValue, numB, iVarD3 != null ? C34328m0.e(iVarD3) : null);
    }
}
