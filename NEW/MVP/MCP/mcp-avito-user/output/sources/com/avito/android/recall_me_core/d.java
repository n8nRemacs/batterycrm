package com.avito.android.recall_me_core;

import com.avito.android.recall_me_core.c;
import com.avito.android.remote.ConfirmCodeResponse;
import com.avito.android.remote.RecallMeError;
import kotlin.Metadata;
import l41.o;

/* compiled from: RecallMeConfirmedInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/ConfirmCodeResponse;", "it", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f252047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f252048c;

    public d(c cVar, String str) {
        this.f252047b = cVar;
        this.f252048c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        RecallMeError error;
        Integer numValueOf;
        ConfirmCodeResponse confirmCodeResponse = (ConfirmCodeResponse) obj;
        RecallMeError error2 = confirmCodeResponse.getError();
        boolean z12 = (error2 != null && error2.getCode() == 11) || ((error = confirmCodeResponse.getError()) != null && error.getCode() == 2);
        if (confirmCodeResponse.getSuccess() || !z12) {
            return confirmCodeResponse;
        }
        c cVar = this.f252047b;
        String string = cVar.f252044c.getString(this.f252048c);
        if (string == null) {
            numValueOf = null;
        } else {
            c.a aVar = (c.a) cVar.f252046e.d(c.a.class, string);
            cVar.f252045d.getClass();
            long jCurrentTimeMillis = (System.currentTimeMillis() - aVar.getRecordingTime()) / 1000;
            numValueOf = jCurrentTimeMillis > ((long) aVar.getRequestAfterTime()) ? 0 : Integer.valueOf(aVar.getRequestAfterTime() - ((int) jCurrentTimeMillis));
        }
        return ConfirmCodeResponse.a(confirmCodeResponse, numValueOf);
    }
}
