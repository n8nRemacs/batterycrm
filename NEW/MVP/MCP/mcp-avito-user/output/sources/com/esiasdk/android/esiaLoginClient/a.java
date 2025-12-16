package com.esiasdk.android.esiaLoginClient;

import Y61.l;
import android.content.Intent;
import com.esiasdk.android.EsiaErrorResponse;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: EsiaCallbackManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/a;", "", "<init>", "()V", "a", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public e f339702a;

    /* compiled from: EsiaCallbackManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/a$a;", "", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.esiasdk.android.esiaLoginClient.a$a, reason: collision with other inner class name */
    public interface InterfaceC10523a {
    }

    public final boolean a(int i12, int i13, @l Intent intent) {
        if (i12 != 1) {
            return false;
        }
        e eVar = this.f339702a;
        if (eVar == null) {
            return true;
        }
        InterfaceC42726C interfaceC42726CC = C42727D.c(new d(intent));
        InterfaceC42726C interfaceC42726CC2 = C42727D.c(new c(intent));
        b bVar = eVar.f339705a;
        if (i13 == 0) {
            bVar.a((EsiaErrorResponse) interfaceC42726CC2.getValue());
            return true;
        }
        if (((TokenParameters) interfaceC42726CC.getValue()) != null) {
            bVar.b((TokenParameters) interfaceC42726CC.getValue());
            return true;
        }
        bVar.c((EsiaErrorResponse) interfaceC42726CC2.getValue());
        return true;
    }
}
