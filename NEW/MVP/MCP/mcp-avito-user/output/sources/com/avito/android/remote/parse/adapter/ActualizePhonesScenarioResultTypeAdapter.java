package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.ActualizePhonesScenarioResult;
import com.avito.android.remote.model.PhonesActualizationFlow;
import com.avito.android.remote.model.PhonesPayload;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ActualizePhonesScenarioResultTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ActualizePhonesScenarioResultTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult;", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActualizePhonesScenarioResultTypeAdapter implements com.google.gson.h<ActualizePhonesScenarioResult> {

    /* compiled from: ActualizePhonesScenarioResultTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254147a;

        static {
            int[] iArr = new int[PhonesActualizationFlow.values().length];
            try {
                iArr[PhonesActualizationFlow.ACTUALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhonesActualizationFlow.NO_PHONES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhonesActualizationFlow.NO_VERIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhonesActualizationFlow.HAS_VERIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f254147a = iArr;
        }
    }

    @Override // com.google.gson.h
    public final ActualizePhonesScenarioResult deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        int iG2 = kVarI.i().D("delayInterval").g();
        int i12 = a.f254147a[((PhonesActualizationFlow) gVar.b(kVarI.D(MessageBody.SystemMessageBody.Platform.FLOW), PhonesActualizationFlow.class)).ordinal()];
        if (i12 == 1) {
            return new ActualizePhonesScenarioResult.DoNotShow(iG2);
        }
        if (i12 == 2) {
            return new ActualizePhonesScenarioResult.ShowAddNewPhone(iG2);
        }
        if (i12 == 3) {
            return new ActualizePhonesScenarioResult.WithPayload.ShowWithConfirmablePhones(iG2, (PhonesPayload) gVar.b(kVarI.D("payload"), PhonesPayload.class));
        }
        if (i12 == 4) {
            return new ActualizePhonesScenarioResult.WithPayload.ShowWithPhones(iG2, (PhonesPayload) gVar.b(kVarI.D("payload"), PhonesPayload.class));
        }
        throw new NoWhenBranchMatchedException();
    }
}
